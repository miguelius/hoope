package org.uqbar.hoope.lingo;


public class DecimalNumberReference extends AbstractReference {

	public DecimalNumberReference(double referenced) {
		super(new Double(referenced));
	}

	public DecimalNumberReference(float referenced) {
		super(new Double(referenced));
	}

}
