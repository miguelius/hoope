/*
 * generated by Xtext
 */
package org.uqbar;

import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.uqbar.hoope.lib.IHoopeInterpreter;
import org.uqbar.hoope.lib.IProjectClassLoaderHelper;
import org.uqbar.hoope.lib.ProjectClassLoaderHelper;
import org.uqbar.interpreter.HoopeGraphicObjectShellInterpreter;
import org.uqbar.jvmmodel.HoopeTypesBuilder;
import org.uqbar.scoping.HoopeImplicitlyImportedTypes;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class HoopeRuntimeModule extends org.uqbar.AbstractHoopeRuntimeModule {

    public Class<? extends ImplicitlyImportedTypes> bindImplicitlyImportedTypes() {
        return HoopeImplicitlyImportedTypes.class;
    }
    
    public Class<? extends ITypeProvider> bindITypeProvider() {
		return HoopeTypeProvider.class;
	}

	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return HoopeCompiler.class;
	}

	public Class<? extends IHoopeInterpreter> bindIHoopeInterpreter() {
		return HoopeGraphicObjectShellInterpreter.class;
	}
	
	public Class<? extends IProjectClassLoaderHelper> bindProjectClassLoader() {
		return ProjectClassLoaderHelper.class;
	}
	
	public Class<? extends ITypeComputer> bindITypeComputer() {
		return HoopeTypeComputer.class;
	}
	
//	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder() {
//		return HoopeTypesBuilder.class;
//	}
}
