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
		
		assertEquals(1, expression.value());
	}

	@Test
	public void binaryExpression() {
		Expression expression = 
				ExpressionBuilder.getInstance()
					.add( lingoContext.createInstance(3) )
					.addBinaryOperator( BinaryOperator.ADD )
					.add( lingoContext.createInstance(2) )
				.build();
		
		assertEquals(new BigDecimal(5), expression.value());
	}
}
