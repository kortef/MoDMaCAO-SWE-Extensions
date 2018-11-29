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
 * A representation of the model object '<em><b>Sugarcrmdatabase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sugarcrm.Sugarcrmdatabase#getDBName <em>DB Name</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmdatabase#getDBUser <em>DB User</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmdatabase#getDBPassword <em>DB Password</em>}</li>
 *   <li>{@link sugarcrm.Sugarcrmdatabase#getDBPort <em>DB Port</em>}</li>
 * </ul>
 *
 * @see sugarcrm.SugarcrmPackage#getSugarcrmdatabase()
 * @model
 * @generated
 */
public interface Sugarcrmdatabase extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>DB Name</b></em>' attribute.
	 * The default value is <code>"sugarcrm"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Database Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DB Name</em>' attribute.
	 * @see #setDBName(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmdatabase_DBName()
	 * @model default="sugarcrm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmdatabase!dBName'"
	 * @generated
	 */
	String getDBName();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmdatabase#getDBName <em>DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Name</em>' attribute.
	 * @see #getDBName()
	 * @generated
	 */
	void setDBName(String value);

	/**
	 * Returns the value of the '<em><b>DB User</b></em>' attribute.
	 * The default value is <code>"sugarcrm"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Database User
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DB User</em>' attribute.
	 * @see #setDBUser(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmdatabase_DBUser()
	 * @model default="sugarcrm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmdatabase!dBUser'"
	 * @generated
	 */
	String getDBUser();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmdatabase#getDBUser <em>DB User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB User</em>' attribute.
	 * @see #getDBUser()
	 * @generated
	 */
	void setDBUser(String value);

	/**
	 * Returns the value of the '<em><b>DB Password</b></em>' attribute.
	 * The default value is <code>"sugarcrm"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Database User Password
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DB Password</em>' attribute.
	 * @see #setDBPassword(String)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmdatabase_DBPassword()
	 * @model default="sugarcrm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmdatabase!dBPassword'"
	 * @generated
	 */
	String getDBPassword();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmdatabase#getDBPassword <em>DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Password</em>' attribute.
	 * @see #getDBPassword()
	 * @generated
	 */
	void setDBPassword(String value);

	/**
	 * Returns the value of the '<em><b>DB Port</b></em>' attribute.
	 * The default value is <code>"3306"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Database Port (default 3306)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DB Port</em>' attribute.
	 * @see #setDBPort(int)
	 * @see sugarcrm.SugarcrmPackage#getSugarcrmdatabase_DBPort()
	 * @model default="3306"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/sugarcrm/ecore!Sugarcrmdatabase!dBPort'"
	 * @generated
	 */
	int getDBPort();

	/**
	 * Sets the value of the '{@link sugarcrm.Sugarcrmdatabase#getDBPort <em>DB Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Port</em>' attribute.
	 * @see #getDBPort()
	 * @generated
	 */
	void setDBPort(int value);

} // Sugarcrmdatabase
