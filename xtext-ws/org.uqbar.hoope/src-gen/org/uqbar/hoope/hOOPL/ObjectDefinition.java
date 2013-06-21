/**
 */
package org.uqbar.hoope.hoopl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.ObjectDefinition#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getObjectDefinition()
 * @model
 * @generated
 */
public interface ObjectDefinition extends Feature
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.hoope.hoopl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.uqbar.hoope.hoopl.HooplPackage#getObjectDefinition_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // ObjectDefinition
