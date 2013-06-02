/**
 */
package org.uqbar.hoope.hOOPL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.uqbar.hoope.hOOPL.Feature;
import org.uqbar.hoope.hOOPL.HOOPLFactory;
import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Mutator;
import org.uqbar.hoope.hOOPL.Operation;
import org.uqbar.hoope.hOOPL.Property;
import org.uqbar.hoope.hOOPL.SendMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HOOPLPackageImpl extends EPackageImpl implements HOOPLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hooplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mutatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sendMessageEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.uqbar.hoope.hOOPL.HOOPLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HOOPLPackageImpl()
  {
    super(eNS_URI, HOOPLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HOOPLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HOOPLPackage init()
  {
    if (isInited) return (HOOPLPackage)EPackage.Registry.INSTANCE.getEPackage(HOOPLPackage.eNS_URI);

    // Obtain or create and register package
    HOOPLPackageImpl theHOOPLPackage = (HOOPLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HOOPLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HOOPLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHOOPLPackage.createPackageContents();

    // Initialize created meta-data
    theHOOPLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHOOPLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HOOPLPackage.eNS_URI, theHOOPLPackage);
    return theHOOPLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHOOPL()
  {
    return hooplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject()
  {
    return objectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObject_Name()
  {
    return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_Features()
  {
    return (EReference)objectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Annotations()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Sentence()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMutator()
  {
    return mutatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMutator_Name()
  {
    return (EAttribute)mutatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSendMessage()
  {
    return sendMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSendMessage_Name()
  {
    return (EAttribute)sendMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSendMessage_Message()
  {
    return (EAttribute)sendMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOOPLFactory getHOOPLFactory()
  {
    return (HOOPLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    hooplEClass = createEClass(HOOPL);

    objectEClass = createEClass(OBJECT);
    createEAttribute(objectEClass, OBJECT__NAME);
    createEReference(objectEClass, OBJECT__FEATURES);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);

    propertyEClass = createEClass(PROPERTY);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__ANNOTATIONS);
    createEReference(operationEClass, OPERATION__SENTENCE);

    mutatorEClass = createEClass(MUTATOR);
    createEAttribute(mutatorEClass, MUTATOR__NAME);

    sendMessageEClass = createEClass(SEND_MESSAGE);
    createEAttribute(sendMessageEClass, SEND_MESSAGE__NAME);
    createEAttribute(sendMessageEClass, SEND_MESSAGE__MESSAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    objectEClass.getESuperTypes().add(this.getHOOPL());
    propertyEClass.getESuperTypes().add(this.getFeature());
    operationEClass.getESuperTypes().add(this.getFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(hooplEClass, org.uqbar.hoope.hOOPL.HOOPL.class, "HOOPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectEClass, org.uqbar.hoope.hOOPL.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.uqbar.hoope.hOOPL.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObject_Features(), this.getFeature(), null, "features", null, 0, -1, org.uqbar.hoope.hOOPL.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Annotations(), ecorePackage.getEString(), "annotations", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Sentence(), ecorePackage.getEObject(), null, "sentence", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mutatorEClass, Mutator.class, "Mutator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMutator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mutator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sendMessageEClass, SendMessage.class, "SendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSendMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSendMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HOOPLPackageImpl
