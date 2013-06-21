/**
 */
package org.uqbar.hoope.hoopl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.Expresion#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.Expresion#getThen <em>Then</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.Expresion#getElse <em>Else</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.Expresion#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.hoope.hoopl.HooplPackage#getExpresion()
 * @model
 * @generated
 */
public interface Expresion extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expresion)
   * @see org.uqbar.hoope.hoopl.HooplPackage#getExpresion_Condition()
   * @model containment="true"
   * @generated
   */
  Expresion getCondition();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hoopl.Expresion#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expresion value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Expresion)
   * @see org.uqbar.hoope.hoopl.HooplPackage#getExpresion_Then()
   * @model containment="true"
   * @generated
   */
  Expresion getThen();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hoopl.Expresion#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Expresion value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Expresion)
   * @see org.uqbar.hoope.hoopl.HooplPackage#getExpresion_Else()
   * @model containment="true"
   * @generated
   */
  Expresion getElse();

  /**
   * Sets the value of the '{@link org.uqbar.hoope.hoopl.Expresion#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Expresion value);

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
   * @see org.uqbar.hoope.hoopl.HooplPackage#getExpresion_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getSentences();

} // Expresion
