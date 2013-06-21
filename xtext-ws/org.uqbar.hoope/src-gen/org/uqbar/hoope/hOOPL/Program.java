/**
 */
package org.uqbar.hoope.hoopl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.Program#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.uqbar.hoope.hoopl.HooplPackage#getProgram_Objects()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getObjects();

} // Program
