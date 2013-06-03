/**
 */
package org.uqbar.hoope.hoopl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.uqbar.hoope.hoopl.Feature;
import org.uqbar.hoope.hoopl.HooplFactory;
import org.uqbar.hoope.hoopl.HooplPackage;
import org.uqbar.hoope.hoopl.Mutator;
import org.uqbar.hoope.hoopl.Operation;
import org.uqbar.hoope.hoopl.Property;
import org.uqbar.hoope.hoopl.SendMessage;
import org.uqbar.hoope.hoopl.Sentence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HooplFactoryImpl extends EFactoryImpl implements HooplFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HooplFactory init()
  {
    try
    {
      HooplFactory theHooplFactory = (HooplFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.uqbar.org/hoope/HOOPL"); 
      if (theHooplFactory != null)
      {
        return theHooplFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HooplFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HooplFactoryImpl()
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
      case HooplPackage.OBJECT: return createObject();
      case HooplPackage.FEATURE: return createFeature();
      case HooplPackage.PROPERTY: return createProperty();
      case HooplPackage.OPERATION: return createOperation();
      case HooplPackage.SENTENCE: return createSentence();
      case HooplPackage.MUTATOR: return createMutator();
      case HooplPackage.SEND_MESSAGE: return createSendMessage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.uqbar.hoope.hoopl.Object createObject()
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
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
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
  public HooplPackage getHooplPackage()
  {
    return (HooplPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HooplPackage getPackage()
  {
    return HooplPackage.eINSTANCE;
  }

} //HooplFactoryImpl
