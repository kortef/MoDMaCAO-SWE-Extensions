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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ossweruntime.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ossweruntime.OssweruntimePackage
 * @generated
 */
public class OssweruntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OssweruntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OssweruntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OssweruntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OssweruntimeSwitch<Adapter> modelSwitch =
		new OssweruntimeSwitch<Adapter>() {
			@Override
			public Adapter caseSwe_small(Swe_small object) {
				return createSwe_smallAdapter();
			}
			@Override
			public Adapter caseSwe_medium(Swe_medium object) {
				return createSwe_mediumAdapter();
			}
			@Override
			public Adapter caseSwe_large(Swe_large object) {
				return createSwe_largeAdapter();
			}
			@Override
			public Adapter caseSwe_mem_small(Swe_mem_small object) {
				return createSwe_mem_smallAdapter();
			}
			@Override
			public Adapter caseSwe_mem_medium(Swe_mem_medium object) {
				return createSwe_mem_mediumAdapter();
			}
			@Override
			public Adapter caseSwe_mem_large(Swe_mem_large object) {
				return createSwe_mem_largeAdapter();
			}
			@Override
			public Adapter caseUbuntu_trustytahr(Ubuntu_trustytahr object) {
				return createUbuntu_trustytahrAdapter();
			}
			@Override
			public Adapter caseUbuntu_xenialxerus(Ubuntu_xenialxerus object) {
				return createUbuntu_xenialxerusAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseResource_tpl(Resource_tpl object) {
				return createResource_tplAdapter();
			}
			@Override
			public Adapter caseSmall(Small object) {
				return createSmallAdapter();
			}
			@Override
			public Adapter caseMedium(Medium object) {
				return createMediumAdapter();
			}
			@Override
			public Adapter caseLarge(Large object) {
				return createLargeAdapter();
			}
			@Override
			public Adapter caseMem_small(Mem_small object) {
				return createMem_smallAdapter();
			}
			@Override
			public Adapter caseMem_medium(Mem_medium object) {
				return createMem_mediumAdapter();
			}
			@Override
			public Adapter caseMem_large(Mem_large object) {
				return createMem_largeAdapter();
			}
			@Override
			public Adapter caseOs_tpl(Os_tpl object) {
				return createOs_tplAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_small <em>Swe small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_small
	 * @generated
	 */
	public Adapter createSwe_smallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_medium <em>Swe medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_medium
	 * @generated
	 */
	public Adapter createSwe_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_large <em>Swe large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_large
	 * @generated
	 */
	public Adapter createSwe_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_mem_small <em>Swe mem small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_mem_small
	 * @generated
	 */
	public Adapter createSwe_mem_smallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_mem_medium <em>Swe mem medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_mem_medium
	 * @generated
	 */
	public Adapter createSwe_mem_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Swe_mem_large <em>Swe mem large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Swe_mem_large
	 * @generated
	 */
	public Adapter createSwe_mem_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Ubuntu_trustytahr <em>Ubuntu trustytahr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Ubuntu_trustytahr
	 * @generated
	 */
	public Adapter createUbuntu_trustytahrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ossweruntime.Ubuntu_xenialxerus <em>Ubuntu xenialxerus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ossweruntime.Ubuntu_xenialxerus
	 * @generated
	 */
	public Adapter createUbuntu_xenialxerusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Resource_tpl <em>Resource tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Resource_tpl
	 * @generated
	 */
	public Adapter createResource_tplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Small <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Small
	 * @generated
	 */
	public Adapter createSmallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Medium
	 * @generated
	 */
	public Adapter createMediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Large <em>Large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Large
	 * @generated
	 */
	public Adapter createLargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Mem_small <em>Mem small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small
	 * @generated
	 */
	public Adapter createMem_smallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Mem_medium <em>Mem medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium
	 * @generated
	 */
	public Adapter createMem_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.crtp.Mem_large <em>Mem large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large
	 * @generated
	 */
	public Adapter createMem_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Os_tpl <em>Os tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Os_tpl
	 * @generated
	 */
	public Adapter createOs_tplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OssweruntimeAdapterFactory
