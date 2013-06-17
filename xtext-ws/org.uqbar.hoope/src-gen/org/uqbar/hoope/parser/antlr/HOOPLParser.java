/*
* generated by Xtext
*/
package org.uqbar.hoope.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

public class HOOPLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HOOPLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.uqbar.hoope.parser.antlr.internal.InternalHOOPLParser createParser(XtextTokenStream stream) {
		return new org.uqbar.hoope.parser.antlr.internal.InternalHOOPLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public HOOPLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HOOPLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
