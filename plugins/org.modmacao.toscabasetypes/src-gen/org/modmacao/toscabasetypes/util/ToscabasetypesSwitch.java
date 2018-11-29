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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modmacao.toscabasetypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage
 * @generated
 */
public class ToscabasetypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscabasetypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesSwitch() {
		if (modelPackage == null) {
			modelPackage = ToscabasetypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ToscabasetypesPackage.ROOTNODETYPE: {
				Rootnodetype rootnodetype = (Rootnodetype)theEObject;
				T result = caseRootnodetype(rootnodetype);
				if (result == null) result = caseComponent(rootnodetype);
				if (result == null) result = caseMixinBase(rootnodetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.TIER: {
				Tier tier = (Tier)theEObject;
				T result = caseTier(tier);
				if (result == null) result = caseComponent(tier);
				if (result == null) result = caseMixinBase(tier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.SINGLENODETIER: {
				Singlenodetier singlenodetier = (Singlenodetier)theEObject;
				T result = caseSinglenodetier(singlenodetier);
				if (result == null) result = caseComponent(singlenodetier);
				if (result == null) result = caseMixinBase(singlenodetier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.SCALABLETIER: {
				Scalabletier scalabletier = (Scalabletier)theEObject;
				T result = caseScalabletier(scalabletier);
				if (result == null) result = caseComponent(scalabletier);
				if (result == null) result = caseMixinBase(scalabletier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseComponent(server);
				if (result == null) result = caseMixinBase(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.OPERATINGSYSTEM: {
				Operatingsystem operatingsystem = (Operatingsystem)theEObject;
				T result = caseOperatingsystem(operatingsystem);
				if (result == null) result = caseComponent(operatingsystem);
				if (result == null) result = caseMixinBase(operatingsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.WEBSERVER: {
				Webserver webserver = (Webserver)theEObject;
				T result = caseWebserver(webserver);
				if (result == null) result = caseComponent(webserver);
				if (result == null) result = caseMixinBase(webserver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.WEBAPPLICATION: {
				Webapplication webapplication = (Webapplication)theEObject;
				T result = caseWebapplication(webapplication);
				if (result == null) result = caseComponent(webapplication);
				if (result == null) result = caseMixinBase(webapplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.DBMS: {
				Dbms dbms = (Dbms)theEObject;
				T result = caseDbms(dbms);
				if (result == null) result = caseComponent(dbms);
				if (result == null) result = caseMixinBase(dbms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscabasetypesPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseComponent(database);
				if (result == null) result = caseMixinBase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rootnodetype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rootnodetype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootnodetype(Rootnodetype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTier(Tier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singlenodetier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singlenodetier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglenodetier(Singlenodetier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalabletier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalabletier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalabletier(Scalabletier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operatingsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operatingsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingsystem(Operatingsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Webserver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Webserver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebserver(Webserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Webapplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Webapplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebapplication(Webapplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dbms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dbms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbms(Dbms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ToscabasetypesSwitch
