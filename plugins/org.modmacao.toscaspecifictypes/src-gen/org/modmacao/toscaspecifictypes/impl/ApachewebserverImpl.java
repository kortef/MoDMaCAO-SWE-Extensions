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

import org.modmacao.toscaspecifictypes.Apachewebserver;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apachewebserver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscaspecifictypes.impl.ApachewebserverImpl#getHttpdport <em>Httpdport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApachewebserverImpl extends ComponentImpl implements Apachewebserver {
	/**
	 * The default value of the '{@link #getHttpdport() <em>Httpdport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpdport()
	 * @generated
	 * @ordered
	 */
	protected static final int HTTPDPORT_EDEFAULT = 80;

	/**
	 * The cached value of the '{@link #getHttpdport() <em>Httpdport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpdport()
	 * @generated
	 * @ordered
	 */
	protected int httpdport = HTTPDPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApachewebserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaspecifictypesPackage.Literals.APACHEWEBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHttpdport() {
		return httpdport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpdport(int newHttpdport) {
		int oldHttpdport = httpdport;
		httpdport = newHttpdport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaspecifictypesPackage.APACHEWEBSERVER__HTTPDPORT, oldHttpdport, httpdport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaspecifictypesPackage.APACHEWEBSERVER__HTTPDPORT:
				return getHttpdport();
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
			case ToscaspecifictypesPackage.APACHEWEBSERVER__HTTPDPORT:
				setHttpdport((Integer)newValue);
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
			case ToscaspecifictypesPackage.APACHEWEBSERVER__HTTPDPORT:
				setHttpdport(HTTPDPORT_EDEFAULT);
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
			case ToscaspecifictypesPackage.APACHEWEBSERVER__HTTPDPORT:
				return httpdport != HTTPDPORT_EDEFAULT;
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
		result.append(" (httpdport: ");
		result.append(httpdport);
		result.append(')');
		return result.toString();
	}

} //ApachewebserverImpl
