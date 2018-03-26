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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ossweruntime.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OssweruntimeFactoryImpl extends EFactoryImpl implements OssweruntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OssweruntimeFactory init() {
		try {
			OssweruntimeFactory theOssweruntimeFactory = (OssweruntimeFactory)EPackage.Registry.INSTANCE.getEFactory(OssweruntimePackage.eNS_URI);
			if (theOssweruntimeFactory != null) {
				return theOssweruntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OssweruntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OssweruntimeFactoryImpl() {
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
			case OssweruntimePackage.SWE_SMALL: return createSwe_small();
			case OssweruntimePackage.SWE_MEDIUM: return createSwe_medium();
			case OssweruntimePackage.SWE_LARGE: return createSwe_large();
			case OssweruntimePackage.SWE_MEM_SMALL: return createSwe_mem_small();
			case OssweruntimePackage.SWE_MEM_MEDIUM: return createSwe_mem_medium();
			case OssweruntimePackage.SWE_MEM_LARGE: return createSwe_mem_large();
			case OssweruntimePackage.UBUNTU_TRUSTYTAHR: return createUbuntu_trustytahr();
			case OssweruntimePackage.UBUNTU_XENIALXERUS: return createUbuntu_xenialxerus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_small createSwe_small() {
		Swe_smallImpl swe_small = new Swe_smallImpl();
		return swe_small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_medium createSwe_medium() {
		Swe_mediumImpl swe_medium = new Swe_mediumImpl();
		return swe_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_large createSwe_large() {
		Swe_largeImpl swe_large = new Swe_largeImpl();
		return swe_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_mem_small createSwe_mem_small() {
		Swe_mem_smallImpl swe_mem_small = new Swe_mem_smallImpl();
		return swe_mem_small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_mem_medium createSwe_mem_medium() {
		Swe_mem_mediumImpl swe_mem_medium = new Swe_mem_mediumImpl();
		return swe_mem_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_mem_large createSwe_mem_large() {
		Swe_mem_largeImpl swe_mem_large = new Swe_mem_largeImpl();
		return swe_mem_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ubuntu_trustytahr createUbuntu_trustytahr() {
		Ubuntu_trustytahrImpl ubuntu_trustytahr = new Ubuntu_trustytahrImpl();
		return ubuntu_trustytahr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ubuntu_xenialxerus createUbuntu_xenialxerus() {
		Ubuntu_xenialxerusImpl ubuntu_xenialxerus = new Ubuntu_xenialxerusImpl();
		return ubuntu_xenialxerus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OssweruntimePackage getOssweruntimePackage() {
		return (OssweruntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OssweruntimePackage getPackage() {
		return OssweruntimePackage.eINSTANCE;
	}

} //OssweruntimeFactoryImpl
