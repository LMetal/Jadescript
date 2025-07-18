/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.Message#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.Message#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
  /**
   * Returns the value of the '<em><b>Message Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Type</em>' reference.
   * @see #setMessageType(Definition)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessage_MessageType()
   * @model
   * @generated
   */
  Definition getMessageType();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.Message#getMessageType <em>Message Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Type</em>' reference.
   * @see #getMessageType()
   * @generated
   */
  void setMessageType(Definition value);

  /**
   * Returns the value of the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' reference.
   * @see #setSender(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessage_Sender()
   * @model
   * @generated
   */
  RoleOne getSender();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.Message#getSender <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' reference.
   * @see #getSender()
   * @generated
   */
  void setSender(RoleOne value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' reference.
   * @see #setReceiver(Role)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessage_Receiver()
   * @model
   * @generated
   */
  Role getReceiver();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.Message#getReceiver <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(Role value);

} // Message
