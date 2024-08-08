/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.serializer;

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
import org.xtext.globalTypes.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LocalProtocol_RightParenthesisLeftCurlyBracketKeyword_7_0_or___RightParenthesisKeyword_7_1_0_LeftCurlyBracketKeyword_7_1_1__;
	protected AbstractElementAlias match_MessageNormalL_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__;
	protected AbstractElementAlias match_MessageNormal_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_LocalProtocol_RightParenthesisLeftCurlyBracketKeyword_7_0_or___RightParenthesisKeyword_7_1_0_LeftCurlyBracketKeyword_7_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocalProtocolAccess().getRightParenthesisKeyword_7_1_0()), new TokenAlias(false, false, grammarAccess.getLocalProtocolAccess().getLeftCurlyBracketKeyword_7_1_1())), new TokenAlias(false, false, grammarAccess.getLocalProtocolAccess().getRightParenthesisLeftCurlyBracketKeyword_7_0()));
		match_MessageNormalL_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMessageNormalLAccess().getLeftParenthesisKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMessageNormalLAccess().getRightParenthesisKeyword_1_0_2())), new TokenAlias(false, false, grammarAccess.getMessageNormalLAccess().getLeftParenthesisRightParenthesisKeyword_1_1()));
		match_MessageNormal_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMessageNormalAccess().getLeftParenthesisKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMessageNormalAccess().getRightParenthesisKeyword_1_0_2())), new TokenAlias(false, false, grammarAccess.getMessageNormalAccess().getLeftParenthesisRightParenthesisKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_LocalProtocol_RightParenthesisLeftCurlyBracketKeyword_7_0_or___RightParenthesisKeyword_7_1_0_LeftCurlyBracketKeyword_7_1_1__.equals(syntax))
				emit_LocalProtocol_RightParenthesisLeftCurlyBracketKeyword_7_0_or___RightParenthesisKeyword_7_1_0_LeftCurlyBracketKeyword_7_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageNormalL_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__.equals(syntax))
				emit_MessageNormalL_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageNormal_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__.equals(syntax))
				emit_MessageNormal_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '){' | (')' '{')
	 *
	 * This ambiguous syntax occurs at:
	 *     roles=Roles (ambiguity) protocol=ProtocolL
	 
	 * </pre>
	 */
	protected void emit_LocalProtocol_RightParenthesisLeftCurlyBracketKeyword_7_0_or___RightParenthesisKeyword_7_1_0_LeftCurlyBracketKeyword_7_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')') | '()'
	 *
	 * This ambiguous syntax occurs at:
	 *     messageType=ID (ambiguity) sendReceive=MessageType
	 
	 * </pre>
	 */
	protected void emit_MessageNormalL_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')') | '()'
	 *
	 * This ambiguous syntax occurs at:
	 *     messageType=[Definition|ID] (ambiguity) 'from' sender=[RoleOne|ID]
	 
	 * </pre>
	 */
	protected void emit_MessageNormal_LeftParenthesisRightParenthesisKeyword_1_1_or___LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
