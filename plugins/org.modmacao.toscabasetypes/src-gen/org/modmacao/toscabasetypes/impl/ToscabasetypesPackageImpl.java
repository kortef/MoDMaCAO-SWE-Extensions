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

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;

import org.modmacao.placement.PlacementPackage;

import org.modmacao.toscabasetypes.Database;
import org.modmacao.toscabasetypes.Dbms;
import org.modmacao.toscabasetypes.Operatingsystem;
import org.modmacao.toscabasetypes.Rootnodetype;
import org.modmacao.toscabasetypes.Scalabletier;
import org.modmacao.toscabasetypes.Server;
import org.modmacao.toscabasetypes.Singlenodetier;
import org.modmacao.toscabasetypes.Tier;
import org.modmacao.toscabasetypes.ToscabasetypesFactory;
import org.modmacao.toscabasetypes.ToscabasetypesPackage;
import org.modmacao.toscabasetypes.Webapplication;
import org.modmacao.toscabasetypes.Webserver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscabasetypesPackageImpl extends EPackageImpl implements ToscabasetypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootnodetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlenodetierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalabletierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webapplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToscabasetypesPackageImpl() {
		super(eNS_URI, ToscabasetypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ToscabasetypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToscabasetypesPackage init() {
		if (isInited) return (ToscabasetypesPackage)EPackage.Registry.INSTANCE.getEPackage(ToscabasetypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredToscabasetypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ToscabasetypesPackageImpl theToscabasetypesPackage = registeredToscabasetypesPackage instanceof ToscabasetypesPackageImpl ? (ToscabasetypesPackageImpl)registeredToscabasetypesPackage : new ToscabasetypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToscabasetypesPackage.createPackageContents();

		// Initialize created meta-data
		theToscabasetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToscabasetypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToscabasetypesPackage.eNS_URI, theToscabasetypesPackage);
		return theToscabasetypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootnodetype() {
		return rootnodetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTier() {
		return tierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglenodetier() {
		return singlenodetierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalabletier() {
		return scalabletierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_NumCpus() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Memory() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingsystem() {
		return operatingsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebserver() {
		return webserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebapplication() {
		return webapplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbms() {
		return dbmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesFactory getToscabasetypesFactory() {
		return (ToscabasetypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootnodetypeEClass = createEClass(ROOTNODETYPE);

		tierEClass = createEClass(TIER);

		singlenodetierEClass = createEClass(SINGLENODETIER);

		scalabletierEClass = createEClass(SCALABLETIER);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__NUM_CPUS);
		createEAttribute(serverEClass, SERVER__MEMORY);

		operatingsystemEClass = createEClass(OPERATINGSYSTEM);

		webserverEClass = createEClass(WEBSERVER);

		webapplicationEClass = createEClass(WEBAPPLICATION);

		dbmsEClass = createEClass(DBMS);

		databaseEClass = createEClass(DATABASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModmacaoPackage theModmacaoPackage = (ModmacaoPackage)EPackage.Registry.INSTANCE.getEPackage(ModmacaoPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootnodetypeEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		rootnodetypeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tierEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		tierEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		singlenodetierEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		singlenodetierEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		scalabletierEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		scalabletierEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		serverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		serverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		operatingsystemEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		operatingsystemEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		webserverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		webserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		webapplicationEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		webapplicationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dbmsEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		dbmsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		databaseEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		databaseEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootnodetypeEClass, Rootnodetype.class, "Rootnodetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tierEClass, Tier.class, "Tier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singlenodetierEClass, Singlenodetier.class, "Singlenodetier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalabletierEClass, Scalabletier.class, "Scalabletier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_NumCpus(), ecorePackage.getEInt(), "numCpus", "1", 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Memory(), ecorePackage.getEInt(), "memory", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingsystemEClass, Operatingsystem.class, "Operatingsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webserverEClass, Webserver.class, "Webserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webapplicationEClass, Webapplication.class, "Webapplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbmsEClass, Dbms.class, "Dbms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //ToscabasetypesPackageImpl
