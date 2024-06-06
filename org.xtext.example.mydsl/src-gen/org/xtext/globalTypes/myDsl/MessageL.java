/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageL#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageL#getTarget <em>Target</em>}</li>
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
   * Returns the value of the '<em><b>Payload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payload</em>' containment reference.
   * @see #setPayload(Payload)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageL_Payload()
   * @model containment="true"
   * @generated
   */
  Payload getPayload();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.MessageL#getPayload <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payload</em>' containment reference.
   * @see #getPayload()
   * @generated
   */
  void setPayload(Payload value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageL_Target()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTarget();

} // MessageL