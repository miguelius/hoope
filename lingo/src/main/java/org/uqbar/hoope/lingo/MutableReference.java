package org.uqbar.hoope.lingo;

public class MutableReference extends NamedReference {

	public MutableReference(String name, Object referenced) {
		super(name, referenced);
	}

	public void assign(Object referenced) {
		this.referenced = referenced;
	}
}
