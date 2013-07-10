package org.uqbar.hoope.lingo;

import java.util.ArrayList;
import java.util.List;

public class LingoMethod extends LingoContext implements Expression {
	
	List<Expression> expressions;
	
	private LingoContext parentContext; 
	
	public LingoMethod() {
		this.expressions = new ArrayList<Expression>();
	}

	public Object value() {
		Expression last = null;
		for (Expression ex : expressions) {
			ex.value();
			last = ex;
		}
		return last.value();
	}

	public void setParentContext(LingoContext parentContext) {
		this.parentContext = parentContext;		
	}

	public void addDeclaration(String string, Object objecto) {
		registerNamedReference(string, objecto);
	}

	public void addExpression(Expression exp) {
		expressions.add(exp);
	}
	
	public Reference resolve(String name) {
		Reference reference = namedReferences.get(name);
		if (reference == null) {
			reference = parentContext.resolve(name);
			if (reference == null) {
				throw new RuntimeException(name + ": No se encontro una referencia con ese nombre en este contexto.");
			}
		}
		return reference;
	}
}
