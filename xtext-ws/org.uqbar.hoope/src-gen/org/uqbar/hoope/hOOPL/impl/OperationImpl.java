/**
 */
package org.uqbar.hoope.hoopl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uqbar.hoope.hoopl.HooplPackage;
import org.uqbar.hoope.hoopl.Operation;
import org.uqbar.hoope.hoopl.Sentence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.OperationImpl#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends FeatureImpl implements Operation
{
  /**
   * The cached value of the '{@link #getSentence() <em>Sentence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentence()
   * @generated
   * @ordered
   */
  protected EList<Sentence> sentence;

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
    return HooplPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sentence> getSentence()
  {
    if (sentence == null)
    {
      sentence = new EObjectContainmentEList<Sentence>(Sentence.class, this, HooplPackage.OPERATION__SENTENCE);
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
      case HooplPackage.OPERATION__SENTENCE:
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
      case HooplPackage.OPERATION__SENTENCE:
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
      case HooplPackage.OPERATION__SENTENCE:
        getSentence().clear();
        getSentence().addAll((Collection<? extends Sentence>)newValue);
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
      case HooplPackage.OPERATION__SENTENCE:
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
      case HooplPackage.OPERATION__SENTENCE:
        return sentence != null && !sentence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperationImpl
