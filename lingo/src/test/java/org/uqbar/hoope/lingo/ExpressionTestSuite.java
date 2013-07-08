package org.uqbar.hoope.lingo;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTestSuite {

	private LingoContext lingoContext;

	@Before
	public void bifor() {
		lingoContext = new LingoContext();
	}

	@Test
	public void basicExpression() {
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add(lingoContext.createInstance(1))
				.build();
		
		assertEquals(new BigDecimal(1), expression.value());
	}

	@Test
	public void binaryExpression() {
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add( lingoContext.createInstance(3) )
					.addBinaryOperator( new AddOperator() )
					.add( lingoContext.createInstance(2) )
				.build();
		
		assertEquals(new BigDecimal(5), expression.value());
	}

	@Test
	public void menageATroiExpression() {
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add( lingoContext.createInstance(3) )
					.addBinaryOperator( new AddOperator() )
					.add( lingoContext.createInstance(2) )
					.addBinaryOperator( new AddOperator() )
					.add( lingoContext.createInstance(1) )
				.build();
		
		assertEquals(new BigDecimal(6), expression.value());
	}

	@Test
	public void substractionExpression() {
		NumberReference number = (NumberReference) lingoContext.createInstance(2);
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add( lingoContext.createInstance(3) )
					.addBinaryOperator( new AddOperator() )
					.add( number.negate() )
				.build();
		
		assertEquals(new BigDecimal(1), expression.value());
	}

	@Test
	public void variablesBinaryExpressionExpression() {
		lingoContext.registerNamedReference("a", lingoContext.createInstance(1));
		lingoContext.registerNamedReference("b", lingoContext.createInstance(2));
		// a + b
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add( lingoContext.resolve("a") )
					.addBinaryOperator( new AddOperator() )
					.add( lingoContext.resolve("b") )
				.build();
		
		assertEquals(new BigDecimal(3), expression.value());
	}

}
