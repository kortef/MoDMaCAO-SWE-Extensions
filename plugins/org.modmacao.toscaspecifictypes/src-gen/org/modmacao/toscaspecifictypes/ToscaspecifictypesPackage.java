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
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesFactory
 * @model kind="package"
 * @generated
 */
public interface ToscaspecifictypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toscaspecifictypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/toscaspecifictypes/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toscaspecifictypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaspecifictypesPackage eINSTANCE = org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.ApachewebserverImpl <em>Apachewebserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.ApachewebserverImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachewebserver()
	 * @generated
	 */
	int APACHEWEBSERVER = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Httpdport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER__HTTPDPORT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apachewebserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apachewebserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBSERVER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.ApachewebapplicationImpl <em>Apachewebapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.ApachewebapplicationImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachewebapplication()
	 * @generated
	 */
	int APACHEWEBAPPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Apachewebapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apachewebapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEWEBAPPLICATION_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.ApachemoduleImpl <em>Apachemodule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.ApachemoduleImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachemodule()
	 * @generated
	 */
	int APACHEMODULE = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Apachemodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apachemodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEMODULE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.ApachephpmoduleImpl <em>Apachephpmodule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.ApachephpmoduleImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachephpmodule()
	 * @generated
	 */
	int APACHEPHPMODULE = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Apachephpmodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apachephpmodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHEPHPMODULE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.MysqlImpl <em>Mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.MysqlImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysql()
	 * @generated
	 */
	int MYSQL = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__ROOT_PASSWORD = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabaseImpl <em>Mysqldatabase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabaseImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabase()
	 * @generated
	 */
	int MYSQLDATABASE = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Mysqldatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mysqldatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabasehostedonmysqlImpl <em>Mysqldatabasehostedonmysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabasehostedonmysqlImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabasehostedonmysql()
	 * @generated
	 */
	int MYSQLDATABASEHOSTEDONMYSQL = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASEHOSTEDONMYSQL__MIXIN = ModmacaoPackage.DEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASEHOSTEDONMYSQL__ENTITY = ModmacaoPackage.DEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASEHOSTEDONMYSQL__ATTRIBUTES = ModmacaoPackage.DEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mysqldatabasehostedonmysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASEHOSTEDONMYSQL_FEATURE_COUNT = ModmacaoPackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mysqldatabasehostedonmysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASEHOSTEDONMYSQL_OPERATION_COUNT = ModmacaoPackage.DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabaseconnectionImpl <em>Mysqldatabaseconnection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabaseconnectionImpl
	 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabaseconnection()
	 * @generated
	 */
	int MYSQLDATABASECONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASECONNECTION__MIXIN = ModmacaoPackage.DEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASECONNECTION__ENTITY = ModmacaoPackage.DEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASECONNECTION__ATTRIBUTES = ModmacaoPackage.DEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mysqldatabaseconnection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASECONNECTION_FEATURE_COUNT = ModmacaoPackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mysqldatabaseconnection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDATABASECONNECTION_OPERATION_COUNT = ModmacaoPackage.DEPENDENCY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Apachewebserver <em>Apachewebserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachewebserver</em>'.
	 * @see org.modmacao.toscaspecifictypes.Apachewebserver
	 * @generated
	 */
	EClass getApachewebserver();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.toscaspecifictypes.Apachewebserver#getHttpdport <em>Httpdport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Httpdport</em>'.
	 * @see org.modmacao.toscaspecifictypes.Apachewebserver#getHttpdport()
	 * @see #getApachewebserver()
	 * @generated
	 */
	EAttribute getApachewebserver_Httpdport();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Apachewebapplication <em>Apachewebapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachewebapplication</em>'.
	 * @see org.modmacao.toscaspecifictypes.Apachewebapplication
	 * @generated
	 */
	EClass getApachewebapplication();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Apachemodule <em>Apachemodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachemodule</em>'.
	 * @see org.modmacao.toscaspecifictypes.Apachemodule
	 * @generated
	 */
	EClass getApachemodule();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Apachephpmodule <em>Apachephpmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachephpmodule</em>'.
	 * @see org.modmacao.toscaspecifictypes.Apachephpmodule
	 * @generated
	 */
	EClass getApachephpmodule();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Mysql <em>Mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysql</em>'.
	 * @see org.modmacao.toscaspecifictypes.Mysql
	 * @generated
	 */
	EClass getMysql();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.toscaspecifictypes.Mysql#getRootPassword <em>Root Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Password</em>'.
	 * @see org.modmacao.toscaspecifictypes.Mysql#getRootPassword()
	 * @see #getMysql()
	 * @generated
	 */
	EAttribute getMysql_RootPassword();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Mysqldatabase <em>Mysqldatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysqldatabase</em>'.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabase
	 * @generated
	 */
	EClass getMysqldatabase();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Mysqldatabasehostedonmysql <em>Mysqldatabasehostedonmysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysqldatabasehostedonmysql</em>'.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabasehostedonmysql
	 * @generated
	 */
	EClass getMysqldatabasehostedonmysql();

	/**
	 * Returns the meta object for class '{@link org.modmacao.toscaspecifictypes.Mysqldatabaseconnection <em>Mysqldatabaseconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysqldatabaseconnection</em>'.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabaseconnection
	 * @generated
	 */
	EClass getMysqldatabaseconnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscaspecifictypesFactory getToscaspecifictypesFactory();

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
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.ApachewebserverImpl <em>Apachewebserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.ApachewebserverImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachewebserver()
		 * @generated
		 */
		EClass APACHEWEBSERVER = eINSTANCE.getApachewebserver();

		/**
		 * The meta object literal for the '<em><b>Httpdport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHEWEBSERVER__HTTPDPORT = eINSTANCE.getApachewebserver_Httpdport();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.ApachewebapplicationImpl <em>Apachewebapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.ApachewebapplicationImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachewebapplication()
		 * @generated
		 */
		EClass APACHEWEBAPPLICATION = eINSTANCE.getApachewebapplication();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.ApachemoduleImpl <em>Apachemodule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.ApachemoduleImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachemodule()
		 * @generated
		 */
		EClass APACHEMODULE = eINSTANCE.getApachemodule();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.ApachephpmoduleImpl <em>Apachephpmodule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.ApachephpmoduleImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getApachephpmodule()
		 * @generated
		 */
		EClass APACHEPHPMODULE = eINSTANCE.getApachephpmodule();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.MysqlImpl <em>Mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.MysqlImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysql()
		 * @generated
		 */
		EClass MYSQL = eINSTANCE.getMysql();

		/**
		 * The meta object literal for the '<em><b>Root Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MYSQL__ROOT_PASSWORD = eINSTANCE.getMysql_RootPassword();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabaseImpl <em>Mysqldatabase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabaseImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabase()
		 * @generated
		 */
		EClass MYSQLDATABASE = eINSTANCE.getMysqldatabase();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabasehostedonmysqlImpl <em>Mysqldatabasehostedonmysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabasehostedonmysqlImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabasehostedonmysql()
		 * @generated
		 */
		EClass MYSQLDATABASEHOSTEDONMYSQL = eINSTANCE.getMysqldatabasehostedonmysql();

		/**
		 * The meta object literal for the '{@link org.modmacao.toscaspecifictypes.impl.MysqldatabaseconnectionImpl <em>Mysqldatabaseconnection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.toscaspecifictypes.impl.MysqldatabaseconnectionImpl
		 * @see org.modmacao.toscaspecifictypes.impl.ToscaspecifictypesPackageImpl#getMysqldatabaseconnection()
		 * @generated
		 */
		EClass MYSQLDATABASECONNECTION = eINSTANCE.getMysqldatabaseconnection();

	}

} //ToscaspecifictypesPackage
