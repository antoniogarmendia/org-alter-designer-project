/**
 */
package externals.impl;

import externals.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsFactoryImpl extends EFactoryImpl implements ExternalsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalsFactory init() {
		try {
			ExternalsFactory theExternalsFactory = (ExternalsFactory)EPackage.Registry.INSTANCE.getEFactory(ExternalsPackage.eNS_URI);
			if (theExternalsFactory != null) {
				return theExternalsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExternalsPackage.EXTERNALS_ROOT: return createExternalsRoot();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS: return createExternalsRootAPIDescriptions();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS: return createExternalsRootAPIDescriptionsItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME: return createExternalsRootAPIDescriptionsItemsName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL: return createExternalsRootAPIDescriptionsItemsProtocol();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL: return createExternalsRootAPIDescriptionsItemsUrl();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS: return createExternalsRootAPIDescriptionsItemsPaths();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS: return createExternalsRootAPIDescriptionsItemsPathsItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE: return createExternalsRootAPIDescriptionsItemsPathsItemsRoute();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS: return createExternalsRootAPIDescriptionsItemsPathsItemsParameters();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS: return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME: return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE: return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS: return createExternalsRootAPIDescriptionsItemsPathsItemsOutputs();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS: return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME: return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE: return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH: return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH: return createExternalsRootAPIDescriptionsItemsAPIAuth();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS: return createExternalsRootAPIDescriptionsItemsAPIAuthItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME: return createExternalsRootAPIDescriptionsItemsAPIAuthItemsName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY: return createExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRoot createExternalsRoot() {
		ExternalsRootImpl externalsRoot = new ExternalsRootImpl();
		return externalsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptions createExternalsRootAPIDescriptions() {
		ExternalsRootAPIDescriptionsImpl externalsRootAPIDescriptions = new ExternalsRootAPIDescriptionsImpl();
		return externalsRootAPIDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItems createExternalsRootAPIDescriptionsItems() {
		ExternalsRootAPIDescriptionsItemsImpl externalsRootAPIDescriptionsItems = new ExternalsRootAPIDescriptionsItemsImpl();
		return externalsRootAPIDescriptionsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsName createExternalsRootAPIDescriptionsItemsName() {
		ExternalsRootAPIDescriptionsItemsNameImpl externalsRootAPIDescriptionsItemsName = new ExternalsRootAPIDescriptionsItemsNameImpl();
		return externalsRootAPIDescriptionsItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsProtocol createExternalsRootAPIDescriptionsItemsProtocol() {
		ExternalsRootAPIDescriptionsItemsProtocolImpl externalsRootAPIDescriptionsItemsProtocol = new ExternalsRootAPIDescriptionsItemsProtocolImpl();
		return externalsRootAPIDescriptionsItemsProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsUrl createExternalsRootAPIDescriptionsItemsUrl() {
		ExternalsRootAPIDescriptionsItemsUrlImpl externalsRootAPIDescriptionsItemsUrl = new ExternalsRootAPIDescriptionsItemsUrlImpl();
		return externalsRootAPIDescriptionsItemsUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPaths createExternalsRootAPIDescriptionsItemsPaths() {
		ExternalsRootAPIDescriptionsItemsPathsImpl externalsRootAPIDescriptionsItemsPaths = new ExternalsRootAPIDescriptionsItemsPathsImpl();
		return externalsRootAPIDescriptionsItemsPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItems createExternalsRootAPIDescriptionsItemsPathsItems() {
		ExternalsRootAPIDescriptionsItemsPathsItemsImpl externalsRootAPIDescriptionsItemsPathsItems = new ExternalsRootAPIDescriptionsItemsPathsItemsImpl();
		return externalsRootAPIDescriptionsItemsPathsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsRoute createExternalsRootAPIDescriptionsItemsPathsItemsRoute() {
		ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl externalsRootAPIDescriptionsItemsPathsItemsRoute = new ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsParameters createExternalsRootAPIDescriptionsItemsPathsItemsParameters() {
		ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl externalsRootAPIDescriptionsItemsPathsItemsParameters = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems createExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() {
		ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl externalsRootAPIDescriptionsItemsPathsItemsParametersItems = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() {
		ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl externalsRootAPIDescriptionsItemsPathsItemsParametersItemsName = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() {
		ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl externalsRootAPIDescriptionsItemsPathsItemsParametersItemsType = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputs createExternalsRootAPIDescriptionsItemsPathsItemsOutputs() {
		ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl externalsRootAPIDescriptionsItemsPathsItemsOutputs = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() {
		ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl externalsRootAPIDescriptionsItemsPathsItemsOutputsItems = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() {
		ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() {
		ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() {
		ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl();
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsAPIAuth createExternalsRootAPIDescriptionsItemsAPIAuth() {
		ExternalsRootAPIDescriptionsItemsAPIAuthImpl externalsRootAPIDescriptionsItemsAPIAuth = new ExternalsRootAPIDescriptionsItemsAPIAuthImpl();
		return externalsRootAPIDescriptionsItemsAPIAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsAPIAuthItems createExternalsRootAPIDescriptionsItemsAPIAuthItems() {
		ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl externalsRootAPIDescriptionsItemsAPIAuthItems = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl();
		return externalsRootAPIDescriptionsItemsAPIAuthItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsAPIAuthItemsName createExternalsRootAPIDescriptionsItemsAPIAuthItemsName() {
		ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl externalsRootAPIDescriptionsItemsAPIAuthItemsName = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl();
		return externalsRootAPIDescriptionsItemsAPIAuthItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey createExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() {
		ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl externalsRootAPIDescriptionsItemsAPIAuthItemsKey = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl();
		return externalsRootAPIDescriptionsItemsAPIAuthItemsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsPackage getExternalsPackage() {
		return (ExternalsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalsPackage getPackage() {
		return ExternalsPackage.eINSTANCE;
	}

} //ExternalsFactoryImpl
