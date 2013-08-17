package org.uqbar.hoope.lingo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectTestSuite {

	private LingoContext lingoContext;

	@Before
	public void bifor() {
		lingoContext = new LingoContext();
	}

	@Test
	public void defineObject() {
		Reference pepitaReference = lingoContext.registerLingoObject("pepita");
		LingoObject object = (LingoObject) pepitaReference.resolve();
		object.addInstanceVariable(new MutableReference("energia", 3));
		object.addMessage("energia",
					newMethod()
				);
		assertEquals(lingoContext.resolve("pepita"), pepitaReference);
		assertEquals(3, object.sendMessage("energia"));
	}

	private LingoMethod newMethod() {
		return null; //ExpressionBuilder.getInstance()
				//.add(  )
				//.build();
	}
	
}
