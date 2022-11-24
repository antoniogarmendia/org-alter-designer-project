/**
 */
package externals;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see externals.ExternalsFactory
 * @model kind="package"
 * @generated
 */
public interface ExternalsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "externals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/externals";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "externals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalsPackage eINSTANCE = externals.impl.ExternalsPackageImpl.init();

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRoot()
	 * @generated
	 */
	int EXTERNALS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Externals Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT__EXTERNALS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>API Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT__API_DESCRIPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_PROPERTIES_ABSTRACT = 22;

	/**
	 * The number of structural features of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsImpl <em>Root API Descriptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptions()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>API Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS = EXTERNALS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_FEATURE_COUNT = EXTERNALS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_OPERATION_COUNT = EXTERNALS_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl <em>Root API Descriptions Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL = 3;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS = 4;

	/**
	 * The feature id for the '<em><b>API Auth</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH = 5;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT = 23;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsNameImpl <em>Root API Descriptions Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsNameImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsName()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME__NAME = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsProtocolImpl <em>Root API Descriptions Items Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsProtocolImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsProtocol()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL__PROTOCOL = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsUrlImpl <em>Root API Descriptions Items Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsUrlImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsUrl()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL__URL = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsImpl <em>Root API Descriptions Items Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPaths()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS = 6;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS__PATHS = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl <em>Root API Descriptions Items Paths Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItems()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS = 7;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__OUTPUTS = 3;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT = 24;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl <em>Root API Descriptions Items Paths Items Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsRoute()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE = 8;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl <em>Root API Descriptions Items Paths Items Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParameters()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS = 9;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS__PARAMETERS = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl <em>Root API Descriptions Items Paths Items Parameters Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Parameters Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Parameters Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT = 25;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl <em>Root API Descriptions Items Paths Items Parameters Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME__NAME = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Parameters Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Parameters Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl <em>Root API Descriptions Items Paths Items Parameters Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE__TYPE = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Parameters Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Parameters Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl <em>Root API Descriptions Items Paths Items Outputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputs()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS = 13;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS__OUTPUTS = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl <em>Root API Descriptions Items Paths Items Outputs Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>JSON Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__JSON_PATH = 3;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT = 26;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl <em>Root API Descriptions Items Paths Items Outputs Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME__NAME = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl <em>Root API Descriptions Items Paths Items Outputs Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE__TYPE = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl <em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH = 17;

	/**
	 * The feature id for the '<em><b>JSON Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH__JSON_PATH = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthImpl <em>Root API Descriptions Items API Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuth()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH = 18;

	/**
	 * The feature id for the '<em><b>API Auth</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items API Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items API Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl <em>Root API Descriptions Items API Auth Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItems()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS = 19;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__KEY = 2;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items API Auth Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items API Auth Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractImpl <em>Root API Descriptions Items API Auth Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT = 27;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items API Auth Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items API Auth Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl <em>Root API Descriptions Items API Auth Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsName()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME__NAME = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items API Auth Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items API Auth Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl <em>Root API Descriptions Items API Auth Items Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl
	 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey()
	 * @generated
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY__KEY = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root API Descriptions Items API Auth Items Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY_FEATURE_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root API Descriptions Items API Auth Items Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY_OPERATION_COUNT = EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link externals.ExternalsRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see externals.ExternalsRoot
	 * @generated
	 */
	EClass getExternalsRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRoot#getExternalsRoot <em>Externals Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals Root</em>'.
	 * @see externals.ExternalsRoot#getExternalsRoot()
	 * @see #getExternalsRoot()
	 * @generated
	 */
	EReference getExternalsRoot_ExternalsRoot();

	/**
	 * Returns the meta object for the reference list '{@link externals.ExternalsRoot#getAPIDescriptions <em>API Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>API Descriptions</em>'.
	 * @see externals.ExternalsRoot#getAPIDescriptions()
	 * @see #getExternalsRoot()
	 * @generated
	 */
	EReference getExternalsRoot_APIDescriptions();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRoot#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRoot#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRoot__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptions <em>Root API Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions</em>'.
	 * @see externals.ExternalsRootAPIDescriptions
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptions#getAPIDescriptions <em>API Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>API Descriptions</em>'.
	 * @see externals.ExternalsRootAPIDescriptions#getAPIDescriptions()
	 * @see #getExternalsRootAPIDescriptions()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptions_APIDescriptions();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItems <em>Root API Descriptions Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItems();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getItems()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getName()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItems#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getProtocol()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItems_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItems#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getUrl()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItems_Url();

	/**
	 * Returns the meta object for the reference list '{@link externals.ExternalsRootAPIDescriptionsItems#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paths</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getPaths()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItems_Paths();

	/**
	 * Returns the meta object for the reference list '{@link externals.ExternalsRootAPIDescriptionsItems#getAPIAuth <em>API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>API Auth</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItems#getAPIAuth()
	 * @see #getExternalsRootAPIDescriptionsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItems_APIAuth();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRootAPIDescriptionsItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRootAPIDescriptionsItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRootAPIDescriptionsItems__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsName <em>Root API Descriptions Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsName
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsName();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsName#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsName()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsName_Name();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsProtocol <em>Root API Descriptions Items Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Protocol</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsProtocol
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsProtocol();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsProtocol#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsProtocol#getProtocol()
	 * @see #getExternalsRootAPIDescriptionsItemsProtocol()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsProtocol_Protocol();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsUrl <em>Root API Descriptions Items Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Url</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsUrl
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsUrl();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsUrl#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsUrl#getUrl()
	 * @see #getExternalsRootAPIDescriptionsItemsUrl()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsUrl_Url();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPaths <em>Root API Descriptions Items Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPaths
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPaths#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPaths#getPaths()
	 * @see #getExternalsRootAPIDescriptionsItemsPaths()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPaths_Paths();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems <em>Root API Descriptions Items Paths Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItems();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems#getItems()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems#getRoute()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItems_Route();

	/**
	 * Returns the meta object for the reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems#getParameters()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItems_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems#getOutputs()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItems_Outputs();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRootAPIDescriptionsItemsPathsItems__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute <em>Root API Descriptions Items Paths Items Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Route</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsRoute();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute#getRoute()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsRoute()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsRoute_Route();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters <em>Root API Descriptions Items Paths Items Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Parameters</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters#getParameters()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParameters()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems <em>Root API Descriptions Items Paths Items Parameters Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Parameters Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getItems()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getType()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Type();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName <em>Root API Descriptions Items Paths Items Parameters Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Parameters Items Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_Name();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType <em>Root API Descriptions Items Paths Items Parameters Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Parameters Items Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType#getType()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_Type();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs <em>Root API Descriptions Items Paths Items Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs#getOutputs()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputs()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems <em>Root API Descriptions Items Paths Items Outputs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getItems()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getType()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Type();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getJSONPath <em>JSON Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JSON Path</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getJSONPath()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_JSONPath();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName <em>Root API Descriptions Items Paths Items Outputs Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs Items Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_Name();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType <em>Root API Descriptions Items Paths Items Outputs Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs Items Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType#getType()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_Type();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath <em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath#getJSONPath <em>JSON Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JSON Path</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath#getJSONPath()
	 * @see #getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_JSONPath();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth <em>Root API Descriptions Items API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items API Auth</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuth
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsAPIAuth();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth#getAPIAuth <em>API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>API Auth</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuth#getAPIAuth()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuth()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems <em>Root API Descriptions Items API Auth Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items API Auth Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsAPIAuthItems();

	/**
	 * Returns the meta object for the containment reference list '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getItems()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuthItems()
	 * @generated
	 */
	EReference getExternalsRootAPIDescriptionsItemsAPIAuthItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuthItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getKey()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuthItems()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItems_Key();

	/**
	 * Returns the meta object for the '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getExternalsRootAPIDescriptionsItemsAPIAuthItems__Get__String();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName <em>Root API Descriptions Items API Auth Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items API Auth Items Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName#getName()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuthItemsName()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItemsName_Name();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey <em>Root API Descriptions Items API Auth Items Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items API Auth Items Key</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

	/**
	 * Returns the meta object for the attribute '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey#getKey()
	 * @see #getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey()
	 * @generated
	 */
	EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_Key();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Properties Abstract</em>'.
	 * @see externals.ExternalsRootPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract <em>Root API Descriptions Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Properties Abstract</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Properties Abstract</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract <em>Root API Descriptions Items API Auth Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root API Descriptions Items API Auth Items Properties Abstract</em>'.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
	 * @generated
	 */
	EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalsFactory getExternalsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRoot()
		 * @generated
		 */
		EClass EXTERNALS_ROOT = eINSTANCE.getExternalsRoot();

		/**
		 * The meta object literal for the '<em><b>Externals Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT__EXTERNALS_ROOT = eINSTANCE.getExternalsRoot_ExternalsRoot();

		/**
		 * The meta object literal for the '<em><b>API Descriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT__API_DESCRIPTIONS = eINSTANCE.getExternalsRoot_APIDescriptions();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT___GET__STRING = eINSTANCE.getExternalsRoot__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsImpl <em>Root API Descriptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptions()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS = eINSTANCE.getExternalsRootAPIDescriptions();

		/**
		 * The meta object literal for the '<em><b>API Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS = eINSTANCE.getExternalsRootAPIDescriptions_APIDescriptions();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl <em>Root API Descriptions Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItems()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItems_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL = eINSTANCE.getExternalsRootAPIDescriptionsItems_Protocol();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL = eINSTANCE.getExternalsRootAPIDescriptionsItems_Url();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS = eINSTANCE.getExternalsRootAPIDescriptionsItems_Paths();

		/**
		 * The meta object literal for the '<em><b>API Auth</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH = eINSTANCE.getExternalsRootAPIDescriptionsItems_APIAuth();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS___GET__STRING = eINSTANCE.getExternalsRootAPIDescriptionsItems__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsNameImpl <em>Root API Descriptions Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsNameImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsName()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsName_Name();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsProtocolImpl <em>Root API Descriptions Items Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsProtocolImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsProtocol()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL = eINSTANCE.getExternalsRootAPIDescriptionsItemsProtocol();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL__PROTOCOL = eINSTANCE.getExternalsRootAPIDescriptionsItemsProtocol_Protocol();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsUrlImpl <em>Root API Descriptions Items Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsUrlImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsUrl()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL = eINSTANCE.getExternalsRootAPIDescriptionsItemsUrl();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL__URL = eINSTANCE.getExternalsRootAPIDescriptionsItemsUrl_Url();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsImpl <em>Root API Descriptions Items Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPaths()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPaths();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS__PATHS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPaths_Paths();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl <em>Root API Descriptions Items Paths Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItems()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems_Items();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ROUTE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems_Route();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__PARAMETERS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems_Parameters();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__OUTPUTS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems_Outputs();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS___GET__STRING = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItems__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl <em>Root API Descriptions Items Paths Items Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsRoute()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsRoute();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsRoute_Route();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl <em>Root API Descriptions Items Paths Items Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParameters()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParameters();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS__PARAMETERS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl <em>Root API Descriptions Items Paths Items Parameters Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Type();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS___GET__STRING = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl <em>Root API Descriptions Items Paths Items Parameters Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_Name();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl <em>Root API Descriptions Items Paths Items Parameters Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE__TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_Type();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl <em>Root API Descriptions Items Paths Items Outputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputs()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS__OUTPUTS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl <em>Root API Descriptions Items Paths Items Outputs Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Type();

		/**
		 * The meta object literal for the '<em><b>JSON Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__JSON_PATH = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_JSONPath();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS___GET__STRING = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl <em>Root API Descriptions Items Paths Items Outputs Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_Name();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl <em>Root API Descriptions Items Paths Items Outputs Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE__TYPE = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_Type();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl <em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

		/**
		 * The meta object literal for the '<em><b>JSON Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH__JSON_PATH = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_JSONPath();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthImpl <em>Root API Descriptions Items API Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuth()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuth();

		/**
		 * The meta object literal for the '<em><b>API Auth</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl <em>Root API Descriptions Items API Auth Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItems()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__ITEMS = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItems_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__KEY = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItems_Key();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS___GET__STRING = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItems__Get__String();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl <em>Root API Descriptions Items API Auth Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsName()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME__NAME = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItemsName_Name();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl <em>Root API Descriptions Items API Auth Items Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY__KEY = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_Key();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootAPIDescriptionsItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractImpl <em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractImpl <em>Root API Descriptions Items API Auth Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractImpl
		 * @see externals.impl.ExternalsPackageImpl#getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract()
		 * @generated
		 */
		EClass EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

	}

} //ExternalsPackage
