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

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubuntu trustytahr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ossweruntime.Ubuntu_trustytahr#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @see ossweruntime.OssweruntimePackage#getUbuntu_trustytahr()
 * @model
 * @generated
 */
public interface Ubuntu_trustytahr extends Os_tpl, MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * The default value is <code>"adf63ddc-debe-4d7e-b899-b936e989439f"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #setOpenstackRuntimeId(String)
	 * @see ossweruntime.OssweruntimePackage#getUbuntu_trustytahr_OpenstackRuntimeId()
	 * @model default="adf63ddc-debe-4d7e-b899-b936e989439f" dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getOpenstackRuntimeId();

	/**
	 * Sets the value of the '{@link ossweruntime.Ubuntu_trustytahr#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 */
	void setOpenstackRuntimeId(String value);

} // Ubuntu_trustytahr
