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

import org.eclipse.cmf.occi.crtp.Large;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swe large</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ossweruntime.Swe_large#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @see ossweruntime.OssweruntimePackage#getSwe_large()
 * @model
 * @generated
 */
public interface Swe_large extends Large, MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * The default value is <code>"ce8c33af-0cd5-4aac-b6f3-fcde58c4b262"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #setOpenstackRuntimeId(String)
	 * @see ossweruntime.OssweruntimePackage#getSwe_large_OpenstackRuntimeId()
	 * @model default="ce8c33af-0cd5-4aac-b6f3-fcde58c4b262" dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getOpenstackRuntimeId();

	/**
	 * Sets the value of the '{@link ossweruntime.Swe_large#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 */
	void setOpenstackRuntimeId(String value);

} // Swe_large
