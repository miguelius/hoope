package org.uqbar.hoope.lingo;

import java.math.BigDecimal;

public class DecimalNumberReference extends NumberReference {

	public DecimalNumberReference(double referenced) {
		super(new BigDecimal(referenced));
	}

	public DecimalNumberReference(float referenced) {
		super(new BigDecimal(referenced));
	}
}
