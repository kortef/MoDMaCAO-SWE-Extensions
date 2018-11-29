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
package sugarcrm.impl;

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;

import org.modmacao.placement.PlacementPackage;

import org.modmacao.toscabasetypes.ToscabasetypesPackage;

import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

import sugarcrm.SugarcrmFactory;
import sugarcrm.SugarcrmPackage;
import sugarcrm.Sugarcrmapplication;
import sugarcrm.Sugarcrmdatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SugarcrmPackageImpl extends EPackageImpl implements SugarcrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sugarcrmapplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sugarcrmdatabaseEClass = null;

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
	 * @see sugarcrm.SugarcrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SugarcrmPackageImpl() {
		super(eNS_URI, SugarcrmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SugarcrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SugarcrmPackage init() {
		if (isInited) return (SugarcrmPackage)EPackage.Registry.INSTANCE.getEPackage(SugarcrmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSugarcrmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SugarcrmPackageImpl theSugarcrmPackage = registeredSugarcrmPackage instanceof SugarcrmPackageImpl ? (SugarcrmPackageImpl)registeredSugarcrmPackage : new SugarcrmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		ToscabasetypesPackage.eINSTANCE.eClass();
		ToscaspecifictypesPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSugarcrmPackage.createPackageContents();

		// Initialize created meta-data
		theSugarcrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSugarcrmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SugarcrmPackage.eNS_URI, theSugarcrmPackage);
		return theSugarcrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSugarcrmapplication() {
		return sugarcrmapplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmapplication_AdminUser() {
		return (EAttribute)sugarcrmapplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmapplication_AdminPassword() {
		return (EAttribute)sugarcrmapplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmapplication_SiteName() {
		return (EAttribute)sugarcrmapplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmapplication_SitePath() {
		return (EAttribute)sugarcrmapplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSugarcrmdatabase() {
		return sugarcrmdatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmdatabase_DBName() {
		return (EAttribute)sugarcrmdatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmdatabase_DBUser() {
		return (EAttribute)sugarcrmdatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmdatabase_DBPassword() {
		return (EAttribute)sugarcrmdatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSugarcrmdatabase_DBPort() {
		return (EAttribute)sugarcrmdatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SugarcrmFactory getSugarcrmFactory() {
		return (SugarcrmFactory)getEFactoryInstance();
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
		sugarcrmapplicationEClass = createEClass(SUGARCRMAPPLICATION);
		createEAttribute(sugarcrmapplicationEClass, SUGARCRMAPPLICATION__ADMIN_USER);
		createEAttribute(sugarcrmapplicationEClass, SUGARCRMAPPLICATION__ADMIN_PASSWORD);
		createEAttribute(sugarcrmapplicationEClass, SUGARCRMAPPLICATION__SITE_NAME);
		createEAttribute(sugarcrmapplicationEClass, SUGARCRMAPPLICATION__SITE_PATH);

		sugarcrmdatabaseEClass = createEClass(SUGARCRMDATABASE);
		createEAttribute(sugarcrmdatabaseEClass, SUGARCRMDATABASE__DB_NAME);
		createEAttribute(sugarcrmdatabaseEClass, SUGARCRMDATABASE__DB_USER);
		createEAttribute(sugarcrmdatabaseEClass, SUGARCRMDATABASE__DB_PASSWORD);
		createEAttribute(sugarcrmdatabaseEClass, SUGARCRMDATABASE__DB_PORT);
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
		sugarcrmapplicationEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		sugarcrmapplicationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sugarcrmdatabaseEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		sugarcrmdatabaseEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(sugarcrmapplicationEClass, Sugarcrmapplication.class, "Sugarcrmapplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSugarcrmapplication_AdminUser(), ecorePackage.getEString(), "adminUser", "admin", 0, 1, Sugarcrmapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmapplication_AdminPassword(), ecorePackage.getEString(), "adminPassword", "admin", 0, 1, Sugarcrmapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmapplication_SiteName(), ecorePackage.getEString(), "siteName", "SugarCRM", 0, 1, Sugarcrmapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmapplication_SitePath(), ecorePackage.getEString(), "sitePath", "sugarcrm", 0, 1, Sugarcrmapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sugarcrmdatabaseEClass, Sugarcrmdatabase.class, "Sugarcrmdatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSugarcrmdatabase_DBName(), ecorePackage.getEString(), "dBName", "sugarcrm", 0, 1, Sugarcrmdatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmdatabase_DBUser(), ecorePackage.getEString(), "dBUser", "sugarcrm", 0, 1, Sugarcrmdatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmdatabase_DBPassword(), ecorePackage.getEString(), "dBPassword", "sugarcrm", 0, 1, Sugarcrmdatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSugarcrmdatabase_DBPort(), ecorePackage.getEInt(), "dBPort", "3306", 0, 1, Sugarcrmdatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //SugarcrmPackageImpl
