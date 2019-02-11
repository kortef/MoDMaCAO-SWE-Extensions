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
package org.modmacao.toscaspecifictypes.util;

import modmacao.Component;

import modmacao.Dependency;
import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modmacao.toscaspecifictypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage
 * @generated
 */
public class ToscaspecifictypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaspecifictypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaspecifictypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToscaspecifictypesPackage.eINSTANCE;
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
	protected ToscaspecifictypesSwitch<Adapter> modelSwitch =
		new ToscaspecifictypesSwitch<Adapter>() {
			@Override
			public Adapter caseApachewebserver(Apachewebserver object) {
				return createApachewebserverAdapter();
			}
			@Override
			public Adapter caseApachewebapplication(Apachewebapplication object) {
				return createApachewebapplicationAdapter();
			}
			@Override
			public Adapter caseApachemodule(Apachemodule object) {
				return createApachemoduleAdapter();
			}
			@Override
			public Adapter caseApachephpmodule(Apachephpmodule object) {
				return createApachephpmoduleAdapter();
			}
			@Override
			public Adapter caseMysql(Mysql object) {
				return createMysqlAdapter();
			}
			@Override
			public Adapter caseMysqldatabase(Mysqldatabase object) {
				return createMysqldatabaseAdapter();
			}
			@Override
			public Adapter caseMysqldatabasehostedonmysql(Mysqldatabasehostedonmysql object) {
				return createMysqldatabasehostedonmysqlAdapter();
			}
			@Override
			public Adapter caseMysqldatabaseconnection(Mysqldatabaseconnection object) {
				return createMysqldatabaseconnectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Apachewebserver <em>Apachewebserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Apachewebserver
	 * @generated
	 */
	public Adapter createApachewebserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Apachewebapplication <em>Apachewebapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Apachewebapplication
	 * @generated
	 */
	public Adapter createApachewebapplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Apachemodule <em>Apachemodule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Apachemodule
	 * @generated
	 */
	public Adapter createApachemoduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Apachephpmodule <em>Apachephpmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Apachephpmodule
	 * @generated
	 */
	public Adapter createApachephpmoduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Mysql <em>Mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Mysql
	 * @generated
	 */
	public Adapter createMysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Mysqldatabase <em>Mysqldatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabase
	 * @generated
	 */
	public Adapter createMysqldatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Mysqldatabasehostedonmysql <em>Mysqldatabasehostedonmysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabasehostedonmysql
	 * @generated
	 */
	public Adapter createMysqldatabasehostedonmysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.toscaspecifictypes.Mysqldatabaseconnection <em>Mysqldatabaseconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.toscaspecifictypes.Mysqldatabaseconnection
	 * @generated
	 */
	public Adapter createMysqldatabaseconnectionAdapter() {
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

} //ToscaspecifictypesAdapterFactory
