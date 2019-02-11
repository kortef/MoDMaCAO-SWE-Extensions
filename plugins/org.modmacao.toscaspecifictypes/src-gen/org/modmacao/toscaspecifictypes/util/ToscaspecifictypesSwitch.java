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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modmacao.toscaspecifictypes.*;

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
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage
 * @generated
 */
public class ToscaspecifictypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaspecifictypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaspecifictypesSwitch() {
		if (modelPackage == null) {
			modelPackage = ToscaspecifictypesPackage.eINSTANCE;
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
			case ToscaspecifictypesPackage.APACHEWEBSERVER: {
				Apachewebserver apachewebserver = (Apachewebserver)theEObject;
				T result = caseApachewebserver(apachewebserver);
				if (result == null) result = caseComponent(apachewebserver);
				if (result == null) result = caseMixinBase(apachewebserver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.APACHEWEBAPPLICATION: {
				Apachewebapplication apachewebapplication = (Apachewebapplication)theEObject;
				T result = caseApachewebapplication(apachewebapplication);
				if (result == null) result = caseComponent(apachewebapplication);
				if (result == null) result = caseMixinBase(apachewebapplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.APACHEMODULE: {
				Apachemodule apachemodule = (Apachemodule)theEObject;
				T result = caseApachemodule(apachemodule);
				if (result == null) result = caseComponent(apachemodule);
				if (result == null) result = caseMixinBase(apachemodule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.APACHEPHPMODULE: {
				Apachephpmodule apachephpmodule = (Apachephpmodule)theEObject;
				T result = caseApachephpmodule(apachephpmodule);
				if (result == null) result = caseComponent(apachephpmodule);
				if (result == null) result = caseMixinBase(apachephpmodule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.MYSQL: {
				Mysql mysql = (Mysql)theEObject;
				T result = caseMysql(mysql);
				if (result == null) result = caseComponent(mysql);
				if (result == null) result = caseMixinBase(mysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.MYSQLDATABASE: {
				Mysqldatabase mysqldatabase = (Mysqldatabase)theEObject;
				T result = caseMysqldatabase(mysqldatabase);
				if (result == null) result = caseComponent(mysqldatabase);
				if (result == null) result = caseMixinBase(mysqldatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.MYSQLDATABASEHOSTEDONMYSQL: {
				Mysqldatabasehostedonmysql mysqldatabasehostedonmysql = (Mysqldatabasehostedonmysql)theEObject;
				T result = caseMysqldatabasehostedonmysql(mysqldatabasehostedonmysql);
				if (result == null) result = caseDependency(mysqldatabasehostedonmysql);
				if (result == null) result = caseMixinBase(mysqldatabasehostedonmysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaspecifictypesPackage.MYSQLDATABASECONNECTION: {
				Mysqldatabaseconnection mysqldatabaseconnection = (Mysqldatabaseconnection)theEObject;
				T result = caseMysqldatabaseconnection(mysqldatabaseconnection);
				if (result == null) result = caseDependency(mysqldatabaseconnection);
				if (result == null) result = caseMixinBase(mysqldatabaseconnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apachewebserver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apachewebserver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApachewebserver(Apachewebserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apachewebapplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apachewebapplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApachewebapplication(Apachewebapplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apachemodule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apachemodule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApachemodule(Apachemodule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apachephpmodule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apachephpmodule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApachephpmodule(Apachephpmodule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMysql(Mysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mysqldatabase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mysqldatabase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMysqldatabase(Mysqldatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mysqldatabasehostedonmysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mysqldatabasehostedonmysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMysqldatabasehostedonmysql(Mysqldatabasehostedonmysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mysqldatabaseconnection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mysqldatabaseconnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMysqldatabaseconnection(Mysqldatabaseconnection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
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

} //ToscaspecifictypesSwitch
