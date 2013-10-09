package org.uqbar.hoope.lib;

import org.eclipse.core.resources.IProject;

public interface IProjectClassLoaderHelper {
	Class<?> loadClass(String fullyQualifiedName) throws ClassNotFoundException;

	Class<?> loadClass(IProject project, String fullyQualifiedName)
			throws ClassNotFoundException;
}
