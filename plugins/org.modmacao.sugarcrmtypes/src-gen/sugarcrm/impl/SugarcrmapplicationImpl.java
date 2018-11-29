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
import sugarcrm.Sugarcrmapplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sugarcrmapplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sugarcrm.impl.SugarcrmapplicationImpl#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmapplicationImpl#getAdminPassword <em>Admin Password</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmapplicationImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link sugarcrm.impl.SugarcrmapplicationImpl#getSitePath <em>Site Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SugarcrmapplicationImpl extends ComponentImpl implements Sugarcrmapplication {
	/**
	 * The default value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_USER_EDEFAULT = "admin";

	/**
	 * The cached value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected String adminUser = ADMIN_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminPassword() <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_PASSWORD_EDEFAULT = "admin";

	/**
	 * The cached value of the '{@link #getAdminPassword() <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminPassword()
	 * @generated
	 * @ordered
	 */
	protected String adminPassword = ADMIN_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_NAME_EDEFAULT = "SugarCRM";

	/**
	 * The cached value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected String siteName = SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSitePath() <em>Site Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_PATH_EDEFAULT = "sugarcrm";

	/**
	 * The cached value of the '{@link #getSitePath() <em>Site Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePath()
	 * @generated
	 * @ordered
	 */
	protected String sitePath = SITE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SugarcrmapplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SugarcrmPackage.Literals.SUGARCRMAPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminUser() {
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminUser(String newAdminUser) {
		String oldAdminUser = adminUser;
		adminUser = newAdminUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_USER, oldAdminUser, adminUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminPassword(String newAdminPassword) {
		String oldAdminPassword = adminPassword;
		adminPassword = newAdminPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_PASSWORD, oldAdminPassword, adminPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteName(String newSiteName) {
		String oldSiteName = siteName;
		siteName = newSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMAPPLICATION__SITE_NAME, oldSiteName, siteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSitePath() {
		return sitePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSitePath(String newSitePath) {
		String oldSitePath = sitePath;
		sitePath = newSitePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SugarcrmPackage.SUGARCRMAPPLICATION__SITE_PATH, oldSitePath, sitePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_USER:
				return getAdminUser();
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_PASSWORD:
				return getAdminPassword();
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_NAME:
				return getSiteName();
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_PATH:
				return getSitePath();
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
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_USER:
				setAdminUser((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_PASSWORD:
				setAdminPassword((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_NAME:
				setSiteName((String)newValue);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_PATH:
				setSitePath((String)newValue);
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
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_USER:
				setAdminUser(ADMIN_USER_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_PASSWORD:
				setAdminPassword(ADMIN_PASSWORD_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_NAME:
				setSiteName(SITE_NAME_EDEFAULT);
				return;
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_PATH:
				setSitePath(SITE_PATH_EDEFAULT);
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
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_USER:
				return ADMIN_USER_EDEFAULT == null ? adminUser != null : !ADMIN_USER_EDEFAULT.equals(adminUser);
			case SugarcrmPackage.SUGARCRMAPPLICATION__ADMIN_PASSWORD:
				return ADMIN_PASSWORD_EDEFAULT == null ? adminPassword != null : !ADMIN_PASSWORD_EDEFAULT.equals(adminPassword);
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_NAME:
				return SITE_NAME_EDEFAULT == null ? siteName != null : !SITE_NAME_EDEFAULT.equals(siteName);
			case SugarcrmPackage.SUGARCRMAPPLICATION__SITE_PATH:
				return SITE_PATH_EDEFAULT == null ? sitePath != null : !SITE_PATH_EDEFAULT.equals(sitePath);
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
		result.append(" (adminUser: ");
		result.append(adminUser);
		result.append(", adminPassword: ");
		result.append(adminPassword);
		result.append(", siteName: ");
		result.append(siteName);
		result.append(", sitePath: ");
		result.append(sitePath);
		result.append(')');
		return result.toString();
	}

} //SugarcrmapplicationImpl
