package org.uqbar.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.uqbar.hoope.HoopeObject
import org.uqbar.hoope.Message
import org.uqbar.hoope.Program
import org.uqbar.hoope.Property
import org.uqbar.hoope.lib.HoopeGraphicObject

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
@Singleton
class HoopeJvmModelInferrer extends AbstractModelInferrer {
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferences
	@Inject extension ITypeProvider

	// @Inject extension XbaseFactory 
	var count = 0
	val Map<XExpression, JvmGenericType> createdClasses = new HashMap

	def dispatch void infer(Program element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		cleanClassCache
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

	def cleanClassCache() {
		count = 0
		createdClasses.clear
	}

	def dispatch void infer(HoopeObject element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		var result = element.toClass("examples.hoope.HoopeObject" + count)
		count = count + 1
		acceptor.accept(result).initializeLater [
			documentation = element.documentation
			for (feature : element.features) {
				switch feature {
					Property: {
						members += feature.toField(feature.name, feature.type)
						members += feature.toGetter(feature.name, feature.type)
						members += feature.toSetter(feature.name, feature.type)
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
		createdClasses.put(element, result)
	}

	def JvmGenericType getType(HoopeObject element) {
		createdClasses.get(element)
	}

}
