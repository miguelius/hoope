package org.uqbar.hoope.lingo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LingoObject extends LingoContext {
	
	private Map<String, MutableReference> instanceVariables;
	private Map<String, LingoMethod> messages;
	
	public LingoObject() {
		instanceVariables = new LinkedHashMap<String, MutableReference>();
		messages = new LinkedHashMap<String, LingoMethod>();
	}
	
	public void addInstanceVariable(MutableReference mr) {
		instanceVariables.put(mr.getName(), mr);
	}

	public void addMessage(String messageName, LingoMethod lingoMethod) {
		messages.put(messageName, lingoMethod);
	}
	
	public Object sendMessage(String messageName) {
		return messages.get(messageName).value();
	}
	
}
