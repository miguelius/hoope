package org.uqbar.hoope.lingo;

public class IntegerNumberReference extends AbstractReference {

	public IntegerNumberReference(long l) {
		super(new Long(l));
	}

	public IntegerNumberReference(int i) {
		super(new Integer(i));
	}

	public IntegerNumberReference(byte b) {
		super(new Byte(b));
	}
}
