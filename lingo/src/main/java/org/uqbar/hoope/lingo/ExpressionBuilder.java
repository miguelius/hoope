package org.uqbar.hoope.lingo;

public class ExpressionBuilder {
	
	public boolean isWaitingOperand = true;
	
	protected ExpressionBuilder() {
		
	}
	
	public static ExpressionBuilder getInstance() {
		return new ExpressionBuilder();
	}
	
	Expression expression;
	
	public ExpressionBuilder add(Reference reference) {
		if (BinaryOperator.class.isInstance(expression)) {
			BinaryOperator bo = (BinaryOperator) expression;
			bo.setRightSide(reference);
			isWaitingOperand = true;
		} else if (isWaitingOperand) {
			this.expression = reference;
			isWaitingOperand = false;
		} else {
			throw new RuntimeException();
		}
		return this;
	}
	
	public Expression build() {
		return expression;
	}

	public ExpressionBuilder addBinaryOperator(BinaryOperator add) {
		add.setLeftSide(expression);
		expression = add;
		isWaitingOperand = true;
		return this;
	}
}
