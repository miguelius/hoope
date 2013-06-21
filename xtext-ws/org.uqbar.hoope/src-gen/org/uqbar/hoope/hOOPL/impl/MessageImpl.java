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

import org.uqbar.hoope.hoopl.Expresion;
import org.uqbar.hoope.hoopl.HooplPackage;
import org.uqbar.hoope.hoopl.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.MessageImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends FeatureImpl implements Message
{
  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<Expresion> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
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
    return HooplPackage.Literals.MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expresion> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<Expresion>(Expresion.class, this, HooplPackage.MESSAGE__SENTENCES);
    }
    return sentences;
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
      case HooplPackage.MESSAGE__SENTENCES:
        return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
      case HooplPackage.MESSAGE__SENTENCES:
        return getSentences();
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
      case HooplPackage.MESSAGE__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends Expresion>)newValue);
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
      case HooplPackage.MESSAGE__SENTENCES:
        getSentences().clear();
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
      case HooplPackage.MESSAGE__SENTENCES:
        return sentences != null && !sentences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MessageImpl
