package org.uqbar.hoope.lib

import com.google.common.collect.Maps
import com.google.inject.Guice
import com.google.inject.Injector
import java.util.Collections
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.util.Modules2
import org.osgi.framework.BundleContext
import org.eclipse.xtext.ui.shared.SharedStateModule

class Activator extends AbstractUIPlugin {
	
	public static val String ORG_UQBAR_HOOPE = "org.uqbar.Hoope";
	
	static val LOGGER = Logger::getLogger(Activator)
	
	static Activator INSTANCE
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	Injector injector;
	
	override start(BundleContext context) throws Exception {
		super.start(context)
		INSTANCE = this
	}

	override stop(BundleContext context) throws Exception {
		super.stop(context)
		INSTANCE = null
		injector = null
	}

	def static getInstance() {
		INSTANCE
	}

	def getInjector() {
		if(injector == null)
			injector = createInjector(ORG_UQBAR_HOOPE)
		injector
	}

	def Injector getInjector(String language) {
//		synchronized (injectors) {
			var injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			injector;
//		}
	}
	
	def protected createInjector(String language) {
		try {
			val runtimeModule = getRuntimeModule(language);
			val sharedStateModule = getSharedStateModule();
			val uiModule = getUiModule(language);
			val mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			Guice.createInjector(mergedModule);
		} catch (Exception e) {
			LOGGER.error("Failed to create injector for " + language);
			LOGGER.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}

		//Guice.createInjector(new org.uqbar.hoope.lib.HoopeLibModule());
	}
	
	def	protected getRuntimeModule(String grammar) {
		if (ORG_UQBAR_HOOPE.equals(grammar)) {
			return new org.uqbar.HoopeRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	def protected getUiModule(String grammar) {
		if (ORG_UQBAR_HOOPE.equals(grammar)) {
			return new HoopeLibModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	def protected getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
	
}