package org.uqbar.hoope.lingo;


public abstract class BinaryOperator implements Expression {

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
