/**
 */
package org.uqbar.hoope.hOOPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hOOPL.SendMessage#getName <em>Name</em>}</li>
 *   <li>{@link org.uqbar.hoope.hOOPL.SendMessage#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getSendMessage()
 * @model
 * @generated
 */
public interface SendMessage extends EObject
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
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getSendMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hOOPL.SendMessage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#getSendMessage_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hOOPL.SendMessage#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // SendMessage
