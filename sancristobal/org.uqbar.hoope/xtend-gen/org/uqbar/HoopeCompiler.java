package org.uqbar;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Arrays;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
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
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValueBinaryOperation;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.Extension;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.jvmmodel.HoopeJvmModelInferrer;

@Singleton
@SuppressWarnings("all")
public class HoopeCompiler extends XbaseCompiler {
  public void doInternalToJavaStatement(final XExpression obj, final ITreeAppendable appendable, final boolean isReferenced) {
    this.toJavaStatement(obj, appendable, isReferenced);
  }
  
  public void internalToConvertedExpression(final XExpression obj, final ITreeAppendable appendable) {
    this.toJavaExpression(obj, appendable);
  }
  
  protected void _toJavaStatement(final HoopeObject object, final ITreeAppendable appendable, final boolean isReferenced) {
  }
  
  @Inject
  @Extension
  private HoopeJvmModelInferrer _hoopeJvmModelInferrer;
  
  protected void _toJavaExpression(final HoopeObject object, final ITreeAppendable b) {
    ITreeAppendable _append = b.append("new ");
    JvmGenericType _type = this._hoopeJvmModelInferrer.getType(object);
    ITreeAppendable _append_1 = _append.append(_type);
    _append_1.append("();");
  }
  
  public void toJavaStatement(final XExpression expr, final ITreeAppendable b, final boolean isReferenced) {
    if (expr instanceof XDoWhileExpression) {
      _toJavaStatement((XDoWhileExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XFeatureCall) {
      _toJavaStatement((XFeatureCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XListLiteral) {
      _toJavaStatement((XListLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XSetLiteral) {
      _toJavaStatement((XSetLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XWhileExpression) {
      _toJavaStatement((XWhileExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XAbstractFeatureCall) {
      _toJavaStatement((XAbstractFeatureCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XBlockExpression) {
      _toJavaStatement((XBlockExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XBooleanLiteral) {
      _toJavaStatement((XBooleanLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XCastedExpression) {
      _toJavaStatement((XCastedExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XClosure) {
      _toJavaStatement((XClosure)expr, b, isReferenced);
      return;
    } else if (expr instanceof XConstructorCall) {
      _toJavaStatement((XConstructorCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XForLoopExpression) {
      _toJavaStatement((XForLoopExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XIfExpression) {
      _toJavaStatement((XIfExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XInstanceOfExpression) {
      _toJavaStatement((XInstanceOfExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XNullLiteral) {
      _toJavaStatement((XNullLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XNumberLiteral) {
      _toJavaStatement((XNumberLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XReturnExpression) {
      _toJavaStatement((XReturnExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XStringLiteral) {
      _toJavaStatement((XStringLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XSwitchExpression) {
      _toJavaStatement((XSwitchExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XThrowExpression) {
      _toJavaStatement((XThrowExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XTryCatchFinallyExpression) {
      _toJavaStatement((XTryCatchFinallyExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XTypeLiteral) {
      _toJavaStatement((XTypeLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XVariableDeclaration) {
      _toJavaStatement((XVariableDeclaration)expr, b, isReferenced);
      return;
    } else if (expr instanceof XAnnotationElementValueBinaryOperation) {
      _toJavaStatement((XAnnotationElementValueBinaryOperation)expr, b, isReferenced);
      return;
    } else if (expr instanceof HoopeObject) {
      _toJavaStatement((HoopeObject)expr, b, isReferenced);
      return;
    } else if (expr != null) {
      _toJavaStatement(expr, b, isReferenced);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, b, isReferenced).toString());
    }
  }
  
  public void toJavaExpression(final XExpression literal, final ITreeAppendable b) {
    if (literal instanceof XListLiteral) {
      _toJavaExpression((XListLiteral)literal, b);
      return;
    } else if (literal instanceof XSetLiteral) {
      _toJavaExpression((XSetLiteral)literal, b);
      return;
    } else if (literal instanceof XAbstractFeatureCall) {
      _toJavaExpression((XAbstractFeatureCall)literal, b);
      return;
    } else if (literal instanceof XBlockExpression) {
      _toJavaExpression((XBlockExpression)literal, b);
      return;
    } else if (literal instanceof XBooleanLiteral) {
      _toJavaExpression((XBooleanLiteral)literal, b);
      return;
    } else if (literal instanceof XCastedExpression) {
      _toJavaExpression((XCastedExpression)literal, b);
      return;
    } else if (literal instanceof XClosure) {
      _toJavaExpression((XClosure)literal, b);
      return;
    } else if (literal instanceof XConstructorCall) {
      _toJavaExpression((XConstructorCall)literal, b);
      return;
    } else if (literal instanceof XIfExpression) {
      _toJavaExpression((XIfExpression)literal, b);
      return;
    } else if (literal instanceof XInstanceOfExpression) {
      _toJavaExpression((XInstanceOfExpression)literal, b);
      return;
    } else if (literal instanceof XNullLiteral) {
      _toJavaExpression((XNullLiteral)literal, b);
      return;
    } else if (literal instanceof XNumberLiteral) {
      _toJavaExpression((XNumberLiteral)literal, b);
      return;
    } else if (literal instanceof XStringLiteral) {
      _toJavaExpression((XStringLiteral)literal, b);
      return;
    } else if (literal instanceof XSwitchExpression) {
      _toJavaExpression((XSwitchExpression)literal, b);
      return;
    } else if (literal instanceof XTryCatchFinallyExpression) {
      _toJavaExpression((XTryCatchFinallyExpression)literal, b);
      return;
    } else if (literal instanceof XTypeLiteral) {
      _toJavaExpression((XTypeLiteral)literal, b);
      return;
    } else if (literal instanceof XAnnotationElementValueBinaryOperation) {
      _toJavaExpression((XAnnotationElementValueBinaryOperation)literal, b);
      return;
    } else if (literal instanceof HoopeObject) {
      _toJavaExpression((HoopeObject)literal, b);
      return;
    } else if (literal != null) {
      _toJavaExpression(literal, b);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(literal, b).toString());
    }
  }
}
