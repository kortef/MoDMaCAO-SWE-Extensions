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
 * A representation of the model object '<em><b>Mysql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscaspecifictypes.Mysql#getRootPassword <em>Root Password</em>}</li>
 * </ul>
 *
 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage#getMysql()
 * @model
 * @generated
 */
public interface Mysql extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root Password
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Password</em>' attribute.
	 * @see #setRootPassword(String)
	 * @see org.modmacao.toscaspecifictypes.ToscaspecifictypesPackage#getMysql_RootPassword()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/toscaspecifictypes/ecore!Mysql!rootPassword'"
	 * @generated
	 */
	String getRootPassword();

	/**
	 * Sets the value of the '{@link org.modmacao.toscaspecifictypes.Mysql#getRootPassword <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Password</em>' attribute.
	 * @see #getRootPassword()
	 * @generated
	 */
	void setRootPassword(String value);

} // Mysql
