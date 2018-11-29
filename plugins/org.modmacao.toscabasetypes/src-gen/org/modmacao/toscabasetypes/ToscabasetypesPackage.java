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
 * @see org.modmacao.toscabasetypes.ToscabasetypesFactory
 * @model kind="package"
 * @generated
 */
public interface ToscabasetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toscabasetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/toscabasetypes/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toscabasetypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscabasetypesPackage eINSTANCE = org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.RootnodetypeImpl <em>Rootnodetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.RootnodetypeImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getRootnodetype()
	 * @generated
	 */
	int ROOTNODETYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Rootnodetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rootnodetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTNODETYPE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.TierImpl <em>Tier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.TierImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getTier()
	 * @generated
	 */
	int TIER = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.SinglenodetierImpl <em>Singlenodetier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.SinglenodetierImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getSinglenodetier()
	 * @generated
	 */
	int SINGLENODETIER = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Singlenodetier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Singlenodetier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLENODETIER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.ScalabletierImpl <em>Scalabletier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.ScalabletierImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getScalabletier()
	 * @generated
	 */
	int SCALABLETIER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Scalabletier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalabletier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLETIER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.ServerImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NUM_CPUS = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MEMORY = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.OperatingsystemImpl <em>Operatingsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.OperatingsystemImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getOperatingsystem()
	 * @generated
	 */
	int OPERATINGSYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATINGSYSTEM_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.WebserverImpl <em>Webserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.WebserverImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getWebserver()
	 * @generated
	 */
	int WEBSERVER = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.WebapplicationImpl <em>Webapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.WebapplicationImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getWebapplication()
	 * @generated
	 */
	int WEBAPPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.DbmsImpl <em>Dbms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.DbmsImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getDbms()
	 * @generated
	 */
	int DBMS = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscabasetypes.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscabasetypes.impl.DatabaseImpl
	 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Rootnodetype <em>Rootnodetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rootnodetype</em>'.
	 * @see org.modmacao.toscabasetypes.Rootnodetype
	 * @generated
	 */
	EClass getRootnodetype();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tier</em>'.
	 * @see org.modmacao.toscabasetypes.Tier
	 * @generated
	 */
	EClass getTier();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Singlenodetier <em>Singlenodetier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singlenodetier</em>'.
	 * @see org.modmacao.toscabasetypes.Singlenodetier
	 * @generated
	 */
	EClass getSinglenodetier();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Scalabletier <em>Scalabletier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalabletier</em>'.
	 * @see org.modmacao.toscabasetypes.Scalabletier
	 * @generated
	 */
	EClass getScalabletier();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.modmacao.toscabasetypes.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.toscabasetypes.Server#getNumCpus <em>Num Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cpus</em>'.
	 * @see org.modmacao.toscabasetypes.Server#getNumCpus()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_NumCpus();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.toscabasetypes.Server#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see org.modmacao.toscabasetypes.Server#getMemory()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Memory();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Operatingsystem <em>Operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operatingsystem</em>'.
	 * @see org.modmacao.toscabasetypes.Operatingsystem
	 * @generated
	 */
	EClass getOperatingsystem();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Webserver <em>Webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webserver</em>'.
	 * @see org.modmacao.toscabasetypes.Webserver
	 * @generated
	 */
	EClass getWebserver();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Webapplication <em>Webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webapplication</em>'.
	 * @see org.modmacao.toscabasetypes.Webapplication
	 * @generated
	 */
	EClass getWebapplication();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Dbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dbms</em>'.
	 * @see org.modmacao.toscabasetypes.Dbms
	 * @generated
	 */
	EClass getDbms();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscabasetypes.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.modmacao.toscabasetypes.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscabasetypesFactory getToscabasetypesFactory();

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
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.RootnodetypeImpl <em>Rootnodetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.RootnodetypeImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getRootnodetype()
		 * @generated
		 */
		EClass ROOTNODETYPE = eINSTANCE.getRootnodetype();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.TierImpl <em>Tier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.TierImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getTier()
		 * @generated
		 */
		EClass TIER = eINSTANCE.getTier();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.SinglenodetierImpl <em>Singlenodetier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.SinglenodetierImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getSinglenodetier()
		 * @generated
		 */
		EClass SINGLENODETIER = eINSTANCE.getSinglenodetier();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.ScalabletierImpl <em>Scalabletier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.ScalabletierImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getScalabletier()
		 * @generated
		 */
		EClass SCALABLETIER = eINSTANCE.getScalabletier();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.ServerImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Num Cpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__NUM_CPUS = eINSTANCE.getServer_NumCpus();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__MEMORY = eINSTANCE.getServer_Memory();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.OperatingsystemImpl <em>Operatingsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.OperatingsystemImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getOperatingsystem()
		 * @generated
		 */
		EClass OPERATINGSYSTEM = eINSTANCE.getOperatingsystem();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.WebserverImpl <em>Webserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.WebserverImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getWebserver()
		 * @generated
		 */
		EClass WEBSERVER = eINSTANCE.getWebserver();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.WebapplicationImpl <em>Webapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.WebapplicationImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getWebapplication()
		 * @generated
		 */
		EClass WEBAPPLICATION = eINSTANCE.getWebapplication();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.DbmsImpl <em>Dbms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.DbmsImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getDbms()
		 * @generated
		 */
		EClass DBMS = eINSTANCE.getDbms();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscabasetypes.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscabasetypes.impl.DatabaseImpl
		 * @see org.modmacao.toscabasetypes.impl.ToscabasetypesPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

	}

} //ToscabasetypesPackage
