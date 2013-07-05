package org.uqbar.hoope.lingo;

public interface Reference extends Expression {

	Object resolve();
	boolean referencesTheSame(Reference reference);

}
