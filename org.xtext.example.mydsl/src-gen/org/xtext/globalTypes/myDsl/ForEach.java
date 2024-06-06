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
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getEachRole <em>Each Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getRefRole <em>Ref Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEach#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends EObject
{
  /**
   * Returns the value of the '<em><b>Each Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Role</em>' containment reference.
   * @see #setEachRole(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_EachRole()
   * @model containment="true"
   * @generated
   */
  RoleOne getEachRole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getEachRole <em>Each Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Role</em>' containment reference.
   * @see #getEachRole()
   * @generated
   */
  void setEachRole(RoleOne value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(RoleSet)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_Role()
   * @model
   * @generated
   */
  RoleSet getRole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(RoleSet value);

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
   * Returns the value of the '<em><b>Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branch</em>' containment reference.
   * @see #setBranch(Protocol)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEach_Branch()
   * @model containment="true"
   * @generated
   */
  Protocol getBranch();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEach#getBranch <em>Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Branch</em>' containment reference.
   * @see #getBranch()
   * @generated
   */
  void setBranch(Protocol value);

} // ForEach
