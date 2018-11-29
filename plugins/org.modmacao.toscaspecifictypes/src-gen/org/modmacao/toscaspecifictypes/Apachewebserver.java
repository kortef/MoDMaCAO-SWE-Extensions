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
package org.modmacao.toscaspecifictypes;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apachewebserver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscaspecifictypes.Apachewebserver#getHttpdport <em>Httpdport</em>}</li>
 * </ul>
 *
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage#getApachewebserver()
 * @model
 * @generated
 */
public interface Apachewebserver extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Httpdport</b></em>' attribute.
	 * The default value is <code>"80"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache HTTP Port (default 80)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Httpdport</em>' attribute.
	 * @see #setHttpdport(int)
	 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage#getApachewebserver_Httpdport()
	 * @model default="80"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/toscaspecifictypes/ecore!Apachewebserver!httpdport'"
	 * @generated
	 */
	int getHttpdport();

	/**
	 * Sets the value of the '{@link org.modmacao.toscaspecifictypes.Apachewebserver#getHttpdport <em>Httpdport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Httpdport</em>' attribute.
	 * @see #getHttpdport()
	 * @generated
	 */
	void setHttpdport(int value);

} // Apachewebserver
