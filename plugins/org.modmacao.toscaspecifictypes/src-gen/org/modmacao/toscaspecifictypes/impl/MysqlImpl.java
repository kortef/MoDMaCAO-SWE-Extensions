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
package org.modmacao.toscaspecifictypes.impl;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modmacao.toscaspecifictypes.Mysql;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mysql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscaspecifictypes.impl.MysqlImpl#getRootPassword <em>Root Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MysqlImpl extends ComponentImpl implements Mysql {
	/**
	 * The default value of the '{@link #getRootPassword() <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPassword() <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPassword()
	 * @generated
	 * @ordered
	 */
	protected String rootPassword = ROOT_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MysqlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaspecifictypesPackage.Literals.MYSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootPassword() {
		return rootPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPassword(String newRootPassword) {
		String oldRootPassword = rootPassword;
		rootPassword = newRootPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaspecifictypesPackage.MYSQL__ROOT_PASSWORD, oldRootPassword, rootPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaspecifictypesPackage.MYSQL__ROOT_PASSWORD:
				return getRootPassword();
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
			case ToscaspecifictypesPackage.MYSQL__ROOT_PASSWORD:
				setRootPassword((String)newValue);
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
			case ToscaspecifictypesPackage.MYSQL__ROOT_PASSWORD:
				setRootPassword(ROOT_PASSWORD_EDEFAULT);
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
			case ToscaspecifictypesPackage.MYSQL__ROOT_PASSWORD:
				return ROOT_PASSWORD_EDEFAULT == null ? rootPassword != null : !ROOT_PASSWORD_EDEFAULT.equals(rootPassword);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (rootPassword: ");
		result.append(rootPassword);
		result.append(')');
		return result.toString();
	}

} //MysqlImpl
