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
package org.modmacao.toscabasetypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage
 * @generated
 */
public interface ToscabasetypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscabasetypesFactory eINSTANCE = org.modmacao.toscabasetypes.impl.ToscabasetypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rootnodetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rootnodetype</em>'.
	 * @generated
	 */
	Rootnodetype createRootnodetype();

	/**
	 * Returns a new object of class '<em>Tier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tier</em>'.
	 * @generated
	 */
	Tier createTier();

	/**
	 * Returns a new object of class '<em>Singlenodetier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singlenodetier</em>'.
	 * @generated
	 */
	Singlenodetier createSinglenodetier();

	/**
	 * Returns a new object of class '<em>Scalabletier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalabletier</em>'.
	 * @generated
	 */
	Scalabletier createScalabletier();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Operatingsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operatingsystem</em>'.
	 * @generated
	 */
	Operatingsystem createOperatingsystem();

	/**
	 * Returns a new object of class '<em>Webserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Webserver</em>'.
	 * @generated
	 */
	Webserver createWebserver();

	/**
	 * Returns a new object of class '<em>Webapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Webapplication</em>'.
	 * @generated
	 */
	Webapplication createWebapplication();

	/**
	 * Returns a new object of class '<em>Dbms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dbms</em>'.
	 * @generated
	 */
	Dbms createDbms();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToscabasetypesPackage getToscabasetypesPackage();

} //ToscabasetypesFactory
