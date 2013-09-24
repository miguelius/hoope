package org.uqbar.hoope.lib

import org.eclipse.ui.plugin.AbstractUIPlugin
import com.google.inject.Injector
import org.osgi.framework.BundleContext
import com.google.inject.Guice

class Activator extends AbstractUIPlugin {
	
	static Activator INSTANCE
	
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
			injector = createInjector
		injector
	}

	def protected createInjector() {
		Guice.createInjector(new Module());
	}
}