package org.uqbar.hoope.lingo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResolveReferenceTestSuite {

	
	private static final int NUMERIC_EXAMPLE = 42;
	private static final float DECIMAL_EXAMPLE = 4.2f;
	private static final String STRING_EXAMPLE = "Hola, Mundo!";
	private static final String ENGLISH_STRING_EXAMPLE = "Hello, World!";
	private static final String NAME = "greeting";
	private LingoContext lingoContext;

	@Before
	public void bifor() {
		lingoContext = new LingoContext();
	}
	
	@Test
	public void numericResolve() {
		Reference numericReference = lingoContext.createInstance(NUMERIC_EXAMPLE);
		
		assertEquals(numericReference.resolve(), new Integer(NUMERIC_EXAMPLE));
	}
	
	@Test
	public void decimalResolve() {
		Reference decimalReference = lingoContext.createInstance(DECIMAL_EXAMPLE);
		
		assertEquals(decimalReference.resolve(), new Double(DECIMAL_EXAMPLE));
	}
	
	@Test
	public void stringResolve() {
		Reference stringReference = lingoContext.createInstance(STRING_EXAMPLE);
		
		assertEquals(stringReference.resolve(), STRING_EXAMPLE);
	}

	@Test
	public void namedResolve() {
		Reference namedReference = lingoContext.registerNamedReference(NAME, STRING_EXAMPLE);
		
		assertEquals(namedReference, lingoContext.resolve(NAME));
	}

	@Test
	public void mutableResolve() {
		MutableReference mutableReference = (MutableReference) lingoContext.registerMutableNamedReference(NAME, STRING_EXAMPLE);
		
		mutableReference.assign(ENGLISH_STRING_EXAMPLE);
	
		assertEquals(ENGLISH_STRING_EXAMPLE, lingoContext.resolve(NAME).resolve());
	}
}
