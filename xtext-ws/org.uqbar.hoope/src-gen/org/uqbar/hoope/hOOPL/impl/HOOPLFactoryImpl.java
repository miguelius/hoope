/**
 */
package org.uqbar.hoope.hOOPL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.uqbar.hoope.hOOPL.Feature;
import org.uqbar.hoope.hOOPL.HOOPL;
import org.uqbar.hoope.hOOPL.HOOPLFactory;
import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Mutator;
import org.uqbar.hoope.hOOPL.Operation;
import org.uqbar.hoope.hOOPL.Property;
import org.uqbar.hoope.hOOPL.SendMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HOOPLFactoryImpl extends EFactoryImpl implements HOOPLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HOOPLFactory init()
  {
    try
    {
      HOOPLFactory theHOOPLFactory = (HOOPLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.uqbar.org/hoope/HOOPL"); 
      if (theHOOPLFactory != null)
      {
        return theHOOPLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HOOPLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HOOPLPackage.HOOPL: return createHOOPL();
      case HOOPLPackage.OBJECT: return createObject();
      case HOOPLPackage.FEATURE: return createFeature();
      case HOOPLPackage.PROPERTY: return createProperty();
      case HOOPLPackage.OPERATION: return createOperation();
      case HOOPLPackage.MUTATOR: return createMutator();
      case HOOPLPackage.SEND_MESSAGE: return createSendMessage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPL createHOOPL()
  {
    HOOPLImpl hoopl = new HOOPLImpl();
    return hoopl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.uqbar.hoope.hOOPL.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mutator createMutator()
  {
    MutatorImpl mutator = new MutatorImpl();
    return mutator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendMessage createSendMessage()
  {
    SendMessageImpl sendMessage = new SendMessageImpl();
    return sendMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPLPackage getHOOPLPackage()
  {
    return (HOOPLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HOOPLPackage getPackage()
  {
    return HOOPLPackage.eINSTANCE;
  }

} //HOOPLFactoryImpl
