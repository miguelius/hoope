/**
 */
package org.uqbar.hoope.hoopl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.Message#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Feature
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.hoope.hoopl.Expresion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see org.uqbar.hoope.hoopl.HooplPackage#getMessage_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getSentences();

} // Message
