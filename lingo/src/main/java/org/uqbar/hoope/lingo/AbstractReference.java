package org.uqbar.hoope.lingo;

public class AbstractReference implements Reference {

	protected Object referenced = null; 
	
	public AbstractReference(Object referenced) {
		this.referenced = referenced;
	}

	public Object resolve() {
		return referenced;
	}
	
	public int hashCode() {
		if (referenced == null)
				return 0;
		return referenced.hashCode();
	}
	
	public boolean equals(Object that) {
		if (referenced == null || that == null || !this.getClass().isInstance(that)) 
			return false;
		return referenced.equals(((AbstractReference)that).referenced);
	}

	public boolean referencesTheSame(Reference otherReference) {
		if (referenced == null) 
			return false;
		return resolve().equals(otherReference.resolve());
	}

	public Object value() {
		return resolve();
	}
}
