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
package ossweruntime.util;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Mem_large;
import org.eclipse.cmf.occi.crtp.Mem_medium;
import org.eclipse.cmf.occi.crtp.Mem_small;
import org.eclipse.cmf.occi.crtp.Small;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ossweruntime.*;

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
 * @see ossweruntime.OssweruntimePackage
 * @generated
 */
public class OssweruntimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OssweruntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OssweruntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = OssweruntimePackage.eINSTANCE;
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
			case OssweruntimePackage.SWE_SMALL: {
				Swe_small swe_small = (Swe_small)theEObject;
				T result = caseSwe_small(swe_small);
				if (result == null) result = caseSmall(swe_small);
				if (result == null) result = caseResource_tpl(swe_small);
				if (result == null) result = caseMixinBase(swe_small);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.SWE_MEDIUM: {
				Swe_medium swe_medium = (Swe_medium)theEObject;
				T result = caseSwe_medium(swe_medium);
				if (result == null) result = caseMedium(swe_medium);
				if (result == null) result = caseResource_tpl(swe_medium);
				if (result == null) result = caseMixinBase(swe_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.SWE_LARGE: {
				Swe_large swe_large = (Swe_large)theEObject;
				T result = caseSwe_large(swe_large);
				if (result == null) result = caseLarge(swe_large);
				if (result == null) result = caseResource_tpl(swe_large);
				if (result == null) result = caseMixinBase(swe_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.SWE_MEM_SMALL: {
				Swe_mem_small swe_mem_small = (Swe_mem_small)theEObject;
				T result = caseSwe_mem_small(swe_mem_small);
				if (result == null) result = caseMem_small(swe_mem_small);
				if (result == null) result = caseResource_tpl(swe_mem_small);
				if (result == null) result = caseMixinBase(swe_mem_small);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.SWE_MEM_MEDIUM: {
				Swe_mem_medium swe_mem_medium = (Swe_mem_medium)theEObject;
				T result = caseSwe_mem_medium(swe_mem_medium);
				if (result == null) result = caseMem_medium(swe_mem_medium);
				if (result == null) result = caseResource_tpl(swe_mem_medium);
				if (result == null) result = caseMixinBase(swe_mem_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.SWE_MEM_LARGE: {
				Swe_mem_large swe_mem_large = (Swe_mem_large)theEObject;
				T result = caseSwe_mem_large(swe_mem_large);
				if (result == null) result = caseMem_large(swe_mem_large);
				if (result == null) result = caseResource_tpl(swe_mem_large);
				if (result == null) result = caseMixinBase(swe_mem_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.UBUNTU_TRUSTYTAHR: {
				Ubuntu_trustytahr ubuntu_trustytahr = (Ubuntu_trustytahr)theEObject;
				T result = caseUbuntu_trustytahr(ubuntu_trustytahr);
				if (result == null) result = caseOs_tpl(ubuntu_trustytahr);
				if (result == null) result = caseMixinBase(ubuntu_trustytahr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OssweruntimePackage.UBUNTU_XENIALXERUS: {
				Ubuntu_xenialxerus ubuntu_xenialxerus = (Ubuntu_xenialxerus)theEObject;
				T result = caseUbuntu_xenialxerus(ubuntu_xenialxerus);
				if (result == null) result = caseOs_tpl(ubuntu_xenialxerus);
				if (result == null) result = caseMixinBase(ubuntu_xenialxerus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_small(Swe_small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_medium(Swe_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_large(Swe_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe mem small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe mem small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_mem_small(Swe_mem_small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe mem medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe mem medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_mem_medium(Swe_mem_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swe mem large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swe mem large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwe_mem_large(Swe_mem_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ubuntu trustytahr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubuntu trustytahr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUbuntu_trustytahr(Ubuntu_trustytahr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ubuntu xenialxerus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubuntu xenialxerus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUbuntu_xenialxerus(Ubuntu_xenialxerus object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource tpl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource tpl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource_tpl(Resource_tpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmall(Small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedium(Medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLarge(Large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMem_small(Mem_small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMem_medium(Mem_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMem_large(Mem_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os tpl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os tpl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOs_tpl(Os_tpl object) {
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

} //OssweruntimeSwitch
