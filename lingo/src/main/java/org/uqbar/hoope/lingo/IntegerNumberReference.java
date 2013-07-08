package org.uqbar.hoope.lingo;

import java.math.BigDecimal;

public class IntegerNumberReference extends NumberReference {

	public IntegerNumberReference(long l) {
		super(new BigDecimal(l));
	}

	public IntegerNumberReference(int i) {
		super(new BigDecimal(i));
	}

	public IntegerNumberReference(byte b) {
		super(new BigDecimal(b));
	}
}
