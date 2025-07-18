/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.ChoiceL;
import org.xtext.globalTypes.myDsl.CloseRecursion;
import org.xtext.globalTypes.myDsl.CloseRecursionL;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.EndProtocol;
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.ForEachL;
import org.xtext.globalTypes.myDsl.GlobalProtocol;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.MessageNormal;
import org.xtext.globalTypes.myDsl.MessageNormalL;
import org.xtext.globalTypes.myDsl.MessageQuit;
import org.xtext.globalTypes.myDsl.MessageQuitL;
import org.xtext.globalTypes.myDsl.Model;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.ProtocolL;
import org.xtext.globalTypes.myDsl.QuitDefinition;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.Recursion;
import org.xtext.globalTypes.myDsl.RecursionL;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.Roles;
import org.xtext.globalTypes.myDsl.SenderL;
import org.xtext.globalTypes.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CHOICE:
				sequence_Choice(context, (Choice) semanticObject); 
				return; 
			case MyDslPackage.CHOICE_L:
				sequence_ChoiceL(context, (ChoiceL) semanticObject); 
				return; 
			case MyDslPackage.CLOSE_RECURSION:
				sequence_CloseRecursion(context, (CloseRecursion) semanticObject); 
				return; 
			case MyDslPackage.CLOSE_RECURSION_L:
				sequence_CloseRecursionL(context, (CloseRecursionL) semanticObject); 
				return; 
			case MyDslPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case MyDslPackage.END_PROTOCOL:
				sequence_EndProtocol(context, (EndProtocol) semanticObject); 
				return; 
			case MyDslPackage.FOR_EACH:
				sequence_ForEach(context, (ForEach) semanticObject); 
				return; 
			case MyDslPackage.FOR_EACH_L:
				sequence_ForEachL(context, (ForEachL) semanticObject); 
				return; 
			case MyDslPackage.GLOBAL_PROTOCOL:
				sequence_GlobalProtocol(context, (GlobalProtocol) semanticObject); 
				return; 
			case MyDslPackage.LOCAL_PROTOCOL:
				sequence_LocalProtocol(context, (LocalProtocol) semanticObject); 
				return; 
			case MyDslPackage.MESSAGE_NORMAL:
				sequence_MessageNormal(context, (MessageNormal) semanticObject); 
				return; 
			case MyDslPackage.MESSAGE_NORMAL_L:
				sequence_MessageNormalL(context, (MessageNormalL) semanticObject); 
				return; 
			case MyDslPackage.MESSAGE_QUIT:
				sequence_MessageQuit(context, (MessageQuit) semanticObject); 
				return; 
			case MyDslPackage.MESSAGE_QUIT_L:
				sequence_MessageQuitL(context, (MessageQuitL) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PAYLOAD:
				sequence_Payload(context, (Payload) semanticObject); 
				return; 
			case MyDslPackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			case MyDslPackage.PROTOCOL_L:
				sequence_ProtocolL(context, (ProtocolL) semanticObject); 
				return; 
			case MyDslPackage.QUIT_DEFINITION:
				sequence_QuitDefinition(context, (QuitDefinition) semanticObject); 
				return; 
			case MyDslPackage.RECEIVER_L:
				sequence_ReceiverL(context, (ReceiverL) semanticObject); 
				return; 
			case MyDslPackage.RECURSION:
				sequence_Recursion(context, (Recursion) semanticObject); 
				return; 
			case MyDslPackage.RECURSION_L:
				sequence_RecursionL(context, (RecursionL) semanticObject); 
				return; 
			case MyDslPackage.ROLE_ONE:
				sequence_RoleOne(context, (RoleOne) semanticObject); 
				return; 
			case MyDslPackage.ROLE_SET:
				sequence_RoleSet(context, (RoleSet) semanticObject); 
				return; 
			case MyDslPackage.ROLES:
				sequence_Roles(context, (Roles) semanticObject); 
				return; 
			case MyDslPackage.SENDER_L:
				sequence_SenderL(context, (SenderL) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ChoiceL returns ChoiceL
	 *
	 * Constraint:
	 *     (roleMakingChoice=[Role|ID] branches+=MessageL branches+=MessageL*)
	 * </pre>
	 */
	protected void sequence_ChoiceL(ISerializationContext context, ChoiceL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Choice returns Choice
	 *
	 * Constraint:
	 *     (role=[RoleOne|ID] branches+=Message branches+=Message*)
	 * </pre>
	 */
	protected void sequence_Choice(ISerializationContext context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CloseRecursionL returns CloseRecursionL
	 *
	 * Constraint:
	 *     recursionVariable=[RecursionL|ID]
	 * </pre>
	 */
	protected void sequence_CloseRecursionL(ISerializationContext context, CloseRecursionL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION_L__RECURSION_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION_L__RECURSION_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseRecursionLAccess().getRecursionVariableRecursionLIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.CLOSE_RECURSION_L__RECURSION_VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CloseRecursion returns CloseRecursion
	 *
	 * Constraint:
	 *     recursionVariable=[Recursion|ID]
	 * </pre>
	 */
	protected void sequence_CloseRecursion(ISerializationContext context, CloseRecursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     ((type='@proposition' name=ID) | (type='@action' name=ID (types+=Type types+=Type*)?) | (type='@predicate' name=ID types+=Type types+=Type*))
	 * </pre>
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EndProtocol returns EndProtocol
	 *
	 * Constraint:
	 *     end='End'
	 * </pre>
	 */
	protected void sequence_EndProtocol(ISerializationContext context, EndProtocol semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.END_PROTOCOL__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.END_PROTOCOL__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndProtocolAccess().getEndEndKeyword_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ForEachL returns ForEachL
	 *
	 * Constraint:
	 *     (eachRole=RoleOne roleset=[RoleSet|ID] refrole=[RoleOne|ID] branch=ProtocolL protocol=ProtocolL)
	 * </pre>
	 */
	protected void sequence_ForEachL(ISerializationContext context, ForEachL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__EACH_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__EACH_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__ROLESET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__ROLESET));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__REFROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__REFROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__BRANCH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachLAccess().getEachRoleRoleOneParserRuleCall_1_0(), semanticObject.getEachRole());
		feeder.accept(grammarAccess.getForEachLAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH_L__ROLESET, false));
		feeder.accept(grammarAccess.getForEachLAccess().getRefroleRoleOneIDTerminalRuleCall_6_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH_L__REFROLE, false));
		feeder.accept(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_9_0(), semanticObject.getBranch());
		feeder.accept(grammarAccess.getForEachLAccess().getProtocolProtocolLParserRuleCall_12_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ForEach returns ForEach
	 *
	 * Constraint:
	 *     (loopRole=RoleOne roleset=[RoleSet|ID] refRole=[RoleOne|ID] forBody=Protocol protocol=Protocol)
	 * </pre>
	 */
	protected void sequence_ForEach(ISerializationContext context, ForEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__LOOP_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__LOOP_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__ROLESET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__ROLESET));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__REF_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__REF_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__FOR_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__FOR_BODY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachAccess().getLoopRoleRoleOneParserRuleCall_1_0(), semanticObject.getLoopRole());
		feeder.accept(grammarAccess.getForEachAccess().getRolesetRoleSetIDTerminalRuleCall_4_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH__ROLESET, false));
		feeder.accept(grammarAccess.getForEachAccess().getRefRoleRoleOneIDTerminalRuleCall_6_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH__REF_ROLE, false));
		feeder.accept(grammarAccess.getForEachAccess().getForBodyProtocolParserRuleCall_9_0(), semanticObject.getForBody());
		feeder.accept(grammarAccess.getForEachAccess().getProtocolProtocolParserRuleCall_12_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GlobalProtocol returns GlobalProtocol
	 *
	 * Constraint:
	 *     (protocolName=ID roles=Roles protocol=Protocol)
	 * </pre>
	 */
	protected void sequence_GlobalProtocol(ISerializationContext context, GlobalProtocol semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__PROTOCOL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__PROTOCOL_NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__ROLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__ROLES));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GLOBAL_PROTOCOL__PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0(), semanticObject.getProtocolName());
		feeder.accept(grammarAccess.getGlobalProtocolAccess().getRolesRolesParserRuleCall_4_0(), semanticObject.getRoles());
		feeder.accept(grammarAccess.getGlobalProtocolAccess().getProtocolProtocolParserRuleCall_6_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LocalProtocol returns LocalProtocol
	 *
	 * Constraint:
	 *     (protocolName=ID projectedRole=Role roles=Roles protocol=ProtocolL)
	 * </pre>
	 */
	protected void sequence_LocalProtocol(ISerializationContext context, LocalProtocol semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROTOCOL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROTOCOL_NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROJECTED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROJECTED_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__ROLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__ROLES));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOCAL_PROTOCOL__PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalProtocolAccess().getProtocolNameIDTerminalRuleCall_2_0(), semanticObject.getProtocolName());
		feeder.accept(grammarAccess.getLocalProtocolAccess().getProjectedRoleRoleParserRuleCall_4_0(), semanticObject.getProjectedRole());
		feeder.accept(grammarAccess.getLocalProtocolAccess().getRolesRolesParserRuleCall_6_0(), semanticObject.getRoles());
		feeder.accept(grammarAccess.getLocalProtocolAccess().getProtocolProtocolLParserRuleCall_8_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MessageL returns MessageNormalL
	 *     MessageNormalL returns MessageNormalL
	 *
	 * Constraint:
	 *     (messageType=ID payload=Payload? sendReceive=MessageType protocol=ProtocolL)
	 * </pre>
	 */
	protected void sequence_MessageNormalL(ISerializationContext context, MessageNormalL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Message returns MessageNormal
	 *     MessageNormal returns MessageNormal
	 *
	 * Constraint:
	 *     (messageType=[Definition|ID] payload=Payload? sender=[RoleOne|ID] receiver=[Role|ID] protocol=Protocol)
	 * </pre>
	 */
	protected void sequence_MessageNormal(ISerializationContext context, MessageNormal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MessageL returns MessageQuitL
	 *     MessageQuitL returns MessageQuitL
	 *
	 * Constraint:
	 *     (messageType='QUIT' sendReceive=MessageType end=EndProtocol)
	 * </pre>
	 */
	protected void sequence_MessageQuitL(ISerializationContext context, MessageQuitL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_L__MESSAGE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_L__MESSAGE_TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_L__SEND_RECEIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_L__SEND_RECEIVE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_QUIT_L__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_QUIT_L__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageQuitLAccess().getMessageTypeQUITKeyword_0_0(), semanticObject.getMessageType());
		feeder.accept(grammarAccess.getMessageQuitLAccess().getSendReceiveMessageTypeParserRuleCall_2_0(), semanticObject.getSendReceive());
		feeder.accept(grammarAccess.getMessageQuitLAccess().getEndEndProtocolParserRuleCall_4_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Message returns MessageQuit
	 *     MessageQuit returns MessageQuit
	 *
	 * Constraint:
	 *     (messageType=[Definition|'QUIT'] sender=[RoleOne|ID] receiver=[Role|ID] end=EndProtocol)
	 * </pre>
	 */
	protected void sequence_MessageQuit(ISerializationContext context, MessageQuit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE__MESSAGE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE__MESSAGE_TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE__SENDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE__SENDER));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE__RECEIVER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE__RECEIVER));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_QUIT__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_QUIT__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageQuitAccess().getMessageTypeDefinitionQUITKeyword_0_0_1(), semanticObject.eGet(MyDslPackage.Literals.MESSAGE__MESSAGE_TYPE, false));
		feeder.accept(grammarAccess.getMessageQuitAccess().getSenderRoleOneIDTerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.MESSAGE__SENDER, false));
		feeder.accept(grammarAccess.getMessageQuitAccess().getReceiverRoleIDTerminalRuleCall_5_0_1(), semanticObject.eGet(MyDslPackage.Literals.MESSAGE__RECEIVER, false));
		feeder.accept(grammarAccess.getMessageQuitAccess().getEndEndProtocolParserRuleCall_7_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (definitions+=QuitDefinition definitions+=Definition* (protocol=GlobalProtocol | protocol=LocalProtocol))
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Payload returns Payload
	 *
	 * Constraint:
	 *     (types+=Type types+=Type*)
	 * </pre>
	 */
	protected void sequence_Payload(ISerializationContext context, Payload semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProtocolL returns ProtocolL
	 *
	 * Constraint:
	 *     (
	 *         begin=MessageL | 
	 *         begin=ChoiceL | 
	 *         begin=ForEachL | 
	 *         begin=RecursionL | 
	 *         begin=CloseRecursionL | 
	 *         begin=EndProtocol
	 *     )
	 * </pre>
	 */
	protected void sequence_ProtocolL(ISerializationContext context, ProtocolL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Protocol returns Protocol
	 *
	 * Constraint:
	 *     (
	 *         begin=Choice | 
	 *         begin=Message | 
	 *         begin=Recursion | 
	 *         begin=ForEach | 
	 *         begin=CloseRecursion | 
	 *         begin=EndProtocol
	 *     )
	 * </pre>
	 */
	protected void sequence_Protocol(ISerializationContext context, Protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Definition returns QuitDefinition
	 *     QuitDefinition returns QuitDefinition
	 *
	 * Constraint:
	 *     (type='@action' name='QUIT')
	 * </pre>
	 */
	protected void sequence_QuitDefinition(ISerializationContext context, QuitDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEFINITION__TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuitDefinitionAccess().getTypeActionKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getQuitDefinitionAccess().getNameQUITKeyword_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MessageType returns ReceiverL
	 *     ReceiverL returns ReceiverL
	 *
	 * Constraint:
	 *     role=[Role|ID]
	 * </pre>
	 */
	protected void sequence_ReceiverL(ISerializationContext context, ReceiverL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_TYPE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_TYPE__ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReceiverLAccess().getRoleRoleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.MESSAGE_TYPE__ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RecursionL returns RecursionL
	 *
	 * Constraint:
	 *     (name=ID recProtocol=ProtocolL)
	 * </pre>
	 */
	protected void sequence_RecursionL(ISerializationContext context, RecursionL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECURSION_L__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECURSION_L__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECURSION_L__REC_PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECURSION_L__REC_PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRecursionLAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecursionLAccess().getRecProtocolProtocolLParserRuleCall_4_0(), semanticObject.getRecProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Recursion returns Recursion
	 *
	 * Constraint:
	 *     (name=ID recProtocol=Protocol)
	 * </pre>
	 */
	protected void sequence_Recursion(ISerializationContext context, Recursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECURSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECURSION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECURSION__REC_PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECURSION__REC_PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRecursionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecursionAccess().getRecProtocolProtocolParserRuleCall_4_0(), semanticObject.getRecProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleOne
	 *     RoleOne returns RoleOne
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_RoleOne(ISerializationContext context, RoleOne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleOneAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleSet
	 *     RoleSet returns RoleSet
	 *
	 * Constraint:
	 *     (name=ID ref=[RoleOne|ID])
	 * </pre>
	 */
	protected void sequence_RoleSet(ISerializationContext context, RoleSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE_SET__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE_SET__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleSetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleSetAccess().getRefRoleOneIDTerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.ROLE_SET__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Roles returns Roles
	 *
	 * Constraint:
	 *     (roles+=Role roles+=Role*)
	 * </pre>
	 */
	protected void sequence_Roles(ISerializationContext context, Roles semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MessageType returns SenderL
	 *     SenderL returns SenderL
	 *
	 * Constraint:
	 *     role=[Role|ID]
	 * </pre>
	 */
	protected void sequence_SenderL(ISerializationContext context, SenderL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MESSAGE_TYPE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MESSAGE_TYPE__ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSenderLAccess().getRoleRoleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.MESSAGE_TYPE__ROLE, false));
		feeder.finish();
	}
	
	
}
