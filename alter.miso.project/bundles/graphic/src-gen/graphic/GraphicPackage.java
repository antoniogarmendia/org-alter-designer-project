/**
 */
package graphic;

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
 * @see graphic.GraphicFactory
 * @model kind="package"
 * @generated
 */
public interface GraphicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/graphic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicPackage eINSTANCE = graphic.impl.GraphicPackageImpl.init();

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRoot()
	 * @generated
	 */
	int GRAPHIC_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Graphic Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT__GRAPHIC_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT__URI = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT__CLASSES = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootPropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootPropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_PROPERTIES_ABSTRACT = 48;

	/**
	 * The number of structural features of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootNameImpl <em>Root Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootNameImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootName()
	 * @generated
	 */
	int GRAPHIC_ROOT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_NAME__NAME = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_NAME_FEATURE_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_NAME_OPERATION_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootURIImpl <em>Root URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootURIImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootURI()
	 * @generated
	 */
	int GRAPHIC_ROOT_URI = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_URI__URI = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_URI_FEATURE_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_URI_OPERATION_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesImpl <em>Root Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClasses()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES__CLASSES = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_FEATURE_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_OPERATION_COUNT = GRAPHIC_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsImpl <em>Root Classes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItems()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS = 2;

	/**
	 * The feature id for the '<em><b>Vname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__VNAME = 3;

	/**
	 * The feature id for the '<em><b>Show Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Material Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS = 6;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS = 7;

	/**
	 * The number of structural features of the '<em>Root Classes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsPropertiesAbstractImpl <em>Root Classes Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsPropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsPropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT = 49;

	/**
	 * The number of structural features of the '<em>Root Classes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsNameImpl <em>Root Classes Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsNameImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsName()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_NAME__NAME = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_NAME_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_NAME_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVersionsImpl <em>Root Classes Items Versions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVersionsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersions()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS = 6;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V1 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V2 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V3 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Root Classes Items Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS___GET__STRING = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVersionsPropertiesAbstractImpl <em>Root Classes Items Versions Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVersionsPropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsPropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT = 50;

	/**
	 * The number of structural features of the '<em>Root Classes Items Versions Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Versions Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV1Impl <em>Root Classes Items Versions V1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVersionsV1Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV1()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1 = 7;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1__V1 = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Versions V1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Versions V1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV2Impl <em>Root Classes Items Versions V2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVersionsV2Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV2()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2 = 8;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2__V2 = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Versions V2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Versions V2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV3Impl <em>Root Classes Items Versions V3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVersionsV3Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV3()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3 = 9;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3__V3 = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Versions V3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Versions V3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVnameImpl <em>Root Classes Items Vname</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVnameImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVname()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME = 10;

	/**
	 * The feature id for the '<em><b>Vname</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V1 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V2 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V3 = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Root Classes Items Vname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME___GET__STRING = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Vname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVnamePropertiesAbstractImpl <em>Root Classes Items Vname Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVnamePropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnamePropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT = 51;

	/**
	 * The number of structural features of the '<em>Root Classes Items Vname Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Vname Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVnameV1Impl <em>Root Classes Items Vname V1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVnameV1Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV1()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1 = 11;

	/**
	 * The feature id for the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1__V1 = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Vname V1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Vname V1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVnameV2Impl <em>Root Classes Items Vname V2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVnameV2Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV2()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2 = 12;

	/**
	 * The feature id for the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2__V2 = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Vname V2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Vname V2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsVnameV3Impl <em>Root Classes Items Vname V3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsVnameV3Impl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV3()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3 = 13;

	/**
	 * The feature id for the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3__V3 = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Vname V3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Vname V3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsShowAttributesImpl <em>Root Classes Items Show Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsShowAttributesImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsShowAttributes()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES = 14;

	/**
	 * The feature id for the '<em><b>Show Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Show Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Show Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsShowAttributesItemsImpl <em>Root Classes Items Show Attributes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsShowAttributesItemsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsShowAttributesItems()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS = 15;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Show Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Show Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsMaterialAttributesImpl <em>Root Classes Items Material Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsMaterialAttributesImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsMaterialAttributes()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES = 16;

	/**
	 * The feature id for the '<em><b>Material Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Material Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Material Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsMaterialAttributesItemsImpl <em>Root Classes Items Material Attributes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsMaterialAttributesItemsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsMaterialAttributesItems()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Material Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Material Attributes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl <em>Root Classes Items Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS = 18;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Planes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ilumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overlapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>XTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>YTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>ZTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Category Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Collision Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Contact Test Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS___GET__STRING = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsPropertiesAbstractImpl <em>Root Classes Items Constraints Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsPropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsPropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT = 52;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsPlanesImpl <em>Root Classes Items Constraints Planes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsPlanesImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsPlanes()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES = 19;

	/**
	 * The feature id for the '<em><b>Planes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES__PLANES = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Planes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Planes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsIluminationImpl <em>Root Classes Items Constraints Ilumination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsIluminationImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsIlumination()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION = 20;

	/**
	 * The feature id for the '<em><b>Ilumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION__ILUMINATION = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Ilumination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Ilumination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeMaxImpl <em>Root Classes Items Constraints Size Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeMaxImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeMax()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX = 21;

	/**
	 * The feature id for the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Size Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Size Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeMinImpl <em>Root Classes Items Constraints Size Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeMinImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeMin()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN = 22;

	/**
	 * The feature id for the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN__SIZE_MIN = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Size Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Size Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeInitImpl <em>Root Classes Items Constraints Size Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeInitImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeInit()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT = 23;

	/**
	 * The feature id for the '<em><b>Size Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT__SIZE_INIT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Size Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Size Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsOverlappingImpl <em>Root Classes Items Constraints Overlapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsOverlappingImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsOverlapping()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING = 24;

	/**
	 * The feature id for the '<em><b>Overlapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Overlapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Overlapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsXToOriginPosImpl <em>Root Classes Items Constraints XTo Origin Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsXToOriginPosImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsXToOriginPos()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS = 25;

	/**
	 * The feature id for the '<em><b>XTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS__XTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints XTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints XTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsYToOriginPosImpl <em>Root Classes Items Constraints YTo Origin Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsYToOriginPosImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsYToOriginPos()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS = 26;

	/**
	 * The feature id for the '<em><b>YTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS__YTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints YTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints YTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsZToOriginPosImpl <em>Root Classes Items Constraints ZTo Origin Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsZToOriginPosImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsZToOriginPos()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS = 27;

	/**
	 * The feature id for the '<em><b>ZTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints ZTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints ZTo Origin Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsRotationImpl <em>Root Classes Items Constraints Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsRotationImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsRotation()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION = 28;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION__ROTATION = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsTextImpl <em>Root Classes Items Constraints Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsTextImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsText()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT = 29;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT__TEXT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsTrimImpl <em>Root Classes Items Constraints Trim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsTrimImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsTrim()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM = 30;

	/**
	 * The feature id for the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM__TRIM = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Trim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Trim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsCategoryBitMaskImpl <em>Root Classes Items Constraints Category Bit Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsCategoryBitMaskImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsCategoryBitMask()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK = 31;

	/**
	 * The feature id for the '<em><b>Category Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Category Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Category Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsCollisionBitMaskImpl <em>Root Classes Items Constraints Collision Bit Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsCollisionBitMaskImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsCollisionBitMask()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK = 32;

	/**
	 * The feature id for the '<em><b>Collision Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Collision Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Collision Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsContactTestBitMaskImpl <em>Root Classes Items Constraints Contact Test Bit Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConstraintsContactTestBitMaskImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsContactTestBitMask()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK = 33;

	/**
	 * The feature id for the '<em><b>Contact Test Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Constraints Contact Test Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Constraints Contact Test Bit Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsImpl <em>Root Classes Items Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnections()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS = 34;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS__CONNECTIONS = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl <em>Root Classes Items Connections Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS = 35;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR = 5;

	/**
	 * The feature id for the '<em><b>Decorator Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR = 6;

	/**
	 * The feature id for the '<em><b>Decorator Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Decorator Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS = 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH = 10;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET = 12;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl <em>Root Classes Items Connections Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT = 53;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsNameImpl <em>Root Classes Items Connections Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsNameImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsName()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME__NAME = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTypeImpl <em>Root Classes Items Connections Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTypeImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsType()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE__TYPE = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsColorImpl <em>Root Classes Items Connections Items Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsColorImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsColor()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR = 38;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR__COLOR = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTextColorImpl <em>Root Classes Items Connections Items Text Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTextColorImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsTextColor()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR = 39;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR__TEXT_COLOR = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Text Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Text Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorImpl <em>Root Classes Items Connections Items Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecorator()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR = 40;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl <em>Root Classes Items Connections Items Decorator Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorColor()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR = 41;

	/**
	 * The feature id for the '<em><b>Decorator Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Decorator Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Decorator Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl <em>Root Classes Items Connections Items Decorator Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorWidth()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH = 42;

	/**
	 * The feature id for the '<em><b>Decorator Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Decorator Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Decorator Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl <em>Root Classes Items Connections Items Decorator Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorPos()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS = 43;

	/**
	 * The feature id for the '<em><b>Decorator Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Decorator Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Decorator Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPatternImpl <em>Root Classes Items Connections Items Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPatternImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPattern()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN = 44;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN__PATTERN = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsWidthImpl <em>Root Classes Items Connections Items Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsWidthImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsWidth()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH = 45;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH__WIDTH = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPositionImpl <em>Root Classes Items Connections Items Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPositionImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPosition()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION = 46;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION__POSITION = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTargetImpl <em>Root Classes Items Connections Items Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTargetImpl
	 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsTarget()
	 * @generated
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET = 47;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET__TARGET = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Classes Items Connections Items Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET_FEATURE_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Classes Items Connections Items Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET_OPERATION_COUNT = GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link graphic.GraphicRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see graphic.GraphicRoot
	 * @generated
	 */
	EClass getGraphicRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRoot#getGraphicRoot <em>Graphic Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphic Root</em>'.
	 * @see graphic.GraphicRoot#getGraphicRoot()
	 * @see #getGraphicRoot()
	 * @generated
	 */
	EReference getGraphicRoot_GraphicRoot();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRoot#getName()
	 * @see #getGraphicRoot()
	 * @generated
	 */
	EAttribute getGraphicRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRoot#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see graphic.GraphicRoot#getURI()
	 * @see #getGraphicRoot()
	 * @generated
	 */
	EAttribute getGraphicRoot_URI();

	/**
	 * Returns the meta object for the reference list '{@link graphic.GraphicRoot#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see graphic.GraphicRoot#getClasses()
	 * @see #getGraphicRoot()
	 * @generated
	 */
	EReference getGraphicRoot_Classes();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRoot#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRoot#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRoot__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Name</em>'.
	 * @see graphic.GraphicRootName
	 * @generated
	 */
	EClass getGraphicRootName();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRootName#getName()
	 * @see #getGraphicRootName()
	 * @generated
	 */
	EAttribute getGraphicRootName_Name();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootURI <em>Root URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root URI</em>'.
	 * @see graphic.GraphicRootURI
	 * @generated
	 */
	EClass getGraphicRootURI();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootURI#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see graphic.GraphicRootURI#getURI()
	 * @see #getGraphicRootURI()
	 * @generated
	 */
	EAttribute getGraphicRootURI_URI();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClasses <em>Root Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes</em>'.
	 * @see graphic.GraphicRootClasses
	 * @generated
	 */
	EClass getGraphicRootClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClasses#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see graphic.GraphicRootClasses#getClasses()
	 * @see #getGraphicRootClasses()
	 * @generated
	 */
	EReference getGraphicRootClasses_Classes();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItems <em>Root Classes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items</em>'.
	 * @see graphic.GraphicRootClassesItems
	 * @generated
	 */
	EClass getGraphicRootClassesItems();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see graphic.GraphicRootClassesItems#getItems()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRootClassesItems#getName()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItems_Name();

	/**
	 * Returns the meta object for the reference '{@link graphic.GraphicRootClassesItems#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Versions</em>'.
	 * @see graphic.GraphicRootClassesItems#getVersions()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_Versions();

	/**
	 * Returns the meta object for the reference '{@link graphic.GraphicRootClassesItems#getVname <em>Vname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vname</em>'.
	 * @see graphic.GraphicRootClassesItems#getVname()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_Vname();

	/**
	 * Returns the meta object for the reference list '{@link graphic.GraphicRootClassesItems#getShowAttributes <em>Show Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Show Attributes</em>'.
	 * @see graphic.GraphicRootClassesItems#getShowAttributes()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_ShowAttributes();

	/**
	 * Returns the meta object for the reference list '{@link graphic.GraphicRootClassesItems#getMaterialAttributes <em>Material Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Attributes</em>'.
	 * @see graphic.GraphicRootClassesItems#getMaterialAttributes()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_MaterialAttributes();

	/**
	 * Returns the meta object for the reference '{@link graphic.GraphicRootClassesItems#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraints</em>'.
	 * @see graphic.GraphicRootClassesItems#getConstraints()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link graphic.GraphicRootClassesItems#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see graphic.GraphicRootClassesItems#getConnections()
	 * @see #getGraphicRootClassesItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItems_Connections();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRootClassesItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRootClassesItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRootClassesItems__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsName <em>Root Classes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Name</em>'.
	 * @see graphic.GraphicRootClassesItemsName
	 * @generated
	 */
	EClass getGraphicRootClassesItemsName();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRootClassesItemsName#getName()
	 * @see #getGraphicRootClassesItemsName()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsName_Name();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVersions <em>Root Classes Items Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Versions</em>'.
	 * @see graphic.GraphicRootClassesItemsVersions
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsVersions#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see graphic.GraphicRootClassesItemsVersions#getVersions()
	 * @see #getGraphicRootClassesItemsVersions()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsVersions_Versions();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersions#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVersions#getV1()
	 * @see #getGraphicRootClassesItemsVersions()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersions_V1();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersions#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVersions#getV2()
	 * @see #getGraphicRootClassesItemsVersions()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersions_V2();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersions#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVersions#getV3()
	 * @see #getGraphicRootClassesItemsVersions()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersions_V3();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRootClassesItemsVersions#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRootClassesItemsVersions#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRootClassesItemsVersions__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVersionsV1 <em>Root Classes Items Versions V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Versions V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV1
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVersionsV1();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersionsV1#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV1#getV1()
	 * @see #getGraphicRootClassesItemsVersionsV1()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersionsV1_V1();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVersionsV2 <em>Root Classes Items Versions V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Versions V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV2
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVersionsV2();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersionsV2#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV2#getV2()
	 * @see #getGraphicRootClassesItemsVersionsV2()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersionsV2_V2();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVersionsV3 <em>Root Classes Items Versions V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Versions V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV3
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVersionsV3();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVersionsV3#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsV3#getV3()
	 * @see #getGraphicRootClassesItemsVersionsV3()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVersionsV3_V3();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVname <em>Root Classes Items Vname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Vname</em>'.
	 * @see graphic.GraphicRootClassesItemsVname
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVname();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsVname#getVname <em>Vname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vname</em>'.
	 * @see graphic.GraphicRootClassesItemsVname#getVname()
	 * @see #getGraphicRootClassesItemsVname()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsVname_Vname();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVname#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVname#getV1()
	 * @see #getGraphicRootClassesItemsVname()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVname_V1();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVname#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVname#getV2()
	 * @see #getGraphicRootClassesItemsVname()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVname_V2();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVname#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVname#getV3()
	 * @see #getGraphicRootClassesItemsVname()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVname_V3();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRootClassesItemsVname#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRootClassesItemsVname#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRootClassesItemsVname__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVnameV1 <em>Root Classes Items Vname V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Vname V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV1
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVnameV1();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVnameV1#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV1#getV1()
	 * @see #getGraphicRootClassesItemsVnameV1()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVnameV1_V1();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVnameV2 <em>Root Classes Items Vname V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Vname V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV2
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVnameV2();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVnameV2#getV2 <em>V2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V2</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV2#getV2()
	 * @see #getGraphicRootClassesItemsVnameV2()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVnameV2_V2();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVnameV3 <em>Root Classes Items Vname V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Vname V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV3
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVnameV3();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsVnameV3#getV3 <em>V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3</em>'.
	 * @see graphic.GraphicRootClassesItemsVnameV3#getV3()
	 * @see #getGraphicRootClassesItemsVnameV3()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsVnameV3_V3();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsShowAttributes <em>Root Classes Items Show Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Show Attributes</em>'.
	 * @see graphic.GraphicRootClassesItemsShowAttributes
	 * @generated
	 */
	EClass getGraphicRootClassesItemsShowAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsShowAttributes#getShowAttributes <em>Show Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Show Attributes</em>'.
	 * @see graphic.GraphicRootClassesItemsShowAttributes#getShowAttributes()
	 * @see #getGraphicRootClassesItemsShowAttributes()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsShowAttributes_ShowAttributes();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsShowAttributesItems <em>Root Classes Items Show Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Show Attributes Items</em>'.
	 * @see graphic.GraphicRootClassesItemsShowAttributesItems
	 * @generated
	 */
	EClass getGraphicRootClassesItemsShowAttributesItems();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsShowAttributesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Items</em>'.
	 * @see graphic.GraphicRootClassesItemsShowAttributesItems#getItems()
	 * @see #getGraphicRootClassesItemsShowAttributesItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsShowAttributesItems_Items();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsMaterialAttributes <em>Root Classes Items Material Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Material Attributes</em>'.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributes
	 * @generated
	 */
	EClass getGraphicRootClassesItemsMaterialAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsMaterialAttributes#getMaterialAttributes <em>Material Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Attributes</em>'.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributes#getMaterialAttributes()
	 * @see #getGraphicRootClassesItemsMaterialAttributes()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsMaterialAttributesItems <em>Root Classes Items Material Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Material Attributes Items</em>'.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributesItems
	 * @generated
	 */
	EClass getGraphicRootClassesItemsMaterialAttributesItems();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsMaterialAttributesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Items</em>'.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributesItems#getItems()
	 * @see #getGraphicRootClassesItemsMaterialAttributesItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsMaterialAttributesItems_Items();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraints <em>Root Classes Items Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsConstraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getConstraints()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsConstraints_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getPlanes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planes</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getPlanes()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Planes();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getIlumination <em>Ilumination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ilumination</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getIlumination()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Ilumination();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getSizeMax <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getSizeMax()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_SizeMax();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getSizeMin <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getSizeMin()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_SizeMin();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getSizeInit <em>Size Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Init</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getSizeInit()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_SizeInit();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getOverlapping <em>Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlapping</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getOverlapping()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Overlapping();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getXToOriginPos <em>XTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getXToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_XToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getYToOriginPos <em>YTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getYToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_YToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getZToOriginPos <em>ZTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getZToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_ZToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getRotation()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getText()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Text();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getTrim <em>Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trim</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getTrim()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_Trim();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getCategoryBitMask <em>Category Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getCategoryBitMask()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_CategoryBitMask();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getCollisionBitMask <em>Collision Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collision Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getCollisionBitMask()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_CollisionBitMask();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraints#getContactTestBitMask <em>Contact Test Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Test Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraints#getContactTestBitMask()
	 * @see #getGraphicRootClassesItemsConstraints()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraints_ContactTestBitMask();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRootClassesItemsConstraints#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRootClassesItemsConstraints#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRootClassesItemsConstraints__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsPlanes <em>Root Classes Items Constraints Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Planes</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsPlanes
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsPlanes();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsPlanes#getPlanes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planes</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsPlanes#getPlanes()
	 * @see #getGraphicRootClassesItemsConstraintsPlanes()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsPlanes_Planes();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsIlumination <em>Root Classes Items Constraints Ilumination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Ilumination</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsIlumination
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsIlumination();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsIlumination#getIlumination <em>Ilumination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ilumination</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsIlumination#getIlumination()
	 * @see #getGraphicRootClassesItemsConstraintsIlumination()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsIlumination_Ilumination();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsSizeMax <em>Root Classes Items Constraints Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Size Max</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMax
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsSizeMax();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsSizeMax#getSizeMax <em>Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Max</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMax#getSizeMax()
	 * @see #getGraphicRootClassesItemsConstraintsSizeMax()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsSizeMax_SizeMax();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsSizeMin <em>Root Classes Items Constraints Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Size Min</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMin
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsSizeMin();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsSizeMin#getSizeMin <em>Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Min</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMin#getSizeMin()
	 * @see #getGraphicRootClassesItemsConstraintsSizeMin()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsSizeMin_SizeMin();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsSizeInit <em>Root Classes Items Constraints Size Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Size Init</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeInit
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsSizeInit();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsSizeInit#getSizeInit <em>Size Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Init</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeInit#getSizeInit()
	 * @see #getGraphicRootClassesItemsConstraintsSizeInit()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsSizeInit_SizeInit();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsOverlapping <em>Root Classes Items Constraints Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Overlapping</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsOverlapping
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsOverlapping();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsOverlapping#getOverlapping <em>Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlapping</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsOverlapping#getOverlapping()
	 * @see #getGraphicRootClassesItemsConstraintsOverlapping()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsOverlapping_Overlapping();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsXToOriginPos <em>Root Classes Items Constraints XTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints XTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsXToOriginPos
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsXToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsXToOriginPos#getXToOriginPos <em>XTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsXToOriginPos#getXToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraintsXToOriginPos()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsXToOriginPos_XToOriginPos();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsYToOriginPos <em>Root Classes Items Constraints YTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints YTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsYToOriginPos
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsYToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsYToOriginPos#getYToOriginPos <em>YTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsYToOriginPos#getYToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraintsYToOriginPos()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsYToOriginPos_YToOriginPos();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsZToOriginPos <em>Root Classes Items Constraints ZTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints ZTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsZToOriginPos
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsZToOriginPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsZToOriginPos#getZToOriginPos <em>ZTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZTo Origin Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsZToOriginPos#getZToOriginPos()
	 * @see #getGraphicRootClassesItemsConstraintsZToOriginPos()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsZToOriginPos_ZToOriginPos();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsRotation <em>Root Classes Items Constraints Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Rotation</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsRotation
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsRotation();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsRotation#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsRotation#getRotation()
	 * @see #getGraphicRootClassesItemsConstraintsRotation()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsRotation_Rotation();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsText <em>Root Classes Items Constraints Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Text</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsText
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsText();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsText#getText()
	 * @see #getGraphicRootClassesItemsConstraintsText()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsText_Text();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsTrim <em>Root Classes Items Constraints Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Trim</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsTrim
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsTrim();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsTrim#getTrim <em>Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trim</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsTrim#getTrim()
	 * @see #getGraphicRootClassesItemsConstraintsTrim()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsTrim_Trim();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsCategoryBitMask <em>Root Classes Items Constraints Category Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Category Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsCategoryBitMask
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsCategoryBitMask();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsCategoryBitMask#getCategoryBitMask <em>Category Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsCategoryBitMask#getCategoryBitMask()
	 * @see #getGraphicRootClassesItemsConstraintsCategoryBitMask()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsCategoryBitMask_CategoryBitMask();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsCollisionBitMask <em>Root Classes Items Constraints Collision Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Collision Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsCollisionBitMask
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsCollisionBitMask();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsCollisionBitMask#getCollisionBitMask <em>Collision Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collision Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsCollisionBitMask#getCollisionBitMask()
	 * @see #getGraphicRootClassesItemsConstraintsCollisionBitMask()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsCollisionBitMask_CollisionBitMask();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsContactTestBitMask <em>Root Classes Items Constraints Contact Test Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Contact Test Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsContactTestBitMask
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsContactTestBitMask();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConstraintsContactTestBitMask#getContactTestBitMask <em>Contact Test Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Test Bit Mask</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsContactTestBitMask#getContactTestBitMask()
	 * @see #getGraphicRootClassesItemsConstraintsContactTestBitMask()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConstraintsContactTestBitMask_ContactTestBitMask();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnections <em>Root Classes Items Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections</em>'.
	 * @see graphic.GraphicRootClassesItemsConnections
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsConnections#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see graphic.GraphicRootClassesItemsConnections#getConnections()
	 * @see #getGraphicRootClassesItemsConnections()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsConnections_Connections();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItems <em>Root Classes Items Connections Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItems();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic.GraphicRootClassesItemsConnectionsItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getItems()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EReference getGraphicRootClassesItemsConnectionsItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getName()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getType()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Type();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getColor()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Color();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getTextColor()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getDecorator()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Decorator();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorColor <em>Decorator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorColor()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorWidth <em>Decorator Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorWidth()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorWidth();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorPos <em>Decorator Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getDecoratorPos()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getPattern()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getWidth()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Width();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getPosition()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Position();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItems#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#getTarget()
	 * @see #getGraphicRootClassesItemsConnectionsItems()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItems_Target();

	/**
	 * Returns the meta object for the '{@link graphic.GraphicRootClassesItemsConnectionsItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getGraphicRootClassesItemsConnectionsItems__Get__String();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsName <em>Root Classes Items Connections Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Name</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsName
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsName();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsName#getName()
	 * @see #getGraphicRootClassesItemsConnectionsItemsName()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsName_Name();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsType <em>Root Classes Items Connections Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Type</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsType
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsType();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsType#getType()
	 * @see #getGraphicRootClassesItemsConnectionsItemsType()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsType_Type();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsColor <em>Root Classes Items Connections Items Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsColor
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsColor#getColor()
	 * @see #getGraphicRootClassesItemsConnectionsItemsColor()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsColor_Color();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsTextColor <em>Root Classes Items Connections Items Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Text Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTextColor
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsTextColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsTextColor#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTextColor#getTextColor()
	 * @see #getGraphicRootClassesItemsConnectionsItemsTextColor()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsTextColor_TextColor();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecorator <em>Root Classes Items Connections Items Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Decorator</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecorator
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsDecorator();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecorator#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecorator#getDecorator()
	 * @see #getGraphicRootClassesItemsConnectionsItemsDecorator()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsDecorator_Decorator();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor <em>Root Classes Items Connections Items Decorator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Decorator Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsDecoratorColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor#getDecoratorColor <em>Decorator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Color</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor#getDecoratorColor()
	 * @see #getGraphicRootClassesItemsConnectionsItemsDecoratorColor()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorColor_DecoratorColor();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth <em>Root Classes Items Connections Items Decorator Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Decorator Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth#getDecoratorWidth <em>Decorator Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth#getDecoratorWidth()
	 * @see #getGraphicRootClassesItemsConnectionsItemsDecoratorWidth()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorWidth_DecoratorWidth();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos <em>Root Classes Items Connections Items Decorator Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Decorator Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsDecoratorPos();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos#getDecoratorPos <em>Decorator Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Pos</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos#getDecoratorPos()
	 * @see #getGraphicRootClassesItemsConnectionsItemsDecoratorPos()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorPos_DecoratorPos();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPattern <em>Root Classes Items Connections Items Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Pattern</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPattern
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsPattern();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPattern#getPattern()
	 * @see #getGraphicRootClassesItemsConnectionsItemsPattern()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsWidth <em>Root Classes Items Connections Items Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsWidth
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsWidth();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsWidth#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsWidth#getWidth()
	 * @see #getGraphicRootClassesItemsConnectionsItemsWidth()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsWidth_Width();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPosition <em>Root Classes Items Connections Items Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Position</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPosition
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsPosition();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPosition#getPosition()
	 * @see #getGraphicRootClassesItemsConnectionsItemsPosition()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsPosition_Position();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsTarget <em>Root Classes Items Connections Items Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Target</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTarget
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsTarget();

	/**
	 * Returns the meta object for the attribute '{@link graphic.GraphicRootClassesItemsConnectionsItemsTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTarget#getTarget()
	 * @see #getGraphicRootClassesItemsConnectionsItemsTarget()
	 * @generated
	 */
	EAttribute getGraphicRootClassesItemsConnectionsItemsTarget_Target();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Properties Abstract</em>'.
	 * @see graphic.GraphicRootPropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsPropertiesAbstract <em>Root Classes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Properties Abstract</em>'.
	 * @see graphic.GraphicRootClassesItemsPropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootClassesItemsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVersionsPropertiesAbstract <em>Root Classes Items Versions Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Versions Properties Abstract</em>'.
	 * @see graphic.GraphicRootClassesItemsVersionsPropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVersionsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsVnamePropertiesAbstract <em>Root Classes Items Vname Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Vname Properties Abstract</em>'.
	 * @see graphic.GraphicRootClassesItemsVnamePropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootClassesItemsVnamePropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract <em>Root Classes Items Constraints Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Constraints Properties Abstract</em>'.
	 * @see graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConstraintsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract <em>Root Classes Items Connections Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Classes Items Connections Items Properties Abstract</em>'.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract
	 * @generated
	 */
	EClass getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphicFactory getGraphicFactory();

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
		 * The meta object literal for the '{@link graphic.impl.GraphicRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRoot()
		 * @generated
		 */
		EClass GRAPHIC_ROOT = eINSTANCE.getGraphicRoot();

		/**
		 * The meta object literal for the '<em><b>Graphic Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT__GRAPHIC_ROOT = eINSTANCE.getGraphicRoot_GraphicRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT__NAME = eINSTANCE.getGraphicRoot_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT__URI = eINSTANCE.getGraphicRoot_URI();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT__CLASSES = eINSTANCE.getGraphicRoot_Classes();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT___GET__STRING = eINSTANCE.getGraphicRoot__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootNameImpl <em>Root Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootNameImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootName()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_NAME = eINSTANCE.getGraphicRootName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_NAME__NAME = eINSTANCE.getGraphicRootName_Name();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootURIImpl <em>Root URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootURIImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootURI()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_URI = eINSTANCE.getGraphicRootURI();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_URI__URI = eINSTANCE.getGraphicRootURI_URI();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesImpl <em>Root Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClasses()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES = eINSTANCE.getGraphicRootClasses();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES__CLASSES = eINSTANCE.getGraphicRootClasses_Classes();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsImpl <em>Root Classes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItems()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS = eINSTANCE.getGraphicRootClassesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS = eINSTANCE.getGraphicRootClassesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS__NAME = eINSTANCE.getGraphicRootClassesItems_Name();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS = eINSTANCE.getGraphicRootClassesItems_Versions();

		/**
		 * The meta object literal for the '<em><b>Vname</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__VNAME = eINSTANCE.getGraphicRootClassesItems_Vname();

		/**
		 * The meta object literal for the '<em><b>Show Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItems_ShowAttributes();

		/**
		 * The meta object literal for the '<em><b>Material Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItems_MaterialAttributes();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS = eINSTANCE.getGraphicRootClassesItems_Constraints();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS = eINSTANCE.getGraphicRootClassesItems_Connections();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT_CLASSES_ITEMS___GET__STRING = eINSTANCE.getGraphicRootClassesItems__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsNameImpl <em>Root Classes Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsNameImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsName()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_NAME = eINSTANCE.getGraphicRootClassesItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_NAME__NAME = eINSTANCE.getGraphicRootClassesItemsName_Name();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVersionsImpl <em>Root Classes Items Versions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVersionsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersions()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS = eINSTANCE.getGraphicRootClassesItemsVersions();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS = eINSTANCE.getGraphicRootClassesItemsVersions_Versions();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V1 = eINSTANCE.getGraphicRootClassesItemsVersions_V1();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V2 = eINSTANCE.getGraphicRootClassesItemsVersions_V2();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V3 = eINSTANCE.getGraphicRootClassesItemsVersions_V3();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS___GET__STRING = eINSTANCE.getGraphicRootClassesItemsVersions__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV1Impl <em>Root Classes Items Versions V1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVersionsV1Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV1()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1 = eINSTANCE.getGraphicRootClassesItemsVersionsV1();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1__V1 = eINSTANCE.getGraphicRootClassesItemsVersionsV1_V1();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV2Impl <em>Root Classes Items Versions V2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVersionsV2Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV2()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2 = eINSTANCE.getGraphicRootClassesItemsVersionsV2();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2__V2 = eINSTANCE.getGraphicRootClassesItemsVersionsV2_V2();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVersionsV3Impl <em>Root Classes Items Versions V3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVersionsV3Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsV3()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3 = eINSTANCE.getGraphicRootClassesItemsVersionsV3();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3__V3 = eINSTANCE.getGraphicRootClassesItemsVersionsV3_V3();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVnameImpl <em>Root Classes Items Vname</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVnameImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVname()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VNAME = eINSTANCE.getGraphicRootClassesItemsVname();

		/**
		 * The meta object literal for the '<em><b>Vname</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME = eINSTANCE.getGraphicRootClassesItemsVname_Vname();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V1 = eINSTANCE.getGraphicRootClassesItemsVname_V1();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V2 = eINSTANCE.getGraphicRootClassesItemsVname_V2();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V3 = eINSTANCE.getGraphicRootClassesItemsVname_V3();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT_CLASSES_ITEMS_VNAME___GET__STRING = eINSTANCE.getGraphicRootClassesItemsVname__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVnameV1Impl <em>Root Classes Items Vname V1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVnameV1Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV1()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1 = eINSTANCE.getGraphicRootClassesItemsVnameV1();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1__V1 = eINSTANCE.getGraphicRootClassesItemsVnameV1_V1();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVnameV2Impl <em>Root Classes Items Vname V2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVnameV2Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV2()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2 = eINSTANCE.getGraphicRootClassesItemsVnameV2();

		/**
		 * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2__V2 = eINSTANCE.getGraphicRootClassesItemsVnameV2_V2();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVnameV3Impl <em>Root Classes Items Vname V3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVnameV3Impl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnameV3()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3 = eINSTANCE.getGraphicRootClassesItemsVnameV3();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3__V3 = eINSTANCE.getGraphicRootClassesItemsVnameV3_V3();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsShowAttributesImpl <em>Root Classes Items Show Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsShowAttributesImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsShowAttributes()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItemsShowAttributes();

		/**
		 * The meta object literal for the '<em><b>Show Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItemsShowAttributes_ShowAttributes();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsShowAttributesItemsImpl <em>Root Classes Items Show Attributes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsShowAttributesItemsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsShowAttributesItems()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS = eINSTANCE.getGraphicRootClassesItemsShowAttributesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS__ITEMS = eINSTANCE.getGraphicRootClassesItemsShowAttributesItems_Items();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsMaterialAttributesImpl <em>Root Classes Items Material Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsMaterialAttributesImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsMaterialAttributes()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItemsMaterialAttributes();

		/**
		 * The meta object literal for the '<em><b>Material Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES = eINSTANCE.getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsMaterialAttributesItemsImpl <em>Root Classes Items Material Attributes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsMaterialAttributesItemsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsMaterialAttributesItems()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS = eINSTANCE.getGraphicRootClassesItemsMaterialAttributesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS__ITEMS = eINSTANCE.getGraphicRootClassesItemsMaterialAttributesItems_Items();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl <em>Root Classes Items Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraints()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS = eINSTANCE.getGraphicRootClassesItemsConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS = eINSTANCE.getGraphicRootClassesItemsConstraints_Constraints();

		/**
		 * The meta object literal for the '<em><b>Planes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES = eINSTANCE.getGraphicRootClassesItemsConstraints_Planes();

		/**
		 * The meta object literal for the '<em><b>Ilumination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION = eINSTANCE.getGraphicRootClassesItemsConstraints_Ilumination();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX = eINSTANCE.getGraphicRootClassesItemsConstraints_SizeMax();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN = eINSTANCE.getGraphicRootClassesItemsConstraints_SizeMin();

		/**
		 * The meta object literal for the '<em><b>Size Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT = eINSTANCE.getGraphicRootClassesItemsConstraints_SizeInit();

		/**
		 * The meta object literal for the '<em><b>Overlapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING = eINSTANCE.getGraphicRootClassesItemsConstraints_Overlapping();

		/**
		 * The meta object literal for the '<em><b>XTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraints_XToOriginPos();

		/**
		 * The meta object literal for the '<em><b>YTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraints_YToOriginPos();

		/**
		 * The meta object literal for the '<em><b>ZTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraints_ZToOriginPos();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION = eINSTANCE.getGraphicRootClassesItemsConstraints_Rotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT = eINSTANCE.getGraphicRootClassesItemsConstraints_Text();

		/**
		 * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM = eINSTANCE.getGraphicRootClassesItemsConstraints_Trim();

		/**
		 * The meta object literal for the '<em><b>Category Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraints_CategoryBitMask();

		/**
		 * The meta object literal for the '<em><b>Collision Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraints_CollisionBitMask();

		/**
		 * The meta object literal for the '<em><b>Contact Test Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraints_ContactTestBitMask();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS___GET__STRING = eINSTANCE.getGraphicRootClassesItemsConstraints__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsPlanesImpl <em>Root Classes Items Constraints Planes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsPlanesImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsPlanes()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES = eINSTANCE.getGraphicRootClassesItemsConstraintsPlanes();

		/**
		 * The meta object literal for the '<em><b>Planes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES__PLANES = eINSTANCE.getGraphicRootClassesItemsConstraintsPlanes_Planes();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsIluminationImpl <em>Root Classes Items Constraints Ilumination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsIluminationImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsIlumination()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION = eINSTANCE.getGraphicRootClassesItemsConstraintsIlumination();

		/**
		 * The meta object literal for the '<em><b>Ilumination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION__ILUMINATION = eINSTANCE.getGraphicRootClassesItemsConstraintsIlumination_Ilumination();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeMaxImpl <em>Root Classes Items Constraints Size Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeMaxImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeMax()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeMax();

		/**
		 * The meta object literal for the '<em><b>Size Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeMax_SizeMax();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeMinImpl <em>Root Classes Items Constraints Size Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeMinImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeMin()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeMin();

		/**
		 * The meta object literal for the '<em><b>Size Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN__SIZE_MIN = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeMin_SizeMin();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeInitImpl <em>Root Classes Items Constraints Size Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsSizeInitImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsSizeInit()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeInit();

		/**
		 * The meta object literal for the '<em><b>Size Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT__SIZE_INIT = eINSTANCE.getGraphicRootClassesItemsConstraintsSizeInit_SizeInit();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsOverlappingImpl <em>Root Classes Items Constraints Overlapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsOverlappingImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsOverlapping()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING = eINSTANCE.getGraphicRootClassesItemsConstraintsOverlapping();

		/**
		 * The meta object literal for the '<em><b>Overlapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING = eINSTANCE.getGraphicRootClassesItemsConstraintsOverlapping_Overlapping();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsXToOriginPosImpl <em>Root Classes Items Constraints XTo Origin Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsXToOriginPosImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsXToOriginPos()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsXToOriginPos();

		/**
		 * The meta object literal for the '<em><b>XTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS__XTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsXToOriginPos_XToOriginPos();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsYToOriginPosImpl <em>Root Classes Items Constraints YTo Origin Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsYToOriginPosImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsYToOriginPos()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsYToOriginPos();

		/**
		 * The meta object literal for the '<em><b>YTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS__YTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsYToOriginPos_YToOriginPos();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsZToOriginPosImpl <em>Root Classes Items Constraints ZTo Origin Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsZToOriginPosImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsZToOriginPos()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsZToOriginPos();

		/**
		 * The meta object literal for the '<em><b>ZTo Origin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS = eINSTANCE.getGraphicRootClassesItemsConstraintsZToOriginPos_ZToOriginPos();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsRotationImpl <em>Root Classes Items Constraints Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsRotationImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsRotation()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION = eINSTANCE.getGraphicRootClassesItemsConstraintsRotation();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION__ROTATION = eINSTANCE.getGraphicRootClassesItemsConstraintsRotation_Rotation();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsTextImpl <em>Root Classes Items Constraints Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsTextImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsText()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT = eINSTANCE.getGraphicRootClassesItemsConstraintsText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT__TEXT = eINSTANCE.getGraphicRootClassesItemsConstraintsText_Text();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsTrimImpl <em>Root Classes Items Constraints Trim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsTrimImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsTrim()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM = eINSTANCE.getGraphicRootClassesItemsConstraintsTrim();

		/**
		 * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM__TRIM = eINSTANCE.getGraphicRootClassesItemsConstraintsTrim_Trim();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsCategoryBitMaskImpl <em>Root Classes Items Constraints Category Bit Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsCategoryBitMaskImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsCategoryBitMask()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsCategoryBitMask();

		/**
		 * The meta object literal for the '<em><b>Category Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsCategoryBitMask_CategoryBitMask();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsCollisionBitMaskImpl <em>Root Classes Items Constraints Collision Bit Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsCollisionBitMaskImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsCollisionBitMask()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsCollisionBitMask();

		/**
		 * The meta object literal for the '<em><b>Collision Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsCollisionBitMask_CollisionBitMask();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsContactTestBitMaskImpl <em>Root Classes Items Constraints Contact Test Bit Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsContactTestBitMaskImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsContactTestBitMask()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsContactTestBitMask();

		/**
		 * The meta object literal for the '<em><b>Contact Test Bit Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK = eINSTANCE.getGraphicRootClassesItemsConstraintsContactTestBitMask_ContactTestBitMask();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsImpl <em>Root Classes Items Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnections()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS = eINSTANCE.getGraphicRootClassesItemsConnections();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS__CONNECTIONS = eINSTANCE.getGraphicRootClassesItemsConnections_Connections();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl <em>Root Classes Items Connections Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItems()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS = eINSTANCE.getGraphicRootClassesItemsConnectionsItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Type();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Color();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_TextColor();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Decorator();

		/**
		 * The meta object literal for the '<em><b>Decorator Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_DecoratorColor();

		/**
		 * The meta object literal for the '<em><b>Decorator Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_DecoratorWidth();

		/**
		 * The meta object literal for the '<em><b>Decorator Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_DecoratorPos();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Pattern();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Width();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Position();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET = eINSTANCE.getGraphicRootClassesItemsConnectionsItems_Target();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS___GET__STRING = eINSTANCE.getGraphicRootClassesItemsConnectionsItems__Get__String();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsNameImpl <em>Root Classes Items Connections Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsNameImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsName()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME__NAME = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsName_Name();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTypeImpl <em>Root Classes Items Connections Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTypeImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsType()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE__TYPE = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsType_Type();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsColorImpl <em>Root Classes Items Connections Items Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsColorImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsColor()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR__COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsColor_Color();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTextColorImpl <em>Root Classes Items Connections Items Text Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTextColorImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsTextColor()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsTextColor();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR__TEXT_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsTextColor_TextColor();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorImpl <em>Root Classes Items Connections Items Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecorator()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecorator();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecorator_Decorator();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl <em>Root Classes Items Connections Items Decorator Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorColor()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorColor();

		/**
		 * The meta object literal for the '<em><b>Decorator Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorColor_DecoratorColor();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl <em>Root Classes Items Connections Items Decorator Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorWidth()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

		/**
		 * The meta object literal for the '<em><b>Decorator Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorWidth_DecoratorWidth();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl <em>Root Classes Items Connections Items Decorator Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsDecoratorPos()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorPos();

		/**
		 * The meta object literal for the '<em><b>Decorator Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsDecoratorPos_DecoratorPos();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPatternImpl <em>Root Classes Items Connections Items Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPatternImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPattern()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN__PATTERN = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsPattern_Pattern();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsWidthImpl <em>Root Classes Items Connections Items Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsWidthImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsWidth()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsWidth();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH__WIDTH = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsWidth_Width();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPositionImpl <em>Root Classes Items Connections Items Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPositionImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPosition()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION__POSITION = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsPosition_Position();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsTargetImpl <em>Root Classes Items Connections Items Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsTargetImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsTarget()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsTarget();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET__TARGET = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsTarget_Target();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootPropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootPropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsPropertiesAbstractImpl <em>Root Classes Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsPropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsPropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootClassesItemsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVersionsPropertiesAbstractImpl <em>Root Classes Items Versions Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVersionsPropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVersionsPropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootClassesItemsVersionsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsVnamePropertiesAbstractImpl <em>Root Classes Items Vname Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsVnamePropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsVnamePropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootClassesItemsVnamePropertiesAbstract();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConstraintsPropertiesAbstractImpl <em>Root Classes Items Constraints Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConstraintsPropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConstraintsPropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootClassesItemsConstraintsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl <em>Root Classes Items Connections Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic.impl.GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl
		 * @see graphic.impl.GraphicPackageImpl#getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract()
		 * @generated
		 */
		EClass GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

	}

} //GraphicPackage
