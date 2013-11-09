package org.uqbar.hoope.lib

import com.google.inject.Binder
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.ui.DefaultUiModule
import org.uqbar.hoope.interpreter.HoopeGraphicObjectShellInterpreter

class HoopeLibModule extends DefaultUiModule {

	new(AbstractUIPlugin plugin) {
		super(plugin)
	}

	override configure(Binder binder) {
		super.configure(binder);
		binder.bind(AbstractUIPlugin).toInstance(Activator.instance)
	}

	def Class<? extends IProjectClassLoaderHelper> bindIProjectClassLoaderHelper() {
		ProjectClassLoaderHelper
	}

	def Class<? extends IHoopeInterpreter> bindIHoopeInterpreter() {
		HoopeGraphicObjectShellInterpreter
	}

	def Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
	}

	def com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		org.eclipse.xtext.ui.shared.Access.getJavaProjectsState();
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	def void configureHighlightingTokenDefProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider).annotatedWith(
			com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(
			org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider);
	}

}
