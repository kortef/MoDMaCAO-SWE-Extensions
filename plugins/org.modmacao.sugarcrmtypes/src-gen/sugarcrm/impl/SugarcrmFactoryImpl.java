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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sugarcrm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SugarcrmFactoryImpl extends EFactoryImpl implements SugarcrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SugarcrmFactory init() {
		try {
			SugarcrmFactory theSugarcrmFactory = (SugarcrmFactory)EPackage.Registry.INSTANCE.getEFactory(SugarcrmPackage.eNS_URI);
			if (theSugarcrmFactory != null) {
				return theSugarcrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SugarcrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SugarcrmFactoryImpl() {
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
			case SugarcrmPackage.SUGARCRMAPPLICATION: return createSugarcrmapplication();
			case SugarcrmPackage.SUGARCRMDATABASE: return createSugarcrmdatabase();
			case SugarcrmPackage.SUGARCRMDATABASECONNECTION: return createSugarcrmdatabaseconnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sugarcrmapplication createSugarcrmapplication() {
		SugarcrmapplicationImpl sugarcrmapplication = new SugarcrmapplicationImpl();
		return sugarcrmapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sugarcrmdatabase createSugarcrmdatabase() {
		SugarcrmdatabaseImpl sugarcrmdatabase = new SugarcrmdatabaseImpl();
		return sugarcrmdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sugarcrmdatabaseconnection createSugarcrmdatabaseconnection() {
		SugarcrmdatabaseconnectionImpl sugarcrmdatabaseconnection = new SugarcrmdatabaseconnectionImpl();
		return sugarcrmdatabaseconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SugarcrmPackage getSugarcrmPackage() {
		return (SugarcrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SugarcrmPackage getPackage() {
		return SugarcrmPackage.eINSTANCE;
	}

} //SugarcrmFactoryImpl
