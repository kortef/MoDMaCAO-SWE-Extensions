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
package openfoam.impl;

import modmacao.ModmacaoPackage;

import openfoam.Cloudserver;
import openfoam.Connectstonfsserver;
import openfoam.Gateway;
import openfoam.Mpiworker;
import openfoam.Nfsclient;
import openfoam.Nfsserver;
import openfoam.Openfoam;
import openfoam.OpenfoamFactory;
import openfoam.OpenfoamPackage;
import openfoam.Publicip;
import openfoam.Storageattachestoserver;
import openfoam.Volume;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.toscabasetypes.ToscabasetypesPackage;

import org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenfoamPackageImpl extends EPackageImpl implements OpenfoamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpiworkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openfoamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfsserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfsclientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageattachestoserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectstonfsserverEClass = null;

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
	 * @see openfoam.OpenfoamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenfoamPackageImpl() {
		super(eNS_URI, OpenfoamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenfoamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenfoamPackage init() {
		if (isInited) return (OpenfoamPackage)EPackage.Registry.INSTANCE.getEPackage(OpenfoamPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenfoamPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenfoamPackageImpl theOpenfoamPackage = registeredOpenfoamPackage instanceof OpenfoamPackageImpl ? (OpenfoamPackageImpl)registeredOpenfoamPackage : new OpenfoamPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModmacaoPackage.eINSTANCE.eClass();
		ToscabasetypesPackage.eINSTANCE.eClass();
		ToscaspecifictypesPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenfoamPackage.createPackageContents();

		// Initialize created meta-data
		theOpenfoamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenfoamPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenfoamPackage.eNS_URI, theOpenfoamPackage);
		return theOpenfoamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMpiworker() {
		return mpiworkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Size() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicip() {
		return publicipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudserver() {
		return cloudserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenfoam() {
		return openfoamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNfsserver() {
		return nfsserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNfsclient() {
		return nfsclientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageattachestoserver() {
		return storageattachestoserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectstonfsserver() {
		return connectstonfsserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenfoamFactory getOpenfoamFactory() {
		return (OpenfoamFactory)getEFactoryInstance();
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
		gatewayEClass = createEClass(GATEWAY);

		mpiworkerEClass = createEClass(MPIWORKER);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__SIZE);

		publicipEClass = createEClass(PUBLICIP);

		cloudserverEClass = createEClass(CLOUDSERVER);

		openfoamEClass = createEClass(OPENFOAM);

		nfsserverEClass = createEClass(NFSSERVER);

		nfsclientEClass = createEClass(NFSCLIENT);

		storageattachestoserverEClass = createEClass(STORAGEATTACHESTOSERVER);

		connectstonfsserverEClass = createEClass(CONNECTSTONFSSERVER);
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
		gatewayEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		gatewayEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mpiworkerEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		mpiworkerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		volumeEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		volumeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		publicipEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		publicipEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cloudserverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		cloudserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		openfoamEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		openfoamEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		nfsserverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		nfsserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		nfsclientEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		nfsclientEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		storageattachestoserverEClass.getESuperTypes().add(theModmacaoPackage.getDependency());
		storageattachestoserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		connectstonfsserverEClass.getESuperTypes().add(theModmacaoPackage.getDependency());
		connectstonfsserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpiworkerEClass, Mpiworker.class, "Mpiworker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Size(), ecorePackage.getEString(), "size", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicipEClass, Publicip.class, "Publicip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudserverEClass, Cloudserver.class, "Cloudserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openfoamEClass, Openfoam.class, "Openfoam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nfsserverEClass, Nfsserver.class, "Nfsserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nfsclientEClass, Nfsclient.class, "Nfsclient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageattachestoserverEClass, Storageattachestoserver.class, "Storageattachestoserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectstonfsserverEClass, Connectstonfsserver.class, "Connectstonfsserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //OpenfoamPackageImpl
