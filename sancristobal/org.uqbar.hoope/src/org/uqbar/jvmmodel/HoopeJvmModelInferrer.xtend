package org.uqbar.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Observable
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.annotation.Nullable
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.uqbar.hoope.HoopeObject
import org.uqbar.hoope.Message
import org.uqbar.hoope.Program
import org.uqbar.hoope.Property
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.util.XExpressionHelper
import org.eclipse.xtext.xbase.XExpression
import org.uqbar.HoopeCompiler
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import java.lang.ProcessBuilder.Redirect.Type
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.uqbar.services.HoopeGrammarAccess.CoordinatesElements
import java.awt.Point
import org.uqbar.hoope.Coordinates

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
@Singleton
class HoopeJvmModelInferrer extends AbstractModelInferrer {
	@Inject ITypeProvider typeProvider

	@Inject extension HoopeTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferences
	@Inject extension XExpressionHelper
	@Inject extension IJvmModelAssociations 
	@Inject extension HoopeCompiler
	
	var count = 0

	def dispatch void infer(Program element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		count = 0;
		val mainClass =	element.toClass("examples.hoope.Main")
		acceptor.accept(
			mainClass
		).initializeLater [
			//superTypes += element.newTypeRef(typeof(HoopeGraphicObject))
			documentation = element.documentation
			members += element.toMethod("main", getTypeForName(Void::TYPE, element)) [
				setStatic(true)
				parameters += element.toParameter("args", typeof(String).getTypeForName(element).createArrayType())
				body = element
			]
		]

		for (expression : element.expressions) {
			expression.infer(acceptor, isPrelinkingPhase)
		}
	}

	def dispatch void infer(Coordinates element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		element.newTypeRef(typeof(Point))
	}

	def dispatch void infer(HoopeObject element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		var jvmGenericType = element.toClass("examples.hoope.HoopeObject" + count)
		jvmGenericType.superTypes.add(element.newTypeRef(typeof(Observable)))
		count = count + 1
		acceptor.accept(jvmGenericType).initializeLater [
			documentation = element.documentation
			for (feature : element.features) {
				switch feature {
					Property: {
						
						val type = feature.type?: feature.value?.inferredType
						
//						feature.value.infer(acceptor, isPrelinkingPhase)
//						System.out.println(feature.value.inferredType)
						members += feature.toField(feature.name, type) [
							initializer = feature.value
						]
						members += feature.toGetter(feature.name, type)
						members += feature.toObservedSetter(feature.name, type)
					}
					Message: {
						var methodName = feature.name
						if (feature.body.hasSideEffects) {
							val mn = methodName = feature.name + 'Observed'
							members += feature.toMethod(feature.name, feature.type) [
								documentation = feature.documentation
								for (p : feature.params) {
									parameters += p.toParameter(p.name, p.parameterType)
								}
								body = [
									if (!feature.newTypeRef(Void::TYPE).type.equals( cloneWithProxies(feature.type).type ) ) {
										it.append(cloneWithProxies(feature.type).type)
										it.append(" retorname = ");
										it.append( methodCall( mn , feature.params ) );
										it.append("\n")
									}
									else {
										it.append( methodCall(mn, feature.params))
									}
									it.append("setChanged();\n")
									it.append("notifyObservers(\"");
									it.append(feature.name);
									it.append("\");\n");
									if (!feature.newTypeRef(Void::TYPE).type.equals( cloneWithProxies(feature.type).type ) ) {
										it.append("return retorname;")
									}
								]
							]
						}				
						members += feature.toMethod(methodName, feature.type) [
							documentation = feature.documentation
							for (p : feature.params) {
								parameters += p.toParameter(p.name, p.parameterType)
							}
							body = feature.body
						]
					}
				}
			}
		]
	}
	
	def String methodCall(String methodName, EList<JvmFormalParameter> params) {
		val sb = new StringBuilder(methodName)
		sb.append("(")
		if (!params.empty) {
			sb.append( params.head.name )
			params.tail.forEach [
				sb.append( ", " )
				sb.append( it.name )
			]
		}
		sb.append(");\n")
		return sb.toString
	}

	def JvmGenericType getType(HoopeObject element) {
		(getJvmElements(element).head as JvmGenericType)
	}

}
