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
package openfoam.util;

import modmacao.Component;

import modmacao.Dependency;
import openfoam.*;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see openfoam.OpenfoamPackage
 * @generated
 */
public class OpenfoamAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenfoamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenfoamAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenfoamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenfoamSwitch<Adapter> modelSwitch =
		new OpenfoamSwitch<Adapter>() {
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseMpiworker(Mpiworker object) {
				return createMpiworkerAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter casePublicip(Publicip object) {
				return createPublicipAdapter();
			}
			@Override
			public Adapter caseCloudserver(Cloudserver object) {
				return createCloudserverAdapter();
			}
			@Override
			public Adapter caseOpenfoam(Openfoam object) {
				return createOpenfoamAdapter();
			}
			@Override
			public Adapter caseNfsserver(Nfsserver object) {
				return createNfsserverAdapter();
			}
			@Override
			public Adapter caseNfsclient(Nfsclient object) {
				return createNfsclientAdapter();
			}
			@Override
			public Adapter caseStorageattachestoserver(Storageattachestoserver object) {
				return createStorageattachestoserverAdapter();
			}
			@Override
			public Adapter caseConnectstonfsserver(Connectstonfsserver object) {
				return createConnectstonfsserverAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Mpiworker <em>Mpiworker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Mpiworker
	 * @generated
	 */
	public Adapter createMpiworkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Publicip <em>Publicip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Publicip
	 * @generated
	 */
	public Adapter createPublicipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Cloudserver <em>Cloudserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Cloudserver
	 * @generated
	 */
	public Adapter createCloudserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Openfoam <em>Openfoam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Openfoam
	 * @generated
	 */
	public Adapter createOpenfoamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Nfsserver <em>Nfsserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Nfsserver
	 * @generated
	 */
	public Adapter createNfsserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Nfsclient <em>Nfsclient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Nfsclient
	 * @generated
	 */
	public Adapter createNfsclientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Storageattachestoserver <em>Storageattachestoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Storageattachestoserver
	 * @generated
	 */
	public Adapter createStorageattachestoserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openfoam.Connectstonfsserver <em>Connectstonfsserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openfoam.Connectstonfsserver
	 * @generated
	 */
	public Adapter createConnectstonfsserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenfoamAdapterFactory
