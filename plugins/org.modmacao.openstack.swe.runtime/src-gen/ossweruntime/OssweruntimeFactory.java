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
package ossweruntime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ossweruntime.OssweruntimePackage
 * @generated
 */
public interface OssweruntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OssweruntimeFactory eINSTANCE = ossweruntime.impl.OssweruntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Swe small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe small</em>'.
	 * @generated
	 */
	Swe_small createSwe_small();

	/**
	 * Returns a new object of class '<em>Swe medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe medium</em>'.
	 * @generated
	 */
	Swe_medium createSwe_medium();

	/**
	 * Returns a new object of class '<em>Swe large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe large</em>'.
	 * @generated
	 */
	Swe_large createSwe_large();

	/**
	 * Returns a new object of class '<em>Swe mem small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe mem small</em>'.
	 * @generated
	 */
	Swe_mem_small createSwe_mem_small();

	/**
	 * Returns a new object of class '<em>Swe mem medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe mem medium</em>'.
	 * @generated
	 */
	Swe_mem_medium createSwe_mem_medium();

	/**
	 * Returns a new object of class '<em>Swe mem large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swe mem large</em>'.
	 * @generated
	 */
	Swe_mem_large createSwe_mem_large();

	/**
	 * Returns a new object of class '<em>Ubuntu trustytahr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubuntu trustytahr</em>'.
	 * @generated
	 */
	Ubuntu_trustytahr createUbuntu_trustytahr();

	/**
	 * Returns a new object of class '<em>Ubuntu xenialxerus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubuntu xenialxerus</em>'.
	 * @generated
	 */
	Ubuntu_xenialxerus createUbuntu_xenialxerus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OssweruntimePackage getOssweruntimePackage();

} //OssweruntimeFactory
