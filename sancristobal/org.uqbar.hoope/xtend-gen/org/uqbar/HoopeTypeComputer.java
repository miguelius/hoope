package org.uqbar;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.jvmmodel.HoopeJvmModelInferrer;

@SuppressWarnings("all")
public class HoopeTypeComputer extends XbaseTypeComputer {
  @Inject
  @Extension
  private HoopeJvmModelInferrer _hoopeJvmModelInferrer;
  
  protected void _computeTypes(final HoopeObject hoopObject, final ITypeComputationState state) {
    ITypeReferenceOwner _referenceOwner = state.getReferenceOwner();
    JvmGenericType _type = this._hoopeJvmModelInferrer.getType(hoopObject);
    ParameterizedTypeReference _parameterizedTypeReference = new ParameterizedTypeReference(_referenceOwner, _type);
    final ParameterizedTypeReference type = _parameterizedTypeReference;
    state.acceptActualType(type);
  }
  
  public void computeTypes(final XExpression assignment, final ITypeComputationState state) {
    if (assignment instanceof XAssignment) {
      _computeTypes((XAssignment)assignment, state);
      return;
    } else if (assignment instanceof XDoWhileExpression) {
      _computeTypes((XDoWhileExpression)assignment, state);
      return;
    } else if (assignment instanceof XListLiteral) {
      _computeTypes((XListLiteral)assignment, state);
      return;
    } else if (assignment instanceof XSetLiteral) {
      _computeTypes((XSetLiteral)assignment, state);
      return;
    } else if (assignment instanceof XAbstractFeatureCall) {
      _computeTypes((XAbstractFeatureCall)assignment, state);
      return;
    } else if (assignment instanceof XAbstractWhileExpression) {
      _computeTypes((XAbstractWhileExpression)assignment, state);
      return;
    } else if (assignment instanceof XBlockExpression) {
      _computeTypes((XBlockExpression)assignment, state);
      return;
    } else if (assignment instanceof XBooleanLiteral) {
      _computeTypes((XBooleanLiteral)assignment, state);
      return;
    } else if (assignment instanceof XCastedExpression) {
      _computeTypes((XCastedExpression)assignment, state);
      return;
    } else if (assignment instanceof XClosure) {
      _computeTypes((XClosure)assignment, state);
      return;
    } else if (assignment instanceof XConstructorCall) {
      _computeTypes((XConstructorCall)assignment, state);
      return;
    } else if (assignment instanceof XForLoopExpression) {
      _computeTypes((XForLoopExpression)assignment, state);
      return;
    } else if (assignment instanceof XIfExpression) {
      _computeTypes((XIfExpression)assignment, state);
      return;
    } else if (assignment instanceof XInstanceOfExpression) {
      _computeTypes((XInstanceOfExpression)assignment, state);
      return;
    } else if (assignment instanceof XNullLiteral) {
      _computeTypes((XNullLiteral)assignment, state);
      return;
    } else if (assignment instanceof XNumberLiteral) {
      _computeTypes((XNumberLiteral)assignment, state);
      return;
    } else if (assignment instanceof XReturnExpression) {
      _computeTypes((XReturnExpression)assignment, state);
      return;
    } else if (assignment instanceof XStringLiteral) {
      _computeTypes((XStringLiteral)assignment, state);
      return;
    } else if (assignment instanceof XSwitchExpression) {
      _computeTypes((XSwitchExpression)assignment, state);
      return;
    } else if (assignment instanceof XThrowExpression) {
      _computeTypes((XThrowExpression)assignment, state);
      return;
    } else if (assignment instanceof XTryCatchFinallyExpression) {
      _computeTypes((XTryCatchFinallyExpression)assignment, state);
      return;
    } else if (assignment instanceof XTypeLiteral) {
      _computeTypes((XTypeLiteral)assignment, state);
      return;
    } else if (assignment instanceof XVariableDeclaration) {
      _computeTypes((XVariableDeclaration)assignment, state);
      return;
    } else if (assignment instanceof HoopeObject) {
      _computeTypes((HoopeObject)assignment, state);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, state).toString());
    }
  }
}
