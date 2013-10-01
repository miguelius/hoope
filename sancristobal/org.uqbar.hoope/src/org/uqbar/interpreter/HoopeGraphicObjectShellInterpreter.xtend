package org.uqbar.interpreter

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.uqbar.hoope.HoopeObject
import org.uqbar.hoope.Program
import org.uqbar.hoope.lib.HoopeGraphicObject
import org.uqbar.hoope.lib.IHoopeInterpreter
import org.uqbar.jvmmodel.HoopeJvmModelInferrer

class HoopeGraphicObjectShellInterpreter extends XbaseInterpreter implements IHoopeInterpreter {

	@Inject extension IJvmModelAssociations 

	HoopeGraphicObject hoopeGraphicObject

	int stopAtLine

	override run(HoopeGraphicObject tortoise, EObject program, int stopAtLine) {
		if (tortoise != null && program != null) {
			this.hoopeGraphicObject = tortoise
			this.stopAtLine = stopAtLine
			try {
				program.jvmElements.filter(JvmOperation).head
					?.invokeOperation(tortoise, emptyList)
			} catch (StopLineReachedException exc) {
				// ignore
			}
		}
	}

	override protected internalEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		val line = NodeModelUtils.findActualNodeFor(expression)?.startLine
		if (line-1 == stopAtLine)
			throw new StopLineReachedException
		super.internalEvaluate(expression, context, indicator)
	}

	override protected invokeOperation(JvmOperation operation, Object receiver, List<Object> argumentValues) {
		val executable = operation.sourceElements.head
		if (executable instanceof XExpression) {
			val context = createContext
			context.newValue(XbaseScopeProvider.THIS, hoopeGraphicObject)
			var index = 0
			for (param : operation.parameters) {
				if (argumentValues.size == 0){
					context.newValue(QualifiedName.create(param.name), newArrayOfSize(0));
				} else {
					context.newValue(QualifiedName.create(param.name), argumentValues.get(index))
				}
				index = index + 1	
			}
			val result = evaluate((executable as Program), context, CancelIndicator.NullImpl)
			if(result.exception != null)
				throw result.exception
			result.result
		} else {
			super.invokeOperation(operation, receiver, argumentValues)
		}
	}
	
	@Inject extension HoopeJvmModelInferrer
	

	def dispatch Object doEvaluate(HoopeObject expression, IEvaluationContext context, CancelIndicator indicator) {
		expression
	}

	def override dispatch Object doEvaluate(XMemberFeatureCall featureCall, IEvaluationContext context, CancelIndicator indicator) {
		handleMemberFeatureCall(featureCall.actualReceiver, featureCall, context,indicator)
	}

	def dispatch handleMemberFeatureCall(HoopeObject receiver,XMemberFeatureCall featureCall, IEvaluationContext context, CancelIndicator indicator) {
		0
	}
	def dispatch handleMemberFeatureCall(XExpression receiver,XMemberFeatureCall featureCall, IEvaluationContext context, CancelIndicator indicator) {
		super.doEvaluate(featureCall,context,indicator)
	}

}

class StopLineReachedException extends RuntimeException {
}