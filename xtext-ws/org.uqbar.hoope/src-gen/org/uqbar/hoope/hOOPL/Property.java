/**
 */
package org.uqbar.hoope.hoopl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.Property#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.uqbar.hoope.hoopl.HooplPackage#getProperty_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hoopl.Property#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' attribute.
   * @see #setInitial(String)
   * @see org.uqbar.hoope.hoopl.HooplPackage#getProperty_Initial()
   * @model
   * @generated
   */
  String getInitial();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hoopl.Property#getInitial <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' attribute.
   * @see #getInitial()
   * @generated
   */
  void setInitial(String value);

} // Property
