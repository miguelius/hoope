package org.uqbar;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.uqbar.hoope.HoopeObject;
import org.uqbar.jvmmodel.HoopeJvmModelInferrer;

@Singleton
@SuppressWarnings("all")
public class HoopeTypeProvider extends XbaseTypeProvider {
  @Inject
  @Extension
  private HoopeJvmModelInferrer _hoopeJvmModelInferrer;
  
  public JvmTypeReference type(final XExpression expression, final JvmTypeReference rawExpectation, final boolean rawType) {
    JvmTypeReference _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof HoopeObject) {
        final HoopeObject _hoopeObject = (HoopeObject)expression;
        _matched=true;
        TypeReferences _typeReferences = this.getTypeReferences();
        JvmGenericType _type = this._hoopeJvmModelInferrer.getType(_hoopeObject);
        String _qualifiedName = _type.getQualifiedName('.');
        JvmTypeReference _typeForName = _typeReferences.getTypeForName(_qualifiedName, _hoopeObject);
        _switchResult = _typeForName;
      }
    }
    if (!_matched) {
      JvmTypeReference _type = super.type(expression, rawExpectation, rawType);
      _switchResult = _type;
    }
    return _switchResult;
  }
}
