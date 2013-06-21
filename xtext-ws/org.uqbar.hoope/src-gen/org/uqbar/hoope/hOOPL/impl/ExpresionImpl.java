/**
 */
package org.uqbar.hoope.hoopl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uqbar.hoope.hoopl.Expresion;
import org.uqbar.hoope.hoopl.HooplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.ExpresionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.ExpresionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.ExpresionImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.uqbar.hoope.hoopl.impl.ExpresionImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpresionImpl extends MinimalEObjectImpl.Container implements Expresion
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expresion condition;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Expresion then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected Expresion else_;

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
  protected ExpresionImpl()
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
    return HooplPackage.Literals.EXPRESION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expresion newCondition, NotificationChain msgs)
  {
    Expresion oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expresion newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Expresion newThen, NotificationChain msgs)
  {
    Expresion oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(Expresion newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(Expresion newElse, NotificationChain msgs)
  {
    Expresion oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(Expresion newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HooplPackage.EXPRESION__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HooplPackage.EXPRESION__ELSE, newElse, newElse));
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
      sentences = new EObjectContainmentEList<Expresion>(Expresion.class, this, HooplPackage.EXPRESION__SENTENCES);
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
      case HooplPackage.EXPRESION__CONDITION:
        return basicSetCondition(null, msgs);
      case HooplPackage.EXPRESION__THEN:
        return basicSetThen(null, msgs);
      case HooplPackage.EXPRESION__ELSE:
        return basicSetElse(null, msgs);
      case HooplPackage.EXPRESION__SENTENCES:
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
      case HooplPackage.EXPRESION__CONDITION:
        return getCondition();
      case HooplPackage.EXPRESION__THEN:
        return getThen();
      case HooplPackage.EXPRESION__ELSE:
        return getElse();
      case HooplPackage.EXPRESION__SENTENCES:
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
      case HooplPackage.EXPRESION__CONDITION:
        setCondition((Expresion)newValue);
        return;
      case HooplPackage.EXPRESION__THEN:
        setThen((Expresion)newValue);
        return;
      case HooplPackage.EXPRESION__ELSE:
        setElse((Expresion)newValue);
        return;
      case HooplPackage.EXPRESION__SENTENCES:
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
      case HooplPackage.EXPRESION__CONDITION:
        setCondition((Expresion)null);
        return;
      case HooplPackage.EXPRESION__THEN:
        setThen((Expresion)null);
        return;
      case HooplPackage.EXPRESION__ELSE:
        setElse((Expresion)null);
        return;
      case HooplPackage.EXPRESION__SENTENCES:
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
      case HooplPackage.EXPRESION__CONDITION:
        return condition != null;
      case HooplPackage.EXPRESION__THEN:
        return then != null;
      case HooplPackage.EXPRESION__ELSE:
        return else_ != null;
      case HooplPackage.EXPRESION__SENTENCES:
        return sentences != null && !sentences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpresionImpl
