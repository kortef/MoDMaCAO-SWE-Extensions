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
 *   /org.modmacao.toscabasetypes/model/toscabasetypes.ecore
 * using:
 *   /org.modmacao.toscabasetypes/model/toscabasetypes.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.modmacao.toscabasetypes;

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
import org.modmacao.toscabasetypes.ToscabasetypesTables;

/**
 * ToscabasetypesTables provides the dispatch tables for the toscabasetypes for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ToscabasetypesTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ToscabasetypesPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = org.modmacao.toscabasetypes.ToscabasetypesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ToscabasetypesTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Database = new EcoreExecutorType(ToscabasetypesPackage.Literals.DATABASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dbms = new EcoreExecutorType(ToscabasetypesPackage.Literals.DBMS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operatingsystem = new EcoreExecutorType(ToscabasetypesPackage.Literals.OPERATINGSYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rootnodetype = new EcoreExecutorType(ToscabasetypesPackage.Literals.ROOTNODETYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scalabletier = new EcoreExecutorType(ToscabasetypesPackage.Literals.SCALABLETIER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Server = new EcoreExecutorType(ToscabasetypesPackage.Literals.SERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Singlenodetier = new EcoreExecutorType(ToscabasetypesPackage.Literals.SINGLENODETIER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tier = new EcoreExecutorType(ToscabasetypesPackage.Literals.TIER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Webapplication = new EcoreExecutorType(ToscabasetypesPackage.Literals.WEBAPPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Webserver = new EcoreExecutorType(ToscabasetypesPackage.Literals.WEBSERVER, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Database,
			_Dbms,
			_Operatingsystem,
			_Rootnodetype,
			_Scalabletier,
			_Server,
			_Singlenodetier,
			_Tier,
			_Webapplication,
			_Webserver
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Database__Component = new ExecutorFragment(Types._Database, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Database__Database = new ExecutorFragment(Types._Database, ToscabasetypesTables.Types._Database);
		private static final /*@NonNull*/ ExecutorFragment _Database__MixinBase = new ExecutorFragment(Types._Database, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Database__OclAny = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Database__OclElement = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Dbms__Component = new ExecutorFragment(Types._Dbms, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Dbms__Dbms = new ExecutorFragment(Types._Dbms, ToscabasetypesTables.Types._Dbms);
		private static final /*@NonNull*/ ExecutorFragment _Dbms__MixinBase = new ExecutorFragment(Types._Dbms, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dbms__OclAny = new ExecutorFragment(Types._Dbms, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dbms__OclElement = new ExecutorFragment(Types._Dbms, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Operatingsystem__Component = new ExecutorFragment(Types._Operatingsystem, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Operatingsystem__MixinBase = new ExecutorFragment(Types._Operatingsystem, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Operatingsystem__OclAny = new ExecutorFragment(Types._Operatingsystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operatingsystem__OclElement = new ExecutorFragment(Types._Operatingsystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operatingsystem__Operatingsystem = new ExecutorFragment(Types._Operatingsystem, ToscabasetypesTables.Types._Operatingsystem);

		private static final /*@NonNull*/ ExecutorFragment _Rootnodetype__Component = new ExecutorFragment(Types._Rootnodetype, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Rootnodetype__MixinBase = new ExecutorFragment(Types._Rootnodetype, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Rootnodetype__OclAny = new ExecutorFragment(Types._Rootnodetype, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rootnodetype__OclElement = new ExecutorFragment(Types._Rootnodetype, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rootnodetype__Rootnodetype = new ExecutorFragment(Types._Rootnodetype, ToscabasetypesTables.Types._Rootnodetype);

		private static final /*@NonNull*/ ExecutorFragment _Scalabletier__Component = new ExecutorFragment(Types._Scalabletier, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Scalabletier__MixinBase = new ExecutorFragment(Types._Scalabletier, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Scalabletier__OclAny = new ExecutorFragment(Types._Scalabletier, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scalabletier__OclElement = new ExecutorFragment(Types._Scalabletier, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scalabletier__Scalabletier = new ExecutorFragment(Types._Scalabletier, ToscabasetypesTables.Types._Scalabletier);

		private static final /*@NonNull*/ ExecutorFragment _Server__Component = new ExecutorFragment(Types._Server, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Server__MixinBase = new ExecutorFragment(Types._Server, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Server__OclAny = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Server__OclElement = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Server__Server = new ExecutorFragment(Types._Server, ToscabasetypesTables.Types._Server);

		private static final /*@NonNull*/ ExecutorFragment _Singlenodetier__Component = new ExecutorFragment(Types._Singlenodetier, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Singlenodetier__MixinBase = new ExecutorFragment(Types._Singlenodetier, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Singlenodetier__OclAny = new ExecutorFragment(Types._Singlenodetier, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Singlenodetier__OclElement = new ExecutorFragment(Types._Singlenodetier, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Singlenodetier__Singlenodetier = new ExecutorFragment(Types._Singlenodetier, ToscabasetypesTables.Types._Singlenodetier);

		private static final /*@NonNull*/ ExecutorFragment _Tier__Component = new ExecutorFragment(Types._Tier, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Tier__MixinBase = new ExecutorFragment(Types._Tier, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tier__OclAny = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tier__OclElement = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tier__Tier = new ExecutorFragment(Types._Tier, ToscabasetypesTables.Types._Tier);

		private static final /*@NonNull*/ ExecutorFragment _Webapplication__Component = new ExecutorFragment(Types._Webapplication, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Webapplication__MixinBase = new ExecutorFragment(Types._Webapplication, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Webapplication__OclAny = new ExecutorFragment(Types._Webapplication, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Webapplication__OclElement = new ExecutorFragment(Types._Webapplication, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Webapplication__Webapplication = new ExecutorFragment(Types._Webapplication, ToscabasetypesTables.Types._Webapplication);

		private static final /*@NonNull*/ ExecutorFragment _Webserver__Component = new ExecutorFragment(Types._Webserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Webserver__MixinBase = new ExecutorFragment(Types._Webserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Webserver__OclAny = new ExecutorFragment(Types._Webserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Webserver__OclElement = new ExecutorFragment(Types._Webserver, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Webserver__Webserver = new ExecutorFragment(Types._Webserver, ToscabasetypesTables.Types._Webserver);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscabasetypesTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscabasetypesTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Server__memory = new EcoreExecutorProperty(ToscabasetypesPackage.Literals.SERVER__MEMORY, Types._Server, 0);
		public static final /*@NonNull*/ ExecutorProperty _Server__numCpus = new EcoreExecutorProperty(ToscabasetypesPackage.Literals.SERVER__NUM_CPUS, Types._Server, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Database =
			{
				Fragments._Database__OclAny /* 0 */,
				Fragments._Database__OclElement /* 1 */,
				Fragments._Database__MixinBase /* 2 */,
				Fragments._Database__Component /* 3 */,
				Fragments._Database__Database /* 4 */
			};
		private static final int /*@NonNull*/ [] __Database = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dbms =
			{
				Fragments._Dbms__OclAny /* 0 */,
				Fragments._Dbms__OclElement /* 1 */,
				Fragments._Dbms__MixinBase /* 2 */,
				Fragments._Dbms__Component /* 3 */,
				Fragments._Dbms__Dbms /* 4 */
			};
		private static final int /*@NonNull*/ [] __Dbms = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operatingsystem =
			{
				Fragments._Operatingsystem__OclAny /* 0 */,
				Fragments._Operatingsystem__OclElement /* 1 */,
				Fragments._Operatingsystem__MixinBase /* 2 */,
				Fragments._Operatingsystem__Component /* 3 */,
				Fragments._Operatingsystem__Operatingsystem /* 4 */
			};
		private static final int /*@NonNull*/ [] __Operatingsystem = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rootnodetype =
			{
				Fragments._Rootnodetype__OclAny /* 0 */,
				Fragments._Rootnodetype__OclElement /* 1 */,
				Fragments._Rootnodetype__MixinBase /* 2 */,
				Fragments._Rootnodetype__Component /* 3 */,
				Fragments._Rootnodetype__Rootnodetype /* 4 */
			};
		private static final int /*@NonNull*/ [] __Rootnodetype = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scalabletier =
			{
				Fragments._Scalabletier__OclAny /* 0 */,
				Fragments._Scalabletier__OclElement /* 1 */,
				Fragments._Scalabletier__MixinBase /* 2 */,
				Fragments._Scalabletier__Component /* 3 */,
				Fragments._Scalabletier__Scalabletier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Scalabletier = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Server =
			{
				Fragments._Server__OclAny /* 0 */,
				Fragments._Server__OclElement /* 1 */,
				Fragments._Server__MixinBase /* 2 */,
				Fragments._Server__Component /* 3 */,
				Fragments._Server__Server /* 4 */
			};
		private static final int /*@NonNull*/ [] __Server = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Singlenodetier =
			{
				Fragments._Singlenodetier__OclAny /* 0 */,
				Fragments._Singlenodetier__OclElement /* 1 */,
				Fragments._Singlenodetier__MixinBase /* 2 */,
				Fragments._Singlenodetier__Component /* 3 */,
				Fragments._Singlenodetier__Singlenodetier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Singlenodetier = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tier =
			{
				Fragments._Tier__OclAny /* 0 */,
				Fragments._Tier__OclElement /* 1 */,
				Fragments._Tier__MixinBase /* 2 */,
				Fragments._Tier__Component /* 3 */,
				Fragments._Tier__Tier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Tier = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Webapplication =
			{
				Fragments._Webapplication__OclAny /* 0 */,
				Fragments._Webapplication__OclElement /* 1 */,
				Fragments._Webapplication__MixinBase /* 2 */,
				Fragments._Webapplication__Component /* 3 */,
				Fragments._Webapplication__Webapplication /* 4 */
			};
		private static final int /*@NonNull*/ [] __Webapplication = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Webserver =
			{
				Fragments._Webserver__OclAny /* 0 */,
				Fragments._Webserver__OclElement /* 1 */,
				Fragments._Webserver__MixinBase /* 2 */,
				Fragments._Webserver__Component /* 3 */,
				Fragments._Webserver__Webserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Webserver = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Database.initFragments(_Database, __Database);
			Types._Dbms.initFragments(_Dbms, __Dbms);
			Types._Operatingsystem.initFragments(_Operatingsystem, __Operatingsystem);
			Types._Rootnodetype.initFragments(_Rootnodetype, __Rootnodetype);
			Types._Scalabletier.initFragments(_Scalabletier, __Scalabletier);
			Types._Server.initFragments(_Server, __Server);
			Types._Singlenodetier.initFragments(_Singlenodetier, __Singlenodetier);
			Types._Tier.initFragments(_Tier, __Tier);
			Types._Webapplication.initFragments(_Webapplication, __Webapplication);
			Types._Webserver.initFragments(_Webserver, __Webserver);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__Database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dbms__Dbms = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dbms__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dbms__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dbms__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dbms__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operatingsystem__Operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operatingsystem__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operatingsystem__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operatingsystem__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operatingsystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootnodetype__Rootnodetype = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootnodetype__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootnodetype__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootnodetype__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootnodetype__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalabletier__Scalabletier = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalabletier__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalabletier__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalabletier__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalabletier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__Server = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Singlenodetier__Singlenodetier = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Singlenodetier__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Singlenodetier__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Singlenodetier__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Singlenodetier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tier__Tier = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tier__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tier__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tier__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webapplication__Webapplication = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webapplication__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webapplication__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webapplication__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webapplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webserver__Webserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webserver__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Webserver__OclElement = {
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
			Fragments._Database__Component.initOperations(_Database__Component);
			Fragments._Database__Database.initOperations(_Database__Database);
			Fragments._Database__MixinBase.initOperations(_Database__MixinBase);
			Fragments._Database__OclAny.initOperations(_Database__OclAny);
			Fragments._Database__OclElement.initOperations(_Database__OclElement);

			Fragments._Dbms__Component.initOperations(_Dbms__Component);
			Fragments._Dbms__Dbms.initOperations(_Dbms__Dbms);
			Fragments._Dbms__MixinBase.initOperations(_Dbms__MixinBase);
			Fragments._Dbms__OclAny.initOperations(_Dbms__OclAny);
			Fragments._Dbms__OclElement.initOperations(_Dbms__OclElement);

			Fragments._Operatingsystem__Component.initOperations(_Operatingsystem__Component);
			Fragments._Operatingsystem__MixinBase.initOperations(_Operatingsystem__MixinBase);
			Fragments._Operatingsystem__OclAny.initOperations(_Operatingsystem__OclAny);
			Fragments._Operatingsystem__OclElement.initOperations(_Operatingsystem__OclElement);
			Fragments._Operatingsystem__Operatingsystem.initOperations(_Operatingsystem__Operatingsystem);

			Fragments._Rootnodetype__Component.initOperations(_Rootnodetype__Component);
			Fragments._Rootnodetype__MixinBase.initOperations(_Rootnodetype__MixinBase);
			Fragments._Rootnodetype__OclAny.initOperations(_Rootnodetype__OclAny);
			Fragments._Rootnodetype__OclElement.initOperations(_Rootnodetype__OclElement);
			Fragments._Rootnodetype__Rootnodetype.initOperations(_Rootnodetype__Rootnodetype);

			Fragments._Scalabletier__Component.initOperations(_Scalabletier__Component);
			Fragments._Scalabletier__MixinBase.initOperations(_Scalabletier__MixinBase);
			Fragments._Scalabletier__OclAny.initOperations(_Scalabletier__OclAny);
			Fragments._Scalabletier__OclElement.initOperations(_Scalabletier__OclElement);
			Fragments._Scalabletier__Scalabletier.initOperations(_Scalabletier__Scalabletier);

			Fragments._Server__Component.initOperations(_Server__Component);
			Fragments._Server__MixinBase.initOperations(_Server__MixinBase);
			Fragments._Server__OclAny.initOperations(_Server__OclAny);
			Fragments._Server__OclElement.initOperations(_Server__OclElement);
			Fragments._Server__Server.initOperations(_Server__Server);

			Fragments._Singlenodetier__Component.initOperations(_Singlenodetier__Component);
			Fragments._Singlenodetier__MixinBase.initOperations(_Singlenodetier__MixinBase);
			Fragments._Singlenodetier__OclAny.initOperations(_Singlenodetier__OclAny);
			Fragments._Singlenodetier__OclElement.initOperations(_Singlenodetier__OclElement);
			Fragments._Singlenodetier__Singlenodetier.initOperations(_Singlenodetier__Singlenodetier);

			Fragments._Tier__Component.initOperations(_Tier__Component);
			Fragments._Tier__MixinBase.initOperations(_Tier__MixinBase);
			Fragments._Tier__OclAny.initOperations(_Tier__OclAny);
			Fragments._Tier__OclElement.initOperations(_Tier__OclElement);
			Fragments._Tier__Tier.initOperations(_Tier__Tier);

			Fragments._Webapplication__Component.initOperations(_Webapplication__Component);
			Fragments._Webapplication__MixinBase.initOperations(_Webapplication__MixinBase);
			Fragments._Webapplication__OclAny.initOperations(_Webapplication__OclAny);
			Fragments._Webapplication__OclElement.initOperations(_Webapplication__OclElement);
			Fragments._Webapplication__Webapplication.initOperations(_Webapplication__Webapplication);

			Fragments._Webserver__Component.initOperations(_Webserver__Component);
			Fragments._Webserver__MixinBase.initOperations(_Webserver__MixinBase);
			Fragments._Webserver__OclAny.initOperations(_Webserver__OclAny);
			Fragments._Webserver__OclElement.initOperations(_Webserver__OclElement);
			Fragments._Webserver__Webserver.initOperations(_Webserver__Webserver);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Database = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dbms = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operatingsystem = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rootnodetype = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scalabletier = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Server = {
			ToscabasetypesTables.Properties._Server__memory,
			ToscabasetypesTables.Properties._Server__numCpus
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Singlenodetier = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tier = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Webapplication = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Webserver = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Database__Database.initProperties(_Database);
			Fragments._Dbms__Dbms.initProperties(_Dbms);
			Fragments._Operatingsystem__Operatingsystem.initProperties(_Operatingsystem);
			Fragments._Rootnodetype__Rootnodetype.initProperties(_Rootnodetype);
			Fragments._Scalabletier__Scalabletier.initProperties(_Scalabletier);
			Fragments._Server__Server.initProperties(_Server);
			Fragments._Singlenodetier__Singlenodetier.initProperties(_Singlenodetier);
			Fragments._Tier__Tier.initProperties(_Tier);
			Fragments._Webapplication__Webapplication.initProperties(_Webapplication);
			Fragments._Webserver__Webserver.initProperties(_Webserver);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscabasetypesTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of ToscabasetypesTables::EnumerationLiterals and all preceding sub-packages.
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
