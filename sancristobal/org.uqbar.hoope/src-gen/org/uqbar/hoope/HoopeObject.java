/**
 */
package org.uqbar.hoope;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.HoopeObject#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.HoopePackage#getHoopeObject()
 * @model
 * @generated
 */
public interface HoopeObject extends XExpression
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.hoope.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.uqbar.hoope.HoopePackage#getHoopeObject_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // HoopeObject
