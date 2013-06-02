/*
 * generated by Xtext
 */
package org.uqbar.hoope.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.uqbar.hoope.ui.internal.HOOPLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HOOPLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HOOPLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HOOPLActivator.getInstance().getInjector(HOOPLActivator.ORG_UQBAR_HOOPE_HOOPL);
	}
	
}
