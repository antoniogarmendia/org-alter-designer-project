/**
 */
package ontological;

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
 * @see ontological.OntologicalFactory
 * @model kind="package"
 * @generated
 */
public interface OntologicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ontological";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/ontological";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ontological";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologicalPackage eINSTANCE = ontological.impl.OntologicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRoot()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Ontological Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__URI = 2;

	/**
	 * The feature id for the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__ONLY_CODES = 3;

	/**
	 * The feature id for the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__BLUETOOTH = 4;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__EXTERNAL = 5;

	/**
	 * The feature id for the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__FIREBASE = 6;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__PHYSICS = 7;

	/**
	 * The feature id for the '<em><b>Gameloop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__GAMELOOP = 8;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT__CLASSES = 9;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootPropertiesAbstractImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootPropertiesAbstract()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT = 35;

	/**
	 * The number of structural features of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootNameImpl <em>Root Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootNameImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootName()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_NAME__NAME = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_NAME_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_NAME_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootURIImpl <em>Root URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootURIImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootURI()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_URI = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_URI__URI = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_URI_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_URI_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootOnlyCodesImpl <em>Root Only Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootOnlyCodesImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootOnlyCodes()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_ONLY_CODES = 3;

	/**
	 * The feature id for the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_ONLY_CODES__ONLY_CODES = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Only Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_ONLY_CODES_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Only Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_ONLY_CODES_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootBluetoothImpl <em>Root Bluetooth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootBluetoothImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootBluetooth()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_BLUETOOTH = 4;

	/**
	 * The feature id for the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_BLUETOOTH__BLUETOOTH = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_BLUETOOTH_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_BLUETOOTH_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootExternalImpl <em>Root External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootExternalImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootExternal()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_EXTERNAL = 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_EXTERNAL__EXTERNAL = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_EXTERNAL_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_EXTERNAL_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootFirebaseImpl <em>Root Firebase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootFirebaseImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootFirebase()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_FIREBASE = 6;

	/**
	 * The feature id for the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_FIREBASE__FIREBASE = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Firebase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_FIREBASE_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Firebase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_FIREBASE_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootPhysicsImpl <em>Root Physics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootPhysicsImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootPhysics()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_PHYSICS = 7;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_PHYSICS__PHYSICS = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Physics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_PHYSICS_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Physics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_PHYSICS_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootGameloopImpl <em>Root Gameloop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootGameloopImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootGameloop()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_GAMELOOP = 8;

	/**
	 * The feature id for the '<em><b>Gameloop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Gameloop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_GAMELOOP_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Gameloop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_GAMELOOP_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesImpl <em>Root Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClasses()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES = 9;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES__CLASSES = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_FEATURE_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_OPERATION_COUNT = ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsImpl <em>Root Classes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItems()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__AUTO_ID = 5;

	/**
	 * The feature id for the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__ONLY_CODES = 6;

	/**
	 * The feature id for the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__BLUETOOTH = 7;

	/**
	 * The feature id for the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS__NO_SCN = 8;

	/**
	 * The number of structural features of the '<em>Root Classes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsPropertiesAbstractImpl <em>Root Classes Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsPropertiesAbstractImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsPropertiesAbstract()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT = 36;

	/**
	 * The number of structural features of the '<em>Root Classes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsNameImpl <em>Root Classes Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsNameImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsName()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME__NAME = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAbstractImpl <em>Root Classes Items Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAbstractImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAbstract()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT = 12;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT__ABSTRACT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesImpl <em>Root Classes Items Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributes()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES = 13;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES__ATTRIBUTES = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl <em>Root Classes Items Attributes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN = 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX = 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT = 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY = 6;

	/**
	 * The feature id for the '<em><b>Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY = 8;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl <em>Root Classes Items Attributes Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT = 37;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsNameImpl <em>Root Classes Items Attributes Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsNameImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsName()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME__NAME = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsTypeImpl <em>Root Classes Items Attributes Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsTypeImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsType()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE__TYPE = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsMinImpl <em>Root Classes Items Attributes Items Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsMinImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsMin()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN = 17;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN__MIN = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsMaxImpl <em>Root Classes Items Attributes Items Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsMaxImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsMax()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX = 18;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX__MAX = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsDefaultImpl <em>Root Classes Items Attributes Items Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsDefaultImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsDefault()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT = 19;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT__DEFAULT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsReadOnlyImpl <em>Root Classes Items Attributes Items Read Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsReadOnlyImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsReadOnly()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY = 20;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Read Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Read Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsIsParamImpl <em>Root Classes Items Attributes Items Is Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsIsParamImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsIsParam()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM = 21;

	/**
	 * The feature id for the '<em><b>Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Is Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Is Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsIsKeyImpl <em>Root Classes Items Attributes Items Is Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsIsKeyImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsIsKey()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY = 22;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY__IS_KEY = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Attributes Items Is Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Attributes Items Is Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesImpl <em>Root Classes Items References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferences()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES = 23;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES__REFERENCES = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl <em>Root Classes Items References Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS = 24;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Containtment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN = 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE = 6;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl <em>Root Classes Items References Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT = 38;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsNameImpl <em>Root Classes Items References Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsNameImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsName()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME__NAME = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsContaintmentImpl <em>Root Classes Items References Items Containtment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsContaintmentImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsContaintment()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT = 26;

	/**
	 * The feature id for the '<em><b>Containtment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Containtment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Containtment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsMinImpl <em>Root Classes Items References Items Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsMinImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsMin()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN = 27;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN__MIN = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsMaxImpl <em>Root Classes Items References Items Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsMaxImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsMax()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX = 28;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX__MAX = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsTargetImpl <em>Root Classes Items References Items Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsTargetImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsTarget()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET__TARGET = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsOppositeImpl <em>Root Classes Items References Items Opposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsOppositeImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsOpposite()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE = 30;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items References Items Opposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items References Items Opposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsAutoIDImpl <em>Root Classes Items Auto ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsAutoIDImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAutoID()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID = 31;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Auto ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Auto ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsOnlyCodesImpl <em>Root Classes Items Only Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsOnlyCodesImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsOnlyCodes()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES = 32;

	/**
	 * The feature id for the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES__ONLY_CODES = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Only Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Only Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsBluetoothImpl <em>Root Classes Items Bluetooth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsBluetoothImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsBluetooth()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH = 33;

	/**
	 * The feature id for the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH__BLUETOOTH = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ontological.impl.OntologicalRootClassesItemsNoSCNImpl <em>Root Classes Items No SCN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ontological.impl.OntologicalRootClassesItemsNoSCNImpl
	 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsNoSCN()
	 * @generated
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN = 34;

	/**
	 * The feature id for the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN__NO_SCN = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items No SCN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN_FEATURE_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items No SCN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN_OPERATION_COUNT = ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see ontological.OntologicalRoot
	 * @generated
	 */
	EClass getOntologicalRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRoot#getOntologicalRoot <em>Ontological Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontological Root</em>'.
	 * @see ontological.OntologicalRoot#getOntologicalRoot()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EReference getOntologicalRoot_OntologicalRoot();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRoot#getName()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see ontological.OntologicalRoot#getURI()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_URI();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getOnlyCodes <em>Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Codes</em>'.
	 * @see ontological.OntologicalRoot#getOnlyCodes()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_OnlyCodes();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getBluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bluetooth</em>'.
	 * @see ontological.OntologicalRoot#getBluetooth()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_Bluetooth();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see ontological.OntologicalRoot#getExternal()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_External();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getFirebase <em>Firebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firebase</em>'.
	 * @see ontological.OntologicalRoot#getFirebase()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_Firebase();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see ontological.OntologicalRoot#getPhysics()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_Physics();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRoot#getGameloop <em>Gameloop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gameloop</em>'.
	 * @see ontological.OntologicalRoot#getGameloop()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EAttribute getOntologicalRoot_Gameloop();

	/**
	 * Returns the meta object for the reference list '{@link ontological.OntologicalRoot#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see ontological.OntologicalRoot#getClasses()
	 * @see #getOntologicalRoot()
	 * @generated
	 */
	EReference getOntologicalRoot_Classes();

	/**
	 * Returns the meta object for the '{@link ontological.OntologicalRoot#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ontological.OntologicalRoot#get(java.lang.String)
	 * @generated
	 */
	EOperation getOntologicalRoot__Get__String();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Name</em>'.
	 * @see ontological.OntologicalRootName
	 * @generated
	 */
	EClass getOntologicalRootName();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootName#getName()
	 * @see #getOntologicalRootName()
	 * @generated
	 */
	EAttribute getOntologicalRootName_Name();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootURI <em>Root URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root URI</em>'.
	 * @see ontological.OntologicalRootURI
	 * @generated
	 */
	EClass getOntologicalRootURI();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootURI#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see ontological.OntologicalRootURI#getURI()
	 * @see #getOntologicalRootURI()
	 * @generated
	 */
	EAttribute getOntologicalRootURI_URI();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootOnlyCodes <em>Root Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Only Codes</em>'.
	 * @see ontological.OntologicalRootOnlyCodes
	 * @generated
	 */
	EClass getOntologicalRootOnlyCodes();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootOnlyCodes#getOnlyCodes <em>Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Codes</em>'.
	 * @see ontological.OntologicalRootOnlyCodes#getOnlyCodes()
	 * @see #getOntologicalRootOnlyCodes()
	 * @generated
	 */
	EAttribute getOntologicalRootOnlyCodes_OnlyCodes();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootBluetooth <em>Root Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Bluetooth</em>'.
	 * @see ontological.OntologicalRootBluetooth
	 * @generated
	 */
	EClass getOntologicalRootBluetooth();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootBluetooth#getBluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bluetooth</em>'.
	 * @see ontological.OntologicalRootBluetooth#getBluetooth()
	 * @see #getOntologicalRootBluetooth()
	 * @generated
	 */
	EAttribute getOntologicalRootBluetooth_Bluetooth();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootExternal <em>Root External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root External</em>'.
	 * @see ontological.OntologicalRootExternal
	 * @generated
	 */
	EClass getOntologicalRootExternal();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootExternal#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see ontological.OntologicalRootExternal#getExternal()
	 * @see #getOntologicalRootExternal()
	 * @generated
	 */
	EAttribute getOntologicalRootExternal_External();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootFirebase <em>Root Firebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Firebase</em>'.
	 * @see ontological.OntologicalRootFirebase
	 * @generated
	 */
	EClass getOntologicalRootFirebase();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootFirebase#getFirebase <em>Firebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firebase</em>'.
	 * @see ontological.OntologicalRootFirebase#getFirebase()
	 * @see #getOntologicalRootFirebase()
	 * @generated
	 */
	EAttribute getOntologicalRootFirebase_Firebase();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootPhysics <em>Root Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Physics</em>'.
	 * @see ontological.OntologicalRootPhysics
	 * @generated
	 */
	EClass getOntologicalRootPhysics();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootPhysics#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see ontological.OntologicalRootPhysics#getPhysics()
	 * @see #getOntologicalRootPhysics()
	 * @generated
	 */
	EAttribute getOntologicalRootPhysics_Physics();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootGameloop <em>Root Gameloop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Gameloop</em>'.
	 * @see ontological.OntologicalRootGameloop
	 * @generated
	 */
	EClass getOntologicalRootGameloop();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootGameloop#getGameloop <em>Gameloop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gameloop</em>'.
	 * @see ontological.OntologicalRootGameloop#getGameloop()
	 * @see #getOntologicalRootGameloop()
	 * @generated
	 */
	EAttribute getOntologicalRootGameloop_Gameloop();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClasses <em>Root Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes</em>'.
	 * @see ontological.OntologicalRootClasses
	 * @generated
	 */
	EClass getOntologicalRootClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClasses#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ontological.OntologicalRootClasses#getClasses()
	 * @see #getOntologicalRootClasses()
	 * @generated
	 */
	EReference getOntologicalRootClasses_Classes();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItems <em>Root Classes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items</em>'.
	 * @see ontological.OntologicalRootClassesItems
	 * @generated
	 */
	EClass getOntologicalRootClassesItems();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClassesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ontological.OntologicalRootClassesItems#getItems()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EReference getOntologicalRootClassesItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItems#getName()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItems#getAbstract()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link ontological.OntologicalRootClassesItems#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see ontological.OntologicalRootClassesItems#getAttributes()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EReference getOntologicalRootClassesItems_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link ontological.OntologicalRootClassesItems#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ontological.OntologicalRootClassesItems#getReferences()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EReference getOntologicalRootClassesItems_References();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see ontological.OntologicalRootClassesItems#getAutoID()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_AutoID();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getOnlyCodes <em>Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Codes</em>'.
	 * @see ontological.OntologicalRootClassesItems#getOnlyCodes()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_OnlyCodes();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getBluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bluetooth</em>'.
	 * @see ontological.OntologicalRootClassesItems#getBluetooth()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_Bluetooth();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItems#getNoSCN <em>No SCN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No SCN</em>'.
	 * @see ontological.OntologicalRootClassesItems#getNoSCN()
	 * @see #getOntologicalRootClassesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItems_NoSCN();

	/**
	 * Returns the meta object for the '{@link ontological.OntologicalRootClassesItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ontological.OntologicalRootClassesItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getOntologicalRootClassesItems__Get__String();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsName <em>Root Classes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsName
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsName();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsName#getName()
	 * @see #getOntologicalRootClassesItemsName()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsName_Name();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAbstract <em>Root Classes Items Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItemsAbstract
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAbstract#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItemsAbstract#getAbstract()
	 * @see #getOntologicalRootClassesItemsAbstract()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAbstract_Abstract();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributes <em>Root Classes Items Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributes
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClassesItemsAttributes#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributes#getAttributes()
	 * @see #getOntologicalRootClassesItemsAttributes()
	 * @generated
	 */
	EReference getOntologicalRootClassesItemsAttributes_Attributes();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItems <em>Root Classes Items Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItems();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClassesItemsAttributesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getItems()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EReference getOntologicalRootClassesItemsAttributesItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getName()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getType()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_Type();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getMin()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_Min();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getMax()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_Max();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getDefault()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_Default();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getReadOnly()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getIsParam <em>Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Param</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getIsParam()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_IsParam();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItems#getIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#getIsKey()
	 * @see #getOntologicalRootClassesItemsAttributesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItems_IsKey();

	/**
	 * Returns the meta object for the '{@link ontological.OntologicalRootClassesItemsAttributesItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getOntologicalRootClassesItemsAttributesItems__Get__String();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsName <em>Root Classes Items Attributes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsName
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsName();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsName#getName()
	 * @see #getOntologicalRootClassesItemsAttributesItemsName()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsName_Name();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsType <em>Root Classes Items Attributes Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Type</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsType
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsType();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsType#getType()
	 * @see #getOntologicalRootClassesItemsAttributesItemsType()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsType_Type();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsMin <em>Root Classes Items Attributes Items Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMin
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsMin();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsMin#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMin#getMin()
	 * @see #getOntologicalRootClassesItemsAttributesItemsMin()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsMin_Min();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsMax <em>Root Classes Items Attributes Items Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMax
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsMax();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsMax#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMax#getMax()
	 * @see #getOntologicalRootClassesItemsAttributesItemsMax()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsMax_Max();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsDefault <em>Root Classes Items Attributes Items Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Default</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsDefault
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsDefault();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsDefault#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsDefault#getDefault()
	 * @see #getOntologicalRootClassesItemsAttributesItemsDefault()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsDefault_Default();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsReadOnly <em>Root Classes Items Attributes Items Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Read Only</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsReadOnly
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsReadOnly#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsReadOnly#getReadOnly()
	 * @see #getOntologicalRootClassesItemsAttributesItemsReadOnly()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsReadOnly_ReadOnly();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsParam <em>Root Classes Items Attributes Items Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Is Param</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsParam
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsIsParam();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsParam#getIsParam <em>Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Param</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsParam#getIsParam()
	 * @see #getOntologicalRootClassesItemsAttributesItemsIsParam()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsIsParam_IsParam();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsKey <em>Root Classes Items Attributes Items Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Is Key</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsKey
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsIsKey();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsKey#getIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsKey#getIsKey()
	 * @see #getOntologicalRootClassesItemsAttributesItemsIsKey()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAttributesItemsIsKey_IsKey();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferences <em>Root Classes Items References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferences
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClassesItemsReferences#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferences#getReferences()
	 * @see #getOntologicalRootClassesItemsReferences()
	 * @generated
	 */
	EReference getOntologicalRootClassesItemsReferences_References();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItems <em>Root Classes Items References Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItems();

	/**
	 * Returns the meta object for the containment reference list '{@link ontological.OntologicalRootClassesItemsReferencesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getItems()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EReference getOntologicalRootClassesItemsReferencesItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getName()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getContaintment <em>Containtment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containtment</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getContaintment()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Containtment();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getMin()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Min();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getMax()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Max();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getTarget()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Target();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItems#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opposite</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#getOpposite()
	 * @see #getOntologicalRootClassesItemsReferencesItems()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItems_Opposite();

	/**
	 * Returns the meta object for the '{@link ontological.OntologicalRootClassesItemsReferencesItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getOntologicalRootClassesItemsReferencesItems__Get__String();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsName <em>Root Classes Items References Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsName
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsName();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsName#getName()
	 * @see #getOntologicalRootClassesItemsReferencesItemsName()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsName_Name();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsContaintment <em>Root Classes Items References Items Containtment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Containtment</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsContaintment
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsContaintment();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsContaintment#getContaintment <em>Containtment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containtment</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsContaintment#getContaintment()
	 * @see #getOntologicalRootClassesItemsReferencesItemsContaintment()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsContaintment_Containtment();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsMin <em>Root Classes Items References Items Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMin
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsMin();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsMin#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMin#getMin()
	 * @see #getOntologicalRootClassesItemsReferencesItemsMin()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsMin_Min();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsMax <em>Root Classes Items References Items Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMax
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsMax();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsMax#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMax#getMax()
	 * @see #getOntologicalRootClassesItemsReferencesItemsMax()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsMax_Max();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsTarget <em>Root Classes Items References Items Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Target</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsTarget
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsTarget();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsTarget#getTarget()
	 * @see #getOntologicalRootClassesItemsReferencesItemsTarget()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsTarget_Target();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsOpposite <em>Root Classes Items References Items Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Opposite</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsOpposite
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsOpposite();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsReferencesItemsOpposite#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opposite</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsOpposite#getOpposite()
	 * @see #getOntologicalRootClassesItemsReferencesItemsOpposite()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsReferencesItemsOpposite_Opposite();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAutoID <em>Root Classes Items Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Auto ID</em>'.
	 * @see ontological.OntologicalRootClassesItemsAutoID
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAutoID();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsAutoID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see ontological.OntologicalRootClassesItemsAutoID#getAutoID()
	 * @see #getOntologicalRootClassesItemsAutoID()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsAutoID_AutoID();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsOnlyCodes <em>Root Classes Items Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Only Codes</em>'.
	 * @see ontological.OntologicalRootClassesItemsOnlyCodes
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsOnlyCodes();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsOnlyCodes#getOnlyCodes <em>Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Codes</em>'.
	 * @see ontological.OntologicalRootClassesItemsOnlyCodes#getOnlyCodes()
	 * @see #getOntologicalRootClassesItemsOnlyCodes()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsOnlyCodes_OnlyCodes();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsBluetooth <em>Root Classes Items Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Bluetooth</em>'.
	 * @see ontological.OntologicalRootClassesItemsBluetooth
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsBluetooth();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsBluetooth#getBluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bluetooth</em>'.
	 * @see ontological.OntologicalRootClassesItemsBluetooth#getBluetooth()
	 * @see #getOntologicalRootClassesItemsBluetooth()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsBluetooth_Bluetooth();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsNoSCN <em>Root Classes Items No SCN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items No SCN</em>'.
	 * @see ontological.OntologicalRootClassesItemsNoSCN
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsNoSCN();

	/**
	 * Returns the meta object for the attribute '{@link ontological.OntologicalRootClassesItemsNoSCN#getNoSCN <em>No SCN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No SCN</em>'.
	 * @see ontological.OntologicalRootClassesItemsNoSCN#getNoSCN()
	 * @see #getOntologicalRootClassesItemsNoSCN()
	 * @generated
	 */
	EAttribute getOntologicalRootClassesItemsNoSCN_NoSCN();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Properties Abstract</em>'.
	 * @see ontological.OntologicalRootPropertiesAbstract
	 * @generated
	 */
	EClass getOntologicalRootPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsPropertiesAbstract <em>Root Classes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Properties Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItemsPropertiesAbstract
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract <em>Root Classes Items Attributes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Attributes Items Properties Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract <em>Root Classes Items References Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items References Items Properties Abstract</em>'.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract
	 * @generated
	 */
	EClass getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntologicalFactory getOntologicalFactory();

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
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRoot()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT = eINSTANCE.getOntologicalRoot();

		/**
		 * The meta object literal for the '<em><b>Ontological Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT = eINSTANCE.getOntologicalRoot_OntologicalRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__NAME = eINSTANCE.getOntologicalRoot_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__URI = eINSTANCE.getOntologicalRoot_URI();

		/**
		 * The meta object literal for the '<em><b>Only Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__ONLY_CODES = eINSTANCE.getOntologicalRoot_OnlyCodes();

		/**
		 * The meta object literal for the '<em><b>Bluetooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__BLUETOOTH = eINSTANCE.getOntologicalRoot_Bluetooth();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__EXTERNAL = eINSTANCE.getOntologicalRoot_External();

		/**
		 * The meta object literal for the '<em><b>Firebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__FIREBASE = eINSTANCE.getOntologicalRoot_Firebase();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__PHYSICS = eINSTANCE.getOntologicalRoot_Physics();

		/**
		 * The meta object literal for the '<em><b>Gameloop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT__GAMELOOP = eINSTANCE.getOntologicalRoot_Gameloop();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT__CLASSES = eINSTANCE.getOntologicalRoot_Classes();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTOLOGICAL_ROOT___GET__STRING = eINSTANCE.getOntologicalRoot__Get__String();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootNameImpl <em>Root Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootNameImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootName()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_NAME = eINSTANCE.getOntologicalRootName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_NAME__NAME = eINSTANCE.getOntologicalRootName_Name();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootURIImpl <em>Root URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootURIImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootURI()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_URI = eINSTANCE.getOntologicalRootURI();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_URI__URI = eINSTANCE.getOntologicalRootURI_URI();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootOnlyCodesImpl <em>Root Only Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootOnlyCodesImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootOnlyCodes()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_ONLY_CODES = eINSTANCE.getOntologicalRootOnlyCodes();

		/**
		 * The meta object literal for the '<em><b>Only Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_ONLY_CODES__ONLY_CODES = eINSTANCE.getOntologicalRootOnlyCodes_OnlyCodes();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootBluetoothImpl <em>Root Bluetooth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootBluetoothImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootBluetooth()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_BLUETOOTH = eINSTANCE.getOntologicalRootBluetooth();

		/**
		 * The meta object literal for the '<em><b>Bluetooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_BLUETOOTH__BLUETOOTH = eINSTANCE.getOntologicalRootBluetooth_Bluetooth();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootExternalImpl <em>Root External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootExternalImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootExternal()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_EXTERNAL = eINSTANCE.getOntologicalRootExternal();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_EXTERNAL__EXTERNAL = eINSTANCE.getOntologicalRootExternal_External();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootFirebaseImpl <em>Root Firebase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootFirebaseImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootFirebase()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_FIREBASE = eINSTANCE.getOntologicalRootFirebase();

		/**
		 * The meta object literal for the '<em><b>Firebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_FIREBASE__FIREBASE = eINSTANCE.getOntologicalRootFirebase_Firebase();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootPhysicsImpl <em>Root Physics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootPhysicsImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootPhysics()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_PHYSICS = eINSTANCE.getOntologicalRootPhysics();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_PHYSICS__PHYSICS = eINSTANCE.getOntologicalRootPhysics_Physics();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootGameloopImpl <em>Root Gameloop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootGameloopImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootGameloop()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_GAMELOOP = eINSTANCE.getOntologicalRootGameloop();

		/**
		 * The meta object literal for the '<em><b>Gameloop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP = eINSTANCE.getOntologicalRootGameloop_Gameloop();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesImpl <em>Root Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClasses()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES = eINSTANCE.getOntologicalRootClasses();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES__CLASSES = eINSTANCE.getOntologicalRootClasses_Classes();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsImpl <em>Root Classes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItems()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS = eINSTANCE.getOntologicalRootClassesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS = eINSTANCE.getOntologicalRootClassesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__NAME = eINSTANCE.getOntologicalRootClassesItems_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__ABSTRACT = eINSTANCE.getOntologicalRootClassesItems_Abstract();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS__ATTRIBUTES = eINSTANCE.getOntologicalRootClassesItems_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS__REFERENCES = eINSTANCE.getOntologicalRootClassesItems_References();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__AUTO_ID = eINSTANCE.getOntologicalRootClassesItems_AutoID();

		/**
		 * The meta object literal for the '<em><b>Only Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__ONLY_CODES = eINSTANCE.getOntologicalRootClassesItems_OnlyCodes();

		/**
		 * The meta object literal for the '<em><b>Bluetooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__BLUETOOTH = eINSTANCE.getOntologicalRootClassesItems_Bluetooth();

		/**
		 * The meta object literal for the '<em><b>No SCN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS__NO_SCN = eINSTANCE.getOntologicalRootClassesItems_NoSCN();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTOLOGICAL_ROOT_CLASSES_ITEMS___GET__STRING = eINSTANCE.getOntologicalRootClassesItems__Get__String();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsNameImpl <em>Root Classes Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsNameImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsName()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME = eINSTANCE.getOntologicalRootClassesItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME__NAME = eINSTANCE.getOntologicalRootClassesItemsName_Name();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAbstractImpl <em>Root Classes Items Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAbstractImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAbstract()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT = eINSTANCE.getOntologicalRootClassesItemsAbstract();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT__ABSTRACT = eINSTANCE.getOntologicalRootClassesItemsAbstract_Abstract();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesImpl <em>Root Classes Items Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributes()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES = eINSTANCE.getOntologicalRootClassesItemsAttributes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES__ATTRIBUTES = eINSTANCE.getOntologicalRootClassesItemsAttributes_Attributes();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl <em>Root Classes Items Attributes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItems()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS = eINSTANCE.getOntologicalRootClassesItemsAttributesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Type();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Max();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_Default();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_IsParam();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY = eINSTANCE.getOntologicalRootClassesItemsAttributesItems_IsKey();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS___GET__STRING = eINSTANCE.getOntologicalRootClassesItemsAttributesItems__Get__String();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsNameImpl <em>Root Classes Items Attributes Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsNameImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsName()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME__NAME = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsName_Name();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsTypeImpl <em>Root Classes Items Attributes Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsTypeImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsType()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE__TYPE = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsType_Type();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsMinImpl <em>Root Classes Items Attributes Items Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsMinImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsMin()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsMin();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN__MIN = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsMin_Min();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsMaxImpl <em>Root Classes Items Attributes Items Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsMaxImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsMax()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsMax();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX__MAX = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsMax_Max();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsDefaultImpl <em>Root Classes Items Attributes Items Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsDefaultImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsDefault()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsDefault();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT__DEFAULT = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsDefault_Default();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsReadOnlyImpl <em>Root Classes Items Attributes Items Read Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsReadOnlyImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsReadOnly()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsReadOnly_ReadOnly();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsIsParamImpl <em>Root Classes Items Attributes Items Is Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsIsParamImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsIsParam()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsIsParam();

		/**
		 * The meta object literal for the '<em><b>Is Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsIsParam_IsParam();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsIsKeyImpl <em>Root Classes Items Attributes Items Is Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsIsKeyImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsIsKey()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsIsKey();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY__IS_KEY = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsIsKey_IsKey();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesImpl <em>Root Classes Items References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferences()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES = eINSTANCE.getOntologicalRootClassesItemsReferences();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES__REFERENCES = eINSTANCE.getOntologicalRootClassesItemsReferences_References();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl <em>Root Classes Items References Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItems()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS = eINSTANCE.getOntologicalRootClassesItemsReferencesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Name();

		/**
		 * The meta object literal for the '<em><b>Containtment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Containtment();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Max();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Target();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE = eINSTANCE.getOntologicalRootClassesItemsReferencesItems_Opposite();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS___GET__STRING = eINSTANCE.getOntologicalRootClassesItemsReferencesItems__Get__String();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsNameImpl <em>Root Classes Items References Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsNameImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsName()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME__NAME = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsName_Name();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsContaintmentImpl <em>Root Classes Items References Items Containtment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsContaintmentImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsContaintment()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsContaintment();

		/**
		 * The meta object literal for the '<em><b>Containtment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsContaintment_Containtment();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsMinImpl <em>Root Classes Items References Items Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsMinImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsMin()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsMin();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN__MIN = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsMin_Min();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsMaxImpl <em>Root Classes Items References Items Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsMaxImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsMax()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsMax();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX__MAX = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsMax_Max();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsTargetImpl <em>Root Classes Items References Items Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsTargetImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsTarget()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsTarget();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET__TARGET = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsTarget_Target();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsOppositeImpl <em>Root Classes Items References Items Opposite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsOppositeImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsOpposite()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsOpposite();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsOpposite_Opposite();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAutoIDImpl <em>Root Classes Items Auto ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAutoIDImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAutoID()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID = eINSTANCE.getOntologicalRootClassesItemsAutoID();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID = eINSTANCE.getOntologicalRootClassesItemsAutoID_AutoID();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsOnlyCodesImpl <em>Root Classes Items Only Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsOnlyCodesImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsOnlyCodes()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES = eINSTANCE.getOntologicalRootClassesItemsOnlyCodes();

		/**
		 * The meta object literal for the '<em><b>Only Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES__ONLY_CODES = eINSTANCE.getOntologicalRootClassesItemsOnlyCodes_OnlyCodes();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsBluetoothImpl <em>Root Classes Items Bluetooth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsBluetoothImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsBluetooth()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH = eINSTANCE.getOntologicalRootClassesItemsBluetooth();

		/**
		 * The meta object literal for the '<em><b>Bluetooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH__BLUETOOTH = eINSTANCE.getOntologicalRootClassesItemsBluetooth_Bluetooth();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsNoSCNImpl <em>Root Classes Items No SCN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsNoSCNImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsNoSCN()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN = eINSTANCE.getOntologicalRootClassesItemsNoSCN();

		/**
		 * The meta object literal for the '<em><b>No SCN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN__NO_SCN = eINSTANCE.getOntologicalRootClassesItemsNoSCN_NoSCN();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootPropertiesAbstractImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootPropertiesAbstract()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT = eINSTANCE.getOntologicalRootPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsPropertiesAbstractImpl <em>Root Classes Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsPropertiesAbstractImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getOntologicalRootClassesItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl <em>Root Classes Items Attributes Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl <em>Root Classes Items References Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ontological.impl.OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl
		 * @see ontological.impl.OntologicalPackageImpl#getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract()
		 * @generated
		 */
		EClass ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

	}

} //OntologicalPackage
