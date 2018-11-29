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
package org.modmacao.toscaspecifictypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage
 * @generated
 */
public interface ToscaspecifictypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaspecifictypesFactory eINSTANCE = org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apachewebserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachewebserver</em>'.
	 * @generated
	 */
	Apachewebserver createApachewebserver();

	/**
	 * Returns a new object of class '<em>Apachewebapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachewebapplication</em>'.
	 * @generated
	 */
	Apachewebapplication createApachewebapplication();

	/**
	 * Returns a new object of class '<em>Apachemodule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachemodule</em>'.
	 * @generated
	 */
	Apachemodule createApachemodule();

	/**
	 * Returns a new object of class '<em>Apachephpmodule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachephpmodule</em>'.
	 * @generated
	 */
	Apachephpmodule createApachephpmodule();

	/**
	 * Returns a new object of class '<em>Mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mysql</em>'.
	 * @generated
	 */
	Mysql createMysql();

	/**
	 * Returns a new object of class '<em>Mysqldatabase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mysqldatabase</em>'.
	 * @generated
	 */
	Mysqldatabase createMysqldatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToscaspecifictypesPackage getToscaspecifictypesPackage();

} //ToscaspecifictypesFactory
