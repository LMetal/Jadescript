/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageBase#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.MessageBase#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageBase()
 * @model
 * @generated
 */
public interface MessageBase extends Message
{
  /**
   * Returns the value of the '<em><b>Payload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payload</em>' containment reference.
   * @see #setPayload(Payload)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageBase_Payload()
   * @model containment="true"
   * @generated
   */
  Payload getPayload();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.MessageBase#getPayload <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payload</em>' containment reference.
   * @see #getPayload()
   * @generated
   */
  void setPayload(Payload value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' containment reference.
   * @see #setProtocol(Protocol)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getMessageBase_Protocol()
   * @model containment="true"
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.MessageBase#getProtocol <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' containment reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // MessageBase