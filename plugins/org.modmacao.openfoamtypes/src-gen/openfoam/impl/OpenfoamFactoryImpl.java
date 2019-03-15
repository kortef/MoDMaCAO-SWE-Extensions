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

import openfoam.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenfoamFactoryImpl extends EFactoryImpl implements OpenfoamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenfoamFactory init() {
		try {
			OpenfoamFactory theOpenfoamFactory = (OpenfoamFactory)EPackage.Registry.INSTANCE.getEFactory(OpenfoamPackage.eNS_URI);
			if (theOpenfoamFactory != null) {
				return theOpenfoamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenfoamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenfoamFactoryImpl() {
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
			case OpenfoamPackage.GATEWAY: return createGateway();
			case OpenfoamPackage.MPIWORKER: return createMpiworker();
			case OpenfoamPackage.VOLUME: return createVolume();
			case OpenfoamPackage.PUBLICIP: return createPublicip();
			case OpenfoamPackage.CLOUDSERVER: return createCloudserver();
			case OpenfoamPackage.OPENFOAM: return createOpenfoam();
			case OpenfoamPackage.NFSSERVER: return createNfsserver();
			case OpenfoamPackage.NFSCLIENT: return createNfsclient();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mpiworker createMpiworker() {
		MpiworkerImpl mpiworker = new MpiworkerImpl();
		return mpiworker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicip createPublicip() {
		PublicipImpl publicip = new PublicipImpl();
		return publicip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudserver createCloudserver() {
		CloudserverImpl cloudserver = new CloudserverImpl();
		return cloudserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openfoam createOpenfoam() {
		OpenfoamImpl openfoam = new OpenfoamImpl();
		return openfoam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nfsserver createNfsserver() {
		NfsserverImpl nfsserver = new NfsserverImpl();
		return nfsserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nfsclient createNfsclient() {
		NfsclientImpl nfsclient = new NfsclientImpl();
		return nfsclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenfoamPackage getOpenfoamPackage() {
		return (OpenfoamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenfoamPackage getPackage() {
		return OpenfoamPackage.eINSTANCE;
	}

} //OpenfoamFactoryImpl
