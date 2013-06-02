/**
 */
package org.uqbar.hoope.hOOPL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.uqbar.hoope.hOOPL.Feature;
import org.uqbar.hoope.hOOPL.HOOPL;
import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Mutator;
import org.uqbar.hoope.hOOPL.Operation;
import org.uqbar.hoope.hOOPL.Property;
import org.uqbar.hoope.hOOPL.SendMessage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.uqbar.hoope.hOOPL.HOOPLPackage
 * @generated
 */
public class HOOPLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HOOPLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HOOPLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HOOPLSwitch<Adapter> modelSwitch =
    new HOOPLSwitch<Adapter>()
    {
      @Override
      public Adapter caseHOOPL(HOOPL object)
      {
        return createHOOPLAdapter();
      }
      @Override
      public Adapter caseObject(org.uqbar.hoope.hOOPL.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseMutator(Mutator object)
      {
        return createMutatorAdapter();
      }
      @Override
      public Adapter caseSendMessage(SendMessage object)
      {
        return createSendMessageAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.HOOPL <em>HOOPL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.HOOPL
   * @generated
   */
  public Adapter createHOOPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.Mutator <em>Mutator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.Mutator
   * @generated
   */
  public Adapter createMutatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.hoope.hOOPL.SendMessage <em>Send Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.hoope.hOOPL.SendMessage
   * @generated
   */
  public Adapter createSendMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HOOPLAdapterFactory
