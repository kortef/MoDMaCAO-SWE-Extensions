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
package ossweruntime;

import org.eclipse.cmf.occi.crtp.CrtpPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
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
 * @see ossweruntime.OssweruntimeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore' crtp='http://schemas.ogf.org/occi/infrastructure/compute/template/1.1/ecore' modmacao='http://schemas.modmacao.org/modmacao/ecore' platform='http://schemas.modmacao.org/occi/platform/ecore' placement='http://schemas.modmacao.org/placement/ecore'"
 * @generated
 */
public interface OssweruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ossweruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/openstack/swe/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ossweruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OssweruntimePackage eINSTANCE = ossweruntime.impl.OssweruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_smallImpl <em>Swe small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_smallImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_small()
	 * @generated
	 */
	int SWE_SMALL = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__MIXIN = CrtpPackage.SMALL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__ENTITY = CrtpPackage.SMALL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__ATTRIBUTES = CrtpPackage.SMALL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__OCCI_COMPUTE_CORES = CrtpPackage.SMALL__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__OCCI_COMPUTE_MEMORY = CrtpPackage.SMALL__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL__OPENSTACK_RUNTIME_ID = CrtpPackage.SMALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL_FEATURE_COUNT = CrtpPackage.SMALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_SMALL_OPERATION_COUNT = CrtpPackage.SMALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_mediumImpl <em>Swe medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_mediumImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_medium()
	 * @generated
	 */
	int SWE_MEDIUM = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__MIXIN = CrtpPackage.MEDIUM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__ENTITY = CrtpPackage.MEDIUM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__ATTRIBUTES = CrtpPackage.MEDIUM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__OCCI_COMPUTE_CORES = CrtpPackage.MEDIUM__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__OCCI_COMPUTE_MEMORY = CrtpPackage.MEDIUM__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM__OPENSTACK_RUNTIME_ID = CrtpPackage.MEDIUM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM_FEATURE_COUNT = CrtpPackage.MEDIUM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEDIUM_OPERATION_COUNT = CrtpPackage.MEDIUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_largeImpl <em>Swe large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_largeImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_large()
	 * @generated
	 */
	int SWE_LARGE = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__MIXIN = CrtpPackage.LARGE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__ENTITY = CrtpPackage.LARGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__ATTRIBUTES = CrtpPackage.LARGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__OCCI_COMPUTE_CORES = CrtpPackage.LARGE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__OCCI_COMPUTE_MEMORY = CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE__OPENSTACK_RUNTIME_ID = CrtpPackage.LARGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE_FEATURE_COUNT = CrtpPackage.LARGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_LARGE_OPERATION_COUNT = CrtpPackage.LARGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_mem_smallImpl <em>Swe mem small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_mem_smallImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_small()
	 * @generated
	 */
	int SWE_MEM_SMALL = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__MIXIN = CrtpPackage.MEM_SMALL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__ENTITY = CrtpPackage.MEM_SMALL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__ATTRIBUTES = CrtpPackage.MEM_SMALL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__OCCI_COMPUTE_CORES = CrtpPackage.MEM_SMALL__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__OCCI_COMPUTE_MEMORY = CrtpPackage.MEM_SMALL__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID = CrtpPackage.MEM_SMALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe mem small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL_FEATURE_COUNT = CrtpPackage.MEM_SMALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe mem small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_SMALL_OPERATION_COUNT = CrtpPackage.MEM_SMALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_mem_mediumImpl <em>Swe mem medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_mem_mediumImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_medium()
	 * @generated
	 */
	int SWE_MEM_MEDIUM = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__MIXIN = CrtpPackage.MEM_MEDIUM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__ENTITY = CrtpPackage.MEM_MEDIUM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__ATTRIBUTES = CrtpPackage.MEM_MEDIUM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__OCCI_COMPUTE_CORES = CrtpPackage.MEM_MEDIUM__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__OCCI_COMPUTE_MEMORY = CrtpPackage.MEM_MEDIUM__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM__OPENSTACK_RUNTIME_ID = CrtpPackage.MEM_MEDIUM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe mem medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM_FEATURE_COUNT = CrtpPackage.MEM_MEDIUM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe mem medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_MEDIUM_OPERATION_COUNT = CrtpPackage.MEM_MEDIUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Swe_mem_largeImpl <em>Swe mem large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Swe_mem_largeImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_large()
	 * @generated
	 */
	int SWE_MEM_LARGE = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__MIXIN = CrtpPackage.MEM_LARGE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__ENTITY = CrtpPackage.MEM_LARGE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__ATTRIBUTES = CrtpPackage.MEM_LARGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__OCCI_COMPUTE_CORES = CrtpPackage.MEM_LARGE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__OCCI_COMPUTE_MEMORY = CrtpPackage.MEM_LARGE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = CrtpPackage.MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE__OPENSTACK_RUNTIME_ID = CrtpPackage.MEM_LARGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swe mem large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE_FEATURE_COUNT = CrtpPackage.MEM_LARGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swe mem large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWE_MEM_LARGE_OPERATION_COUNT = CrtpPackage.MEM_LARGE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ossweruntime.impl.Ubuntu_trustytahrImpl <em>Ubuntu trustytahr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Ubuntu_trustytahrImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getUbuntu_trustytahr()
	 * @generated
	 */
	int UBUNTU_TRUSTYTAHR = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR__MIXIN = InfrastructurePackage.OS_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR__ENTITY = InfrastructurePackage.OS_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR__ATTRIBUTES = InfrastructurePackage.OS_TPL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR__OPENSTACK_RUNTIME_ID = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ubuntu trustytahr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR_FEATURE_COUNT = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ubuntu trustytahr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_TRUSTYTAHR_OPERATION_COUNT = InfrastructurePackage.OS_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ossweruntime.impl.Ubuntu_xenialxerusImpl <em>Ubuntu xenialxerus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ossweruntime.impl.Ubuntu_xenialxerusImpl
	 * @see ossweruntime.impl.OssweruntimePackageImpl#getUbuntu_xenialxerus()
	 * @generated
	 */
	int UBUNTU_XENIALXERUS = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS__MIXIN = InfrastructurePackage.OS_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS__ENTITY = InfrastructurePackage.OS_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS__ATTRIBUTES = InfrastructurePackage.OS_TPL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ubuntu xenialxerus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS_FEATURE_COUNT = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ubuntu xenialxerus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBUNTU_XENIALXERUS_OPERATION_COUNT = InfrastructurePackage.OS_TPL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_small <em>Swe small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe small</em>'.
	 * @see ossweruntime.Swe_small
	 * @generated
	 */
	EClass getSwe_small();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_small#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_small#getOpenstackRuntimeId()
	 * @see #getSwe_small()
	 * @generated
	 */
	EAttribute getSwe_small_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_medium <em>Swe medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe medium</em>'.
	 * @see ossweruntime.Swe_medium
	 * @generated
	 */
	EClass getSwe_medium();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_medium#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_medium#getOpenstackRuntimeId()
	 * @see #getSwe_medium()
	 * @generated
	 */
	EAttribute getSwe_medium_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_large <em>Swe large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe large</em>'.
	 * @see ossweruntime.Swe_large
	 * @generated
	 */
	EClass getSwe_large();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_large#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_large#getOpenstackRuntimeId()
	 * @see #getSwe_large()
	 * @generated
	 */
	EAttribute getSwe_large_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_mem_small <em>Swe mem small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe mem small</em>'.
	 * @see ossweruntime.Swe_mem_small
	 * @generated
	 */
	EClass getSwe_mem_small();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_mem_small#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_mem_small#getOpenstackRuntimeId()
	 * @see #getSwe_mem_small()
	 * @generated
	 */
	EAttribute getSwe_mem_small_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_mem_medium <em>Swe mem medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe mem medium</em>'.
	 * @see ossweruntime.Swe_mem_medium
	 * @generated
	 */
	EClass getSwe_mem_medium();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_mem_medium#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_mem_medium#getOpenstackRuntimeId()
	 * @see #getSwe_mem_medium()
	 * @generated
	 */
	EAttribute getSwe_mem_medium_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Swe_mem_large <em>Swe mem large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swe mem large</em>'.
	 * @see ossweruntime.Swe_mem_large
	 * @generated
	 */
	EClass getSwe_mem_large();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Swe_mem_large#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Swe_mem_large#getOpenstackRuntimeId()
	 * @see #getSwe_mem_large()
	 * @generated
	 */
	EAttribute getSwe_mem_large_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Ubuntu_trustytahr <em>Ubuntu trustytahr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubuntu trustytahr</em>'.
	 * @see ossweruntime.Ubuntu_trustytahr
	 * @generated
	 */
	EClass getUbuntu_trustytahr();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Ubuntu_trustytahr#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Ubuntu_trustytahr#getOpenstackRuntimeId()
	 * @see #getUbuntu_trustytahr()
	 * @generated
	 */
	EAttribute getUbuntu_trustytahr_OpenstackRuntimeId();

	/**
	 * Returns the meta object for class '{@link ossweruntime.Ubuntu_xenialxerus <em>Ubuntu xenialxerus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubuntu xenialxerus</em>'.
	 * @see ossweruntime.Ubuntu_xenialxerus
	 * @generated
	 */
	EClass getUbuntu_xenialxerus();

	/**
	 * Returns the meta object for the attribute '{@link ossweruntime.Ubuntu_xenialxerus#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see ossweruntime.Ubuntu_xenialxerus#getOpenstackRuntimeId()
	 * @see #getUbuntu_xenialxerus()
	 * @generated
	 */
	EAttribute getUbuntu_xenialxerus_OpenstackRuntimeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OssweruntimeFactory getOssweruntimeFactory();

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
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_smallImpl <em>Swe small</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_smallImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_small()
		 * @generated
		 */
		EClass SWE_SMALL = eINSTANCE.getSwe_small();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_SMALL__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_small_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_mediumImpl <em>Swe medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_mediumImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_medium()
		 * @generated
		 */
		EClass SWE_MEDIUM = eINSTANCE.getSwe_medium();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_MEDIUM__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_medium_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_largeImpl <em>Swe large</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_largeImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_large()
		 * @generated
		 */
		EClass SWE_LARGE = eINSTANCE.getSwe_large();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_LARGE__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_large_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_mem_smallImpl <em>Swe mem small</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_mem_smallImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_small()
		 * @generated
		 */
		EClass SWE_MEM_SMALL = eINSTANCE.getSwe_mem_small();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_mem_small_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_mem_mediumImpl <em>Swe mem medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_mem_mediumImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_medium()
		 * @generated
		 */
		EClass SWE_MEM_MEDIUM = eINSTANCE.getSwe_mem_medium();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_MEM_MEDIUM__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_mem_medium_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Swe_mem_largeImpl <em>Swe mem large</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Swe_mem_largeImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getSwe_mem_large()
		 * @generated
		 */
		EClass SWE_MEM_LARGE = eINSTANCE.getSwe_mem_large();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWE_MEM_LARGE__OPENSTACK_RUNTIME_ID = eINSTANCE.getSwe_mem_large_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Ubuntu_trustytahrImpl <em>Ubuntu trustytahr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Ubuntu_trustytahrImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getUbuntu_trustytahr()
		 * @generated
		 */
		EClass UBUNTU_TRUSTYTAHR = eINSTANCE.getUbuntu_trustytahr();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBUNTU_TRUSTYTAHR__OPENSTACK_RUNTIME_ID = eINSTANCE.getUbuntu_trustytahr_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '{@link ossweruntime.impl.Ubuntu_xenialxerusImpl <em>Ubuntu xenialxerus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ossweruntime.impl.Ubuntu_xenialxerusImpl
		 * @see ossweruntime.impl.OssweruntimePackageImpl#getUbuntu_xenialxerus()
		 * @generated
		 */
		EClass UBUNTU_XENIALXERUS = eINSTANCE.getUbuntu_xenialxerus();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID = eINSTANCE.getUbuntu_xenialxerus_OpenstackRuntimeId();

	}

} //OssweruntimePackage
