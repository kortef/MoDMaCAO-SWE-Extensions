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
 *   /org.modmacao.toscaspecifictypes/model/toscaspecifictypes.ecore
 * using:
 *   /org.modmacao.toscaspecifictypes/model/toscaspecifictypes.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.modmacao.toscaspecifictypes;

import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.modmacao.toscaspecifictypes.ToscaspecifictypesTables;

/**
 * ToscaspecifictypesTables provides the dispatch tables for the toscaspecifictypes for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ToscaspecifictypesTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ToscaspecifictypesPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = org.modmacao.toscaspecifictypes.ToscaspecifictypesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ToscaspecifictypesTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Apachemodule = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.APACHEMODULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apachephpmodule = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.APACHEPHPMODULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apachewebapplication = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.APACHEWEBAPPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apachewebserver = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.APACHEWEBSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mysql = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.MYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mysqldatabase = new EcoreExecutorType(ToscaspecifictypesPackage.Literals.MYSQLDATABASE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Apachemodule,
			_Apachephpmodule,
			_Apachewebapplication,
			_Apachewebserver,
			_Mysql,
			_Mysqldatabase
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Apachemodule__Apachemodule = new ExecutorFragment(Types._Apachemodule, ToscaspecifictypesTables.Types._Apachemodule);
		private static final /*@NonNull*/ ExecutorFragment _Apachemodule__Component = new ExecutorFragment(Types._Apachemodule, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apachemodule__MixinBase = new ExecutorFragment(Types._Apachemodule, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachemodule__OclAny = new ExecutorFragment(Types._Apachemodule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachemodule__OclElement = new ExecutorFragment(Types._Apachemodule, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Apachephpmodule__Apachephpmodule = new ExecutorFragment(Types._Apachephpmodule, ToscaspecifictypesTables.Types._Apachephpmodule);
		private static final /*@NonNull*/ ExecutorFragment _Apachephpmodule__Component = new ExecutorFragment(Types._Apachephpmodule, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apachephpmodule__MixinBase = new ExecutorFragment(Types._Apachephpmodule, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachephpmodule__OclAny = new ExecutorFragment(Types._Apachephpmodule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachephpmodule__OclElement = new ExecutorFragment(Types._Apachephpmodule, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Apachewebapplication__Apachewebapplication = new ExecutorFragment(Types._Apachewebapplication, ToscaspecifictypesTables.Types._Apachewebapplication);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebapplication__Component = new ExecutorFragment(Types._Apachewebapplication, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebapplication__MixinBase = new ExecutorFragment(Types._Apachewebapplication, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebapplication__OclAny = new ExecutorFragment(Types._Apachewebapplication, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebapplication__OclElement = new ExecutorFragment(Types._Apachewebapplication, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Apachewebserver__Apachewebserver = new ExecutorFragment(Types._Apachewebserver, ToscaspecifictypesTables.Types._Apachewebserver);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebserver__Component = new ExecutorFragment(Types._Apachewebserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebserver__MixinBase = new ExecutorFragment(Types._Apachewebserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebserver__OclAny = new ExecutorFragment(Types._Apachewebserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachewebserver__OclElement = new ExecutorFragment(Types._Apachewebserver, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mysql__Component = new ExecutorFragment(Types._Mysql, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__MixinBase = new ExecutorFragment(Types._Mysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__Mysql = new ExecutorFragment(Types._Mysql, ToscaspecifictypesTables.Types._Mysql);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__OclAny = new ExecutorFragment(Types._Mysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__OclElement = new ExecutorFragment(Types._Mysql, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mysqldatabase__Component = new ExecutorFragment(Types._Mysqldatabase, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldatabase__MixinBase = new ExecutorFragment(Types._Mysqldatabase, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldatabase__Mysqldatabase = new ExecutorFragment(Types._Mysqldatabase, ToscaspecifictypesTables.Types._Mysqldatabase);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldatabase__OclAny = new ExecutorFragment(Types._Mysqldatabase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldatabase__OclElement = new ExecutorFragment(Types._Mysqldatabase, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscaspecifictypesTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscaspecifictypesTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Apachewebserver__httpdport = new EcoreExecutorProperty(ToscaspecifictypesPackage.Literals.APACHEWEBSERVER__HTTPDPORT, Types._Apachewebserver, 0);

		public static final /*@NonNull*/ ExecutorProperty _Mysql__rootPassword = new EcoreExecutorProperty(ToscaspecifictypesPackage.Literals.MYSQL__ROOT_PASSWORD, Types._Mysql, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachemodule =
			{
				Fragments._Apachemodule__OclAny /* 0 */,
				Fragments._Apachemodule__OclElement /* 1 */,
				Fragments._Apachemodule__MixinBase /* 2 */,
				Fragments._Apachemodule__Component /* 3 */,
				Fragments._Apachemodule__Apachemodule /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apachemodule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachephpmodule =
			{
				Fragments._Apachephpmodule__OclAny /* 0 */,
				Fragments._Apachephpmodule__OclElement /* 1 */,
				Fragments._Apachephpmodule__MixinBase /* 2 */,
				Fragments._Apachephpmodule__Component /* 3 */,
				Fragments._Apachephpmodule__Apachephpmodule /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apachephpmodule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachewebapplication =
			{
				Fragments._Apachewebapplication__OclAny /* 0 */,
				Fragments._Apachewebapplication__OclElement /* 1 */,
				Fragments._Apachewebapplication__MixinBase /* 2 */,
				Fragments._Apachewebapplication__Component /* 3 */,
				Fragments._Apachewebapplication__Apachewebapplication /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apachewebapplication = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachewebserver =
			{
				Fragments._Apachewebserver__OclAny /* 0 */,
				Fragments._Apachewebserver__OclElement /* 1 */,
				Fragments._Apachewebserver__MixinBase /* 2 */,
				Fragments._Apachewebserver__Component /* 3 */,
				Fragments._Apachewebserver__Apachewebserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apachewebserver = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mysql =
			{
				Fragments._Mysql__OclAny /* 0 */,
				Fragments._Mysql__OclElement /* 1 */,
				Fragments._Mysql__MixinBase /* 2 */,
				Fragments._Mysql__Component /* 3 */,
				Fragments._Mysql__Mysql /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mysql = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mysqldatabase =
			{
				Fragments._Mysqldatabase__OclAny /* 0 */,
				Fragments._Mysqldatabase__OclElement /* 1 */,
				Fragments._Mysqldatabase__MixinBase /* 2 */,
				Fragments._Mysqldatabase__Component /* 3 */,
				Fragments._Mysqldatabase__Mysqldatabase /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mysqldatabase = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Apachemodule.initFragments(_Apachemodule, __Apachemodule);
			Types._Apachephpmodule.initFragments(_Apachephpmodule, __Apachephpmodule);
			Types._Apachewebapplication.initFragments(_Apachewebapplication, __Apachewebapplication);
			Types._Apachewebserver.initFragments(_Apachewebserver, __Apachewebserver);
			Types._Mysql.initFragments(_Mysql, __Mysql);
			Types._Mysqldatabase.initFragments(_Mysqldatabase, __Mysqldatabase);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachemodule__Apachemodule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachemodule__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachemodule__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachemodule__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachemodule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachephpmodule__Apachephpmodule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachephpmodule__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachephpmodule__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachephpmodule__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachephpmodule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebapplication__Apachewebapplication = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebapplication__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebapplication__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebapplication__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebapplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebserver__Apachewebserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebserver__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachewebserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__Mysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldatabase__Mysqldatabase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldatabase__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldatabase__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldatabase__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldatabase__OclElement = {
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
			Fragments._Apachemodule__Apachemodule.initOperations(_Apachemodule__Apachemodule);
			Fragments._Apachemodule__Component.initOperations(_Apachemodule__Component);
			Fragments._Apachemodule__MixinBase.initOperations(_Apachemodule__MixinBase);
			Fragments._Apachemodule__OclAny.initOperations(_Apachemodule__OclAny);
			Fragments._Apachemodule__OclElement.initOperations(_Apachemodule__OclElement);

			Fragments._Apachephpmodule__Apachephpmodule.initOperations(_Apachephpmodule__Apachephpmodule);
			Fragments._Apachephpmodule__Component.initOperations(_Apachephpmodule__Component);
			Fragments._Apachephpmodule__MixinBase.initOperations(_Apachephpmodule__MixinBase);
			Fragments._Apachephpmodule__OclAny.initOperations(_Apachephpmodule__OclAny);
			Fragments._Apachephpmodule__OclElement.initOperations(_Apachephpmodule__OclElement);

			Fragments._Apachewebapplication__Apachewebapplication.initOperations(_Apachewebapplication__Apachewebapplication);
			Fragments._Apachewebapplication__Component.initOperations(_Apachewebapplication__Component);
			Fragments._Apachewebapplication__MixinBase.initOperations(_Apachewebapplication__MixinBase);
			Fragments._Apachewebapplication__OclAny.initOperations(_Apachewebapplication__OclAny);
			Fragments._Apachewebapplication__OclElement.initOperations(_Apachewebapplication__OclElement);

			Fragments._Apachewebserver__Apachewebserver.initOperations(_Apachewebserver__Apachewebserver);
			Fragments._Apachewebserver__Component.initOperations(_Apachewebserver__Component);
			Fragments._Apachewebserver__MixinBase.initOperations(_Apachewebserver__MixinBase);
			Fragments._Apachewebserver__OclAny.initOperations(_Apachewebserver__OclAny);
			Fragments._Apachewebserver__OclElement.initOperations(_Apachewebserver__OclElement);

			Fragments._Mysql__Component.initOperations(_Mysql__Component);
			Fragments._Mysql__MixinBase.initOperations(_Mysql__MixinBase);
			Fragments._Mysql__Mysql.initOperations(_Mysql__Mysql);
			Fragments._Mysql__OclAny.initOperations(_Mysql__OclAny);
			Fragments._Mysql__OclElement.initOperations(_Mysql__OclElement);

			Fragments._Mysqldatabase__Component.initOperations(_Mysqldatabase__Component);
			Fragments._Mysqldatabase__MixinBase.initOperations(_Mysqldatabase__MixinBase);
			Fragments._Mysqldatabase__Mysqldatabase.initOperations(_Mysqldatabase__Mysqldatabase);
			Fragments._Mysqldatabase__OclAny.initOperations(_Mysqldatabase__OclAny);
			Fragments._Mysqldatabase__OclElement.initOperations(_Mysqldatabase__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachemodule = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachephpmodule = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachewebapplication = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachewebserver = {
			ToscaspecifictypesTables.Properties._Apachewebserver__httpdport
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mysql = {
			ToscaspecifictypesTables.Properties._Mysql__rootPassword
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mysqldatabase = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Apachemodule__Apachemodule.initProperties(_Apachemodule);
			Fragments._Apachephpmodule__Apachephpmodule.initProperties(_Apachephpmodule);
			Fragments._Apachewebapplication__Apachewebapplication.initProperties(_Apachewebapplication);
			Fragments._Apachewebserver__Apachewebserver.initProperties(_Apachewebserver);
			Fragments._Mysql__Mysql.initProperties(_Mysql);
			Fragments._Mysqldatabase__Mysqldatabase.initProperties(_Mysqldatabase);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaspecifictypesTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscaspecifictypesTables::EnumerationLiterals and all preceding sub-packages.
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
