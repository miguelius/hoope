/**
 */
package org.uqbar.hoope.hOOPL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hOOPL.impl.OperationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.uqbar.hoope.hOOPL.impl.OperationImpl#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends FeatureImpl implements Operation
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<String> annotations;

  /**
   * The cached value of the '{@link #getSentence() <em>Sentence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentence()
   * @generated
   * @ordered
   */
  protected EList<EObject> sentence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HOOPLPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EDataTypeEList<String>(String.class, this, HOOPLPackage.OPERATION__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getSentence()
  {
    if (sentence == null)
    {
      sentence = new EObjectContainmentEList<EObject>(EObject.class, this, HOOPLPackage.OPERATION__SENTENCE);
    }
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HOOPLPackage.OPERATION__SENTENCE:
        return ((InternalEList<?>)getSentence()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HOOPLPackage.OPERATION__ANNOTATIONS:
        return getAnnotations();
      case HOOPLPackage.OPERATION__SENTENCE:
        return getSentence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HOOPLPackage.OPERATION__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends String>)newValue);
        return;
      case HOOPLPackage.OPERATION__SENTENCE:
        getSentence().clear();
        getSentence().addAll((Collection<? extends EObject>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HOOPLPackage.OPERATION__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case HOOPLPackage.OPERATION__SENTENCE:
        getSentence().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HOOPLPackage.OPERATION__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case HOOPLPackage.OPERATION__SENTENCE:
        return sentence != null && !sentence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (annotations: ");
    result.append(annotations);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
