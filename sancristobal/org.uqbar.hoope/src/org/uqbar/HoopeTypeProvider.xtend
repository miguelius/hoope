package org.uqbar

import com.google.inject.Singleton
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.uqbar.hoope.HoopeObject

@SuppressWarnings("restriction")
@Singleton
class HoopeTypeProvider extends XbaseTypeProvider {
	override JvmTypeReference type(XExpression expression, JvmTypeReference rawExpectation, boolean rawType) {
		switch (expression) {
			HoopeObject:
				typeReferences.getTypeForName(Object, expression)
			default:
				super.type(expression, rawExpectation, rawType)
		}
	}
}
