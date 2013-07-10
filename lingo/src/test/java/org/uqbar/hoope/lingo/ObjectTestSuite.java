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
		
		assertEquals(lingoContext.resolve("pepita"), pepitaReference);
	}
	
}
