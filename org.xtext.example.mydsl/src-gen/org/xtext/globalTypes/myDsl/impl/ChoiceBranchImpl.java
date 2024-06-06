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

import org.xtext.globalTypes.myDsl.ChoiceBranch;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Protocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ChoiceBranchImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.ChoiceBranchImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceBranchImpl extends MinimalEObjectImpl.Container implements ChoiceBranch
{
  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected Message message;

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
  protected ChoiceBranchImpl()
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
    return MyDslPackage.Literals.CHOICE_BRANCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Message getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOICE_BRANCH__MESSAGE, oldMessage, newMessage);
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
  public void setMessage(Message newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHOICE_BRANCH__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHOICE_BRANCH__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOICE_BRANCH__MESSAGE, newMessage, newMessage));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOICE_BRANCH__PROTOCOL, oldProtocol, newProtocol);
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
        msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHOICE_BRANCH__PROTOCOL, null, msgs);
      if (newProtocol != null)
        msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHOICE_BRANCH__PROTOCOL, null, msgs);
      msgs = basicSetProtocol(newProtocol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOICE_BRANCH__PROTOCOL, newProtocol, newProtocol));
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
      case MyDslPackage.CHOICE_BRANCH__MESSAGE:
        return basicSetMessage(null, msgs);
      case MyDslPackage.CHOICE_BRANCH__PROTOCOL:
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
      case MyDslPackage.CHOICE_BRANCH__MESSAGE:
        return getMessage();
      case MyDslPackage.CHOICE_BRANCH__PROTOCOL:
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
      case MyDslPackage.CHOICE_BRANCH__MESSAGE:
        setMessage((Message)newValue);
        return;
      case MyDslPackage.CHOICE_BRANCH__PROTOCOL:
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
      case MyDslPackage.CHOICE_BRANCH__MESSAGE:
        setMessage((Message)null);
        return;
      case MyDslPackage.CHOICE_BRANCH__PROTOCOL:
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
      case MyDslPackage.CHOICE_BRANCH__MESSAGE:
        return message != null;
      case MyDslPackage.CHOICE_BRANCH__PROTOCOL:
        return protocol != null;
    }
    return super.eIsSet(featureID);
  }

} //ChoiceBranchImpl
