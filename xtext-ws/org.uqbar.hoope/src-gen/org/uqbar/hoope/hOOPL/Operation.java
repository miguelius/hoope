/**
 */
package org.uqbar.hoope.hOOPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hOOPL.Operation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.uqbar.hoope.hOOPL.Operation#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' attribute list.
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getOperation_Annotations()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnnotations();

  /**
   * Returns the value of the '<em><b>Sentence</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentence</em>' containment reference list.
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getOperation_Sentence()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSentence();

} // Operation
