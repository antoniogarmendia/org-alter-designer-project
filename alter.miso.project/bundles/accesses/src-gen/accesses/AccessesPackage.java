/**
 */
package accesses;

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
 * @see accesses.AccessesFactory
 * @model kind="package"
 * @generated
 */
public interface AccessesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accesses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/accesses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accesses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessesPackage eINSTANCE = accesses.impl.AccessesPackageImpl.init();

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRoot()
	 * @generated
	 */
	int ACCESSES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Accesses Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT__ACCESSES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>External Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT__EXTERNAL_ACCESS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_PROPERTIES_ABSTRACT = 31;

	/**
	 * The number of structural features of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessImpl <em>Root External Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccess()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>External Access</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS = ACCESSES_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_FEATURE_COUNT = ACCESSES_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_OPERATION_COUNT = ACCESSES_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsImpl <em>Root External Access Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItems()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__PATH = 2;

	/**
	 * The feature id for the '<em><b>Ontological</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ONTOLOGICAL = 3;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__CLASSNAME = 4;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__METHOD = 5;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__AUTH = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__INPUT = 7;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__BODY = 9;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__TRIGGER = 10;

	/**
	 * The number of structural features of the '<em>Root External Access Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsPropertiesAbstractImpl <em>Root External Access Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT = 32;

	/**
	 * The number of structural features of the '<em>Root External Access Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsNameImpl <em>Root External Access Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsNameImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsName()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME__NAME = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsPathImpl <em>Root External Access Items Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsPathImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsPath()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH__PATH = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOntologicalImpl <em>Root External Access Items Ontological</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOntologicalImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOntological()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL = 5;

	/**
	 * The feature id for the '<em><b>Ontological</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL__ONTOLOGICAL = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Ontological</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Ontological</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsClassnameImpl <em>Root External Access Items Classname</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsClassnameImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsClassname()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME = 6;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME__CLASSNAME = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Classname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Classname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsMethodImpl <em>Root External Access Items Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsMethodImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsMethod()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD__METHOD = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsAuthImpl <em>Root External Access Items Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsAuthImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsAuth()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH = 8;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH__AUTH = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputImpl <em>Root External Access Items Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInput()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT__INPUT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl <em>Root External Access Items Input Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ATTR = 1;

	/**
	 * The feature id for the '<em><b>API Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__API_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__WAY = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsPropertiesAbstractImpl <em>Root External Access Items Input Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT = 33;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsAttrImpl <em>Root External Access Items Input Items Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsAttrImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsAttr()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR = 11;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR__ATTR = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsAPIInputImpl <em>Root External Access Items Input Items API Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsAPIInputImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsAPIInput()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT = 12;

	/**
	 * The feature id for the '<em><b>API Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items API Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items API Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsWayImpl <em>Root External Access Items Input Items Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsWayImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsWay()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY = 13;

	/**
	 * The feature id for the '<em><b>Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY__WAY = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsValueImpl <em>Root External Access Items Input Items Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsValueImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsValue()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE__VALUE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Input Items Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Input Items Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputImpl <em>Root External Access Items Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOutputImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutput()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT = 15;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT__OUTPUT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsImpl <em>Root External Access Items Output Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItems()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS = 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ATTR = 1;

	/**
	 * The feature id for the '<em><b>API Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__API_OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Root External Access Items Output Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Output Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstractImpl <em>Root External Access Items Output Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT = 34;

	/**
	 * The number of structural features of the '<em>Root External Access Items Output Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Output Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsAttrImpl <em>Root External Access Items Output Items Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsAttrImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsAttr()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR = 17;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR__ATTR = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Output Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Output Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl <em>Root External Access Items Output Items API Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsAPIOutput()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>API Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Output Items API Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Output Items API Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyImpl <em>Root External Access Items Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsBodyImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBody()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY = 19;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY__BODY = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl <em>Root External Access Items Body Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItems()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS = 20;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ATTR = 1;

	/**
	 * The feature id for the '<em><b>API Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__API_BODY = 2;

	/**
	 * The number of structural features of the '<em>Root External Access Items Body Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Body Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstractImpl <em>Root External Access Items Body Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT = 35;

	/**
	 * The number of structural features of the '<em>Root External Access Items Body Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Body Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsAttrImpl <em>Root External Access Items Body Items Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsAttrImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsAttr()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR = 21;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR__ATTR = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Body Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Body Items Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl <em>Root External Access Items Body Items API Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsAPIBody()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY = 22;

	/**
	 * The feature id for the '<em><b>API Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY__API_BODY = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Body Items API Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Body Items API Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl <em>Root External Access Items Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CHANGE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CREATE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_MOVE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_DELETE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_ACCESS = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>On Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_LOAD = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TIME_TRIGGER = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER___GET__STRING = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl <em>Root External Access Items Trigger Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerPropertiesAbstract()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT = 36;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnChangeImpl <em>Root External Access Items Trigger On Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnChangeImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnChange()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE = 24;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE__ON_CHANGE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnCreateImpl <em>Root External Access Items Trigger On Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnCreateImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnCreate()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE = 25;

	/**
	 * The feature id for the '<em><b>On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnMoveImpl <em>Root External Access Items Trigger On Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnMoveImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnMove()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE = 26;

	/**
	 * The feature id for the '<em><b>On Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnDeleteImpl <em>Root External Access Items Trigger On Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnDeleteImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnDelete()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE = 27;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnAccessImpl <em>Root External Access Items Trigger On Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnAccessImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnAccess()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS = 28;

	/**
	 * The feature id for the '<em><b>On Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS__ON_ACCESS = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnLoadImpl <em>Root External Access Items Trigger On Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnLoadImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnLoad()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD = 29;

	/**
	 * The feature id for the '<em><b>On Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD__ON_LOAD = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger On Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger On Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerTimeTriggerImpl <em>Root External Access Items Trigger Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerTimeTriggerImpl
	 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerTimeTrigger()
	 * @generated
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER = 30;

	/**
	 * The feature id for the '<em><b>Time Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External Access Items Trigger Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER_FEATURE_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External Access Items Trigger Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER_OPERATION_COUNT = ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link accesses.AccessesRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see accesses.AccessesRoot
	 * @generated
	 */
	EClass getAccessesRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRoot#getAccessesRoot <em>Accesses Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accesses Root</em>'.
	 * @see accesses.AccessesRoot#getAccessesRoot()
	 * @see #getAccessesRoot()
	 * @generated
	 */
	EReference getAccessesRoot_AccessesRoot();

	/**
	 * Returns the meta object for the reference list '{@link accesses.AccessesRoot#getExternalAccess <em>External Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Access</em>'.
	 * @see accesses.AccessesRoot#getExternalAccess()
	 * @see #getAccessesRoot()
	 * @generated
	 */
	EReference getAccessesRoot_ExternalAccess();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRoot#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRoot#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRoot__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccess <em>Root External Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access</em>'.
	 * @see accesses.AccessesRootExternalAccess
	 * @generated
	 */
	EClass getAccessesRootExternalAccess();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccess#getExternalAccess <em>External Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Access</em>'.
	 * @see accesses.AccessesRootExternalAccess#getExternalAccess()
	 * @see #getAccessesRootExternalAccess()
	 * @generated
	 */
	EReference getAccessesRootExternalAccess_ExternalAccess();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItems <em>Root External Access Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItems
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItems();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getItems()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getName()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getPath()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Path();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getOntological <em>Ontological</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontological</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getOntological()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Ontological();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getClassname()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Classname();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getMethod()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Method();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItems#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getAuth()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItems_Auth();

	/**
	 * Returns the meta object for the reference list '{@link accesses.AccessesRootExternalAccessItems#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getInput()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItems_Input();

	/**
	 * Returns the meta object for the reference list '{@link accesses.AccessesRootExternalAccessItems#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getOutput()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItems_Output();

	/**
	 * Returns the meta object for the reference list '{@link accesses.AccessesRootExternalAccessItems#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getBody()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItems_Body();

	/**
	 * Returns the meta object for the reference '{@link accesses.AccessesRootExternalAccessItems#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItems#getTrigger()
	 * @see #getAccessesRootExternalAccessItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItems_Trigger();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRootExternalAccessItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRootExternalAccessItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRootExternalAccessItems__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsName <em>Root External Access Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Name</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsName
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsName();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsName#getName()
	 * @see #getAccessesRootExternalAccessItemsName()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsName_Name();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsPath <em>Root External Access Items Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Path</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsPath
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsPath();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsPath#getPath()
	 * @see #getAccessesRootExternalAccessItemsPath()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsPath_Path();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOntological <em>Root External Access Items Ontological</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Ontological</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOntological
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOntological();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsOntological#getOntological <em>Ontological</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontological</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOntological#getOntological()
	 * @see #getAccessesRootExternalAccessItemsOntological()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsOntological_Ontological();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsClassname <em>Root External Access Items Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Classname</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsClassname
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsClassname();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsClassname#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsClassname#getClassname()
	 * @see #getAccessesRootExternalAccessItemsClassname()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsClassname_Classname();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsMethod <em>Root External Access Items Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Method</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsMethod
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsMethod();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsMethod#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsMethod#getMethod()
	 * @see #getAccessesRootExternalAccessItemsMethod()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsMethod_Method();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsAuth <em>Root External Access Items Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Auth</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsAuth
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsAuth();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsAuth#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsAuth#getAuth()
	 * @see #getAccessesRootExternalAccessItemsAuth()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsAuth_Auth();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInput <em>Root External Access Items Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInput
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInput();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsInput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInput#getInput()
	 * @see #getAccessesRootExternalAccessItemsInput()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsInput_Input();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItems <em>Root External Access Items Input Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItems();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsInputItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#getItems()
	 * @see #getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsInputItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItems#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#getAttr()
	 * @see #getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItems_Attr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItems#getAPIInput <em>API Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#getAPIInput()
	 * @see #getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItems_APIInput();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItems#getWay <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Way</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#getWay()
	 * @see #getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItems_Way();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItems#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#getValue()
	 * @see #getAccessesRootExternalAccessItemsInputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItems_Value();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRootExternalAccessItemsInputItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRootExternalAccessItemsInputItems__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItemsAttr <em>Root External Access Items Input Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAttr
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItemsAttr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItemsAttr#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAttr#getAttr()
	 * @see #getAccessesRootExternalAccessItemsInputItemsAttr()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItemsAttr_Attr();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItemsAPIInput <em>Root External Access Items Input Items API Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items API Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAPIInput
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItemsAPIInput();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItemsAPIInput#getAPIInput <em>API Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Input</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAPIInput#getAPIInput()
	 * @see #getAccessesRootExternalAccessItemsInputItemsAPIInput()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItemsAPIInput_APIInput();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItemsWay <em>Root External Access Items Input Items Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items Way</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsWay
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItemsWay();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItemsWay#getWay <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Way</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsWay#getWay()
	 * @see #getAccessesRootExternalAccessItemsInputItemsWay()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItemsWay_Way();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItemsValue <em>Root External Access Items Input Items Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items Value</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsValue
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItemsValue();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsInputItemsValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsValue#getValue()
	 * @see #getAccessesRootExternalAccessItemsInputItemsValue()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsInputItemsValue_Value();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOutput <em>Root External Access Items Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutput
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsOutput#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutput#getOutput()
	 * @see #getAccessesRootExternalAccessItemsOutput()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsOutput_Output();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOutputItems <em>Root External Access Items Output Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Output Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOutputItems();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsOutputItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems#getItems()
	 * @see #getAccessesRootExternalAccessItemsOutputItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsOutputItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsOutputItems#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems#getAttr()
	 * @see #getAccessesRootExternalAccessItemsOutputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsOutputItems_Attr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsOutputItems#getAPIOutput <em>API Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems#getAPIOutput()
	 * @see #getAccessesRootExternalAccessItemsOutputItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsOutputItems_APIOutput();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRootExternalAccessItemsOutputItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRootExternalAccessItemsOutputItems__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAttr <em>Root External Access Items Output Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Output Items Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAttr
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOutputItemsAttr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAttr#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAttr#getAttr()
	 * @see #getAccessesRootExternalAccessItemsOutputItemsAttr()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsOutputItemsAttr_Attr();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput <em>Root External Access Items Output Items API Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Output Items API Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOutputItemsAPIOutput();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput#getAPIOutput <em>API Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Output</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput#getAPIOutput()
	 * @see #getAccessesRootExternalAccessItemsOutputItemsAPIOutput()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsOutputItemsAPIOutput_APIOutput();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsBody <em>Root External Access Items Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBody
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsBody();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsBody#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBody#getBody()
	 * @see #getAccessesRootExternalAccessItemsBody()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsBody_Body();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsBodyItems <em>Root External Access Items Body Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Body Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsBodyItems();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsBodyItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems#getItems()
	 * @see #getAccessesRootExternalAccessItemsBodyItems()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsBodyItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsBodyItems#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems#getAttr()
	 * @see #getAccessesRootExternalAccessItemsBodyItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsBodyItems_Attr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsBodyItems#getAPIBody <em>API Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems#getAPIBody()
	 * @see #getAccessesRootExternalAccessItemsBodyItems()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsBodyItems_APIBody();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRootExternalAccessItemsBodyItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRootExternalAccessItemsBodyItems__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAttr <em>Root External Access Items Body Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Body Items Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAttr
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsBodyItemsAttr();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAttr#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAttr#getAttr()
	 * @see #getAccessesRootExternalAccessItemsBodyItemsAttr()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsBodyItemsAttr_Attr();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody <em>Root External Access Items Body Items API Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Body Items API Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsBodyItemsAPIBody();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody#getAPIBody <em>API Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Body</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody#getAPIBody()
	 * @see #getAccessesRootExternalAccessItemsBodyItemsAPIBody()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsBodyItemsAPIBody_APIBody();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTrigger <em>Root External Access Items Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link accesses.AccessesRootExternalAccessItemsTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getTrigger()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EReference getAccessesRootExternalAccessItemsTrigger_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnChange()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnChange();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnCreate <em>On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Create</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnCreate()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnCreate();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnMove <em>On Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Move</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnMove()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnMove();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnDelete()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnAccess <em>On Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Access</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnAccess()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnAccess();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnLoad <em>On Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Load</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getOnLoad()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_OnLoad();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTrigger#getTimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#getTimeTrigger()
	 * @see #getAccessesRootExternalAccessItemsTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTrigger_TimeTrigger();

	/**
	 * Returns the meta object for the '{@link accesses.AccessesRootExternalAccessItemsTrigger#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger#get(java.lang.String)
	 * @generated
	 */
	EOperation getAccessesRootExternalAccessItemsTrigger__Get__String();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnChange <em>Root External Access Items Trigger On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Change</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnChange
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnChange();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnChange#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnChange#getOnChange()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnChange()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnChange_OnChange();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnCreate <em>Root External Access Items Trigger On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Create</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnCreate
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnCreate();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnCreate#getOnCreate <em>On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Create</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnCreate#getOnCreate()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnCreate()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnMove <em>Root External Access Items Trigger On Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Move</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnMove
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnMove();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnMove#getOnMove <em>On Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Move</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnMove#getOnMove()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnMove()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnMove_OnMove();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnDelete <em>Root External Access Items Trigger On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Delete</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnDelete
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnDelete();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnDelete#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnDelete#getOnDelete()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnDelete()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnAccess <em>Root External Access Items Trigger On Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Access</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnAccess
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnAccess();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnAccess#getOnAccess <em>On Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Access</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnAccess#getOnAccess()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnAccess()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnAccess_OnAccess();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnLoad <em>Root External Access Items Trigger On Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger On Load</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnLoad
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerOnLoad();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerOnLoad#getOnLoad <em>On Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Load</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnLoad#getOnLoad()
	 * @see #getAccessesRootExternalAccessItemsTriggerOnLoad()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerOnLoad_OnLoad();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger <em>Root External Access Items Trigger Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger Time Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerTimeTrigger();

	/**
	 * Returns the meta object for the attribute '{@link accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger#getTimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Trigger</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger#getTimeTrigger()
	 * @see #getAccessesRootExternalAccessItemsTriggerTimeTrigger()
	 * @generated
	 */
	EAttribute getAccessesRootExternalAccessItemsTriggerTimeTrigger_TimeTrigger();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Properties Abstract</em>'.
	 * @see accesses.AccessesRootPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsPropertiesAbstract <em>Root External Access Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Properties Abstract</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract <em>Root External Access Items Input Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Input Items Properties Abstract</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract <em>Root External Access Items Output Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Output Items Properties Abstract</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract <em>Root External Access Items Body Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Body Items Properties Abstract</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract <em>Root External Access Items Trigger Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External Access Items Trigger Properties Abstract</em>'.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract
	 * @generated
	 */
	EClass getAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessesFactory getAccessesFactory();

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
		 * The meta object literal for the '{@link accesses.impl.AccessesRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRoot()
		 * @generated
		 */
		EClass ACCESSES_ROOT = eINSTANCE.getAccessesRoot();

		/**
		 * The meta object literal for the '<em><b>Accesses Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT__ACCESSES_ROOT = eINSTANCE.getAccessesRoot_AccessesRoot();

		/**
		 * The meta object literal for the '<em><b>External Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT__EXTERNAL_ACCESS = eINSTANCE.getAccessesRoot_ExternalAccess();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT___GET__STRING = eINSTANCE.getAccessesRoot__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessImpl <em>Root External Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccess()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS = eINSTANCE.getAccessesRootExternalAccess();

		/**
		 * The meta object literal for the '<em><b>External Access</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS = eINSTANCE.getAccessesRootExternalAccess_ExternalAccess();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsImpl <em>Root External Access Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItems()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS = eINSTANCE.getAccessesRootExternalAccessItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS = eINSTANCE.getAccessesRootExternalAccessItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__NAME = eINSTANCE.getAccessesRootExternalAccessItems_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__PATH = eINSTANCE.getAccessesRootExternalAccessItems_Path();

		/**
		 * The meta object literal for the '<em><b>Ontological</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ONTOLOGICAL = eINSTANCE.getAccessesRootExternalAccessItems_Ontological();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__CLASSNAME = eINSTANCE.getAccessesRootExternalAccessItems_Classname();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__METHOD = eINSTANCE.getAccessesRootExternalAccessItems_Method();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__AUTH = eINSTANCE.getAccessesRootExternalAccessItems_Auth();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__INPUT = eINSTANCE.getAccessesRootExternalAccessItems_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__OUTPUT = eINSTANCE.getAccessesRootExternalAccessItems_Output();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__BODY = eINSTANCE.getAccessesRootExternalAccessItems_Body();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__TRIGGER = eINSTANCE.getAccessesRootExternalAccessItems_Trigger();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS___GET__STRING = eINSTANCE.getAccessesRootExternalAccessItems__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsNameImpl <em>Root External Access Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsNameImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsName()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME = eINSTANCE.getAccessesRootExternalAccessItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME__NAME = eINSTANCE.getAccessesRootExternalAccessItemsName_Name();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsPathImpl <em>Root External Access Items Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsPathImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsPath()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH = eINSTANCE.getAccessesRootExternalAccessItemsPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH__PATH = eINSTANCE.getAccessesRootExternalAccessItemsPath_Path();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOntologicalImpl <em>Root External Access Items Ontological</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOntologicalImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOntological()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL = eINSTANCE.getAccessesRootExternalAccessItemsOntological();

		/**
		 * The meta object literal for the '<em><b>Ontological</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL__ONTOLOGICAL = eINSTANCE.getAccessesRootExternalAccessItemsOntological_Ontological();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsClassnameImpl <em>Root External Access Items Classname</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsClassnameImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsClassname()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME = eINSTANCE.getAccessesRootExternalAccessItemsClassname();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME__CLASSNAME = eINSTANCE.getAccessesRootExternalAccessItemsClassname_Classname();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsMethodImpl <em>Root External Access Items Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsMethodImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsMethod()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD = eINSTANCE.getAccessesRootExternalAccessItemsMethod();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD__METHOD = eINSTANCE.getAccessesRootExternalAccessItemsMethod_Method();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsAuthImpl <em>Root External Access Items Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsAuthImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsAuth()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH = eINSTANCE.getAccessesRootExternalAccessItemsAuth();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH__AUTH = eINSTANCE.getAccessesRootExternalAccessItemsAuth_Auth();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputImpl <em>Root External Access Items Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInput()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT = eINSTANCE.getAccessesRootExternalAccessItemsInput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT__INPUT = eINSTANCE.getAccessesRootExternalAccessItemsInput_Input();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl <em>Root External Access Items Input Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItems()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsInputItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsInputItems_Items();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsInputItems_Attr();

		/**
		 * The meta object literal for the '<em><b>API Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__API_INPUT = eINSTANCE.getAccessesRootExternalAccessItemsInputItems_APIInput();

		/**
		 * The meta object literal for the '<em><b>Way</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__WAY = eINSTANCE.getAccessesRootExternalAccessItemsInputItems_Way();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__VALUE = eINSTANCE.getAccessesRootExternalAccessItemsInputItems_Value();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS___GET__STRING = eINSTANCE.getAccessesRootExternalAccessItemsInputItems__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsAttrImpl <em>Root External Access Items Input Items Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsAttrImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsAttr()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsAttr();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsAttr_Attr();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsAPIInputImpl <em>Root External Access Items Input Items API Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsAPIInputImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsAPIInput()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsAPIInput();

		/**
		 * The meta object literal for the '<em><b>API Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsAPIInput_APIInput();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsWayImpl <em>Root External Access Items Input Items Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsWayImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsWay()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsWay();

		/**
		 * The meta object literal for the '<em><b>Way</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY__WAY = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsWay_Way();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsValueImpl <em>Root External Access Items Input Items Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsValueImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsValue()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE__VALUE = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsValue_Value();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputImpl <em>Root External Access Items Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOutputImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutput()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT = eINSTANCE.getAccessesRootExternalAccessItemsOutput();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT__OUTPUT = eINSTANCE.getAccessesRootExternalAccessItemsOutput_Output();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsImpl <em>Root External Access Items Output Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItems()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsOutputItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsOutputItems_Items();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsOutputItems_Attr();

		/**
		 * The meta object literal for the '<em><b>API Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__API_OUTPUT = eINSTANCE.getAccessesRootExternalAccessItemsOutputItems_APIOutput();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS___GET__STRING = eINSTANCE.getAccessesRootExternalAccessItemsOutputItems__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsAttrImpl <em>Root External Access Items Output Items Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsAttrImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsAttr()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR = eINSTANCE.getAccessesRootExternalAccessItemsOutputItemsAttr();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsOutputItemsAttr_Attr();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl <em>Root External Access Items Output Items API Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsAPIOutput()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT = eINSTANCE.getAccessesRootExternalAccessItemsOutputItemsAPIOutput();

		/**
		 * The meta object literal for the '<em><b>API Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT = eINSTANCE.getAccessesRootExternalAccessItemsOutputItemsAPIOutput_APIOutput();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyImpl <em>Root External Access Items Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsBodyImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBody()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY = eINSTANCE.getAccessesRootExternalAccessItemsBody();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY__BODY = eINSTANCE.getAccessesRootExternalAccessItemsBody_Body();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl <em>Root External Access Items Body Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItems()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsBodyItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS = eINSTANCE.getAccessesRootExternalAccessItemsBodyItems_Items();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsBodyItems_Attr();

		/**
		 * The meta object literal for the '<em><b>API Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__API_BODY = eINSTANCE.getAccessesRootExternalAccessItemsBodyItems_APIBody();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS___GET__STRING = eINSTANCE.getAccessesRootExternalAccessItemsBodyItems__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsAttrImpl <em>Root External Access Items Body Items Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsAttrImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsAttr()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR = eINSTANCE.getAccessesRootExternalAccessItemsBodyItemsAttr();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR__ATTR = eINSTANCE.getAccessesRootExternalAccessItemsBodyItemsAttr_Attr();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl <em>Root External Access Items Body Items API Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsAPIBody()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY = eINSTANCE.getAccessesRootExternalAccessItemsBodyItemsAPIBody();

		/**
		 * The meta object literal for the '<em><b>API Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY__API_BODY = eINSTANCE.getAccessesRootExternalAccessItemsBodyItemsAPIBody_APIBody();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl <em>Root External Access Items Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTrigger()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER = eINSTANCE.getAccessesRootExternalAccessItemsTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_Trigger();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CHANGE = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnChange();

		/**
		 * The meta object literal for the '<em><b>On Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CREATE = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnCreate();

		/**
		 * The meta object literal for the '<em><b>On Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_MOVE = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnMove();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_DELETE = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnDelete();

		/**
		 * The meta object literal for the '<em><b>On Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_ACCESS = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnAccess();

		/**
		 * The meta object literal for the '<em><b>On Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_LOAD = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_OnLoad();

		/**
		 * The meta object literal for the '<em><b>Time Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TIME_TRIGGER = eINSTANCE.getAccessesRootExternalAccessItemsTrigger_TimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER___GET__STRING = eINSTANCE.getAccessesRootExternalAccessItemsTrigger__Get__String();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnChangeImpl <em>Root External Access Items Trigger On Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnChangeImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnChange()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnChange();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE__ON_CHANGE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnChange_OnChange();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnCreateImpl <em>Root External Access Items Trigger On Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnCreateImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnCreate()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnCreate();

		/**
		 * The meta object literal for the '<em><b>On Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnMoveImpl <em>Root External Access Items Trigger On Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnMoveImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnMove()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnMove();

		/**
		 * The meta object literal for the '<em><b>On Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnMove_OnMove();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnDeleteImpl <em>Root External Access Items Trigger On Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnDeleteImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnDelete()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnDelete();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnAccessImpl <em>Root External Access Items Trigger On Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnAccessImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnAccess()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnAccess();

		/**
		 * The meta object literal for the '<em><b>On Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS__ON_ACCESS = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnAccess_OnAccess();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnLoadImpl <em>Root External Access Items Trigger On Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerOnLoadImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerOnLoad()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnLoad();

		/**
		 * The meta object literal for the '<em><b>On Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD__ON_LOAD = eINSTANCE.getAccessesRootExternalAccessItemsTriggerOnLoad_OnLoad();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerTimeTriggerImpl <em>Root External Access Items Trigger Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerTimeTriggerImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerTimeTrigger()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER = eINSTANCE.getAccessesRootExternalAccessItemsTriggerTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Time Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER = eINSTANCE.getAccessesRootExternalAccessItemsTriggerTimeTrigger_TimeTrigger();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsPropertiesAbstractImpl <em>Root External Access Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootExternalAccessItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsPropertiesAbstractImpl <em>Root External Access Items Input Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsInputItemsPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstractImpl <em>Root External Access Items Output Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstractImpl <em>Root External Access Items Body Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link accesses.impl.AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl <em>Root External Access Items Trigger Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accesses.impl.AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl
		 * @see accesses.impl.AccessesPackageImpl#getAccessesRootExternalAccessItemsTriggerPropertiesAbstract()
		 * @generated
		 */
		EClass ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT = eINSTANCE.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

	}

} //AccessesPackage
