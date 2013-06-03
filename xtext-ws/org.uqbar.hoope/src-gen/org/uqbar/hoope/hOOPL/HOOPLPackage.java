/**
 */
package org.uqbar.hoope.hoopl;

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
 * @see org.uqbar.hoope.hoopl.HooplFactory
 * @model kind="package"
 * @generated
 */
public interface HooplPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hoopl";

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
  String eNS_PREFIX = "hoopl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HooplPackage eINSTANCE = org.uqbar.hoope.hoopl.impl.HooplPackageImpl.init();

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.ObjectImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FEATURES = 1;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.FeatureImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 1;

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
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.PropertyImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__INITIAL = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.OperationImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Sentence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SENTENCE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.SentenceImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.MutatorImpl <em>Mutator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.MutatorImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getMutator()
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
  int MUTATOR__NAME = SENTENCE__NAME;

  /**
   * The number of structural features of the '<em>Mutator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUTATOR_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.hoope.hoopl.impl.SendMessageImpl <em>Send Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.hoope.hoopl.impl.SendMessageImpl
   * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getSendMessage()
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
  int SEND_MESSAGE__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_MESSAGE__MESSAGE = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Send Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_MESSAGE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.uqbar.hoope.hoopl.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hoopl.Object#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hoopl.Object#getName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.hoope.hoopl.Object#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.uqbar.hoope.hoopl.Object#getFeatures()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Features();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.uqbar.hoope.hoopl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hoopl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hoopl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.uqbar.hoope.hoopl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.hoope.hoopl.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uqbar.hoope.hoopl.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.hoope.hoopl.Property#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see org.uqbar.hoope.hoopl.Property#getInitial()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Initial();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.uqbar.hoope.hoopl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.hoope.hoopl.Operation#getSentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentence</em>'.
   * @see org.uqbar.hoope.hoopl.Operation#getSentence()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Sentence();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see org.uqbar.hoope.hoopl.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hoopl.Sentence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.hoope.hoopl.Sentence#getName()
   * @see #getSentence()
   * @generated
   */
  EAttribute getSentence_Name();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.Mutator <em>Mutator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mutator</em>'.
   * @see org.uqbar.hoope.hoopl.Mutator
   * @generated
   */
  EClass getMutator();

  /**
   * Returns the meta object for class '{@link org.uqbar.hoope.hoopl.SendMessage <em>Send Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send Message</em>'.
   * @see org.uqbar.hoope.hoopl.SendMessage
   * @generated
   */
  EClass getSendMessage();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.hoope.hoopl.SendMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.uqbar.hoope.hoopl.SendMessage#getMessage()
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
  HooplFactory getHooplFactory();

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
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.ObjectImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getObject()
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
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.FeatureImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getFeature()
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
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.PropertyImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__INITIAL = eINSTANCE.getProperty_Initial();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.OperationImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Sentence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SENTENCE = eINSTANCE.getOperation_Sentence();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.SentenceImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENTENCE__NAME = eINSTANCE.getSentence_Name();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.MutatorImpl <em>Mutator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.MutatorImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getMutator()
     * @generated
     */
    EClass MUTATOR = eINSTANCE.getMutator();

    /**
     * The meta object literal for the '{@link org.uqbar.hoope.hoopl.impl.SendMessageImpl <em>Send Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.hoope.hoopl.impl.SendMessageImpl
     * @see org.uqbar.hoope.hoopl.impl.HooplPackageImpl#getSendMessage()
     * @generated
     */
    EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEND_MESSAGE__MESSAGE = eINSTANCE.getSendMessage_Message();

  }

} //HooplPackage
