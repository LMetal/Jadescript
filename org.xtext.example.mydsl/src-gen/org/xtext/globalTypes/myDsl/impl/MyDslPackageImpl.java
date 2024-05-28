/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.xtext.globalTypes.myDsl.MyDslFactory;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.ProtocolL;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.Recursion;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleL;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleOneL;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.RoleSetL;
import org.xtext.globalTypes.myDsl.Roles;
import org.xtext.globalTypes.myDsl.RolesL;
import org.xtext.globalTypes.myDsl.SenderL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalProtocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rolesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleOneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recursionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closeRecursionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass payloadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localProtocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rolesLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleOneLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleSetLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass senderLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass receiverLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEachLEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMyDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MyDslPackageImpl theMyDslPackage = registeredMyDslPackage instanceof MyDslPackageImpl ? (MyDslPackageImpl)registeredMyDslPackage : new MyDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Protocol()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGlobalProtocol()
  {
    return globalProtocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGlobalProtocol_ProtocolName()
  {
    return (EAttribute)globalProtocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGlobalProtocol_Roles()
  {
    return (EReference)globalProtocolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGlobalProtocol_Protocol()
  {
    return (EReference)globalProtocolEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoles()
  {
    return rolesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoles_Roles()
  {
    return (EReference)rolesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoleOne()
  {
    return roleOneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoleSet()
  {
    return roleSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoleSet_Ref()
  {
    return (EReference)roleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProtocol_Actions()
  {
    return (EReference)protocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRecursion()
  {
    return recursionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRecursion_Name()
  {
    return (EAttribute)recursionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCloseRecursion()
  {
    return closeRecursionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCloseRecursion_RecursionVariable()
  {
    return (EReference)closeRecursionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getForEach()
  {
    return forEachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEach_EachRole()
  {
    return (EReference)forEachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEach_Role()
  {
    return (EReference)forEachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEach_Branch()
  {
    return (EReference)forEachEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChoice()
  {
    return choiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoice_Role()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoice_Message()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoice_Branches()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMessage_MessageType()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMessage_Payload()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMessage_Sender()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMessage_Receiver()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPayload()
  {
    return payloadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPayload_Types()
  {
    return (EAttribute)payloadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLocalProtocol()
  {
    return localProtocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLocalProtocol_ProtocolName()
  {
    return (EAttribute)localProtocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLocalProtocol_ProjectedRole()
  {
    return (EAttribute)localProtocolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLocalProtocol_Roles()
  {
    return (EReference)localProtocolEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLocalProtocol_Protocol()
  {
    return (EReference)localProtocolEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRolesL()
  {
    return rolesLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRolesL_Roles()
  {
    return (EReference)rolesLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoleL()
  {
    return roleLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRoleL_Name()
  {
    return (EAttribute)roleLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoleOneL()
  {
    return roleOneLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoleSetL()
  {
    return roleSetLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoleSetL_Ref()
  {
    return (EReference)roleSetLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProtocolL()
  {
    return protocolLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProtocolL_Actions()
  {
    return (EReference)protocolLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMessageL()
  {
    return messageLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMessageL_MessageType()
  {
    return (EAttribute)messageLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMessageL_Payload()
  {
    return (EReference)messageLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMessageL_Target()
  {
    return (EReference)messageLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSenderL()
  {
    return senderLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSenderL_Sender()
  {
    return (EReference)senderLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReceiverL()
  {
    return receiverLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getReceiverL_To()
  {
    return (EReference)receiverLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChoiceL()
  {
    return choiceLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoiceL_Role()
  {
    return (EReference)choiceLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoiceL_Message()
  {
    return (EReference)choiceLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChoiceL_Branches()
  {
    return (EReference)choiceLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getForEachL()
  {
    return forEachLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEachL_EachRole()
  {
    return (EReference)forEachLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEachL_Role()
  {
    return (EReference)forEachLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForEachL_Branch()
  {
    return (EReference)forEachLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROTOCOL);

    globalProtocolEClass = createEClass(GLOBAL_PROTOCOL);
    createEAttribute(globalProtocolEClass, GLOBAL_PROTOCOL__PROTOCOL_NAME);
    createEReference(globalProtocolEClass, GLOBAL_PROTOCOL__ROLES);
    createEReference(globalProtocolEClass, GLOBAL_PROTOCOL__PROTOCOL);

    rolesEClass = createEClass(ROLES);
    createEReference(rolesEClass, ROLES__ROLES);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);

    roleOneEClass = createEClass(ROLE_ONE);

    roleSetEClass = createEClass(ROLE_SET);
    createEReference(roleSetEClass, ROLE_SET__REF);

    protocolEClass = createEClass(PROTOCOL);
    createEReference(protocolEClass, PROTOCOL__ACTIONS);

    recursionEClass = createEClass(RECURSION);
    createEAttribute(recursionEClass, RECURSION__NAME);

    closeRecursionEClass = createEClass(CLOSE_RECURSION);
    createEReference(closeRecursionEClass, CLOSE_RECURSION__RECURSION_VARIABLE);

    forEachEClass = createEClass(FOR_EACH);
    createEReference(forEachEClass, FOR_EACH__EACH_ROLE);
    createEReference(forEachEClass, FOR_EACH__ROLE);
    createEReference(forEachEClass, FOR_EACH__BRANCH);

    choiceEClass = createEClass(CHOICE);
    createEReference(choiceEClass, CHOICE__ROLE);
    createEReference(choiceEClass, CHOICE__MESSAGE);
    createEReference(choiceEClass, CHOICE__BRANCHES);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__MESSAGE_TYPE);
    createEReference(messageEClass, MESSAGE__PAYLOAD);
    createEReference(messageEClass, MESSAGE__SENDER);
    createEReference(messageEClass, MESSAGE__RECEIVER);

    payloadEClass = createEClass(PAYLOAD);
    createEAttribute(payloadEClass, PAYLOAD__TYPES);

    localProtocolEClass = createEClass(LOCAL_PROTOCOL);
    createEAttribute(localProtocolEClass, LOCAL_PROTOCOL__PROTOCOL_NAME);
    createEAttribute(localProtocolEClass, LOCAL_PROTOCOL__PROJECTED_ROLE);
    createEReference(localProtocolEClass, LOCAL_PROTOCOL__ROLES);
    createEReference(localProtocolEClass, LOCAL_PROTOCOL__PROTOCOL);

    rolesLEClass = createEClass(ROLES_L);
    createEReference(rolesLEClass, ROLES_L__ROLES);

    roleLEClass = createEClass(ROLE_L);
    createEAttribute(roleLEClass, ROLE_L__NAME);

    roleOneLEClass = createEClass(ROLE_ONE_L);

    roleSetLEClass = createEClass(ROLE_SET_L);
    createEReference(roleSetLEClass, ROLE_SET_L__REF);

    protocolLEClass = createEClass(PROTOCOL_L);
    createEReference(protocolLEClass, PROTOCOL_L__ACTIONS);

    messageLEClass = createEClass(MESSAGE_L);
    createEAttribute(messageLEClass, MESSAGE_L__MESSAGE_TYPE);
    createEReference(messageLEClass, MESSAGE_L__PAYLOAD);
    createEReference(messageLEClass, MESSAGE_L__TARGET);

    senderLEClass = createEClass(SENDER_L);
    createEReference(senderLEClass, SENDER_L__SENDER);

    receiverLEClass = createEClass(RECEIVER_L);
    createEReference(receiverLEClass, RECEIVER_L__TO);

    choiceLEClass = createEClass(CHOICE_L);
    createEReference(choiceLEClass, CHOICE_L__ROLE);
    createEReference(choiceLEClass, CHOICE_L__MESSAGE);
    createEReference(choiceLEClass, CHOICE_L__BRANCHES);

    forEachLEClass = createEClass(FOR_EACH_L);
    createEReference(forEachLEClass, FOR_EACH_L__EACH_ROLE);
    createEReference(forEachLEClass, FOR_EACH_L__ROLE);
    createEReference(forEachLEClass, FOR_EACH_L__BRANCH);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    roleOneEClass.getESuperTypes().add(this.getRole());
    roleSetEClass.getESuperTypes().add(this.getRole());
    roleOneLEClass.getESuperTypes().add(this.getRoleL());
    roleSetLEClass.getESuperTypes().add(this.getRoleL());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Protocol(), ecorePackage.getEObject(), null, "protocol", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalProtocolEClass, GlobalProtocol.class, "GlobalProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalProtocol_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 0, 1, GlobalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalProtocol_Roles(), this.getRoles(), null, "roles", null, 0, 1, GlobalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalProtocol_Protocol(), this.getProtocol(), null, "protocol", null, 0, 1, GlobalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoles_Roles(), this.getRole(), null, "roles", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleOneEClass, RoleOne.class, "RoleOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleSetEClass, RoleSet.class, "RoleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleSet_Ref(), this.getRoleOne(), null, "ref", null, 0, 1, RoleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProtocol_Actions(), ecorePackage.getEObject(), null, "actions", null, 0, -1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursionEClass, Recursion.class, "Recursion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecursion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closeRecursionEClass, CloseRecursion.class, "CloseRecursion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCloseRecursion_RecursionVariable(), this.getRecursion(), null, "recursionVariable", null, 0, 1, CloseRecursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEachEClass, ForEach.class, "ForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForEach_EachRole(), this.getRoleOne(), null, "eachRole", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForEach_Role(), this.getRoleSet(), null, "role", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForEach_Branch(), this.getProtocol(), null, "branch", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoice_Role(), this.getRoleOne(), null, "role", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoice_Message(), this.getMessage(), null, "message", null, 0, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoice_Branches(), this.getProtocol(), null, "branches", null, 0, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_MessageType(), ecorePackage.getEString(), "messageType", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Payload(), this.getPayload(), null, "payload", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Sender(), this.getRoleOne(), null, "sender", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Receiver(), this.getRoleOne(), null, "receiver", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPayload_Types(), ecorePackage.getEString(), "types", null, 0, -1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localProtocolEClass, LocalProtocol.class, "LocalProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalProtocol_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 0, 1, LocalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalProtocol_ProjectedRole(), ecorePackage.getEString(), "projectedRole", null, 0, 1, LocalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalProtocol_Roles(), this.getRolesL(), null, "roles", null, 0, 1, LocalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalProtocol_Protocol(), this.getProtocolL(), null, "protocol", null, 0, 1, LocalProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rolesLEClass, RolesL.class, "RolesL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRolesL_Roles(), this.getRoleL(), null, "roles", null, 0, -1, RolesL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleLEClass, RoleL.class, "RoleL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoleL_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoleL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleOneLEClass, RoleOneL.class, "RoleOneL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleSetLEClass, RoleSetL.class, "RoleSetL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleSetL_Ref(), this.getRoleOneL(), null, "ref", null, 0, 1, RoleSetL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolLEClass, ProtocolL.class, "ProtocolL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProtocolL_Actions(), ecorePackage.getEObject(), null, "actions", null, 0, -1, ProtocolL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageLEClass, MessageL.class, "MessageL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageL_MessageType(), ecorePackage.getEString(), "messageType", null, 0, 1, MessageL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageL_Payload(), this.getPayload(), null, "payload", null, 0, 1, MessageL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageL_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, MessageL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(senderLEClass, SenderL.class, "SenderL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSenderL_Sender(), this.getRoleL(), null, "sender", null, 0, 1, SenderL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(receiverLEClass, ReceiverL.class, "ReceiverL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReceiverL_To(), this.getRoleL(), null, "to", null, 0, 1, ReceiverL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceLEClass, ChoiceL.class, "ChoiceL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoiceL_Role(), this.getRoleL(), null, "role", null, 0, 1, ChoiceL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoiceL_Message(), this.getMessageL(), null, "message", null, 0, -1, ChoiceL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoiceL_Branches(), this.getProtocolL(), null, "branches", null, 0, -1, ChoiceL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEachLEClass, ForEachL.class, "ForEachL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForEachL_EachRole(), this.getRoleOneL(), null, "eachRole", null, 0, 1, ForEachL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForEachL_Role(), this.getRoleSetL(), null, "role", null, 0, 1, ForEachL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForEachL_Branch(), this.getProtocolL(), null, "branch", null, 0, 1, ForEachL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
