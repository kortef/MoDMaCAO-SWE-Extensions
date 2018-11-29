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
package org.modmacao.toscabasetypes;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.toscabasetypes.Server#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link org.modmacao.toscabasetypes.Server#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Num Cpus</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPUs: Number of CPUs for the virtual machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Cpus</em>' attribute.
	 * @see #setNumCpus(int)
	 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage#getServer_NumCpus()
	 * @model default="1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/toscabasetypes/ecore!Server!numCpus'"
	 * @generated
	 */
	int getNumCpus();

	/**
	 * Sets the value of the '{@link org.modmacao.toscabasetypes.Server#getNumCpus <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cpus</em>' attribute.
	 * @see #getNumCpus()
	 * @generated
	 */
	void setNumCpus(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Memory (in MB): Amount of memory for the virtual machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see org.modmacao.toscabasetypes.ToscabasetypesPackage#getServer_Memory()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/toscabasetypes/ecore!Server!memory'"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link org.modmacao.toscabasetypes.Server#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

} // Server
