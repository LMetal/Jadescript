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

import org.xtext.globalTypes.myDsl.MessageL;
import org.xtext.globalTypes.myDsl.MessageType;
import org.xtext.globalTypes.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message L</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.MessageLImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.xtext.globalTypes.myDsl.impl.MessageLImpl#getSendReceive <em>Send Receive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageLImpl extends MinimalEObjectImpl.Container implements MessageL
{
  /**
   * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageType()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageType()
   * @generated
   * @ordered
   */
  protected String messageType = MESSAGE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSendReceive() <em>Send Receive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendReceive()
   * @generated
   * @ordered
   */
  protected MessageType sendReceive;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageLImpl()
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
    return MyDslPackage.Literals.MESSAGE_L;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMessageType()
  {
    return messageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMessageType(String newMessageType)
  {
    String oldMessageType = messageType;
    messageType = newMessageType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MESSAGE_L__MESSAGE_TYPE, oldMessageType, messageType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MessageType getSendReceive()
  {
    return sendReceive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendReceive(MessageType newSendReceive, NotificationChain msgs)
  {
    MessageType oldSendReceive = sendReceive;
    sendReceive = newSendReceive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MESSAGE_L__SEND_RECEIVE, oldSendReceive, newSendReceive);
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
  public void setSendReceive(MessageType newSendReceive)
  {
    if (newSendReceive != sendReceive)
    {
      NotificationChain msgs = null;
      if (sendReceive != null)
        msgs = ((InternalEObject)sendReceive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MESSAGE_L__SEND_RECEIVE, null, msgs);
      if (newSendReceive != null)
        msgs = ((InternalEObject)newSendReceive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MESSAGE_L__SEND_RECEIVE, null, msgs);
      msgs = basicSetSendReceive(newSendReceive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MESSAGE_L__SEND_RECEIVE, newSendReceive, newSendReceive));
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
      case MyDslPackage.MESSAGE_L__SEND_RECEIVE:
        return basicSetSendReceive(null, msgs);
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
      case MyDslPackage.MESSAGE_L__MESSAGE_TYPE:
        return getMessageType();
      case MyDslPackage.MESSAGE_L__SEND_RECEIVE:
        return getSendReceive();
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
      case MyDslPackage.MESSAGE_L__MESSAGE_TYPE:
        setMessageType((String)newValue);
        return;
      case MyDslPackage.MESSAGE_L__SEND_RECEIVE:
        setSendReceive((MessageType)newValue);
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
      case MyDslPackage.MESSAGE_L__MESSAGE_TYPE:
        setMessageType(MESSAGE_TYPE_EDEFAULT);
        return;
      case MyDslPackage.MESSAGE_L__SEND_RECEIVE:
        setSendReceive((MessageType)null);
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
      case MyDslPackage.MESSAGE_L__MESSAGE_TYPE:
        return MESSAGE_TYPE_EDEFAULT == null ? messageType != null : !MESSAGE_TYPE_EDEFAULT.equals(messageType);
      case MyDslPackage.MESSAGE_L__SEND_RECEIVE:
        return sendReceive != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (messageType: ");
    result.append(messageType);
    result.append(')');
    return result.toString();
  }

} //MessageLImpl
