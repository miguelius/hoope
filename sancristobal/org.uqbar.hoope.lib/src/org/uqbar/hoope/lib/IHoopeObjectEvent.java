package org.uqbar.hoope.lib;

public interface IHoopeObjectEvent {
	
	HoopeObject getHoopeObject();
	
	interface Listener {
		void handleObjectEvent(IHoopeObjectEvent event);
	}
}