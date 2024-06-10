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
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getEachRole <em>Each Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getRoleset <em>Roleset</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getRefRole <em>Ref Role</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ForEachImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachImpl extends MinimalEObjectImpl.Container implements ForEach
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
   * The cached value of the '{@link #getRefRole() <em>Ref Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRole()
   * @generated
   * @ordered
   */
  protected RoleOne refRole;

  /**
   * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranch()
   * @generated
   * @ordered
   */
  protected Protocol branch;

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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__EACH_ROLE, oldEachRole, newEachRole);
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
        msgs = ((InternalEObject)eachRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__EACH_ROLE, null, msgs);
      if (newEachRole != null)
        msgs = ((InternalEObject)newEachRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__EACH_ROLE, null, msgs);
      msgs = basicSetEachRole(newEachRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__EACH_ROLE, newEachRole, newEachRole));
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
  public Protocol getBranch()
  {
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBranch(Protocol newBranch, NotificationChain msgs)
  {
    Protocol oldBranch = branch;
    branch = newBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__BRANCH, oldBranch, newBranch);
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
  public void setBranch(Protocol newBranch)
  {
    if (newBranch != branch)
    {
      NotificationChain msgs = null;
      if (branch != null)
        msgs = ((InternalEObject)branch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__BRANCH, null, msgs);
      if (newBranch != null)
        msgs = ((InternalEObject)newBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EACH__BRANCH, null, msgs);
      msgs = basicSetBranch(newBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EACH__BRANCH, newBranch, newBranch));
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
      case MyDslPackage.FOR_EACH__EACH_ROLE:
        return basicSetEachRole(null, msgs);
      case MyDslPackage.FOR_EACH__BRANCH:
        return basicSetBranch(null, msgs);
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
      case MyDslPackage.FOR_EACH__EACH_ROLE:
        return getEachRole();
      case MyDslPackage.FOR_EACH__ROLESET:
        if (resolve) return getRoleset();
        return basicGetRoleset();
      case MyDslPackage.FOR_EACH__REF_ROLE:
        if (resolve) return getRefRole();
        return basicGetRefRole();
      case MyDslPackage.FOR_EACH__BRANCH:
        return getBranch();
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
      case MyDslPackage.FOR_EACH__EACH_ROLE:
        setEachRole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH__ROLESET:
        setRoleset((RoleSet)newValue);
        return;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        setRefRole((RoleOne)newValue);
        return;
      case MyDslPackage.FOR_EACH__BRANCH:
        setBranch((Protocol)newValue);
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
      case MyDslPackage.FOR_EACH__EACH_ROLE:
        setEachRole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH__ROLESET:
        setRoleset((RoleSet)null);
        return;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        setRefRole((RoleOne)null);
        return;
      case MyDslPackage.FOR_EACH__BRANCH:
        setBranch((Protocol)null);
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
      case MyDslPackage.FOR_EACH__EACH_ROLE:
        return eachRole != null;
      case MyDslPackage.FOR_EACH__ROLESET:
        return roleset != null;
      case MyDslPackage.FOR_EACH__REF_ROLE:
        return refRole != null;
      case MyDslPackage.FOR_EACH__BRANCH:
        return branch != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachImpl
