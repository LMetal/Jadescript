/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEachL#getEachRole <em>Each Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEachL#getRoleset <em>Roleset</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEachL#getRefrole <em>Refrole</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEachL#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ForEachL#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL()
 * @model
 * @generated
 */
public interface ForEachL extends EObject
{
  /**
   * Returns the value of the '<em><b>Each Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Role</em>' containment reference.
   * @see #setEachRole(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL_EachRole()
   * @model containment="true"
   * @generated
   */
  RoleOne getEachRole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEachL#getEachRole <em>Each Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Role</em>' containment reference.
   * @see #getEachRole()
   * @generated
   */
  void setEachRole(RoleOne value);

  /**
   * Returns the value of the '<em><b>Roleset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roleset</em>' reference.
   * @see #setRoleset(RoleSet)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL_Roleset()
   * @model
   * @generated
   */
  RoleSet getRoleset();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEachL#getRoleset <em>Roleset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roleset</em>' reference.
   * @see #getRoleset()
   * @generated
   */
  void setRoleset(RoleSet value);

  /**
   * Returns the value of the '<em><b>Refrole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refrole</em>' reference.
   * @see #setRefrole(RoleOne)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL_Refrole()
   * @model
   * @generated
   */
  RoleOne getRefrole();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEachL#getRefrole <em>Refrole</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refrole</em>' reference.
   * @see #getRefrole()
   * @generated
   */
  void setRefrole(RoleOne value);

  /**
   * Returns the value of the '<em><b>Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branch</em>' containment reference.
   * @see #setBranch(ProtocolL)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL_Branch()
   * @model containment="true"
   * @generated
   */
  ProtocolL getBranch();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEachL#getBranch <em>Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Branch</em>' containment reference.
   * @see #getBranch()
   * @generated
   */
  void setBranch(ProtocolL value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' containment reference.
   * @see #setProtocol(ProtocolL)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getForEachL_Protocol()
   * @model containment="true"
   * @generated
   */
  ProtocolL getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ForEachL#getProtocol <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' containment reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(ProtocolL value);

} // ForEachL
