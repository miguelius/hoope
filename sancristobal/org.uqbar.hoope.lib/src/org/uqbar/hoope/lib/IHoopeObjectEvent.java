package org.uqbar.hoope.lib;

public interface IHoopeObjectEvent {
	
	HoopeGraphicObject getHoopeObject();
	
	interface Listener {
		void handleObjectEvent(IHoopeObjectEvent event);
	}
}