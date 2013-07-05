package org.uqbar.hoope.lingo;

import java.util.Map;
import java.util.TreeMap;

public class LingoContext {
	
	private Map<String, Reference> namedReferences = new TreeMap<String, Reference>();

	public Reference createInstance(double d) {
		return new DecimalNumberReference(d);
	}

	public Reference createInstance(float f) {
		return new DecimalNumberReference(f);
	}

	public Reference createInstance(byte b) {
		return new IntegerNumberReference(b);
	}

	public Reference createInstance(int i) {
		return new IntegerNumberReference(i);
	}

	public Reference createInstance(long l) {
		return new IntegerNumberReference(l);
	}

	public Reference createInstance(String string) {
		return new StringReference(string);
	}

	public Reference registerNamedReference(String name,
			Object objecto) {
		NamedReference namedReference = new NamedReference(name, objecto);
		avoidRepetitionInContext(name);
		return registerInContext(namedReference);
	}

	public Reference resolve(String name) {
		return namedReferences.get(name);
	}

	public Reference registerMutableNamedReference(String name,
			Object objecto) {
		avoidRepetitionInContext(name);
		NamedReference namedReference = new MutableReference(name, objecto);
		return registerInContext(namedReference);
	}

	private Reference registerInContext(NamedReference namedReference) {
		namedReferences.put(namedReference.getName(), namedReference);
		return namedReference;
	}

	private void avoidRepetitionInContext(String name) {
		if (namedReferences.containsKey(name)) {
			throw new RuntimeException(name + ": ya se encuentra registrado en este contexto."); 
		}
	}

}
