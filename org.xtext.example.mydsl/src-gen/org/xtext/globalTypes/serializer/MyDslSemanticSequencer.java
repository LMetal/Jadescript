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
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.ForEachL;
import org.xtext.globalTypes.myDsl.GlobalProtocol;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.MessageL;
import org.xtext.globalTypes.myDsl.Model;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.ProtocolL;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.Recursion;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleOneL;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.RoleSetL;
import org.xtext.globalTypes.myDsl.Roles;
import org.xtext.globalTypes.myDsl.RolesL;
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
			case MyDslPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case MyDslPackage.MESSAGE_L:
				sequence_MessageL(context, (MessageL) semanticObject); 
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
			case MyDslPackage.RECEIVER_L:
				sequence_ReceiverL(context, (ReceiverL) semanticObject); 
				return; 
			case MyDslPackage.RECURSION:
				sequence_Recursion(context, (Recursion) semanticObject); 
				return; 
			case MyDslPackage.ROLE_ONE:
				sequence_RoleOne(context, (RoleOne) semanticObject); 
				return; 
			case MyDslPackage.ROLE_ONE_L:
				sequence_RoleOneL(context, (RoleOneL) semanticObject); 
				return; 
			case MyDslPackage.ROLE_SET:
				sequence_RoleSet(context, (RoleSet) semanticObject); 
				return; 
			case MyDslPackage.ROLE_SET_L:
				sequence_RoleSetL(context, (RoleSetL) semanticObject); 
				return; 
			case MyDslPackage.ROLES:
				sequence_Roles(context, (Roles) semanticObject); 
				return; 
			case MyDslPackage.ROLES_L:
				sequence_RolesL(context, (RolesL) semanticObject); 
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
	 *     (role=[RoleL|ROLENAME] message+=MessageL branches+=ProtocolL (message+=MessageL branches+=ProtocolL)*)
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
	 *     (role=[RoleOne|ROLENAME] message+=Message branches+=Protocol (message+=Message branches+=Protocol)*)
	 * </pre>
	 */
	protected void sequence_Choice(ISerializationContext context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CloseRecursion returns CloseRecursion
	 *
	 * Constraint:
	 *     recursionVariable=[Recursion|RECNAME]
	 * </pre>
	 */
	protected void sequence_CloseRecursion(ISerializationContext context, CloseRecursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionRECNAMETerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ForEachL returns ForEachL
	 *
	 * Constraint:
	 *     (eachRole=RoleOneL role=[RoleSetL|ROLESETNAME] branch=ProtocolL)
	 * </pre>
	 */
	protected void sequence_ForEachL(ISerializationContext context, ForEachL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__EACH_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__EACH_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH_L__BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH_L__BRANCH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachLAccess().getEachRoleRoleOneLParserRuleCall_1_0(), semanticObject.getEachRole());
		feeder.accept(grammarAccess.getForEachLAccess().getRoleRoleSetLROLESETNAMETerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH_L__ROLE, false));
		feeder.accept(grammarAccess.getForEachLAccess().getBranchProtocolLParserRuleCall_5_0(), semanticObject.getBranch());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ForEach returns ForEach
	 *
	 * Constraint:
	 *     (eachRole=RoleOne role=[RoleSet|ROLESETNAME] branch=Protocol)
	 * </pre>
	 */
	protected void sequence_ForEach(ISerializationContext context, ForEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__EACH_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__EACH_ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__ROLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__BRANCH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachAccess().getEachRoleRoleOneParserRuleCall_1_0(), semanticObject.getEachRole());
		feeder.accept(grammarAccess.getForEachAccess().getRoleRoleSetROLESETNAMETerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.FOR_EACH__ROLE, false));
		feeder.accept(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0(), semanticObject.getBranch());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GlobalProtocol returns GlobalProtocol
	 *
	 * Constraint:
	 *     (protocolName=PROTOCOLNAME roles=Roles protocol=Protocol)
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
		feeder.accept(grammarAccess.getGlobalProtocolAccess().getProtocolNamePROTOCOLNAMETerminalRuleCall_2_0(), semanticObject.getProtocolName());
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
	 *     (protocolName=PROTOCOLNAME (projectedRole=ROLENAME | projectedRole=ROLESETNAME) roles=RolesL protocol=ProtocolL)
	 * </pre>
	 */
	protected void sequence_LocalProtocol(ISerializationContext context, LocalProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MessageL returns MessageL
	 *
	 * Constraint:
	 *     (messageType=MessageType payload=Payload? (target=SenderL | target=ReceiverL))
	 * </pre>
	 */
	protected void sequence_MessageL(ISerializationContext context, MessageL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (messageType=MessageType payload=Payload? sender=[RoleOne|ROLENAME] receiver=[RoleOne|ROLENAME])
	 * </pre>
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (protocol=GlobalProtocol | protocol=LocalProtocol)
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
	 *     ((types+=Type types+=Type*) | types+=ID)
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
	 *         actions+=MessageL | 
	 *         actions+=Message | 
	 *         actions+=ChoiceL | 
	 *         actions+=ForEachL | 
	 *         actions+=Recursion | 
	 *         actions+=CloseRecursion
	 *     )*
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
	 *     (actions+=Message | actions+=Choice | actions+=Recursion | actions+=ForEach | actions+=CloseRecursion)*
	 * </pre>
	 */
	protected void sequence_Protocol(ISerializationContext context, Protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReceiverL returns ReceiverL
	 *
	 * Constraint:
	 *     to=[RoleL|ROLENAME]
	 * </pre>
	 */
	protected void sequence_ReceiverL(ISerializationContext context, ReceiverL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECEIVER_L__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECEIVER_L__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReceiverLAccess().getToRoleLROLENAMETerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.RECEIVER_L__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Recursion returns Recursion
	 *
	 * Constraint:
	 *     name=RECNAME
	 * </pre>
	 */
	protected void sequence_Recursion(ISerializationContext context, Recursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RECURSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RECURSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRecursionAccess().getNameRECNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RoleL returns RoleOneL
	 *     RoleOneL returns RoleOneL
	 *
	 * Constraint:
	 *     name=ROLENAME
	 * </pre>
	 */
	protected void sequence_RoleOneL(ISerializationContext context, RoleOneL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE_L__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE_L__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleOneLAccess().getNameROLENAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleOne
	 *     RoleOne returns RoleOne
	 *
	 * Constraint:
	 *     name=ROLENAME
	 * </pre>
	 */
	protected void sequence_RoleOne(ISerializationContext context, RoleOne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleOneAccess().getNameROLENAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RoleL returns RoleSetL
	 *     RoleSetL returns RoleSetL
	 *
	 * Constraint:
	 *     (name=ROLESETNAME ref=[RoleOneL|ROLENAME])
	 * </pre>
	 */
	protected void sequence_RoleSetL(ISerializationContext context, RoleSetL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE_L__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE_L__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLE_SET_L__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLE_SET_L__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleSetLAccess().getNameROLESETNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleSetLAccess().getRefRoleOneLROLENAMETerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.ROLE_SET_L__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleSet
	 *     RoleSet returns RoleSet
	 *
	 * Constraint:
	 *     (name=ROLESETNAME ref=[RoleOne|ROLENAME])
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
		feeder.accept(grammarAccess.getRoleSetAccess().getNameROLESETNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleSetAccess().getRefRoleOneROLENAMETerminalRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.ROLE_SET__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RolesL returns RolesL
	 *
	 * Constraint:
	 *     (roles+=RoleL roles+=RoleL*)
	 * </pre>
	 */
	protected void sequence_RolesL(ISerializationContext context, RolesL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     SenderL returns SenderL
	 *
	 * Constraint:
	 *     sender=[RoleL|ROLENAME]
	 * </pre>
	 */
	protected void sequence_SenderL(ISerializationContext context, SenderL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SENDER_L__SENDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SENDER_L__SENDER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSenderLAccess().getSenderRoleLROLENAMETerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.SENDER_L__SENDER, false));
		feeder.finish();
	}
	
	
}
