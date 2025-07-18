/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursion L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.RecursionL#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.RecursionL#getRecProtocol <em>Rec Protocol</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getRecursionL()
 * @model
 * @generated
 */
public interface RecursionL extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getRecursionL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.RecursionL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rec Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec Protocol</em>' containment reference.
   * @see #setRecProtocol(ProtocolL)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getRecursionL_RecProtocol()
   * @model containment="true"
   * @generated
   */
  ProtocolL getRecProtocol();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.RecursionL#getRecProtocol <em>Rec Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rec Protocol</em>' containment reference.
   * @see #getRecProtocol()
   * @generated
   */
  void setRecProtocol(ProtocolL value);

} // RecursionL
