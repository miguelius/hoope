package org.uqbar

import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.uqbar.hoope.HoopeObject
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import com.google.inject.Inject
import org.uqbar.jvmmodel.HoopeJvmModelInferrer
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference

class HoopeTypeComputer extends XbaseTypeComputer {
	
	@Inject extension HoopeJvmModelInferrer
	
	def dispatch void computeTypes(HoopeObject hoopObject, ITypeComputationState state) {
		//TODO no se olviden de mí!!!!
		val LightweightTypeReference result = new ParameterizedTypeReference(state.referenceOwner, getType(hoopObject) )
		state.acceptActualType(result);
	}
}