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
package org.modmacao.toscaspecifictypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modmacao.toscaspecifictypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaspecifictypesFactoryImpl extends EFactoryImpl implements ToscaspecifictypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToscaspecifictypesFactory init() {
		try {
			ToscaspecifictypesFactory theToscaspecifictypesFactory = (ToscaspecifictypesFactory)EPackage.Registry.INSTANCE.getEFactory(ToscaspecifictypesPackage.eNS_URI);
			if (theToscaspecifictypesFactory != null) {
				return theToscaspecifictypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToscaspecifictypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaspecifictypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToscaspecifictypesPackage.APACHEWEBSERVER: return createApachewebserver();
			case ToscaspecifictypesPackage.APACHEWEBAPPLICATION: return createApachewebapplication();
			case ToscaspecifictypesPackage.APACHEMODULE: return createApachemodule();
			case ToscaspecifictypesPackage.APACHEPHPMODULE: return createApachephpmodule();
			case ToscaspecifictypesPackage.MYSQL: return createMysql();
			case ToscaspecifictypesPackage.MYSQLDATABASE: return createMysqldatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachewebserver createApachewebserver() {
		ApachewebserverImpl apachewebserver = new ApachewebserverImpl();
		return apachewebserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachewebapplication createApachewebapplication() {
		ApachewebapplicationImpl apachewebapplication = new ApachewebapplicationImpl();
		return apachewebapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachemodule createApachemodule() {
		ApachemoduleImpl apachemodule = new ApachemoduleImpl();
		return apachemodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachephpmodule createApachephpmodule() {
		ApachephpmoduleImpl apachephpmodule = new ApachephpmoduleImpl();
		return apachephpmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mysql createMysql() {
		MysqlImpl mysql = new MysqlImpl();
		return mysql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mysqldatabase createMysqldatabase() {
		MysqldatabaseImpl mysqldatabase = new MysqldatabaseImpl();
		return mysqldatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaspecifictypesPackage getToscaspecifictypesPackage() {
		return (ToscaspecifictypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToscaspecifictypesPackage getPackage() {
		return ToscaspecifictypesPackage.eINSTANCE;
	}

} //ToscaspecifictypesFactoryImpl
