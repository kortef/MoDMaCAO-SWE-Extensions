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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sugarcrm.SugarcrmPackage
 * @generated
 */
public interface SugarcrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SugarcrmFactory eINSTANCE = sugarcrm.impl.SugarcrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sugarcrmapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sugarcrmapplication</em>'.
	 * @generated
	 */
	Sugarcrmapplication createSugarcrmapplication();

	/**
	 * Returns a new object of class '<em>Sugarcrmdatabase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sugarcrmdatabase</em>'.
	 * @generated
	 */
	Sugarcrmdatabase createSugarcrmdatabase();

	/**
	 * Returns a new object of class '<em>Sugarcrmdatabaseconnection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sugarcrmdatabaseconnection</em>'.
	 * @generated
	 */
	Sugarcrmdatabaseconnection createSugarcrmdatabaseconnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SugarcrmPackage getSugarcrmPackage();

} //SugarcrmFactory
