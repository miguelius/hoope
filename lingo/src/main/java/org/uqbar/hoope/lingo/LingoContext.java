package org.uqbar.hoope.lingo;

import java.util.Map;
import java.util.TreeMap;

public class LingoContext {
	
	protected Map<String, Reference> namedReferences = new TreeMap<String, Reference>();

	public NumberReference createInstance(double d) {
		return new DecimalNumberReference(d);
	}

	public NumberReference createInstance(float f) {
		return new DecimalNumberReference(f);
	}

	public NumberReference createInstance(byte b) {
		return new IntegerNumberReference(b);
	}

	public NumberReference createInstance(int i) {
		return new IntegerNumberReference(i);
	}

	public NumberReference createInstance(long l) {
		return new IntegerNumberReference(l);
	}

	public StringReference createInstance(String string) {
		return new StringReference(string);
	}

	public NamedReference registerNamedReference(String name,
			Object objecto) {
		NamedReference namedReference = new NamedReference(name, objecto);
		avoidRepetitionInContext(name);
		return (NamedReference )registerInContext(namedReference);
	}

	public Reference resolve(String name) {
		return namedReferences.get(name);
	}

	public MutableReference registerMutableNamedReference(String name,
			Object objecto) {
		avoidRepetitionInContext(name);
		NamedReference namedReference = new MutableReference(name, objecto);
		return (MutableReference )registerInContext(namedReference);
	}

	protected Reference registerInContext(NamedReference namedReference) {
		namedReferences.put(namedReference.getName(), namedReference);
		return namedReference;
	}

	protected void avoidRepetitionInContext(String name) {
		if (namedReferences.containsKey(name)) {
			throw new RuntimeException(name + ": ya se encuentra registrado en este contexto."); 
		}
	}

	public BooleanReference registerBooleanReference(boolean buleano) {
		return new BooleanReference(buleano);
	}

	public NamedReference registerLingoObject(String name) {
		return registerNamedReference(name, new LingoObject());
	}

}
