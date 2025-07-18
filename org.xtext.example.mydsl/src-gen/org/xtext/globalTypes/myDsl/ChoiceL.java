/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.ChoiceL#getRoleMakingChoice <em>Role Making Choice</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.ChoiceL#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getChoiceL()
 * @model
 * @generated
 */
public interface ChoiceL extends EObject
{
  /**
   * Returns the value of the '<em><b>Role Making Choice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Making Choice</em>' reference.
   * @see #setRoleMakingChoice(Role)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getChoiceL_RoleMakingChoice()
   * @model
   * @generated
   */
  Role getRoleMakingChoice();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.ChoiceL#getRoleMakingChoice <em>Role Making Choice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Making Choice</em>' reference.
   * @see #getRoleMakingChoice()
   * @generated
   */
  void setRoleMakingChoice(Role value);

  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.globalTypes.myDsl.MessageL}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getChoiceL_Branches()
   * @model containment="true"
   * @generated
   */
  EList<MessageL> getBranches();

} // ChoiceL
