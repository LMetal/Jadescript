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

import org.xtext.globalTypes.myDsl.ForEachL;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.ProtocolL;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each L</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachLImpl#getEachRole <em>Each Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachLImpl#getRoleset <em>Roleset</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachLImpl#getRefrole <em>Refrole</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachLImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachLImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachLImpl extends MinimalEObjectImpl.Container implements ForEachL
{
  /**
   * The cached value of the '{@link #getEachRole() <em>Each Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEachRole()
   * @generated
   * @ordered
   */
  protected RoleOne eachRole;

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
   * The cached value of the '{@link #getRefrole() <em>Refrole</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefrole()
   * @generated
   * @ordered
   */
  protected RoleOne refrole;

  /**
   * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranch()
   * @generated
   * @ordered
   */
  protected ProtocolL branch;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected ProtocolL protocol;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachLImpl()
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
    return MyDslPackage.Literals.FOR_EACH_L;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleOne getEachRole()
  {
    return eachRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEachRole(RoleOne newEachRole, NotificationChain msgs)
  {
    RoleOne oldEachRole = eachRole;
    eachRole = newEachRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__EACH_ROLE, oldEachRole, newEachRole);
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
  public void setEachRole(RoleOne newEachRole)
  {
    if (newEachRole != eachRole)
    {
      NotificationChain msgs = null;
      if (eachRole != null)
        msgs = ((InternalEObject)eachRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__EACH_ROLE, null, msgs);
      if (newEachRole != null)
        msgs = ((InternalEObject)newEachRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__EACH_ROLE, null, msgs);
      msgs = basicSetEachRole(newEachRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__EACH_ROLE, newEachRole, newEachRole));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FOR_EACH_L__ROLESET, oldRoleset, roleset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__ROLESET, oldRoleset, roleset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleOne getRefrole()
  {
    if (refrole != null && refrole.eIsProxy())
    {
      InternalEObject oldRefrole = (InternalEObject)refrole;
      refrole = (RoleOne)eResolveProxy(oldRefrole);
      if (refrole != oldRefrole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FOR_EACH_L__REFROLE, oldRefrole, refrole));
      }
    }
    return refrole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleOne basicGetRefrole()
  {
    return refrole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefrole(RoleOne newRefrole)
  {
    RoleOne oldRefrole = refrole;
    refrole = newRefrole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__REFROLE, oldRefrole, refrole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtocolL getBranch()
  {
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBranch(ProtocolL newBranch, NotificationChain msgs)
  {
    ProtocolL oldBranch = branch;
    branch = newBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__BRANCH, oldBranch, newBranch);
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
  public void setBranch(ProtocolL newBranch)
  {
    if (newBranch != branch)
    {
      NotificationChain msgs = null;
      if (branch != null)
        msgs = ((InternalEObject)branch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__BRANCH, null, msgs);
      if (newBranch != null)
        msgs = ((InternalEObject)newBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__BRANCH, null, msgs);
      msgs = basicSetBranch(newBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__BRANCH, newBranch, newBranch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProtocolL getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProtocol(ProtocolL newProtocol, NotificationChain msgs)
  {
    ProtocolL oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__PROTOCOL, oldProtocol, newProtocol);
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
  public void setProtocol(ProtocolL newProtocol)
  {
    if (newProtocol != protocol)
    {
      NotificationChain msgs = null;
      if (protocol != null)
        msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__PROTOCOL, null, msgs);
      if (newProtocol != null)
        msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH_L__PROTOCOL, null, msgs);
      msgs = basicSetProtocol(newProtocol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH_L__PROTOCOL, newProtocol, newProtocol));
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
      case MyDslPackage.FOR_EACH_L__EACH_ROLE:
        return basicSetEachRole(null, msgs);
      case MyDslPackage.FOR_EACH_L__BRANCH:
        return basicSetBranch(null, msgs);
      case MyDslPackage.FOR_EACH_L__PROTOCOL:
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
      case MyDslPackage.FOR_EACH_L__EACH_ROLE:
        return getEachRole();
      case MyDslPackage.FOR_EACH_L__ROLESET:
        if (resolve) return getRoleset();
        return basicGetRoleset();
      case MyDslPackage.FOR_EACH_L__REFROLE:
        if (resolve) return getRefrole();
        return basicGetRefrole();
      case MyDslPackage.FOR_EACH_L__BRANCH:
        return getBranch();
      case MyDslPackage.FOR_EACH_L__PROTOCOL:
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
      case MyDslPackage.FOR_EACH_L__EACH_ROLE:
        setEachRole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH_L__ROLESET:
        setRoleset((RoleSet)newValue);
        return;
      case MyDslPackage.FOR_EACH_L__REFROLE:
        setRefrole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH_L__BRANCH:
        setBranch((ProtocolL)newValue);
        return;
      case MyDslPackage.FOR_EACH_L__PROTOCOL:
        setProtocol((ProtocolL)newValue);
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
      case MyDslPackage.FOR_EACH_L__EACH_ROLE:
        setEachRole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH_L__ROLESET:
        setRoleset((RoleSet)null);
        return;
      case MyDslPackage.FOR_EACH_L__REFROLE:
        setRefrole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH_L__BRANCH:
        setBranch((ProtocolL)null);
        return;
      case MyDslPackage.FOR_EACH_L__PROTOCOL:
        setProtocol((ProtocolL)null);
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
      case MyDslPackage.FOR_EACH_L__EACH_ROLE:
        return eachRole != null;
      case MyDslPackage.FOR_EACH_L__ROLESET:
        return roleset != null;
      case MyDslPackage.FOR_EACH_L__REFROLE:
        return refrole != null;
      case MyDslPackage.FOR_EACH_L__BRANCH:
        return branch != null;
      case MyDslPackage.FOR_EACH_L__PROTOCOL:
        return protocol != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachLImpl
