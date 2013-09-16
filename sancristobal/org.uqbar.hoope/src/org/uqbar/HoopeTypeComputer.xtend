package org.uqbar

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XClosure
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference
import org.eclipse.xtext.xbase.typesystem.references.UnknownTypeReference
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.uqbar.hoope.HoopeObject
import org.uqbar.jvmmodel.HoopeJvmModelInferrer

class HoopeTypeComputer extends XbaseTypeComputer {

	@Inject extension HoopeJvmModelInferrer

	def dispatch void computeTypes(HoopeObject hoopObject, ITypeComputationState state) {
		val type = new ParameterizedTypeReference(state.referenceOwner, getType(hoopObject))
		state.acceptActualType(type);
	}
}
