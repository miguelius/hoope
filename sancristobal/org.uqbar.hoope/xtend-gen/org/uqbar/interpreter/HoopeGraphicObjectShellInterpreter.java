package org.uqbar.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
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
import org.eclipse.xtext.xbase.XMemberFeatureCall;
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
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.hoope.Program;
import org.uqbar.hoope.lib.HoopeGraphicObject;
import org.uqbar.hoope.lib.IHoopeInterpreter;
import org.uqbar.interpreter.StopLineReachedException;
import org.uqbar.jvmmodel.HoopeJvmModelInferrer;

@SuppressWarnings("all")
public class HoopeGraphicObjectShellInterpreter extends XbaseInterpreter implements IHoopeInterpreter {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  private HoopeGraphicObject hoopeGraphicObject;
  
  private int stopAtLine;
  
  public void run(final HoopeGraphicObject golondrina, final EObject program, final int stopAtLine) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(golondrina, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(program, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      this.hoopeGraphicObject = golondrina;
      this.stopAtLine = stopAtLine;
      try {
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(program);
        Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_jvmElements, JvmOperation.class);
        JvmOperation _head = IterableExtensions.<JvmOperation>head(_filter);
        if (_head!=null) {
          List<Object> _emptyList = CollectionLiterals.<Object>emptyList();
          this.invokeOperation(_head, golondrina, _emptyList);
        }
      } catch (final Throwable _t) {
        if (_t instanceof StopLineReachedException) {
          final StopLineReachedException exc = (StopLineReachedException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  protected Object internalEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      ICompositeNode _findActualNodeFor = NodeModelUtils.findActualNodeFor(expression);
      int _startLine = 0;
      if (_findActualNodeFor!=null) {
        _startLine=_findActualNodeFor.getStartLine();
      }
      final int line = _startLine;
      int _minus = (line - 1);
      boolean _equals = (_minus == this.stopAtLine);
      if (_equals) {
        StopLineReachedException _stopLineReachedException = new StopLineReachedException();
        throw _stopLineReachedException;
      }
      Object _internalEvaluate = super.internalEvaluate(expression, context, indicator);
      _xblockexpression = (_internalEvaluate);
    }
    return _xblockexpression;
  }
  
  protected Object invokeOperation(final JvmOperation operation, final Object receiver, final List<Object> argumentValues) {
    try {
      Object _xblockexpression = null;
      {
        Set<EObject> _sourceElements = this._iJvmModelAssociations.getSourceElements(operation);
        final EObject executable = IterableExtensions.<EObject>head(_sourceElements);
        Object _xifexpression = null;
        if ((executable instanceof XExpression)) {
          Object _xblockexpression_1 = null;
          {
            final IEvaluationContext context = this.createContext();
            context.newValue(XbaseScopeProvider.THIS, this.hoopeGraphicObject);
            int index = 0;
            EList<JvmFormalParameter> _parameters = operation.getParameters();
            for (final JvmFormalParameter param : _parameters) {
              {
                int _size = argumentValues.size();
                boolean _equals = (_size == 0);
                if (_equals) {
                  String _name = param.getName();
                  QualifiedName _create = QualifiedName.create(_name);
                  Object[] _newArrayOfSize = new Object[0];
                  context.newValue(_create, _newArrayOfSize);
                } else {
                  String _name_1 = param.getName();
                  QualifiedName _create_1 = QualifiedName.create(_name_1);
                  Object _get = argumentValues.get(index);
                  context.newValue(_create_1, _get);
                }
                int _plus = (index + 1);
                index = _plus;
              }
            }
            final IEvaluationResult result = this.evaluate(((Program) executable), context, CancelIndicator.NullImpl);
            Throwable _exception = result.getException();
            boolean _notEquals = (!Objects.equal(_exception, null));
            if (_notEquals) {
              throw result.getException();
            }
            Object _result = result.getResult();
            _xblockexpression_1 = (_result);
          }
          _xifexpression = _xblockexpression_1;
        } else {
          Object _invokeOperation = super.invokeOperation(operation, receiver, argumentValues);
          _xifexpression = _invokeOperation;
        }
        _xblockexpression = (_xifexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Inject
  @Extension
  private HoopeJvmModelInferrer _hoopeJvmModelInferrer;
  
  protected Object _doEvaluate(final HoopeObject expression, final IEvaluationContext context, final CancelIndicator indicator) {
    return expression;
  }
  
  protected Object _doEvaluate(final XMemberFeatureCall featureCall, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _actualReceiver = featureCall.getActualReceiver();
    Object _handleMemberFeatureCall = this.handleMemberFeatureCall(_actualReceiver, featureCall, context, indicator);
    return _handleMemberFeatureCall;
  }
  
  protected Object _handleMemberFeatureCall(final HoopeObject receiver, final XMemberFeatureCall featureCall, final IEvaluationContext context, final CancelIndicator indicator) {
    return 0;
  }
  
  protected Object _handleMemberFeatureCall(final XExpression receiver, final XMemberFeatureCall featureCall, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _doEvaluate = super.doEvaluate(featureCall, context, indicator);
    return _doEvaluate;
  }
  
  public Object doEvaluate(final XExpression assignment, final IEvaluationContext context, final CancelIndicator indicator) {
    if (assignment instanceof XAssignment) {
      return _doEvaluate((XAssignment)assignment, context, indicator);
    } else if (assignment instanceof XDoWhileExpression) {
      return _doEvaluate((XDoWhileExpression)assignment, context, indicator);
    } else if (assignment instanceof XFeatureCall) {
      return _doEvaluate((XFeatureCall)assignment, context, indicator);
    } else if (assignment instanceof XListLiteral) {
      return _doEvaluate((XListLiteral)assignment, context, indicator);
    } else if (assignment instanceof XMemberFeatureCall) {
      return _doEvaluate((XMemberFeatureCall)assignment, context, indicator);
    } else if (assignment instanceof XSetLiteral) {
      return _doEvaluate((XSetLiteral)assignment, context, indicator);
    } else if (assignment instanceof XWhileExpression) {
      return _doEvaluate((XWhileExpression)assignment, context, indicator);
    } else if (assignment instanceof XAbstractFeatureCall) {
      return _doEvaluate((XAbstractFeatureCall)assignment, context, indicator);
    } else if (assignment instanceof XBlockExpression) {
      return _doEvaluate((XBlockExpression)assignment, context, indicator);
    } else if (assignment instanceof XBooleanLiteral) {
      return _doEvaluate((XBooleanLiteral)assignment, context, indicator);
    } else if (assignment instanceof XCastedExpression) {
      return _doEvaluate((XCastedExpression)assignment, context, indicator);
    } else if (assignment instanceof XClosure) {
      return _doEvaluate((XClosure)assignment, context, indicator);
    } else if (assignment instanceof XConstructorCall) {
      return _doEvaluate((XConstructorCall)assignment, context, indicator);
    } else if (assignment instanceof XForLoopExpression) {
      return _doEvaluate((XForLoopExpression)assignment, context, indicator);
    } else if (assignment instanceof XIfExpression) {
      return _doEvaluate((XIfExpression)assignment, context, indicator);
    } else if (assignment instanceof XInstanceOfExpression) {
      return _doEvaluate((XInstanceOfExpression)assignment, context, indicator);
    } else if (assignment instanceof XNullLiteral) {
      return _doEvaluate((XNullLiteral)assignment, context, indicator);
    } else if (assignment instanceof XNumberLiteral) {
      return _doEvaluate((XNumberLiteral)assignment, context, indicator);
    } else if (assignment instanceof XReturnExpression) {
      return _doEvaluate((XReturnExpression)assignment, context, indicator);
    } else if (assignment instanceof XStringLiteral) {
      return _doEvaluate((XStringLiteral)assignment, context, indicator);
    } else if (assignment instanceof XSwitchExpression) {
      return _doEvaluate((XSwitchExpression)assignment, context, indicator);
    } else if (assignment instanceof XThrowExpression) {
      return _doEvaluate((XThrowExpression)assignment, context, indicator);
    } else if (assignment instanceof XTryCatchFinallyExpression) {
      return _doEvaluate((XTryCatchFinallyExpression)assignment, context, indicator);
    } else if (assignment instanceof XTypeLiteral) {
      return _doEvaluate((XTypeLiteral)assignment, context, indicator);
    } else if (assignment instanceof XVariableDeclaration) {
      return _doEvaluate((XVariableDeclaration)assignment, context, indicator);
    } else if (assignment instanceof HoopeObject) {
      return _doEvaluate((HoopeObject)assignment, context, indicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, context, indicator).toString());
    }
  }
  
  public Object handleMemberFeatureCall(final XExpression receiver, final XMemberFeatureCall featureCall, final IEvaluationContext context, final CancelIndicator indicator) {
    if (receiver instanceof HoopeObject) {
      return _handleMemberFeatureCall((HoopeObject)receiver, featureCall, context, indicator);
    } else if (receiver != null) {
      return _handleMemberFeatureCall(receiver, featureCall, context, indicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(receiver, featureCall, context, indicator).toString());
    }
  }
}
