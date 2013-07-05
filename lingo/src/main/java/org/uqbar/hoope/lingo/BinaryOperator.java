package org.uqbar.hoope.lingo;

import java.math.BigDecimal;

public abstract class BinaryOperator implements Expression {

	public static final BinaryOperator ADD = new BinaryOperator() {
		
		public Object value() {
			if (String.class.isInstance(getLeftSide().value())) {
				String l = (String )getLeftSide().value();
				return l + getRightSide().value();
			}
			if (String.class.isInstance(getRightSide().value())) {
				String r = (String )getRightSide().value();
				return getLeftSide().value() + r;
			}
			if (Number.class.isInstance(getLeftSide().value()) &&
					Number.class.isInstance(getRightSide().value())
					) {
				Number l = (Number )getLeftSide().value();
				Number r = (Number )getRightSide().value();
				return new BigDecimal(l.doubleValue()).add(new BigDecimal(r.doubleValue()));
			}
			throw new RuntimeException("El operador no está definido.");
		}
	};
		
	private Expression leftSide;
	
	private Expression rightSide;

	public Expression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(Expression leftSide) {
		this.leftSide = leftSide;
	}

	public Expression getRightSide() {
		return rightSide;
	}

	public void setRightSide(Expression rightSide) {
		this.rightSide = rightSide;
	}

}
