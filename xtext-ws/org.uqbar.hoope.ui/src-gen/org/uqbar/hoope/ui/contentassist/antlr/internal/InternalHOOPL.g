/*
* generated by Xtext
*/
grammar InternalHOOPL;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package org.uqbar.hoope.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.uqbar.hoope.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

}

@parser::members {
 
 	private HOOPLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(HOOPLGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleProgram
entryRuleProgram 
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProgramAccess().getObjectsAssignment()); }
(rule__Program__ObjectsAssignment)*
{ after(grammarAccess.getProgramAccess().getObjectsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleObjectDefinition
entryRuleObjectDefinition 
:
{ before(grammarAccess.getObjectDefinitionRule()); }
	 ruleObjectDefinition
{ after(grammarAccess.getObjectDefinitionRule()); } 
	 EOF 
;

// Rule ObjectDefinition
ruleObjectDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getObjectDefinitionAccess().getGroup()); }
(rule__ObjectDefinition__Group__0)
{ after(grammarAccess.getObjectDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
(rule__Feature__Alternatives)
{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty 
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyAccess().getGroup()); }
(rule__Property__Group__0)
{ after(grammarAccess.getPropertyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMessage
entryRuleMessage 
:
{ before(grammarAccess.getMessageRule()); }
	 ruleMessage
{ after(grammarAccess.getMessageRule()); } 
	 EOF 
;

// Rule Message
ruleMessage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMessageAccess().getGroup()); }
(rule__Message__Group__0)
{ after(grammarAccess.getMessageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpresion
entryRuleExpresion 
:
{ before(grammarAccess.getExpresionRule()); }
	 ruleExpresion
{ after(grammarAccess.getExpresionRule()); } 
	 EOF 
;

// Rule Expresion
ruleExpresion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpresionAccess().getAlternatives()); }
(rule__Expresion__Alternatives)
{ after(grammarAccess.getExpresionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIfExpresion
entryRuleIfExpresion 
:
{ before(grammarAccess.getIfExpresionRule()); }
	 ruleIfExpresion
{ after(grammarAccess.getIfExpresionRule()); } 
	 EOF 
;

// Rule IfExpresion
ruleIfExpresion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIfExpresionAccess().getGroup()); }
(rule__IfExpresion__Group__0)
{ after(grammarAccess.getIfExpresionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWhileExpresion
entryRuleWhileExpresion 
:
{ before(grammarAccess.getWhileExpresionRule()); }
	 ruleWhileExpresion
{ after(grammarAccess.getWhileExpresionRule()); } 
	 EOF 
;

// Rule WhileExpresion
ruleWhileExpresion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWhileExpresionAccess().getGroup()); }
(rule__WhileExpresion__Group__0)
{ after(grammarAccess.getWhileExpresionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTerminal
entryRuleTerminal 
:
{ before(grammarAccess.getTerminalRule()); }
	 ruleTerminal
{ after(grammarAccess.getTerminalRule()); } 
	 EOF 
;

// Rule Terminal
ruleTerminal
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTerminalAccess().getAlternatives()); }
(rule__Terminal__Alternatives)
{ after(grammarAccess.getTerminalAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOperator
entryRuleOperator 
:
{ before(grammarAccess.getOperatorRule()); }
	 ruleOperator
{ after(grammarAccess.getOperatorRule()); } 
	 EOF 
;

// Rule Operator
ruleOperator
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
(rule__Operator__Alternatives)
{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypo
entryRuleTypo 
:
{ before(grammarAccess.getTypoRule()); }
	 ruleTypo
{ after(grammarAccess.getTypoRule()); } 
	 EOF 
;

// Rule Typo
ruleTypo
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypoAccess().getAlternatives()); }
(rule__Typo__Alternatives)
{ after(grammarAccess.getTypoAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Program__ObjectsAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getObjectsExpresionParserRuleCall_0_0()); }
	ruleExpresion
{ after(grammarAccess.getProgramAccess().getObjectsExpresionParserRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0_1()); }
	ruleObjectDefinition
{ after(grammarAccess.getProgramAccess().getObjectsObjectDefinitionParserRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); }
	ruleObjectDefinition
{ after(grammarAccess.getFeatureAccess().getObjectDefinitionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); }
	ruleProperty
{ after(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); }
	ruleMessage
{ after(grammarAccess.getFeatureAccess().getMessageParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpresionAccess().getWhileExpresionParserRuleCall_0()); }
	ruleWhileExpresion
{ after(grammarAccess.getExpresionAccess().getWhileExpresionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getExpresionAccess().getIfExpresionParserRuleCall_1()); }
	ruleIfExpresion
{ after(grammarAccess.getExpresionAccess().getIfExpresionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getExpresionAccess().getGroup_2()); }
(rule__Expresion__Group_2__0)
{ after(grammarAccess.getExpresionAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
{ after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTerminalAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getTerminalAccess().getSTRINGTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
{ after(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_2()); }
)

    |(
{ before(grammarAccess.getTerminalAccess().getGroup_3()); }
(rule__Terminal__Group_3__0)
{ after(grammarAccess.getTerminalAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); }

	'+' 

{ after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); }
)

    |(
{ before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); }

	'-' 

{ after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); }
)

    |(
{ before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); }

	'*' 

{ after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); }
)

    |(
{ before(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); }

	'/' 

{ after(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Typo__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypoAccess().getNumberKeyword_0()); }

	'Number' 

{ after(grammarAccess.getTypoAccess().getNumberKeyword_0()); }
)

    |(
{ before(grammarAccess.getTypoAccess().getStringKeyword_1()); }

	'String' 

{ after(grammarAccess.getTypoAccess().getStringKeyword_1()); }
)

    |(
{ before(grammarAccess.getTypoAccess().getBooleanKeyword_2()); }

	'Boolean' 

{ after(grammarAccess.getTypoAccess().getBooleanKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ObjectDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectDefinition__Group__0__Impl
	rule__ObjectDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getRefKeyword_0()); }

	'ref' 

{ after(grammarAccess.getObjectDefinitionAccess().getRefKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectDefinition__Group__1__Impl
	rule__ObjectDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getNameAssignment_1()); }
(rule__ObjectDefinition__NameAssignment_1)
{ after(grammarAccess.getObjectDefinitionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectDefinition__Group__2__Impl
	rule__ObjectDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2()); }

	'= object {' 

{ after(grammarAccess.getObjectDefinitionAccess().getObjectKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectDefinition__Group__3__Impl
	rule__ObjectDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getFeaturesAssignment_3()); }
(rule__ObjectDefinition__FeaturesAssignment_3)*
{ after(grammarAccess.getObjectDefinitionAccess().getFeaturesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Property__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameAssignment_0()); }
(rule__Property__NameAssignment_0)
{ after(grammarAccess.getPropertyAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getPropertyAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__2__Impl
	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); }
(rule__Property__TypeAssignment_2)
{ after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_3()); }
(rule__Property__Group_3__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Property__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__0__Impl
	rule__Property__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0()); }

	'=' 

{ after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getInitialAssignment_3_1()); }
(rule__Property__InitialAssignment_3_1)
{ after(grammarAccess.getPropertyAccess().getInitialAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Message__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Message__Group__0__Impl
	rule__Message__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getMessageKeyword_0()); }

	'message' 

{ after(grammarAccess.getMessageAccess().getMessageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Message__Group__1__Impl
	rule__Message__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getNameAssignment_1()); }
(rule__Message__NameAssignment_1)
{ after(grammarAccess.getMessageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Message__Group__2__Impl
	rule__Message__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getMethodKeyword_2()); }

	'= method {' 

{ after(grammarAccess.getMessageAccess().getMethodKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Message__Group__3__Impl
	rule__Message__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getSentencesAssignment_3()); }
(rule__Message__SentencesAssignment_3)*
{ after(grammarAccess.getMessageAccess().getSentencesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Message__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Expresion__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expresion__Group_2__0__Impl
	rule__Expresion__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_0()); }
	ruleTerminal
{ after(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expresion__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expresion__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpresionAccess().getGroup_2_1()); }
(rule__Expresion__Group_2_1__0)*
{ after(grammarAccess.getExpresionAccess().getGroup_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expresion__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expresion__Group_2_1__0__Impl
	rule__Expresion__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()); }
	ruleOperator
{ after(grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expresion__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expresion__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()); }
	ruleTerminal
{ after(grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IfExpresion__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group__0__Impl
	rule__IfExpresion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getIfKeyword_0()); }

	'if' 

{ after(grammarAccess.getIfExpresionAccess().getIfKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpresion__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group__1__Impl
	rule__IfExpresion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getConditionAssignment_1()); }
(rule__IfExpresion__ConditionAssignment_1)
{ after(grammarAccess.getIfExpresionAccess().getConditionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpresion__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group__2__Impl
	rule__IfExpresion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getThenKeyword_2()); }

	'then' 

{ after(grammarAccess.getIfExpresionAccess().getThenKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpresion__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group__3__Impl
	rule__IfExpresion__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getThenAssignment_3()); }
(rule__IfExpresion__ThenAssignment_3)
{ after(grammarAccess.getIfExpresionAccess().getThenAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpresion__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getGroup_4()); }
(rule__IfExpresion__Group_4__0)?
{ after(grammarAccess.getIfExpresionAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__IfExpresion__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group_4__0__Impl
	rule__IfExpresion__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getElseKeyword_4_0()); }
(
	'else' 
)
{ after(grammarAccess.getIfExpresionAccess().getElseKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpresion__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IfExpresion__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getElseAssignment_4_1()); }
(rule__IfExpresion__ElseAssignment_4_1)
{ after(grammarAccess.getIfExpresionAccess().getElseAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__WhileExpresion__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WhileExpresion__Group__0__Impl
	rule__WhileExpresion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getWhileKeyword_0()); }

	'while' 

{ after(grammarAccess.getWhileExpresionAccess().getWhileKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WhileExpresion__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WhileExpresion__Group__1__Impl
	rule__WhileExpresion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getConditionAssignment_1()); }
(rule__WhileExpresion__ConditionAssignment_1)
{ after(grammarAccess.getWhileExpresionAccess().getConditionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WhileExpresion__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WhileExpresion__Group__2__Impl
	rule__WhileExpresion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getWhileExpresionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WhileExpresion__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WhileExpresion__Group__3__Impl
	rule__WhileExpresion__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getSentencesAssignment_3()); }
(rule__WhileExpresion__SentencesAssignment_3)*
{ after(grammarAccess.getWhileExpresionAccess().getSentencesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WhileExpresion__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WhileExpresion__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getWhileExpresionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Terminal__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_3__0__Impl
	rule__Terminal__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_0()); }
	RULE_INT
{ after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_3__1__Impl
	rule__Terminal__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_3_1()); }

	'..' 

{ after(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_2()); }
	RULE_INT
{ after(grammarAccess.getTerminalAccess().getINTTerminalRuleCall_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Program__ObjectsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getObjectsAlternatives_0()); }
(rule__Program__ObjectsAlternatives_0)
{ after(grammarAccess.getProgramAccess().getObjectsAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getObjectDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectDefinition__FeaturesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); }
	ruleFeature{ after(grammarAccess.getObjectDefinitionAccess().getFeaturesFeatureParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeTypoParserRuleCall_2_0()); }
	ruleTypo{ after(grammarAccess.getPropertyAccess().getTypeTypoParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__InitialAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getInitialTerminalParserRuleCall_3_1_0()); }
	ruleTerminal{ after(grammarAccess.getPropertyAccess().getInitialTerminalParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Message__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Message__SentencesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMessageAccess().getSentencesExpresionParserRuleCall_3_0()); }
	ruleExpresion{ after(grammarAccess.getMessageAccess().getSentencesExpresionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__ConditionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getConditionExpresionParserRuleCall_1_0()); }
	ruleExpresion{ after(grammarAccess.getIfExpresionAccess().getConditionExpresionParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__ThenAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getThenExpresionParserRuleCall_3_0()); }
	ruleExpresion{ after(grammarAccess.getIfExpresionAccess().getThenExpresionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpresion__ElseAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfExpresionAccess().getElseExpresionParserRuleCall_4_1_0()); }
	ruleExpresion{ after(grammarAccess.getIfExpresionAccess().getElseExpresionParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__ConditionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getConditionExpresionParserRuleCall_1_0()); }
	ruleExpresion{ after(grammarAccess.getWhileExpresionAccess().getConditionExpresionParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WhileExpresion__SentencesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWhileExpresionAccess().getSentencesExpresionParserRuleCall_3_0()); }
	ruleExpresion{ after(grammarAccess.getWhileExpresionAccess().getSentencesExpresionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


