/**
 */
package org.uqbar.hoope.hoopl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.Operation#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature
{
  /**
   * Returns the value of the '<em><b>Sentence</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.hoope.hoopl.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentence</em>' containment reference list.
   * @see org.uqbar.hoope.hoopl.HooplPackage#getOperation_Sentence()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getSentence();

} // Operation
