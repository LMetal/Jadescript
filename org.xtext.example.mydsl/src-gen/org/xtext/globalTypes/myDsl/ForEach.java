/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getLoopRole <em>Loop Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getRoleset <em>Roleset</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getRefRole <em>Ref Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getForBody <em>For Body</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends EObject
{
  /**
   * Returns the value of the '<em><b>Loop Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop Role</em>' containment reference.
   * @see #setLoopRole(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_LoopRole()
   * @model containment="true"
   * @generated
   */
  RoleOne getLoopRole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getLoopRole <em>Loop Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop Role</em>' containment reference.
   * @see #getLoopRole()
   * @generated
   */
  void setLoopRole(RoleOne value);

  /**
   * Returns the value of the '<em><b>Roleset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roleset</em>' reference.
   * @see #setRoleset(RoleSet)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_Roleset()
   * @model
   * @generated
   */
  RoleSet getRoleset();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getRoleset <em>Roleset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roleset</em>' reference.
   * @see #getRoleset()
   * @generated
   */
  void setRoleset(RoleSet value);

  /**
   * Returns the value of the '<em><b>Ref Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Role</em>' reference.
   * @see #setRefRole(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_RefRole()
   * @model
   * @generated
   */
  RoleOne getRefRole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getRefRole <em>Ref Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Role</em>' reference.
   * @see #getRefRole()
   * @generated
   */
  void setRefRole(RoleOne value);

  /**
   * Returns the value of the '<em><b>For Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Body</em>' containment reference.
   * @see #setForBody(Protocol)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_ForBody()
   * @model containment="true"
   * @generated
   */
  Protocol getForBody();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getForBody <em>For Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Body</em>' containment reference.
   * @see #getForBody()
   * @generated
   */
  void setForBody(Protocol value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' containment reference.
   * @see #setProtocol(Protocol)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_Protocol()
   * @model containment="true"
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getProtocol <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' containment reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // ForEach
