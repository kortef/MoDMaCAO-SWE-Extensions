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
 *   /org.modmacao.sugarcrmtypes/model/sugarcrm.ecore
 * using:
 *   /org.modmacao.sugarcrmtypes/model/sugarcrm.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package sugarcrm;

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
import sugarcrm.SugarcrmTables;

/**
 * SugarcrmTables provides the dispatch tables for the sugarcrm for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SugarcrmTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SugarcrmPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = sugarcrm.SugarcrmTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SugarcrmTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Sugarcrmapplication = new EcoreExecutorType(SugarcrmPackage.Literals.SUGARCRMAPPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sugarcrmdatabase = new EcoreExecutorType(SugarcrmPackage.Literals.SUGARCRMDATABASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sugarcrmdatabaseconnection = new EcoreExecutorType(SugarcrmPackage.Literals.SUGARCRMDATABASECONNECTION, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Sugarcrmapplication,
			_Sugarcrmdatabase,
			_Sugarcrmdatabaseconnection
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmapplication__Component = new ExecutorFragment(Types._Sugarcrmapplication, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmapplication__MixinBase = new ExecutorFragment(Types._Sugarcrmapplication, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmapplication__OclAny = new ExecutorFragment(Types._Sugarcrmapplication, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmapplication__OclElement = new ExecutorFragment(Types._Sugarcrmapplication, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmapplication__Sugarcrmapplication = new ExecutorFragment(Types._Sugarcrmapplication, SugarcrmTables.Types._Sugarcrmapplication);

		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabase__Component = new ExecutorFragment(Types._Sugarcrmdatabase, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabase__MixinBase = new ExecutorFragment(Types._Sugarcrmdatabase, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabase__OclAny = new ExecutorFragment(Types._Sugarcrmdatabase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabase__OclElement = new ExecutorFragment(Types._Sugarcrmdatabase, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabase__Sugarcrmdatabase = new ExecutorFragment(Types._Sugarcrmdatabase, SugarcrmTables.Types._Sugarcrmdatabase);

		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabaseconnection__Dependency = new ExecutorFragment(Types._Sugarcrmdatabaseconnection, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabaseconnection__MixinBase = new ExecutorFragment(Types._Sugarcrmdatabaseconnection, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabaseconnection__OclAny = new ExecutorFragment(Types._Sugarcrmdatabaseconnection, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabaseconnection__OclElement = new ExecutorFragment(Types._Sugarcrmdatabaseconnection, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection = new ExecutorFragment(Types._Sugarcrmdatabaseconnection, SugarcrmTables.Types._Sugarcrmdatabaseconnection);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of SugarcrmTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of SugarcrmTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmapplication__adminPassword = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMAPPLICATION__ADMIN_PASSWORD, Types._Sugarcrmapplication, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmapplication__adminUser = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMAPPLICATION__ADMIN_USER, Types._Sugarcrmapplication, 1);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmapplication__siteName = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMAPPLICATION__SITE_NAME, Types._Sugarcrmapplication, 2);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmapplication__sitePath = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMAPPLICATION__SITE_PATH, Types._Sugarcrmapplication, 3);

		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmdatabase__dBName = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMDATABASE__DB_NAME, Types._Sugarcrmdatabase, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmdatabase__dBPassword = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMDATABASE__DB_PASSWORD, Types._Sugarcrmdatabase, 1);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmdatabase__dBPort = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMDATABASE__DB_PORT, Types._Sugarcrmdatabase, 2);
		public static final /*@NonNull*/ ExecutorProperty _Sugarcrmdatabase__dBUser = new EcoreExecutorProperty(SugarcrmPackage.Literals.SUGARCRMDATABASE__DB_USER, Types._Sugarcrmdatabase, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sugarcrmapplication =
			{
				Fragments._Sugarcrmapplication__OclAny /* 0 */,
				Fragments._Sugarcrmapplication__OclElement /* 1 */,
				Fragments._Sugarcrmapplication__MixinBase /* 2 */,
				Fragments._Sugarcrmapplication__Component /* 3 */,
				Fragments._Sugarcrmapplication__Sugarcrmapplication /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sugarcrmapplication = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sugarcrmdatabase =
			{
				Fragments._Sugarcrmdatabase__OclAny /* 0 */,
				Fragments._Sugarcrmdatabase__OclElement /* 1 */,
				Fragments._Sugarcrmdatabase__MixinBase /* 2 */,
				Fragments._Sugarcrmdatabase__Component /* 3 */,
				Fragments._Sugarcrmdatabase__Sugarcrmdatabase /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sugarcrmdatabase = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sugarcrmdatabaseconnection =
			{
				Fragments._Sugarcrmdatabaseconnection__OclAny /* 0 */,
				Fragments._Sugarcrmdatabaseconnection__OclElement /* 1 */,
				Fragments._Sugarcrmdatabaseconnection__MixinBase /* 2 */,
				Fragments._Sugarcrmdatabaseconnection__Dependency /* 3 */,
				Fragments._Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sugarcrmdatabaseconnection = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Sugarcrmapplication.initFragments(_Sugarcrmapplication, __Sugarcrmapplication);
			Types._Sugarcrmdatabase.initFragments(_Sugarcrmdatabase, __Sugarcrmdatabase);
			Types._Sugarcrmdatabaseconnection.initFragments(_Sugarcrmdatabaseconnection, __Sugarcrmdatabaseconnection);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmapplication__Sugarcrmapplication = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmapplication__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmapplication__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmapplication__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmapplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabase__Sugarcrmdatabase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabase__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabase__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabase__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabaseconnection__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabaseconnection__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabaseconnection__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sugarcrmdatabaseconnection__OclElement = {
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
			Fragments._Sugarcrmapplication__Component.initOperations(_Sugarcrmapplication__Component);
			Fragments._Sugarcrmapplication__MixinBase.initOperations(_Sugarcrmapplication__MixinBase);
			Fragments._Sugarcrmapplication__OclAny.initOperations(_Sugarcrmapplication__OclAny);
			Fragments._Sugarcrmapplication__OclElement.initOperations(_Sugarcrmapplication__OclElement);
			Fragments._Sugarcrmapplication__Sugarcrmapplication.initOperations(_Sugarcrmapplication__Sugarcrmapplication);

			Fragments._Sugarcrmdatabase__Component.initOperations(_Sugarcrmdatabase__Component);
			Fragments._Sugarcrmdatabase__MixinBase.initOperations(_Sugarcrmdatabase__MixinBase);
			Fragments._Sugarcrmdatabase__OclAny.initOperations(_Sugarcrmdatabase__OclAny);
			Fragments._Sugarcrmdatabase__OclElement.initOperations(_Sugarcrmdatabase__OclElement);
			Fragments._Sugarcrmdatabase__Sugarcrmdatabase.initOperations(_Sugarcrmdatabase__Sugarcrmdatabase);

			Fragments._Sugarcrmdatabaseconnection__Dependency.initOperations(_Sugarcrmdatabaseconnection__Dependency);
			Fragments._Sugarcrmdatabaseconnection__MixinBase.initOperations(_Sugarcrmdatabaseconnection__MixinBase);
			Fragments._Sugarcrmdatabaseconnection__OclAny.initOperations(_Sugarcrmdatabaseconnection__OclAny);
			Fragments._Sugarcrmdatabaseconnection__OclElement.initOperations(_Sugarcrmdatabaseconnection__OclElement);
			Fragments._Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection.initOperations(_Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sugarcrmapplication = {
			SugarcrmTables.Properties._Sugarcrmapplication__adminPassword,
			SugarcrmTables.Properties._Sugarcrmapplication__adminUser,
			SugarcrmTables.Properties._Sugarcrmapplication__siteName,
			SugarcrmTables.Properties._Sugarcrmapplication__sitePath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sugarcrmdatabase = {
			SugarcrmTables.Properties._Sugarcrmdatabase__dBName,
			SugarcrmTables.Properties._Sugarcrmdatabase__dBPassword,
			SugarcrmTables.Properties._Sugarcrmdatabase__dBPort,
			SugarcrmTables.Properties._Sugarcrmdatabase__dBUser
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sugarcrmdatabaseconnection = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Sugarcrmapplication__Sugarcrmapplication.initProperties(_Sugarcrmapplication);
			Fragments._Sugarcrmdatabase__Sugarcrmdatabase.initProperties(_Sugarcrmdatabase);
			Fragments._Sugarcrmdatabaseconnection__Sugarcrmdatabaseconnection.initProperties(_Sugarcrmdatabaseconnection);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SugarcrmTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of SugarcrmTables::EnumerationLiterals and all preceding sub-packages.
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
