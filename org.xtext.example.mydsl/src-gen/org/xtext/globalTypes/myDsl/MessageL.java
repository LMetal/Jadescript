/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageL#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageL#getSendReceive <em>Send Receive</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageL()
 * @model
 * @generated
 */
public interface MessageL extends EObject
{
  /**
   * Returns the value of the '<em><b>Message Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Type</em>' attribute.
   * @see #setMessageType(String)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageL_MessageType()
   * @model
   * @generated
   */
  String getMessageType();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.MessageL#getMessageType <em>Message Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Type</em>' attribute.
   * @see #getMessageType()
   * @generated
   */
  void setMessageType(String value);

  /**
   * Returns the value of the '<em><b>Send Receive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send Receive</em>' containment reference.
   * @see #setSendReceive(MessageType)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageL_SendReceive()
   * @model containment="true"
   * @generated
   */
  MessageType getSendReceive();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.MessageL#getSendReceive <em>Send Receive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send Receive</em>' containment reference.
   * @see #getSendReceive()
   * @generated
   */
  void setSendReceive(MessageType value);

} // MessageL
