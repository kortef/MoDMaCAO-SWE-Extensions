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
package org.modmacao.toscabasetypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modmacao.toscabasetypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscabasetypesFactoryImpl extends EFactoryImpl implements ToscabasetypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToscabasetypesFactory init() {
		try {
			ToscabasetypesFactory theToscabasetypesFactory = (ToscabasetypesFactory)EPackage.Registry.INSTANCE.getEFactory(ToscabasetypesPackage.eNS_URI);
			if (theToscabasetypesFactory != null) {
				return theToscabasetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToscabasetypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesFactoryImpl() {
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
			case ToscabasetypesPackage.ROOTNODETYPE: return createRootnodetype();
			case ToscabasetypesPackage.TIER: return createTier();
			case ToscabasetypesPackage.SINGLENODETIER: return createSinglenodetier();
			case ToscabasetypesPackage.SCALABLETIER: return createScalabletier();
			case ToscabasetypesPackage.SERVER: return createServer();
			case ToscabasetypesPackage.OPERATINGSYSTEM: return createOperatingsystem();
			case ToscabasetypesPackage.WEBSERVER: return createWebserver();
			case ToscabasetypesPackage.WEBAPPLICATION: return createWebapplication();
			case ToscabasetypesPackage.DBMS: return createDbms();
			case ToscabasetypesPackage.DATABASE: return createDatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rootnodetype createRootnodetype() {
		RootnodetypeImpl rootnodetype = new RootnodetypeImpl();
		return rootnodetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tier createTier() {
		TierImpl tier = new TierImpl();
		return tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Singlenodetier createSinglenodetier() {
		SinglenodetierImpl singlenodetier = new SinglenodetierImpl();
		return singlenodetier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalabletier createScalabletier() {
		ScalabletierImpl scalabletier = new ScalabletierImpl();
		return scalabletier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operatingsystem createOperatingsystem() {
		OperatingsystemImpl operatingsystem = new OperatingsystemImpl();
		return operatingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webserver createWebserver() {
		WebserverImpl webserver = new WebserverImpl();
		return webserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapplication createWebapplication() {
		WebapplicationImpl webapplication = new WebapplicationImpl();
		return webapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dbms createDbms() {
		DbmsImpl dbms = new DbmsImpl();
		return dbms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesPackage getToscabasetypesPackage() {
		return (ToscabasetypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToscabasetypesPackage getPackage() {
		return ToscabasetypesPackage.eINSTANCE;
	}

} //ToscabasetypesFactoryImpl
