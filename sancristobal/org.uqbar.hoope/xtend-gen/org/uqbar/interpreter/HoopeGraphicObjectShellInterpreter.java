package org.uqbar.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.hoope.Feature;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.hoope.Program;
import org.uqbar.hoope.lib.IHoopeInterpreter;
import org.uqbar.hoope.lib.IHoopePlayground;
import org.uqbar.hoope.lib.IProjectClassLoaderHelper;
import org.uqbar.jvmmodel.HoopeJvmModelInferrer;

@SuppressWarnings("all")
public class HoopeGraphicObjectShellInterpreter extends XbaseInterpreter implements IHoopeInterpreter {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private IProjectClassLoaderHelper _iProjectClassLoaderHelper;
  
  @Inject
  private IEvaluationContext context;
  
  private static Logger log = new Function0<Logger>() {
    public Logger apply() {
      String _name = HoopeGraphicObjectShellInterpreter.class.getName();
      Logger _logger = Logger.getLogger(_name);
      return _logger;
    }
  }.apply();
  
  private IProject project;
  
  public void run(final EObject program, final IHoopePlayground playground) {
    final IEvaluationContext runningContext = this.context.fork();
    boolean _notEquals = (!Objects.equal(program, null));
    if (_notEquals) {
      EList<XExpression> _expressions = ((Program) program).getExpressions();
      final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
          public void apply(final XExpression it) {
            HoopeGraphicObjectShellInterpreter.this.evaluate(it, runningContext, null);
          }
        };
      IterableExtensions.<XExpression>forEach(_expressions, _function);
      EList<XExpression> _expressions_1 = ((Program) program).getExpressions();
      Iterable<XVariableDeclaration> _filter = Iterables.<XVariableDeclaration>filter(_expressions_1, XVariableDeclaration.class);
      final Function1<XVariableDeclaration,XExpression> _function_1 = new Function1<XVariableDeclaration,XExpression>() {
          public XExpression apply(final XVariableDeclaration it) {
            XExpression _right = ((XVariableDeclaration) it).getRight();
            return _right;
          }
        };
      Iterable<XExpression> _map = IterableExtensions.<XVariableDeclaration, XExpression>map(_filter, _function_1);
      Iterable<HoopeObject> _filter_1 = Iterables.<HoopeObject>filter(_map, HoopeObject.class);
      final Function1<HoopeObject,Pair<HoopeObject,EList<Feature>>> _function_2 = new Function1<HoopeObject,Pair<HoopeObject,EList<Feature>>>() {
          public Pair<HoopeObject,EList<Feature>> apply(final HoopeObject t) {
            EList<Feature> _features = t.getFeatures();
            Pair<HoopeObject,EList<Feature>> _mappedTo = Pair.<HoopeObject, EList<Feature>>of(t, _features);
            return _mappedTo;
          }
        };
      Iterable<Pair<HoopeObject,EList<Feature>>> _map_1 = IterableExtensions.<HoopeObject, Pair<HoopeObject,EList<Feature>>>map(_filter_1, _function_2);
      final Function1<Pair<HoopeObject,EList<Feature>>,Boolean> _function_3 = new Function1<Pair<HoopeObject,EList<Feature>>,Boolean>() {
          public Boolean apply(final Pair<HoopeObject,EList<Feature>> it) {
            EList<Feature> _value = it.getValue();
            final Function1<Feature,Boolean> _function = new Function1<Feature,Boolean>() {
                public Boolean apply(final Feature f) {
                  String _name = f.getName();
                  boolean _equals = Objects.equal(_name, "position");
                  return Boolean.valueOf(_equals);
                }
              };
            boolean _exists = IterableExtensions.<Feature>exists(_value, _function);
            return Boolean.valueOf(_exists);
          }
        };
      Iterable<Pair<HoopeObject,EList<Feature>>> _filter_2 = IterableExtensions.<Pair<HoopeObject,EList<Feature>>>filter(_map_1, _function_3);
      final Function1<Pair<HoopeObject,EList<Feature>>,HoopeObject> _function_4 = new Function1<Pair<HoopeObject,EList<Feature>>,HoopeObject>() {
          public HoopeObject apply(final Pair<HoopeObject,EList<Feature>> it) {
            HoopeObject _key = it.getKey();
            return _key;
          }
        };
      final Iterable<HoopeObject> dibujables = IterableExtensions.<Pair<HoopeObject,EList<Feature>>, HoopeObject>map(_filter_2, _function_4);
      final Procedure1<HoopeObject> _function_5 = new Procedure1<HoopeObject>() {
          public void apply(final HoopeObject it) {
            EObject _eContainer = it.eContainer();
            String _name = ((XVariableDeclaration) _eContainer).getName();
            Object _doEvaluate = HoopeGraphicObjectShellInterpreter.this.doEvaluate(it, runningContext, null);
            playground.registerGraphicObject(_name, _doEvaluate);
          }
        };
      IterableExtensions.<HoopeObject>forEach(dibujables, _function_5);
      final Function2<String,HoopeObject,String> _function_6 = new Function2<String,HoopeObject,String>() {
          public String apply(final String x, final HoopeObject t) {
            Object _doEvaluate = HoopeGraphicObjectShellInterpreter.this.doEvaluate(t, runningContext, null);
            String _plus = (x + _doEvaluate);
            return _plus;
          }
        };
      String _fold = IterableExtensions.<HoopeObject, String>fold(dibujables, "dibujables: ", _function_6);
      HoopeGraphicObjectShellInterpreter.log.info(_fold);
    }
  }
  
  @Inject
  @Extension
  private HoopeJvmModelInferrer _hoopeJvmModelInferrer;
  
  public Object doEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) {
    try {
      Object _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("evaluando: ");
        String _string = expression.toString();
        _builder.append(_string, " ");
        _builder.append(" ");
        HoopeGraphicObjectShellInterpreter.log.info(_builder.toString());
        Object _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (expression instanceof HoopeObject) {
            final HoopeObject _hoopeObject = (HoopeObject)expression;
            _matched=true;
            Object _xblockexpression_1 = null;
            {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(" ");
              _builder_1.append("se comopne de: ");
              Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(_hoopeObject);
              EObject _head = IterableExtensions.<EObject>head(_jvmElements);
              _builder_1.append(_head, " ");
              _builder_1.append(" ");
              HoopeGraphicObjectShellInterpreter.log.info(_builder_1.toString());
              Set<EObject> _jvmElements_1 = this._iJvmModelAssociations.getJvmElements(_hoopeObject);
              EObject _head_1 = IterableExtensions.<EObject>head(_jvmElements_1);
              String _identifier = ((JvmGenericType) _head_1).getIdentifier();
              Class<? extends Object> _loadClass = this._iProjectClassLoaderHelper.loadClass(this.project, _identifier);
              Object _newInstance = _loadClass.newInstance();
              _xblockexpression_1 = (_newInstance);
            }
            _switchResult = _xblockexpression_1;
          }
        }
        if (!_matched) {
          if (expression instanceof XExpression) {
            final XExpression _xExpression = (XExpression)expression;
            _matched=true;
            Object _doEvaluate = super.doEvaluate(_xExpression, context, indicator);
            _switchResult = _doEvaluate;
          }
        }
        _xblockexpression = (_switchResult);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object invokeOperation(final JvmOperation operation, final Object receiver, final List<Object> argumentValues) {
    Object _xblockexpression = null;
    {
      JavaReflectAccess _javaReflectAccess = this.getJavaReflectAccess();
      Class<? extends Object> _class = receiver.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      _javaReflectAccess.setClassLoader(_classLoader);
      Object _invokeOperation = super.invokeOperation(operation, receiver, argumentValues);
      _xblockexpression = (_invokeOperation);
    }
    return _xblockexpression;
  }
  
  public IProject setProject(final IProject project) {
    IProject _project = this.project = project;
    return _project;
  }
}
