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
package sugarcrm;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sugarcrmapplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sugarcrm.Sugarcrmapplication#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmapplication#getAdminPassword <em>Admin Password</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmapplication#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmapplication#getSitePath <em>Site Path</em>}</li>
 * </ul>
 *
 * @see sugarcrm.SugarcrmPackage#getSugarcrmapplication()
 * @model
 * @generated
 */
public interface Sugarcrmapplication extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Admin User</b></em>' attribute.
	 * The default value is <code>"admin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin User</em>' attribute.
	 * @see #setAdminUser(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmapplication_AdminUser()
	 * @model default="admin"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmapplication!adminUser'"
	 * @generated
	 */
	String getAdminUser();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmapplication#getAdminUser <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin User</em>' attribute.
	 * @see #getAdminUser()
	 * @generated
	 */
	void setAdminUser(String value);

	/**
	 * Returns the value of the '<em><b>Admin Password</b></em>' attribute.
	 * The default value is <code>"admin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrator Password
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Password</em>' attribute.
	 * @see #setAdminPassword(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmapplication_AdminPassword()
	 * @model default="admin"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmapplication!adminPassword'"
	 * @generated
	 */
	String getAdminPassword();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmapplication#getAdminPassword <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Password</em>' attribute.
	 * @see #getAdminPassword()
	 * @generated
	 */
	void setAdminPassword(String value);

	/**
	 * Returns the value of the '<em><b>Site Name</b></em>' attribute.
	 * The default value is <code>"SugarCRM"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Site Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Name</em>' attribute.
	 * @see #setSiteName(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmapplication_SiteName()
	 * @model default="SugarCRM"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmapplication!siteName'"
	 * @generated
	 */
	String getSiteName();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmapplication#getSiteName <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Name</em>' attribute.
	 * @see #getSiteName()
	 * @generated
	 */
	void setSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Site Path</b></em>' attribute.
	 * The default value is <code>"sugarcrm"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Site Path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Path</em>' attribute.
	 * @see #setSitePath(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmapplication_SitePath()
	 * @model default="sugarcrm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmapplication!sitePath'"
	 * @generated
	 */
	String getSitePath();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmapplication#getSitePath <em>Site Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Path</em>' attribute.
	 * @see #getSitePath()
	 * @generated
	 */
	void setSitePath(String value);

} // Sugarcrmapplication
