package org.uqbar.hoope.lib;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.osgi.framework.BundleContext;
import org.uqbar.HoopeRuntimeModule;
import org.uqbar.hoope.lib.HoopeLibModule;

@SuppressWarnings("all")
public class Activator extends AbstractUIPlugin {
  public final static String ORG_UQBAR_HOOPE = "org.uqbar.Hoope";
  
  private final static Logger LOGGER = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = Logger.getLogger(Activator.class);
      return _logger;
    }
  }.apply();
  
  private static Activator INSTANCE;
  
  private Map<String,Injector> injectors = new Function0<Map<String,Injector>>() {
    public Map<String,Injector> apply() {
      HashMap<String,Injector> _newHashMapWithExpectedSize = Maps.<String, Injector>newHashMapWithExpectedSize(1);
      Map<String,Injector> _synchronizedMap = Collections.<String, Injector>synchronizedMap(_newHashMapWithExpectedSize);
      return _synchronizedMap;
    }
  }.apply();
  
  private Injector injector;
  
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    Activator.INSTANCE = this;
  }
  
  public void stop(final BundleContext context) throws Exception {
    super.stop(context);
    Activator.INSTANCE = null;
    this.injector = null;
  }
  
  public static Activator getInstance() {
    return Activator.INSTANCE;
  }
  
  public Injector getInjector() {
    Injector _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.injector, null);
      if (_equals) {
        Injector _createInjector = this.createInjector(Activator.ORG_UQBAR_HOOPE);
        this.injector = _createInjector;
      }
      _xblockexpression = (this.injector);
    }
    return _xblockexpression;
  }
  
  public Injector getInjector(final String language) {
    Injector _xblockexpression = null;
    {
      Injector injector = this.injectors.get(language);
      boolean _equals = Objects.equal(injector, null);
      if (_equals) {
        Injector _createInjector = this.createInjector(language);
        Injector _injector = injector = _createInjector;
        this.injectors.put(language, _injector);
      }
      _xblockexpression = (injector);
    }
    return _xblockexpression;
  }
  
  protected Injector createInjector(final String language) {
    Injector _xtrycatchfinallyexpression = null;
    try {
      Injector _xblockexpression = null;
      {
        final HoopeRuntimeModule runtimeModule = this.getRuntimeModule(language);
        final SharedStateModule sharedStateModule = this.getSharedStateModule();
        final HoopeLibModule uiModule = this.getUiModule(language);
        final Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
        Injector _createInjector = Guice.createInjector(mergedModule);
        _xblockexpression = (_createInjector);
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _plus = ("Failed to create injector for " + language);
        Activator.LOGGER.error(_plus);
        String _message = e.getMessage();
        Activator.LOGGER.error(_message, e);
        String _plus_1 = ("Failed to create injector for " + language);
        RuntimeException _runtimeException = new RuntimeException(_plus_1, e);
        throw _runtimeException;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected HoopeRuntimeModule getRuntimeModule(final String grammar) {
    boolean _equals = Activator.ORG_UQBAR_HOOPE.equals(grammar);
    if (_equals) {
      HoopeRuntimeModule _hoopeRuntimeModule = new HoopeRuntimeModule();
      return _hoopeRuntimeModule;
    }
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(grammar);
    throw _illegalArgumentException;
  }
  
  protected HoopeLibModule getUiModule(final String grammar) {
    boolean _equals = Activator.ORG_UQBAR_HOOPE.equals(grammar);
    if (_equals) {
      HoopeLibModule _hoopeLibModule = new HoopeLibModule(this);
      return _hoopeLibModule;
    }
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException(grammar);
    throw _illegalArgumentException;
  }
  
  protected SharedStateModule getSharedStateModule() {
    SharedStateModule _sharedStateModule = new SharedStateModule();
    return _sharedStateModule;
  }
}
