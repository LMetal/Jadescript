/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getLoopRole <em>Loop Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getRoleset <em>Roleset</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getRefRole <em>Ref Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getForBody <em>For Body</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachImpl extends MinimalEObjectImpl.Container implements ForEach
{
  /**
   * The cached value of the '{@link #getLoopRole() <em>Loop Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoopRole()
   * @generated
   * @ordered
   */
  protected RoleOne loopRole;

  /**
   * The cached value of the '{@link #getRoleset() <em>Roleset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleset()
   * @generated
   * @ordered
   */
  protected RoleSet roleset;

  /**
   * The cached value of the '{@link #getRefRole() <em>Ref Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRole()
   * @generated
   * @ordered
   */
  protected RoleOne refRole;

  /**
   * The cached value of the '{@link #getForBody() <em>For Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForBody()
   * @generated
   * @ordered
   */
  protected Protocol forBody;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected Protocol protocol;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachImpl()
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
    return MyDslPackage.Literals.FOR_EACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleOne getLoopRole()
  {
    return loopRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoopRole(RoleOne newLoopRole, NotificationChain msgs)
  {
    RoleOne oldLoopRole = loopRole;
    loopRole = newLoopRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__LOOP_ROLE, oldLoopRole, newLoopRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLoopRole(RoleOne newLoopRole)
  {
    if (newLoopRole != loopRole)
    {
      NotificationChain msgs = null;
      if (loopRole != null)
        msgs = ((InternalEObject)loopRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__LOOP_ROLE, null, msgs);
      if (newLoopRole != null)
        msgs = ((InternalEObject)newLoopRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__LOOP_ROLE, null, msgs);
      msgs = basicSetLoopRole(newLoopRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__LOOP_ROLE, newLoopRole, newLoopRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleSet getRoleset()
  {
    if (roleset != null && roleset.eIsProxy())
    {
      InternalEObject oldRoleset = (InternalEObject)roleset;
      roleset = (RoleSet)eResolveProxy(oldRoleset);
      if (roleset != oldRoleset)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FOR_EACH__ROLESET, oldRoleset, roleset));
      }
    }
    return roleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleSet basicGetRoleset()
  {
    return roleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoleset(RoleSet newRoleset)
  {
    RoleSet oldRoleset = roleset;
    roleset = newRoleset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__ROLESET, oldRoleset, roleset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleOne getRefRole()
  {
    if (refRole != null && refRole.eIsProxy())
    {
      InternalEObject oldRefRole = (InternalEObject)refRole;
      refRole = (RoleOne)eResolveProxy(oldRefRole);
      if (refRole != oldRefRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FOR_EACH__REF_ROLE, oldRefRole, refRole));
      }
    }
    return refRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleOne basicGetRefRole()
  {
    return refRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefRole(RoleOne newRefRole)
  {
    RoleOne oldRefRole = refRole;
    refRole = newRefRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__REF_ROLE, oldRefRole, refRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Protocol getForBody()
  {
    return forBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForBody(Protocol newForBody, NotificationChain msgs)
  {
    Protocol oldForBody = forBody;
    forBody = newForBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__FOR_BODY, oldForBody, newForBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForBody(Protocol newForBody)
  {
    if (newForBody != forBody)
    {
      NotificationChain msgs = null;
      if (forBody != null)
        msgs = ((InternalEObject)forBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__FOR_BODY, null, msgs);
      if (newForBody != null)
        msgs = ((InternalEObject)newForBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__FOR_BODY, null, msgs);
      msgs = basicSetForBody(newForBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__FOR_BODY, newForBody, newForBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Protocol getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProtocol(Protocol newProtocol, NotificationChain msgs)
  {
    Protocol oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__PROTOCOL, oldProtocol, newProtocol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProtocol(Protocol newProtocol)
  {
    if (newProtocol != protocol)
    {
      NotificationChain msgs = null;
      if (protocol != null)
        msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__PROTOCOL, null, msgs);
      if (newProtocol != null)
        msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__PROTOCOL, null, msgs);
      msgs = basicSetProtocol(newProtocol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__PROTOCOL, newProtocol, newProtocol));
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
      case MyDslPackage.FOR_EACH__LOOP_ROLE:
        return basicSetLoopRole(null, msgs);
      case MyDslPackage.FOR_EACH__FOR_BODY:
        return basicSetForBody(null, msgs);
      case MyDslPackage.FOR_EACH__PROTOCOL:
        return basicSetProtocol(null, msgs);
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
      case MyDslPackage.FOR_EACH__LOOP_ROLE:
        return getLoopRole();
      case MyDslPackage.FOR_EACH__ROLESET:
        if (resolve) return getRoleset();
        return basicGetRoleset();
      case MyDslPackage.FOR_EACH__REF_ROLE:
        if (resolve) return getRefRole();
        return basicGetRefRole();
      case MyDslPackage.FOR_EACH__FOR_BODY:
        return getForBody();
      case MyDslPackage.FOR_EACH__PROTOCOL:
        return getProtocol();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.FOR_EACH__LOOP_ROLE:
        setLoopRole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH__ROLESET:
        setRoleset((RoleSet)newValue);
        return;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        setRefRole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH__FOR_BODY:
        setForBody((Protocol)newValue);
        return;
      case MyDslPackage.FOR_EACH__PROTOCOL:
        setProtocol((Protocol)newValue);
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
      case MyDslPackage.FOR_EACH__LOOP_ROLE:
        setLoopRole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH__ROLESET:
        setRoleset((RoleSet)null);
        return;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        setRefRole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH__FOR_BODY:
        setForBody((Protocol)null);
        return;
      case MyDslPackage.FOR_EACH__PROTOCOL:
        setProtocol((Protocol)null);
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
      case MyDslPackage.FOR_EACH__LOOP_ROLE:
        return loopRole != null;
      case MyDslPackage.FOR_EACH__ROLESET:
        return roleset != null;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        return refRole != null;
      case MyDslPackage.FOR_EACH__FOR_BODY:
        return forBody != null;
      case MyDslPackage.FOR_EACH__PROTOCOL:
        return protocol != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachImpl
