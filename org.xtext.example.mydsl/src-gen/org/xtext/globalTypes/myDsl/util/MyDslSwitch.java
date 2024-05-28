/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.globalTypes.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.globalTypes.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.GLOBAL_PROTOCOL:
      {
        GlobalProtocol globalProtocol = (GlobalProtocol)theEObject;
        T result = caseGlobalProtocol(globalProtocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLES:
      {
        Roles roles = (Roles)theEObject;
        T result = caseRoles(roles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_ONE:
      {
        RoleOne roleOne = (RoleOne)theEObject;
        T result = caseRoleOne(roleOne);
        if (result == null) result = caseRole(roleOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_SET:
      {
        RoleSet roleSet = (RoleSet)theEObject;
        T result = caseRoleSet(roleSet);
        if (result == null) result = caseRole(roleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RECURSION:
      {
        Recursion recursion = (Recursion)theEObject;
        T result = caseRecursion(recursion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLOSE_RECURSION:
      {
        CloseRecursion closeRecursion = (CloseRecursion)theEObject;
        T result = caseCloseRecursion(closeRecursion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_EACH:
      {
        ForEach forEach = (ForEach)theEObject;
        T result = caseForEach(forEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PAYLOAD:
      {
        Payload payload = (Payload)theEObject;
        T result = casePayload(payload);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOCAL_PROTOCOL:
      {
        LocalProtocol localProtocol = (LocalProtocol)theEObject;
        T result = caseLocalProtocol(localProtocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLES_L:
      {
        RolesL rolesL = (RolesL)theEObject;
        T result = caseRolesL(rolesL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_L:
      {
        RoleL roleL = (RoleL)theEObject;
        T result = caseRoleL(roleL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_ONE_L:
      {
        RoleOneL roleOneL = (RoleOneL)theEObject;
        T result = caseRoleOneL(roleOneL);
        if (result == null) result = caseRoleL(roleOneL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_SET_L:
      {
        RoleSetL roleSetL = (RoleSetL)theEObject;
        T result = caseRoleSetL(roleSetL);
        if (result == null) result = caseRoleL(roleSetL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROTOCOL_L:
      {
        ProtocolL protocolL = (ProtocolL)theEObject;
        T result = caseProtocolL(protocolL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MESSAGE_L:
      {
        MessageL messageL = (MessageL)theEObject;
        T result = caseMessageL(messageL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SENDER_L:
      {
        SenderL senderL = (SenderL)theEObject;
        T result = caseSenderL(senderL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RECEIVER_L:
      {
        ReceiverL receiverL = (ReceiverL)theEObject;
        T result = caseReceiverL(receiverL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHOICE_L:
      {
        ChoiceL choiceL = (ChoiceL)theEObject;
        T result = caseChoiceL(choiceL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_EACH_L:
      {
        ForEachL forEachL = (ForEachL)theEObject;
        T result = caseForEachL(forEachL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalProtocol(GlobalProtocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Roles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Roles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoles(Roles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role One</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleOne(RoleOne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleSet(RoleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recursion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recursion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecursion(Recursion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Close Recursion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Close Recursion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloseRecursion(CloseRecursion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEach(ForEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePayload(Payload object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalProtocol(LocalProtocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Roles L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Roles L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRolesL(RolesL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleL(RoleL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role One L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role One L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleOneL(RoleOneL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Set L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Set L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleSetL(RoleSetL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocolL(ProtocolL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageL(MessageL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sender L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sender L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSenderL(SenderL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Receiver L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Receiver L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReceiverL(ReceiverL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceL(ChoiceL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachL(ForEachL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
