/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.modmacao.openfoamtypes/model/openfoamtypes.ecore
 * using:
 *   /org.modmacao.openfoamtypes/model/openfoamtypes.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package openfoam;

import modmacao.ModmacaoTables;
import openfoam.OpenfoamTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * OpenfoamTables provides the dispatch tables for the openfoam for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class OpenfoamTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OpenfoamPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OpenfoamTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Cloudserver = new EcoreExecutorType(OpenfoamPackage.Literals.CLOUDSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Gateway = new EcoreExecutorType(OpenfoamPackage.Literals.GATEWAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mpiworker = new EcoreExecutorType(OpenfoamPackage.Literals.MPIWORKER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Nfsclient = new EcoreExecutorType(OpenfoamPackage.Literals.NFSCLIENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Nfsserver = new EcoreExecutorType(OpenfoamPackage.Literals.NFSSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Openfoam = new EcoreExecutorType(OpenfoamPackage.Literals.OPENFOAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Publicip = new EcoreExecutorType(OpenfoamPackage.Literals.PUBLICIP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Volume = new EcoreExecutorType(OpenfoamPackage.Literals.VOLUME, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Cloudserver,
			_Gateway,
			_Mpiworker,
			_Nfsclient,
			_Nfsserver,
			_Openfoam,
			_Publicip,
			_Volume
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Cloudserver__Cloudserver = new ExecutorFragment(Types._Cloudserver, OpenfoamTables.Types._Cloudserver);
		private static final /*@NonNull*/ ExecutorFragment _Cloudserver__Component = new ExecutorFragment(Types._Cloudserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Cloudserver__MixinBase = new ExecutorFragment(Types._Cloudserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cloudserver__OclAny = new ExecutorFragment(Types._Cloudserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudserver__OclElement = new ExecutorFragment(Types._Cloudserver, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Gateway__Component = new ExecutorFragment(Types._Gateway, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Gateway__Gateway = new ExecutorFragment(Types._Gateway, OpenfoamTables.Types._Gateway);
		private static final /*@NonNull*/ ExecutorFragment _Gateway__MixinBase = new ExecutorFragment(Types._Gateway, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Gateway__OclAny = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Gateway__OclElement = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mpiworker__Component = new ExecutorFragment(Types._Mpiworker, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Mpiworker__MixinBase = new ExecutorFragment(Types._Mpiworker, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mpiworker__Mpiworker = new ExecutorFragment(Types._Mpiworker, OpenfoamTables.Types._Mpiworker);
		private static final /*@NonNull*/ ExecutorFragment _Mpiworker__OclAny = new ExecutorFragment(Types._Mpiworker, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mpiworker__OclElement = new ExecutorFragment(Types._Mpiworker, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Nfsclient__Component = new ExecutorFragment(Types._Nfsclient, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Nfsclient__MixinBase = new ExecutorFragment(Types._Nfsclient, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Nfsclient__Nfsclient = new ExecutorFragment(Types._Nfsclient, OpenfoamTables.Types._Nfsclient);
		private static final /*@NonNull*/ ExecutorFragment _Nfsclient__OclAny = new ExecutorFragment(Types._Nfsclient, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Nfsclient__OclElement = new ExecutorFragment(Types._Nfsclient, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Nfsserver__Component = new ExecutorFragment(Types._Nfsserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Nfsserver__MixinBase = new ExecutorFragment(Types._Nfsserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Nfsserver__Nfsserver = new ExecutorFragment(Types._Nfsserver, OpenfoamTables.Types._Nfsserver);
		private static final /*@NonNull*/ ExecutorFragment _Nfsserver__OclAny = new ExecutorFragment(Types._Nfsserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Nfsserver__OclElement = new ExecutorFragment(Types._Nfsserver, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Openfoam__Component = new ExecutorFragment(Types._Openfoam, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Openfoam__MixinBase = new ExecutorFragment(Types._Openfoam, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Openfoam__OclAny = new ExecutorFragment(Types._Openfoam, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Openfoam__OclElement = new ExecutorFragment(Types._Openfoam, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Openfoam__Openfoam = new ExecutorFragment(Types._Openfoam, OpenfoamTables.Types._Openfoam);

		private static final /*@NonNull*/ ExecutorFragment _Publicip__Component = new ExecutorFragment(Types._Publicip, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Publicip__MixinBase = new ExecutorFragment(Types._Publicip, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Publicip__OclAny = new ExecutorFragment(Types._Publicip, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Publicip__OclElement = new ExecutorFragment(Types._Publicip, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Publicip__Publicip = new ExecutorFragment(Types._Publicip, OpenfoamTables.Types._Publicip);

		private static final /*@NonNull*/ ExecutorFragment _Volume__Component = new ExecutorFragment(Types._Volume, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Volume__MixinBase = new ExecutorFragment(Types._Volume, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclAny = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclElement = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Volume = new ExecutorFragment(Types._Volume, OpenfoamTables.Types._Volume);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Volume__size = new EcoreExecutorProperty(OpenfoamPackage.Literals.VOLUME__SIZE, Types._Volume, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudserver =
			{
				Fragments._Cloudserver__OclAny /* 0 */,
				Fragments._Cloudserver__OclElement /* 1 */,
				Fragments._Cloudserver__MixinBase /* 2 */,
				Fragments._Cloudserver__Component /* 3 */,
				Fragments._Cloudserver__Cloudserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cloudserver = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Gateway =
			{
				Fragments._Gateway__OclAny /* 0 */,
				Fragments._Gateway__OclElement /* 1 */,
				Fragments._Gateway__MixinBase /* 2 */,
				Fragments._Gateway__Component /* 3 */,
				Fragments._Gateway__Gateway /* 4 */
			};
		private static final int /*@NonNull*/ [] __Gateway = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mpiworker =
			{
				Fragments._Mpiworker__OclAny /* 0 */,
				Fragments._Mpiworker__OclElement /* 1 */,
				Fragments._Mpiworker__MixinBase /* 2 */,
				Fragments._Mpiworker__Component /* 3 */,
				Fragments._Mpiworker__Mpiworker /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mpiworker = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Nfsclient =
			{
				Fragments._Nfsclient__OclAny /* 0 */,
				Fragments._Nfsclient__OclElement /* 1 */,
				Fragments._Nfsclient__MixinBase /* 2 */,
				Fragments._Nfsclient__Component /* 3 */,
				Fragments._Nfsclient__Nfsclient /* 4 */
			};
		private static final int /*@NonNull*/ [] __Nfsclient = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Nfsserver =
			{
				Fragments._Nfsserver__OclAny /* 0 */,
				Fragments._Nfsserver__OclElement /* 1 */,
				Fragments._Nfsserver__MixinBase /* 2 */,
				Fragments._Nfsserver__Component /* 3 */,
				Fragments._Nfsserver__Nfsserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Nfsserver = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Openfoam =
			{
				Fragments._Openfoam__OclAny /* 0 */,
				Fragments._Openfoam__OclElement /* 1 */,
				Fragments._Openfoam__MixinBase /* 2 */,
				Fragments._Openfoam__Component /* 3 */,
				Fragments._Openfoam__Openfoam /* 4 */
			};
		private static final int /*@NonNull*/ [] __Openfoam = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Publicip =
			{
				Fragments._Publicip__OclAny /* 0 */,
				Fragments._Publicip__OclElement /* 1 */,
				Fragments._Publicip__MixinBase /* 2 */,
				Fragments._Publicip__Component /* 3 */,
				Fragments._Publicip__Publicip /* 4 */
			};
		private static final int /*@NonNull*/ [] __Publicip = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Volume =
			{
				Fragments._Volume__OclAny /* 0 */,
				Fragments._Volume__OclElement /* 1 */,
				Fragments._Volume__MixinBase /* 2 */,
				Fragments._Volume__Component /* 3 */,
				Fragments._Volume__Volume /* 4 */
			};
		private static final int /*@NonNull*/ [] __Volume = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cloudserver.initFragments(_Cloudserver, __Cloudserver);
			Types._Gateway.initFragments(_Gateway, __Gateway);
			Types._Mpiworker.initFragments(_Mpiworker, __Mpiworker);
			Types._Nfsclient.initFragments(_Nfsclient, __Nfsclient);
			Types._Nfsserver.initFragments(_Nfsserver, __Nfsserver);
			Types._Openfoam.initFragments(_Openfoam, __Openfoam);
			Types._Publicip.initFragments(_Publicip, __Publicip);
			Types._Volume.initFragments(_Volume, __Volume);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudserver__Cloudserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudserver__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gateway__Gateway = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gateway__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gateway__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gateway__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gateway__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mpiworker__Mpiworker = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mpiworker__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mpiworker__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mpiworker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mpiworker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsclient__Nfsclient = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsclient__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsclient__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsclient__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsclient__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsserver__Nfsserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsserver__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nfsserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openfoam__Openfoam = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openfoam__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openfoam__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openfoam__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openfoam__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publicip__Publicip = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publicip__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publicip__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publicip__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publicip__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Volume = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cloudserver__Cloudserver.initOperations(_Cloudserver__Cloudserver);
			Fragments._Cloudserver__Component.initOperations(_Cloudserver__Component);
			Fragments._Cloudserver__MixinBase.initOperations(_Cloudserver__MixinBase);
			Fragments._Cloudserver__OclAny.initOperations(_Cloudserver__OclAny);
			Fragments._Cloudserver__OclElement.initOperations(_Cloudserver__OclElement);

			Fragments._Gateway__Component.initOperations(_Gateway__Component);
			Fragments._Gateway__Gateway.initOperations(_Gateway__Gateway);
			Fragments._Gateway__MixinBase.initOperations(_Gateway__MixinBase);
			Fragments._Gateway__OclAny.initOperations(_Gateway__OclAny);
			Fragments._Gateway__OclElement.initOperations(_Gateway__OclElement);

			Fragments._Mpiworker__Component.initOperations(_Mpiworker__Component);
			Fragments._Mpiworker__MixinBase.initOperations(_Mpiworker__MixinBase);
			Fragments._Mpiworker__Mpiworker.initOperations(_Mpiworker__Mpiworker);
			Fragments._Mpiworker__OclAny.initOperations(_Mpiworker__OclAny);
			Fragments._Mpiworker__OclElement.initOperations(_Mpiworker__OclElement);

			Fragments._Nfsclient__Component.initOperations(_Nfsclient__Component);
			Fragments._Nfsclient__MixinBase.initOperations(_Nfsclient__MixinBase);
			Fragments._Nfsclient__Nfsclient.initOperations(_Nfsclient__Nfsclient);
			Fragments._Nfsclient__OclAny.initOperations(_Nfsclient__OclAny);
			Fragments._Nfsclient__OclElement.initOperations(_Nfsclient__OclElement);

			Fragments._Nfsserver__Component.initOperations(_Nfsserver__Component);
			Fragments._Nfsserver__MixinBase.initOperations(_Nfsserver__MixinBase);
			Fragments._Nfsserver__Nfsserver.initOperations(_Nfsserver__Nfsserver);
			Fragments._Nfsserver__OclAny.initOperations(_Nfsserver__OclAny);
			Fragments._Nfsserver__OclElement.initOperations(_Nfsserver__OclElement);

			Fragments._Openfoam__Component.initOperations(_Openfoam__Component);
			Fragments._Openfoam__MixinBase.initOperations(_Openfoam__MixinBase);
			Fragments._Openfoam__OclAny.initOperations(_Openfoam__OclAny);
			Fragments._Openfoam__OclElement.initOperations(_Openfoam__OclElement);
			Fragments._Openfoam__Openfoam.initOperations(_Openfoam__Openfoam);

			Fragments._Publicip__Component.initOperations(_Publicip__Component);
			Fragments._Publicip__MixinBase.initOperations(_Publicip__MixinBase);
			Fragments._Publicip__OclAny.initOperations(_Publicip__OclAny);
			Fragments._Publicip__OclElement.initOperations(_Publicip__OclElement);
			Fragments._Publicip__Publicip.initOperations(_Publicip__Publicip);

			Fragments._Volume__Component.initOperations(_Volume__Component);
			Fragments._Volume__MixinBase.initOperations(_Volume__MixinBase);
			Fragments._Volume__OclAny.initOperations(_Volume__OclAny);
			Fragments._Volume__OclElement.initOperations(_Volume__OclElement);
			Fragments._Volume__Volume.initOperations(_Volume__Volume);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudserver = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Gateway = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mpiworker = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Nfsclient = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Nfsserver = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Openfoam = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Publicip = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Volume = {
			OpenfoamTables.Properties._Volume__size
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cloudserver__Cloudserver.initProperties(_Cloudserver);
			Fragments._Gateway__Gateway.initProperties(_Gateway);
			Fragments._Mpiworker__Mpiworker.initProperties(_Mpiworker);
			Fragments._Nfsclient__Nfsclient.initProperties(_Nfsclient);
			Fragments._Nfsserver__Nfsserver.initProperties(_Nfsserver);
			Fragments._Openfoam__Openfoam.initProperties(_Openfoam);
			Fragments._Publicip__Publicip.initProperties(_Publicip);
			Fragments._Volume__Volume.initProperties(_Volume);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenfoamTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
