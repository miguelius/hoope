package org.uqbar.hoope.lib;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.uqbar.hoope.lib.Activator;

@SuppressWarnings("all")
public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  protected Bundle getBundle() {
    Activator _instance = Activator.getInstance();
    Bundle _bundle = _instance.getBundle();
    return _bundle;
  }
  
  protected Injector getInjector() {
    Activator _instance = Activator.getInstance();
    Injector _injector = _instance.getInjector();
    return _injector;
  }
}
