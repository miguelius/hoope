package org.uqbar.hoope.lib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.core.resources.IProject;

public interface IHoopeInterpreter {
	void run(EObject program, IHoopePlayground playground);

	public IProject setProject(IProject project);
}
