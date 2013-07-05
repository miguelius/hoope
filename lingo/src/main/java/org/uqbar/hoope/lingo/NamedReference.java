package org.uqbar.hoope.lingo;

public class NamedReference extends AbstractReference {

	private String name;

	public NamedReference(String name, Object referenced) {
		super(referenced);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		if (name == null)
				return 0;
		return name.hashCode();
	}
	
	public boolean equals(Object that) {
		if (name == null || that == null || !this.getClass().isInstance(that)) 
			return false;
		return name.equals(((NamedReference)that).name);
	}


}
