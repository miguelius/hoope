package org.uqbar.hoope.lingo;

import java.math.BigDecimal;

public class NumberReference extends AbstractReference implements Comparable<NumberReference> {

	public NumberReference(Object referenced) {
		super(referenced);
	}

	public Reference negate() {
		return new NumberReference(asDecimal().negate());
	}

	public BigDecimal asDecimal() { 
		return ((BigDecimal) this.referenced);
	}

	public Reference invert() {
		return new DecimalNumberReference(1 / asDecimal().doubleValue());
	}

	public int compareTo(NumberReference o) {
		return asDecimal().compareTo(o.asDecimal());
	}

}