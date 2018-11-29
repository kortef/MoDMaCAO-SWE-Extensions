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

import modmacao.ModmacaoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sugarcrm.SugarcrmFactory
 * @model kind="package"
 * @generated
 */
public interface SugarcrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sugarcrm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/sugarcrm/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sugarcrm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SugarcrmPackage eINSTANCE = sugarcrm.impl.SugarcrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link sugarcrm.impl.SugarcrmapplicationImpl <em>Sugarcrmapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sugarcrm.impl.SugarcrmapplicationImpl
	 * @see sugarcrm.impl.SugarcrmPackageImpl#getSugarcrmapplication()
	 * @generated
	 */
	int SUGARCRMAPPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Admin User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__ADMIN_USER = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admin Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__ADMIN_PASSWORD = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__SITE_NAME = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Site Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION__SITE_PATH = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sugarcrmapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sugarcrmapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMAPPLICATION_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sugarcrm.impl.SugarcrmdatabaseImpl <em>Sugarcrmdatabase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sugarcrm.impl.SugarcrmdatabaseImpl
	 * @see sugarcrm.impl.SugarcrmPackageImpl#getSugarcrmdatabase()
	 * @generated
	 */
	int SUGARCRMDATABASE = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>DB Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__DB_NAME = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DB User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__DB_USER = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DB Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__DB_PASSWORD = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DB Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE__DB_PORT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sugarcrmdatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sugarcrmdatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGARCRMDATABASE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link sugarcrm.Sugarcrmapplication <em>Sugarcrmapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sugarcrmapplication</em>'.
	 * @see sugarcrm.Sugarcrmapplication
	 * @generated
	 */
	EClass getSugarcrmapplication();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmapplication#getAdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin User</em>'.
	 * @see sugarcrm.Sugarcrmapplication#getAdminUser()
	 * @see #getSugarcrmapplication()
	 * @generated
	 */
	EAttribute getSugarcrmapplication_AdminUser();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmapplication#getAdminPassword <em>Admin Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Password</em>'.
	 * @see sugarcrm.Sugarcrmapplication#getAdminPassword()
	 * @see #getSugarcrmapplication()
	 * @generated
	 */
	EAttribute getSugarcrmapplication_AdminPassword();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmapplication#getSiteName <em>Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Name</em>'.
	 * @see sugarcrm.Sugarcrmapplication#getSiteName()
	 * @see #getSugarcrmapplication()
	 * @generated
	 */
	EAttribute getSugarcrmapplication_SiteName();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmapplication#getSitePath <em>Site Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Path</em>'.
	 * @see sugarcrm.Sugarcrmapplication#getSitePath()
	 * @see #getSugarcrmapplication()
	 * @generated
	 */
	EAttribute getSugarcrmapplication_SitePath();

	/**
	 * Returns the meta object for class '{@link sugarcrm.Sugarcrmdatabase <em>Sugarcrmdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sugarcrmdatabase</em>'.
	 * @see sugarcrm.Sugarcrmdatabase
	 * @generated
	 */
	EClass getSugarcrmdatabase();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmdatabase#getDBName <em>DB Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Name</em>'.
	 * @see sugarcrm.Sugarcrmdatabase#getDBName()
	 * @see #getSugarcrmdatabase()
	 * @generated
	 */
	EAttribute getSugarcrmdatabase_DBName();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmdatabase#getDBUser <em>DB User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB User</em>'.
	 * @see sugarcrm.Sugarcrmdatabase#getDBUser()
	 * @see #getSugarcrmdatabase()
	 * @generated
	 */
	EAttribute getSugarcrmdatabase_DBUser();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmdatabase#getDBPassword <em>DB Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Password</em>'.
	 * @see sugarcrm.Sugarcrmdatabase#getDBPassword()
	 * @see #getSugarcrmdatabase()
	 * @generated
	 */
	EAttribute getSugarcrmdatabase_DBPassword();

	/**
	 * Returns the meta object for the attribute '{@link sugarcrm.Sugarcrmdatabase#getDBPort <em>DB Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Port</em>'.
	 * @see sugarcrm.Sugarcrmdatabase#getDBPort()
	 * @see #getSugarcrmdatabase()
	 * @generated
	 */
	EAttribute getSugarcrmdatabase_DBPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SugarcrmFactory getSugarcrmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sugarcrm.impl.SugarcrmapplicationImpl <em>Sugarcrmapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sugarcrm.impl.SugarcrmapplicationImpl
		 * @see sugarcrm.impl.SugarcrmPackageImpl#getSugarcrmapplication()
		 * @generated
		 */
		EClass SUGARCRMAPPLICATION = eINSTANCE.getSugarcrmapplication();

		/**
		 * The meta object literal for the '<em><b>Admin User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMAPPLICATION__ADMIN_USER = eINSTANCE.getSugarcrmapplication_AdminUser();

		/**
		 * The meta object literal for the '<em><b>Admin Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMAPPLICATION__ADMIN_PASSWORD = eINSTANCE.getSugarcrmapplication_AdminPassword();

		/**
		 * The meta object literal for the '<em><b>Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMAPPLICATION__SITE_NAME = eINSTANCE.getSugarcrmapplication_SiteName();

		/**
		 * The meta object literal for the '<em><b>Site Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMAPPLICATION__SITE_PATH = eINSTANCE.getSugarcrmapplication_SitePath();

		/**
		 * The meta object literal for the '{@link sugarcrm.impl.SugarcrmdatabaseImpl <em>Sugarcrmdatabase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sugarcrm.impl.SugarcrmdatabaseImpl
		 * @see sugarcrm.impl.SugarcrmPackageImpl#getSugarcrmdatabase()
		 * @generated
		 */
		EClass SUGARCRMDATABASE = eINSTANCE.getSugarcrmdatabase();

		/**
		 * The meta object literal for the '<em><b>DB Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMDATABASE__DB_NAME = eINSTANCE.getSugarcrmdatabase_DBName();

		/**
		 * The meta object literal for the '<em><b>DB User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMDATABASE__DB_USER = eINSTANCE.getSugarcrmdatabase_DBUser();

		/**
		 * The meta object literal for the '<em><b>DB Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMDATABASE__DB_PASSWORD = eINSTANCE.getSugarcrmdatabase_DBPassword();

		/**
		 * The meta object literal for the '<em><b>DB Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUGARCRMDATABASE__DB_PORT = eINSTANCE.getSugarcrmdatabase_DBPort();

	}

} //SugarcrmPackage
