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
package sugarcrm.impl;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sugarcrm.SugarcrmPackage;
import sugarcrm.Sugarcrmdatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sugarcrmdatabase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sugarcrm.impl.SugarcrmdatabaseImpl#getDBName <em>DB Name</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmdatabaseImpl#getDBUser <em>DB User</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmdatabaseImpl#getDBPassword <em>DB Password</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmdatabaseImpl#getDBPort <em>DB Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SugarcrmdatabaseImpl extends ComponentImpl implements Sugarcrmdatabase {
	/**
	 * The default value of the '{@link #getDBName() <em>DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_NAME_EDEFAULT = "sugarcrm";

	/**
	 * The cached value of the '{@link #getDBName() <em>DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBName()
	 * @generated
	 * @ordered
	 */
	protected String dBName = DB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBUser() <em>DB User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USER_EDEFAULT = "sugarcrm";

	/**
	 * The cached value of the '{@link #getDBUser() <em>DB User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBUser()
	 * @generated
	 * @ordered
	 */
	protected String dBUser = DB_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBPassword() <em>DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = "sugarcrm";

	/**
	 * The cached value of the '{@link #getDBPassword() <em>DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBPassword()
	 * @generated
	 * @ordered
	 */
	protected String dBPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBPort() <em>DB Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBPort()
	 * @generated
	 * @ordered
	 */
	protected static final int DB_PORT_EDEFAULT = 3306;

	/**
	 * The cached value of the '{@link #getDBPort() <em>DB Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBPort()
	 * @generated
	 * @ordered
	 */
	protected int dBPort = DB_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SugarcrmdatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SugarcrmPackage.Literals.SUGARCRMDATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBName() {
		return dBName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBName(String newDBName) {
		String oldDBName = dBName;
		dBName = newDBName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMDATABASE__DB_NAME, oldDBName, dBName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBUser() {
		return dBUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBUser(String newDBUser) {
		String oldDBUser = dBUser;
		dBUser = newDBUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMDATABASE__DB_USER, oldDBUser, dBUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBPassword() {
		return dBPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBPassword(String newDBPassword) {
		String oldDBPassword = dBPassword;
		dBPassword = newDBPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMDATABASE__DB_PASSWORD, oldDBPassword, dBPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDBPort() {
		return dBPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBPort(int newDBPort) {
		int oldDBPort = dBPort;
		dBPort = newDBPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMDATABASE__DB_PORT, oldDBPort, dBPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SugarcrmPackage.SUGARCRMDATABASE__DB_NAME:
				return getDBName();
			case SugarcrmPackage.SUGARCRMDATABASE__DB_USER:
				return getDBUser();
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PASSWORD:
				return getDBPassword();
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PORT:
				return getDBPort();
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
			case SugarcrmPackage.SUGARCRMDATABASE__DB_NAME:
				setDBName((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_USER:
				setDBUser((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PASSWORD:
				setDBPassword((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PORT:
				setDBPort((Integer)newValue);
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
			case SugarcrmPackage.SUGARCRMDATABASE__DB_NAME:
				setDBName(DB_NAME_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_USER:
				setDBUser(DB_USER_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PASSWORD:
				setDBPassword(DB_PASSWORD_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PORT:
				setDBPort(DB_PORT_EDEFAULT);
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
			case SugarcrmPackage.SUGARCRMDATABASE__DB_NAME:
				return DB_NAME_EDEFAULT == null ? dBName != null : !DB_NAME_EDEFAULT.equals(dBName);
			case SugarcrmPackage.SUGARCRMDATABASE__DB_USER:
				return DB_USER_EDEFAULT == null ? dBUser != null : !DB_USER_EDEFAULT.equals(dBUser);
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dBPassword != null : !DB_PASSWORD_EDEFAULT.equals(dBPassword);
			case SugarcrmPackage.SUGARCRMDATABASE__DB_PORT:
				return dBPort != DB_PORT_EDEFAULT;
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
		result.append(" (dBName: ");
		result.append(dBName);
		result.append(", dBUser: ");
		result.append(dBUser);
		result.append(", dBPassword: ");
		result.append(dBPassword);
		result.append(", dBPort: ");
		result.append(dBPort);
		result.append(')');
		return result.toString();
	}

} //SugarcrmdatabaseImpl
