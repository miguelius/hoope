/**
 */
package org.uqbar.hoope.hOOPL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.uqbar.hoope.hOOPL.HOOPLFactory
 * @model kind="package"
 * @generated
 */
public interface HOOPLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hOOPL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uqbar.org/hoope/HOOPL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hOOPL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HOOPLPackage eINSTANCE = org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.HOOPLImpl <em>HOOPL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getHOOPL()
   * @generated
   */
  int HOOPL = 0;

  /**
   * The number of structural features of the '<em>HOOPL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOOPL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.ObjectImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = HOOPL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FEATURES = HOOPL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = HOOPL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.FeatureImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.PropertyImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.OperationImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ANNOTATIONS = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sentence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SENTENCE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.MutatorImpl <em>Mutator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.MutatorImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getMutator()
   * @generated
   */
  int MUTATOR = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUTATOR__NAME = 0;

  /**
   * The number of structural features of the '<em>Mutator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUTATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hOOPL.impl.SendMessageImpl <em>Send Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hOOPL.impl.SendMessageImpl
   * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getSendMessage()
   * @generated
   */
  int SEND_MESSAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_MESSAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_MESSAGE__MESSAGE = 1;

  /**
   * The number of structural features of the '<em>Send Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_MESSAGE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.HOOPL <em>HOOPL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HOOPL</em>'.
   * @see org.uqbar.hoope.hOOPL.HOOPL
   * @generated
   */
  EClass getHOOPL();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.uqbar.hoope.hOOPL.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hOOPL.Object#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hOOPL.Object#getName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.hoope.hOOPL.Object#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.uqbar.hoope.hOOPL.Object#getFeatures()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Features();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.uqbar.hoope.hOOPL.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hOOPL.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hOOPL.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.uqbar.hoope.hOOPL.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.uqbar.hoope.hOOPL.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute list '{@link org.uqbar.hoope.hOOPL.Operation#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Annotations</em>'.
   * @see org.uqbar.hoope.hOOPL.Operation#getAnnotations()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Annotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.hoope.hOOPL.Operation#getSentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentence</em>'.
   * @see org.uqbar.hoope.hOOPL.Operation#getSentence()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Sentence();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.Mutator <em>Mutator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mutator</em>'.
   * @see org.uqbar.hoope.hOOPL.Mutator
   * @generated
   */
  EClass getMutator();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hOOPL.Mutator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hOOPL.Mutator#getName()
   * @see #getMutator()
   * @generated
   */
  EAttribute getMutator_Name();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hOOPL.SendMessage <em>Send Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send Message</em>'.
   * @see org.uqbar.hoope.hOOPL.SendMessage
   * @generated
   */
  EClass getSendMessage();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hOOPL.SendMessage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hOOPL.SendMessage#getName()
   * @see #getSendMessage()
   * @generated
   */
  EAttribute getSendMessage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hOOPL.SendMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.uqbar.hoope.hOOPL.SendMessage#getMessage()
   * @see #getSendMessage()
   * @generated
   */
  EAttribute getSendMessage_Message();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HOOPLFactory getHOOPLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.HOOPLImpl <em>HOOPL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getHOOPL()
     * @generated
     */
    EClass HOOPL = eINSTANCE.getHOOPL();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.ObjectImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__FEATURES = eINSTANCE.getObject_Features();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.FeatureImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.PropertyImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.OperationImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__ANNOTATIONS = eINSTANCE.getOperation_Annotations();

    /**
     * The meta object literal for the '<em><b>Sentence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SENTENCE = eINSTANCE.getOperation_Sentence();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.MutatorImpl <em>Mutator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.MutatorImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getMutator()
     * @generated
     */
    EClass MUTATOR = eINSTANCE.getMutator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUTATOR__NAME = eINSTANCE.getMutator_Name();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hOOPL.impl.SendMessageImpl <em>Send Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hOOPL.impl.SendMessageImpl
     * @see org.uqbar.hoope.hOOPL.impl.HOOPLPackageImpl#getSendMessage()
     * @generated
     */
    EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEND_MESSAGE__NAME = eINSTANCE.getSendMessage_Name();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEND_MESSAGE__MESSAGE = eINSTANCE.getSendMessage_Message();

  }

} //HOOPLPackage
