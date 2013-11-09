package org.uqbar

import com.google.inject.Inject
import com.google.inject.Singleton
import java.awt.Point
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.uqbar.hoope.Coordinates
import org.uqbar.hoope.HoopeObject
import org.uqbar.jvmmodel.HoopeJvmModelInferrer

@SuppressWarnings("restriction")
@Singleton
class HoopeTypeProvider extends XbaseTypeProvider {
	@Inject extension HoopeJvmModelInferrer
	@Inject extension JvmTypesBuilder

	override JvmTypeReference type(XExpression expression, JvmTypeReference rawExpectation, boolean rawType) {
		switch (expression) {
			Coordinates:
				expression.newTypeRef(Point)
			HoopeObject:
				typeReferences.getTypeForName(getType(expression).getQualifiedName('.'),expression)
			default:
				super.type(expression, rawExpectation, rawType)
		}
	}
}
