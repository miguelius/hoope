package org.uqbar.hoope.lingo;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MethodTestSuite {

	private LingoContext lingoContext;

	@Before
	public void bifor() {
		lingoContext = new LingoContext();
	}

	@Test
	public void defineMethodWithNoParams() {
		LingoMethod lingoMethod = new LingoMethod();
		lingoMethod.setParentContext(lingoContext);


		lingoMethod.addDeclaration("a", new BigDecimal(1));
		lingoMethod.addDeclaration("b", new BigDecimal(2));

		Expression aPlusB = aPlusBExpression(lingoMethod);
		
		lingoMethod.addExpression(aPlusB);
		
		assertEquals(new BigDecimal(3), lingoMethod.value());
	}

	private Expression aPlusBExpression(LingoContext lingoContext) {
		// a + b
		return
				ExpressionBuilder.getInstance()
					.add( lingoContext.resolve("a") )
					.addBinaryOperator( new AddOperator() )
					.add( lingoContext.resolve("b") )
				.build();
	}

}
