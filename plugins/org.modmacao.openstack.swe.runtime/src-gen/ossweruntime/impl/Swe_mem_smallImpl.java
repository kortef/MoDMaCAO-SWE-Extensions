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

import org.eclipse.cmf.occi.crtp.impl.Mem_smallImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ossweruntime.OssweruntimePackage;
import ossweruntime.Swe_mem_small;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swe mem small</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ossweruntime.impl.Swe_mem_smallImpl#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Swe_mem_smallImpl extends Mem_smallImpl implements Swe_mem_small {
	/**
	 * The default value of the '{@link #getOpenstackRuntimeId() <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_RUNTIME_ID_EDEFAULT = "7ae43f3f-4f39-4855-8a42-8d1f7e26bc0a";

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
	protected Swe_mem_smallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OssweruntimePackage.Literals.SWE_MEM_SMALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OssweruntimePackage.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID, oldOpenstackRuntimeId, openstackRuntimeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OssweruntimePackage.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID:
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
			case OssweruntimePackage.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID:
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
			case OssweruntimePackage.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID:
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
			case OssweruntimePackage.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID:
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

} //Swe_mem_smallImpl
