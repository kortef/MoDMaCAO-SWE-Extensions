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
package org.modmacao.toscabasetypes.util;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modmacao.toscabasetypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage
 * @generated
 */
public class ToscabasetypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscabasetypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToscabasetypesPackage.eINSTANCE;
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
	protected ToscabasetypesSwitch<Adapter> modelSwitch =
		new ToscabasetypesSwitch<Adapter>() {
			@Override
			public Adapter caseRootnodetype(Rootnodetype object) {
				return createRootnodetypeAdapter();
			}
			@Override
			public Adapter caseTier(Tier object) {
				return createTierAdapter();
			}
			@Override
			public Adapter caseSinglenodetier(Singlenodetier object) {
				return createSinglenodetierAdapter();
			}
			@Override
			public Adapter caseScalabletier(Scalabletier object) {
				return createScalabletierAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseOperatingsystem(Operatingsystem object) {
				return createOperatingsystemAdapter();
			}
			@Override
			public Adapter caseWebserver(Webserver object) {
				return createWebserverAdapter();
			}
			@Override
			public Adapter caseWebapplication(Webapplication object) {
				return createWebapplicationAdapter();
			}
			@Override
			public Adapter caseDbms(Dbms object) {
				return createDbmsAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Rootnodetype <em>Rootnodetype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Rootnodetype
	 * @generated
	 */
	public Adapter createRootnodetypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Tier
	 * @generated
	 */
	public Adapter createTierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Singlenodetier <em>Singlenodetier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Singlenodetier
	 * @generated
	 */
	public Adapter createSinglenodetierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Scalabletier <em>Scalabletier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Scalabletier
	 * @generated
	 */
	public Adapter createScalabletierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Operatingsystem <em>Operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Operatingsystem
	 * @generated
	 */
	public Adapter createOperatingsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Webserver <em>Webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Webserver
	 * @generated
	 */
	public Adapter createWebserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Webapplication <em>Webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Webapplication
	 * @generated
	 */
	public Adapter createWebapplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Dbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Dbms
	 * @generated
	 */
	public Adapter createDbmsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscabasetypes.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscabasetypes.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
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

} //ToscabasetypesAdapterFactory
