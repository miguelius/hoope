/**
 */
package org.uqbar.hoope.hOOPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hOOPL.Object#getName <em>Name</em>}</li>
 *   <li>{@link org.uqbar.hoope.hOOPL.Object#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends HOOPL
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hOOPL.Object#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.hoope.hOOPL.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getObject_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Object
