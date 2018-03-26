/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package ossweruntime.impl;

import org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ossweruntime.OssweruntimePackage;
import ossweruntime.Ubuntu_xenialxerus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubuntu xenialxerus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ossweruntime.impl.Ubuntu_xenialxerusImpl#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ubuntu_xenialxerusImpl extends Os_tplImpl implements Ubuntu_xenialxerus {
	/**
	 * The default value of the '{@link #getOpenstackRuntimeId() <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_RUNTIME_ID_EDEFAULT = "5437eae8-7c47-4834-929c-a314de77d291";

	/**
	 * The cached value of the '{@link #getOpenstackRuntimeId() <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 * @ordered
	 */
	protected String openstackRuntimeId = OPENSTACK_RUNTIME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ubuntu_xenialxerusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OssweruntimePackage.Literals.UBUNTU_XENIALXERUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackRuntimeId() {
		return openstackRuntimeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackRuntimeId(String newOpenstackRuntimeId) {
		String oldOpenstackRuntimeId = openstackRuntimeId;
		openstackRuntimeId = newOpenstackRuntimeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OssweruntimePackage.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID, oldOpenstackRuntimeId, openstackRuntimeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OssweruntimePackage.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID:
				return getOpenstackRuntimeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OssweruntimePackage.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID:
				setOpenstackRuntimeId((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OssweruntimePackage.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID:
				setOpenstackRuntimeId(OPENSTACK_RUNTIME_ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OssweruntimePackage.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID:
				return OPENSTACK_RUNTIME_ID_EDEFAULT == null ? openstackRuntimeId != null : !OPENSTACK_RUNTIME_ID_EDEFAULT.equals(openstackRuntimeId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (openstackRuntimeId: ");
		result.append(openstackRuntimeId);
		result.append(')');
		return result.toString();
	}

} //Ubuntu_xenialxerusImpl
