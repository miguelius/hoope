package org.uqbar

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference
import org.uqbar.hoope.HoopeObject
import org.uqbar.jvmmodel.HoopeJvmModelInferrer
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XClosure
import org.eclipse.xtext.xbase.typesystem.references.UnknownTypeReference

class HoopeTypeComputer extends XbaseTypeComputer {
	
	@Inject extension HoopeJvmModelInferrer
	
/*
	def dispatch bleh(JvmTypeReference x) { 
	  state.getConverter().toLightweightReference(x);
	}

	def dispatch bleh(Void x) { 
	  null
	}
*/
	def dispatch void computeTypes(HoopeObject hoopObject, ITypeComputationState state) {
		//TODO no se olviden de mí!!!!
		val LightweightTypeReference result = new ParameterizedTypeReference(state.referenceOwner, getType(hoopObject) )
		state.acceptActualType(result);
	}

	def dispatch LightweightTypeReference bleh(JvmTypeReference declaredType, ITypeComputationState  state) { 
		state.getConverter().toLightweightReference(declaredType)
	}
	
	def dispatch ITypeComputationState initializerState(Void ref, ITypeComputationState state) {
		state.withNonVoidExpectation()
	}
	
	def dispatch ITypeComputationState initializerState(LightweightTypeReference lightweightTypeReference, ITypeComputationState state) {
		state.withExpectation(lightweightTypeReference) 
	}
	
//	def dispatch override void computeTypes(XVariableDeclaration object, ITypeComputationState state) {
//
//		val lightweightTypeReference = bleh(object.type, state)
//		
//		if (lightweightTypeReference != null && object.right instanceof XClosure) {
//			//ITypeComputationState 
//			val initializerState = state.assignType(object, lightweightTypeReference).withExpectation(lightweightTypeReference)
//			initializerState.computeTypes(object.right)
//		} else if (lightweightTypeReference != null && object.right instanceof HoopeObject) {
//			//HELP!!
//			//val initializerState = state.assignType(object, lightweightTypeReference).withExpectation(lightweightTypeReference)
//			//initializerState.computeTypes(object.right)
//		} else {
//			val initializerState = initializerState(lightweightTypeReference, state)
//			val computedType = initializerState.computeTypes(object.right)
//			var variableType = lightweightTypeReference
//			if (lightweightTypeReference == null) 
//				variableType = computedType.actualExpressionType
//			
//			if (variableType != null && variableType.isPrimitiveVoid()) {
//				variableType = new UnknownTypeReference(variableType.getOwner());
//			}
//			state.assignType(object, variableType, false);
//			state.addExtensionToCurrentScope(object);
//		}
//		val primitiveVoid = getPrimitiveVoid(state);
//		state.acceptActualType(primitiveVoid);
//	}

}