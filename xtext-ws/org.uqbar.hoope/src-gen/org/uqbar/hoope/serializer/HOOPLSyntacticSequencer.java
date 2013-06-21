package org.uqbar.hoope.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

@SuppressWarnings("all")
public class HOOPLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HOOPLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Expresion___OperatorParserRuleCall_2_1_0_TerminalParserRuleCall_2_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HOOPLGrammarAccess) access;
		match_Expresion___OperatorParserRuleCall_2_1_0_TerminalParserRuleCall_2_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpresionAccess().getOperatorParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getExpresionAccess().getTerminalParserRuleCall_2_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTerminalRule())
			return getTerminalToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Operator: '+' | '-' | '*' | '/';
	 */
	protected String getOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * Terminal: INT | STRING | ID | INT'..'INT;
	 */
	protected String getTerminalToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Expresion___OperatorParserRuleCall_2_1_0_TerminalParserRuleCall_2_1_1__a.equals(syntax))
				emit_Expresion___OperatorParserRuleCall_2_1_0_TerminalParserRuleCall_2_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (Operator Terminal)*
	 */
	protected void emit_Expresion___OperatorParserRuleCall_2_1_0_TerminalParserRuleCall_2_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
