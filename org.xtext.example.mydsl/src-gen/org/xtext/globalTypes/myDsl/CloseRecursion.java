/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close Recursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.CloseRecursion#getRecursionVariable <em>Recursion Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getCloseRecursion()
 * @model
 * @generated
 */
public interface CloseRecursion extends EObject
{
  /**
   * Returns the value of the '<em><b>Recursion Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion Variable</em>' reference.
   * @see #setRecursionVariable(Recursion)
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getCloseRecursion_RecursionVariable()
   * @model
   * @generated
   */
  Recursion getRecursionVariable();

  /**
   * Sets the value of the '{@link org.xtext.globalTypes.myDsl.CloseRecursion#getRecursionVariable <em>Recursion Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion Variable</em>' reference.
   * @see #getRecursionVariable()
   * @generated
   */
  void setRecursionVariable(Recursion value);

} // CloseRecursion
