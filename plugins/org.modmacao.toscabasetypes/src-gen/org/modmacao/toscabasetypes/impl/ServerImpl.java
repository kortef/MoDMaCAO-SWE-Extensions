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
package org.modmacao.toscabasetypes.impl;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modmacao.toscabasetypes.Server;
import org.modmacao.toscabasetypes.ToscabasetypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscabasetypes.impl.ServerImpl#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link org.modmacao.toscabasetypes.impl.ServerImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends ComponentImpl implements Server {
	/**
	 * The default value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CPUS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected int numCpus = NUM_CPUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscabasetypesPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumCpus() {
		return numCpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCpus(int newNumCpus) {
		int oldNumCpus = numCpus;
		numCpus = newNumCpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscabasetypesPackage.SERVER__NUM_CPUS, oldNumCpus, numCpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscabasetypesPackage.SERVER__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscabasetypesPackage.SERVER__NUM_CPUS:
				return getNumCpus();
			case ToscabasetypesPackage.SERVER__MEMORY:
				return getMemory();
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
			case ToscabasetypesPackage.SERVER__NUM_CPUS:
				setNumCpus((Integer)newValue);
				return;
			case ToscabasetypesPackage.SERVER__MEMORY:
				setMemory((Integer)newValue);
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
			case ToscabasetypesPackage.SERVER__NUM_CPUS:
				setNumCpus(NUM_CPUS_EDEFAULT);
				return;
			case ToscabasetypesPackage.SERVER__MEMORY:
				setMemory(MEMORY_EDEFAULT);
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
			case ToscabasetypesPackage.SERVER__NUM_CPUS:
				return numCpus != NUM_CPUS_EDEFAULT;
			case ToscabasetypesPackage.SERVER__MEMORY:
				return memory != MEMORY_EDEFAULT;
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
		result.append(" (numCpus: ");
		result.append(numCpus);
		result.append(", memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
