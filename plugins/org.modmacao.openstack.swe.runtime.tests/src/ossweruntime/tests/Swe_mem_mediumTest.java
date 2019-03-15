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
package ossweruntime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ossweruntime.OssweruntimeFactory;
import ossweruntime.Swe_mem_medium;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Swe mem medium</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Swe_mem_mediumTest extends TestCase {

	/**
	 * The fixture for this Swe mem medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Swe_mem_medium fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Swe_mem_mediumTest.class);
	}

	/**
	 * Constructs a new Swe mem medium test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swe_mem_mediumTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Swe mem medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Swe_mem_medium fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Swe mem medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Swe_mem_medium getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OssweruntimeFactory.eINSTANCE.createSwe_mem_medium());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Swe_mem_mediumTest
