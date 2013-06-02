package org.uqbar.hoope.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

@SuppressWarnings("all")
public class HOOPLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HOOPLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Mutator_IDTerminalRuleCall_2_2_or_INTTerminalRuleCall_2_0_or_STRINGTerminalRuleCall_2_1;
	protected AbstractElementAlias match_Property___EqualsSignKeyword_1_0___INTTerminalRuleCall_1_1_0_or_STRINGTerminalRuleCall_1_1_1____q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HOOPLGrammarAccess) access;
		match_Mutator_IDTerminalRuleCall_2_2_or_INTTerminalRuleCall_2_0_or_STRINGTerminalRuleCall_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMutatorAccess().getIDTerminalRuleCall_2_2()), new TokenAlias(false, false, grammarAccess.getMutatorAccess().getINTTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getMutatorAccess().getSTRINGTerminalRuleCall_2_1()));
		match_Property___EqualsSignKeyword_1_0___INTTerminalRuleCall_1_1_0_or_STRINGTerminalRuleCall_1_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPropertyAccess().getINTTerminalRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_1_1_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Mutator_IDTerminalRuleCall_2_2_or_INTTerminalRuleCall_2_0_or_STRINGTerminalRuleCall_2_1.equals(syntax))
				emit_Mutator_IDTerminalRuleCall_2_2_or_INTTerminalRuleCall_2_0_or_STRINGTerminalRuleCall_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property___EqualsSignKeyword_1_0___INTTerminalRuleCall_1_1_0_or_STRINGTerminalRuleCall_1_1_1____q.equals(syntax))
				emit_Property___EqualsSignKeyword_1_0___INTTerminalRuleCall_1_1_0_or_STRINGTerminalRuleCall_1_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     INT | STRING | ID
	 */
	protected void emit_Mutator_IDTerminalRuleCall_2_2_or_INTTerminalRuleCall_2_0_or_STRINGTerminalRuleCall_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=' (INT | STRING))?
	 */
	protected void emit_Property___EqualsSignKeyword_1_0___INTTerminalRuleCall_1_1_0_or_STRINGTerminalRuleCall_1_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
