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
package ossweruntime.impl;

import modmacao.ModmacaoPackage;
import openstackruntime.OpenstackruntimePackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.crtp.CrtpPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;
import org.modmacao.placement.PlacementPackage;
import ossweruntime.OssweruntimeFactory;
import ossweruntime.OssweruntimePackage;
import ossweruntime.Swe_large;
import ossweruntime.Swe_medium;
import ossweruntime.Swe_mem_large;
import ossweruntime.Swe_mem_medium;
import ossweruntime.Swe_mem_small;
import ossweruntime.Swe_small;
import ossweruntime.Ubuntu_trustytahr;
import ossweruntime.Ubuntu_xenialxerus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OssweruntimePackageImpl extends EPackageImpl implements OssweruntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_mem_smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_mem_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swe_mem_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubuntu_trustytahrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubuntu_xenialxerusEClass = null;

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
	 * @see ossweruntime.OssweruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OssweruntimePackageImpl() {
		super(eNS_URI, OssweruntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OssweruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OssweruntimePackage init() {
		if (isInited) return (OssweruntimePackage)EPackage.Registry.INSTANCE.getEPackage(OssweruntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOssweruntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OssweruntimePackageImpl theOssweruntimePackage = registeredOssweruntimePackage instanceof OssweruntimePackageImpl ? (OssweruntimePackageImpl)registeredOssweruntimePackage : new OssweruntimePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		CrtpPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOssweruntimePackage.createPackageContents();

		// Initialize created meta-data
		theOssweruntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOssweruntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OssweruntimePackage.eNS_URI, theOssweruntimePackage);
		return theOssweruntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_small() {
		return swe_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_small_OpenstackRuntimeId() {
		return (EAttribute)swe_smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_medium() {
		return swe_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_medium_OpenstackRuntimeId() {
		return (EAttribute)swe_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_large() {
		return swe_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_large_OpenstackRuntimeId() {
		return (EAttribute)swe_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_mem_small() {
		return swe_mem_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_mem_small_OpenstackRuntimeId() {
		return (EAttribute)swe_mem_smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_mem_medium() {
		return swe_mem_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_mem_medium_OpenstackRuntimeId() {
		return (EAttribute)swe_mem_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwe_mem_large() {
		return swe_mem_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwe_mem_large_OpenstackRuntimeId() {
		return (EAttribute)swe_mem_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbuntu_trustytahr() {
		return ubuntu_trustytahrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbuntu_trustytahr_OpenstackRuntimeId() {
		return (EAttribute)ubuntu_trustytahrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbuntu_xenialxerus() {
		return ubuntu_xenialxerusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbuntu_xenialxerus_OpenstackRuntimeId() {
		return (EAttribute)ubuntu_xenialxerusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OssweruntimeFactory getOssweruntimeFactory() {
		return (OssweruntimeFactory)getEFactoryInstance();
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
		swe_smallEClass = createEClass(SWE_SMALL);
		createEAttribute(swe_smallEClass, SWE_SMALL__OPENSTACK_RUNTIME_ID);

		swe_mediumEClass = createEClass(SWE_MEDIUM);
		createEAttribute(swe_mediumEClass, SWE_MEDIUM__OPENSTACK_RUNTIME_ID);

		swe_largeEClass = createEClass(SWE_LARGE);
		createEAttribute(swe_largeEClass, SWE_LARGE__OPENSTACK_RUNTIME_ID);

		swe_mem_smallEClass = createEClass(SWE_MEM_SMALL);
		createEAttribute(swe_mem_smallEClass, SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID);

		swe_mem_mediumEClass = createEClass(SWE_MEM_MEDIUM);
		createEAttribute(swe_mem_mediumEClass, SWE_MEM_MEDIUM__OPENSTACK_RUNTIME_ID);

		swe_mem_largeEClass = createEClass(SWE_MEM_LARGE);
		createEAttribute(swe_mem_largeEClass, SWE_MEM_LARGE__OPENSTACK_RUNTIME_ID);

		ubuntu_trustytahrEClass = createEClass(UBUNTU_TRUSTYTAHR);
		createEAttribute(ubuntu_trustytahrEClass, UBUNTU_TRUSTYTAHR__OPENSTACK_RUNTIME_ID);

		ubuntu_xenialxerusEClass = createEClass(UBUNTU_XENIALXERUS);
		createEAttribute(ubuntu_xenialxerusEClass, UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID);
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
		CrtpPackage theCrtpPackage = (CrtpPackage)EPackage.Registry.INSTANCE.getEPackage(CrtpPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		swe_smallEClass.getESuperTypes().add(theCrtpPackage.getSmall());
		swe_smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swe_mediumEClass.getESuperTypes().add(theCrtpPackage.getMedium());
		swe_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swe_largeEClass.getESuperTypes().add(theCrtpPackage.getLarge());
		swe_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swe_mem_smallEClass.getESuperTypes().add(theCrtpPackage.getMem_small());
		swe_mem_smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swe_mem_mediumEClass.getESuperTypes().add(theCrtpPackage.getMem_medium());
		swe_mem_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swe_mem_largeEClass.getESuperTypes().add(theCrtpPackage.getMem_large());
		swe_mem_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ubuntu_trustytahrEClass.getESuperTypes().add(theInfrastructurePackage.getOs_tpl());
		ubuntu_trustytahrEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ubuntu_xenialxerusEClass.getESuperTypes().add(theInfrastructurePackage.getOs_tpl());
		ubuntu_xenialxerusEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(swe_smallEClass, Swe_small.class, "Swe_small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_small_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "a6d239e1-4082-4044-9de9-474bee2152bb", 1, 1, Swe_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swe_mediumEClass, Swe_medium.class, "Swe_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_medium_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "9ed5ac24-d1e7-4665-9c22-318561733f42", 1, 1, Swe_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swe_largeEClass, Swe_large.class, "Swe_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_large_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "ce8c33af-0cd5-4aac-b6f3-fcde58c4b262", 1, 1, Swe_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swe_mem_smallEClass, Swe_mem_small.class, "Swe_mem_small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_mem_small_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "7ae43f3f-4f39-4855-8a42-8d1f7e26bc0a", 1, 1, Swe_mem_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swe_mem_mediumEClass, Swe_mem_medium.class, "Swe_mem_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_mem_medium_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "553402b5-e36c-47b4-b2bf-7ecc8be4a4b5", 1, 1, Swe_mem_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swe_mem_largeEClass, Swe_mem_large.class, "Swe_mem_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwe_mem_large_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "7720ef3e-b585-4edf-860a-a60ba72c5ecc", 1, 1, Swe_mem_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubuntu_trustytahrEClass, Ubuntu_trustytahr.class, "Ubuntu_trustytahr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbuntu_trustytahr_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "adf63ddc-debe-4d7e-b899-b936e989439f", 1, 1, Ubuntu_trustytahr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubuntu_xenialxerusEClass, Ubuntu_xenialxerus.class, "Ubuntu_xenialxerus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbuntu_xenialxerus_OpenstackRuntimeId(), theOCCIPackage.getString(), "openstackRuntimeId", "5437eae8-7c47-4834-929c-a314de77d291", 1, 1, Ubuntu_xenialxerus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
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
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "occi", "http://schemas.ogf.org/occi/core/ecore",
			   "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore",
			   "crtp", "http://schemas.ogf.org/occi/infrastructure/compute/template/1.1/ecore",
			   "modmacao", "http://schemas.modmacao.org/modmacao/ecore",
			   "platform", "http://schemas.modmacao.org/occi/platform/ecore",
			   "placement", "http://schemas.modmacao.org/placement/ecore"
		   });
	}

} //OssweruntimePackageImpl
