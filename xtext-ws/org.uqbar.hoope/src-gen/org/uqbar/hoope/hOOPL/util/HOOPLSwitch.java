/**
 */
package org.uqbar.hoope.hOOPL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.uqbar.hoope.hOOPL.Feature;
import org.uqbar.hoope.hOOPL.HOOPL;
import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Mutator;
import org.uqbar.hoope.hOOPL.Operation;
import org.uqbar.hoope.hOOPL.Property;
import org.uqbar.hoope.hOOPL.SendMessage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage
 * @generated
 */
public class HOOPLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HOOPLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HOOPLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HOOPLPackage.HOOPL:
      {
        HOOPL hoopl = (HOOPL)theEObject;
        T result = caseHOOPL(hoopl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.OBJECT:
      {
        org.uqbar.hoope.hOOPL.Object object = (org.uqbar.hoope.hOOPL.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseHOOPL(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseFeature(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseFeature(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.MUTATOR:
      {
        Mutator mutator = (Mutator)theEObject;
        T result = caseMutator(mutator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HOOPLPackage.SEND_MESSAGE:
      {
        SendMessage sendMessage = (SendMessage)theEObject;
        T result = caseSendMessage(sendMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HOOPL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HOOPL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHOOPL(HOOPL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.uqbar.hoope.hOOPL.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mutator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mutator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMutator(Mutator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendMessage(SendMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HOOPLSwitch
