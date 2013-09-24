package org.uqbar.hoope.lib;

import org.eclipse.emf.ecore.EObject;

public interface IHoopeInterpreter {
	void run(HoopeGraphicObject hoopeObject, EObject program, int stopAtLine);
}
