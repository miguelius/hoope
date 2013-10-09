package org.uqbar.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.uqbar.hoope.HoopeObject
import org.uqbar.hoope.Message
import org.uqbar.hoope.Program
import org.uqbar.hoope.Property
import org.eclipse.xtext.xbase.typing.ITypeProvider

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
@Singleton
class HoopeJvmModelInferrer extends AbstractModelInferrer {
	@Inject ITypeProvider typeProvider

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferences

	@Inject extension IJvmModelAssociations 

	// @Inject extension XbaseFactory 
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

	def dispatch void infer(HoopeObject element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		var jvmGenericType = element.toClass("examples.hoope.HoopeObject" + count)
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
						members += feature.toSetter(feature.name, type)
					}
					Message: {
						members += feature.toMethod(feature.name, feature.type) [
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

	def JvmGenericType getType(HoopeObject element) {
		(getJvmElements(element).head as JvmGenericType)
	}

}
