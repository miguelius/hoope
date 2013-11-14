package org.uqbar.jvmmodel;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Point;
import java.util.Arrays;
import java.util.Observable;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.uqbar.HoopeCompiler;
import org.uqbar.hoope.Coordinates;
import org.uqbar.hoope.Feature;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.hoope.Message;
import org.uqbar.hoope.Program;
import org.uqbar.hoope.Property;
import org.uqbar.jvmmodel.HoopeTypesBuilder;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@Singleton
@SuppressWarnings("all")
public class HoopeJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private ITypeProvider typeProvider;
  
  @Inject
  @Extension
  private HoopeTypesBuilder _hoopeTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private XExpressionHelper _xExpressionHelper;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private HoopeCompiler _hoopeCompiler;
  
  private int count = 0;
  
  protected void _infer(final Program element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    this.count = 0;
    final JvmGenericType mainClass = this._hoopeTypesBuilder.toClass(element, "examples.hoope.Main");
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(mainClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = HoopeJvmModelInferrer.this._hoopeTypesBuilder.getDocumentation(element);
        HoopeJvmModelInferrer.this._hoopeTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeForName = HoopeJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = HoopeJvmModelInferrer.this._typeReferences.getTypeForName(String.class, element);
            JvmGenericArrayTypeReference _createArrayType = HoopeJvmModelInferrer.this._typeReferences.createArrayType(_typeForName);
            JvmFormalParameter _parameter = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toParameter(element, "args", _createArrayType);
            HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            HoopeJvmModelInferrer.this._hoopeTypesBuilder.setBody(it, element);
          }
        };
        JvmOperation _method = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toMethod(element, "main", _typeForName, _function);
        HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmOperation>operator_add(_members, _method);
      }
    };
    _accept.initializeLater(_function);
    EList<XExpression> _expressions = element.getExpressions();
    for (final XExpression expression : _expressions) {
      this.infer(expression, acceptor, isPrelinkingPhase);
    }
  }
  
  protected void _infer(final Coordinates element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    this._hoopeTypesBuilder.newTypeRef(element, Point.class);
  }
  
  protected void _infer(final HoopeObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    String _plus = ("examples.hoope.HoopeObject" + Integer.valueOf(this.count));
    JvmGenericType jvmGenericType = this._hoopeTypesBuilder.toClass(element, _plus);
    EList<JvmTypeReference> _superTypes = jvmGenericType.getSuperTypes();
    JvmTypeReference _newTypeRef = this._hoopeTypesBuilder.newTypeRef(element, Observable.class);
    _superTypes.add(_newTypeRef);
    EList<JvmTypeReference> _superTypes_1 = jvmGenericType.getSuperTypes();
    JvmTypeReference _newTypeRef_1 = this._hoopeTypesBuilder.newTypeRef(element, Cloneable.class);
    this._hoopeTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _newTypeRef_1);
    int _plus_1 = (this.count + 1);
    this.count = _plus_1;
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(jvmGenericType);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = HoopeJvmModelInferrer.this._hoopeTypesBuilder.getDocumentation(element);
        HoopeJvmModelInferrer.this._hoopeTypesBuilder.setDocumentation(it, _documentation);
        EList<Feature> _features = element.getFeatures();
        for (final Feature feature : _features) {
          boolean _matched = false;
          if (!_matched) {
            if (feature instanceof Property) {
              final Property _property = (Property)feature;
              _matched=true;
              JvmTypeReference _elvis = null;
              JvmTypeReference _type = _property.getType();
              if (_type != null) {
                _elvis = _type;
              } else {
                JvmTypeReference _inferredType = null;
                XExpression _value = _property.getValue();
                if (_value!=null) {
                  _inferredType=HoopeJvmModelInferrer.this._hoopeTypesBuilder.inferredType(_value);
                }
                _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _inferredType);
              }
              final JvmTypeReference type = _elvis;
              EList<JvmMember> _members = it.getMembers();
              String _name = _property.getName();
              final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                public void apply(final JvmField it) {
                  XExpression _value = _property.getValue();
                  HoopeJvmModelInferrer.this._hoopeTypesBuilder.setInitializer(it, _value);
                }
              };
              JvmField _field = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toField(_property, _name, type, _function);
              HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmField>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              String _name_1 = _property.getName();
              JvmOperation _getter = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toGetter(_property, _name_1, type);
              HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
              EList<JvmMember> _members_2 = it.getMembers();
              String _name_2 = _property.getName();
              JvmOperation _observedSetter = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toObservedSetter(_property, _name_2, type);
              HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmOperation>operator_add(_members_2, _observedSetter);
            }
          }
          if (!_matched) {
            if (feature instanceof Message) {
              final Message _message = (Message)feature;
              _matched=true;
              String methodName = _message.getName();
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _type = _message.getType();
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = HoopeJvmModelInferrer.this._hoopeTypesBuilder.getDocumentation(_message);
                  HoopeJvmModelInferrer.this._hoopeTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _params = _message.getParams();
                  for (final JvmFormalParameter p : _params) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p.getName();
                    JvmTypeReference _parameterType = p.getParameterType();
                    JvmFormalParameter _parameter = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toParameter(p, _name, _parameterType);
                    HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                  XExpression _body = _message.getBody();
                  HoopeJvmModelInferrer.this._hoopeTypesBuilder.setBody(it, _body);
                }
              };
              JvmOperation _method = HoopeJvmModelInferrer.this._hoopeTypesBuilder.toMethod(_message, methodName, _type, _function);
              HoopeJvmModelInferrer.this._hoopeTypesBuilder.<JvmOperation>operator_add(_members, _method);
            }
          }
        }
      }
    };
    _accept.initializeLater(_function);
  }
  
  public String methodCall(final String methodName, final EList<JvmFormalParameter> params) {
    StringBuilder _stringBuilder = new StringBuilder(methodName);
    final StringBuilder sb = _stringBuilder;
    sb.append("(");
    boolean _isEmpty = params.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      JvmFormalParameter _head = IterableExtensions.<JvmFormalParameter>head(params);
      String _name = _head.getName();
      sb.append(_name);
      Iterable<JvmFormalParameter> _tail = IterableExtensions.<JvmFormalParameter>tail(params);
      final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
        public void apply(final JvmFormalParameter it) {
          sb.append(", ");
          String _name = it.getName();
          sb.append(_name);
        }
      };
      IterableExtensions.<JvmFormalParameter>forEach(_tail, _function);
    }
    sb.append(");\n");
    return sb.toString();
  }
  
  public JvmGenericType getType(final HoopeObject element) {
    Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(element);
    EObject _head = IterableExtensions.<EObject>head(_jvmElements);
    return ((JvmGenericType) _head);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (element instanceof Program) {
      _infer((Program)element, acceptor, isPrelinkingPhase);
      return;
    } else if (element instanceof Coordinates) {
      _infer((Coordinates)element, acceptor, isPrelinkingPhase);
      return;
    } else if (element instanceof HoopeObject) {
      _infer((HoopeObject)element, acceptor, isPrelinkingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPrelinkingPhase).toString());
    }
  }
}
