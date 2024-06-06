/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.Payload#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.globalTypes.myDsl.MyDslPackage#getPayload()
 * @model
 * @generated
 */
public interface Payload extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see org.xtext.globalTypes.myDsl.MyDslPackage#getPayload_Types()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypes();

} // Payload