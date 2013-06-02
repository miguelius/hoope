/**
 */
package org.uqbar.hoope.hOOPL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage
 * @generated
 */
public interface HOOPLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HOOPLFactory eINSTANCE = org.uqbar.hoope.hOOPL.impl.HOOPLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>HOOPL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HOOPL</em>'.
   * @generated
   */
  HOOPL createHOOPL();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Mutator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mutator</em>'.
   * @generated
   */
  Mutator createMutator();

  /**
   * Returns a new object of class '<em>Send Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Send Message</em>'.
   * @generated
   */
  SendMessage createSendMessage();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HOOPLPackage getHOOPLPackage();

} //HOOPLFactory
