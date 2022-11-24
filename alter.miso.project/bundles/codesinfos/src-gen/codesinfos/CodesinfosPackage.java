/**
 */
package codesinfos;

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
 * @see codesinfos.CodesinfosFactory
 * @model kind="package"
 * @generated
 */
public interface CodesinfosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codesinfos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/codesinfos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codesinfos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesinfosPackage eINSTANCE = codesinfos.impl.CodesinfosPackageImpl.init();

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRoot()
	 * @generated
	 */
	int CODESINFOS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Codesinfos Root</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT__CODESINFOS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT__CODES = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootPropertiesAbstractImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootPropertiesAbstract()
	 * @generated
	 */
	int CODESINFOS_ROOT_PROPERTIES_ABSTRACT = 7;

	/**
	 * The number of structural features of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootNameImpl <em>Root Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootNameImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootName()
	 * @generated
	 */
	int CODESINFOS_ROOT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_NAME__NAME = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_NAME_FEATURE_COUNT = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_NAME_OPERATION_COUNT = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesImpl <em>Root Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodes()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES = 2;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES__CODES = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_FEATURE_COUNT = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_OPERATION_COUNT = CODESINFOS_ROOT_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesItemsImpl <em>Root Codes Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesItemsImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItems()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS__CLASSNAME = 2;

	/**
	 * The feature id for the '<em><b>Nodename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS__NODENAME = 3;

	/**
	 * The number of structural features of the '<em>Root Codes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS___GET__STRING = 0;

	/**
	 * The number of operations of the '<em>Root Codes Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesItemsPropertiesAbstractImpl <em>Root Codes Items Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesItemsPropertiesAbstractImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsPropertiesAbstract()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT = 8;

	/**
	 * The number of structural features of the '<em>Root Codes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Root Codes Items Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesItemsNameImpl <em>Root Codes Items Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesItemsNameImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsName()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NAME__NAME = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Codes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NAME_FEATURE_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Codes Items Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NAME_OPERATION_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesItemsClassnameImpl <em>Root Codes Items Classname</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesItemsClassnameImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsClassname()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME = 5;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME__CLASSNAME = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Codes Items Classname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME_FEATURE_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Codes Items Classname</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME_OPERATION_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codesinfos.impl.CodesinfosRootCodesItemsNodenameImpl <em>Root Codes Items Nodename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codesinfos.impl.CodesinfosRootCodesItemsNodenameImpl
	 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsNodename()
	 * @generated
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NODENAME = 6;

	/**
	 * The feature id for the '<em><b>Nodename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Codes Items Nodename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NODENAME_FEATURE_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Codes Items Nodename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODESINFOS_ROOT_CODES_ITEMS_NODENAME_OPERATION_COUNT = CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see codesinfos.CodesinfosRoot
	 * @generated
	 */
	EClass getCodesinfosRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link codesinfos.CodesinfosRoot#getCodesinfosRoot <em>Codesinfos Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codesinfos Root</em>'.
	 * @see codesinfos.CodesinfosRoot#getCodesinfosRoot()
	 * @see #getCodesinfosRoot()
	 * @generated
	 */
	EReference getCodesinfosRoot_CodesinfosRoot();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codesinfos.CodesinfosRoot#getName()
	 * @see #getCodesinfosRoot()
	 * @generated
	 */
	EAttribute getCodesinfosRoot_Name();

	/**
	 * Returns the meta object for the reference list '{@link codesinfos.CodesinfosRoot#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Codes</em>'.
	 * @see codesinfos.CodesinfosRoot#getCodes()
	 * @see #getCodesinfosRoot()
	 * @generated
	 */
	EReference getCodesinfosRoot_Codes();

	/**
	 * Returns the meta object for the '{@link codesinfos.CodesinfosRoot#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see codesinfos.CodesinfosRoot#get(java.lang.String)
	 * @generated
	 */
	EOperation getCodesinfosRoot__Get__String();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Name</em>'.
	 * @see codesinfos.CodesinfosRootName
	 * @generated
	 */
	EClass getCodesinfosRootName();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codesinfos.CodesinfosRootName#getName()
	 * @see #getCodesinfosRootName()
	 * @generated
	 */
	EAttribute getCodesinfosRootName_Name();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodes <em>Root Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes</em>'.
	 * @see codesinfos.CodesinfosRootCodes
	 * @generated
	 */
	EClass getCodesinfosRootCodes();

	/**
	 * Returns the meta object for the containment reference list '{@link codesinfos.CodesinfosRootCodes#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codes</em>'.
	 * @see codesinfos.CodesinfosRootCodes#getCodes()
	 * @see #getCodesinfosRootCodes()
	 * @generated
	 */
	EReference getCodesinfosRootCodes_Codes();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodesItems <em>Root Codes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes Items</em>'.
	 * @see codesinfos.CodesinfosRootCodesItems
	 * @generated
	 */
	EClass getCodesinfosRootCodesItems();

	/**
	 * Returns the meta object for the containment reference list '{@link codesinfos.CodesinfosRootCodesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see codesinfos.CodesinfosRootCodesItems#getItems()
	 * @see #getCodesinfosRootCodesItems()
	 * @generated
	 */
	EReference getCodesinfosRootCodesItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codesinfos.CodesinfosRootCodesItems#getName()
	 * @see #getCodesinfosRootCodesItems()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItems_Name();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItems#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see codesinfos.CodesinfosRootCodesItems#getClassname()
	 * @see #getCodesinfosRootCodesItems()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItems_Classname();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItems#getNodename <em>Nodename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodename</em>'.
	 * @see codesinfos.CodesinfosRootCodesItems#getNodename()
	 * @see #getCodesinfosRootCodesItems()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItems_Nodename();

	/**
	 * Returns the meta object for the '{@link codesinfos.CodesinfosRootCodesItems#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see codesinfos.CodesinfosRootCodesItems#get(java.lang.String)
	 * @generated
	 */
	EOperation getCodesinfosRootCodesItems__Get__String();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodesItemsName <em>Root Codes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes Items Name</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsName
	 * @generated
	 */
	EClass getCodesinfosRootCodesItemsName();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItemsName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsName#getName()
	 * @see #getCodesinfosRootCodesItemsName()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItemsName_Name();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodesItemsClassname <em>Root Codes Items Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes Items Classname</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsClassname
	 * @generated
	 */
	EClass getCodesinfosRootCodesItemsClassname();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItemsClassname#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsClassname#getClassname()
	 * @see #getCodesinfosRootCodesItemsClassname()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItemsClassname_Classname();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodesItemsNodename <em>Root Codes Items Nodename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes Items Nodename</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsNodename
	 * @generated
	 */
	EClass getCodesinfosRootCodesItemsNodename();

	/**
	 * Returns the meta object for the attribute '{@link codesinfos.CodesinfosRootCodesItemsNodename#getNodename <em>Nodename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodename</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsNodename#getNodename()
	 * @see #getCodesinfosRootCodesItemsNodename()
	 * @generated
	 */
	EAttribute getCodesinfosRootCodesItemsNodename_Nodename();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Properties Abstract</em>'.
	 * @see codesinfos.CodesinfosRootPropertiesAbstract
	 * @generated
	 */
	EClass getCodesinfosRootPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link codesinfos.CodesinfosRootCodesItemsPropertiesAbstract <em>Root Codes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Codes Items Properties Abstract</em>'.
	 * @see codesinfos.CodesinfosRootCodesItemsPropertiesAbstract
	 * @generated
	 */
	EClass getCodesinfosRootCodesItemsPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodesinfosFactory getCodesinfosFactory();

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
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRoot()
		 * @generated
		 */
		EClass CODESINFOS_ROOT = eINSTANCE.getCodesinfosRoot();

		/**
		 * The meta object literal for the '<em><b>Codesinfos Root</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODESINFOS_ROOT__CODESINFOS_ROOT = eINSTANCE.getCodesinfosRoot_CodesinfosRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT__NAME = eINSTANCE.getCodesinfosRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODESINFOS_ROOT__CODES = eINSTANCE.getCodesinfosRoot_Codes();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODESINFOS_ROOT___GET__STRING = eINSTANCE.getCodesinfosRoot__Get__String();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootNameImpl <em>Root Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootNameImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootName()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_NAME = eINSTANCE.getCodesinfosRootName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_NAME__NAME = eINSTANCE.getCodesinfosRootName_Name();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesImpl <em>Root Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodes()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES = eINSTANCE.getCodesinfosRootCodes();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODESINFOS_ROOT_CODES__CODES = eINSTANCE.getCodesinfosRootCodes_Codes();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesItemsImpl <em>Root Codes Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesItemsImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItems()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES_ITEMS = eINSTANCE.getCodesinfosRootCodesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODESINFOS_ROOT_CODES_ITEMS__ITEMS = eINSTANCE.getCodesinfosRootCodesItems_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS__NAME = eINSTANCE.getCodesinfosRootCodesItems_Name();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS__CLASSNAME = eINSTANCE.getCodesinfosRootCodesItems_Classname();

		/**
		 * The meta object literal for the '<em><b>Nodename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS__NODENAME = eINSTANCE.getCodesinfosRootCodesItems_Nodename();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODESINFOS_ROOT_CODES_ITEMS___GET__STRING = eINSTANCE.getCodesinfosRootCodesItems__Get__String();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesItemsNameImpl <em>Root Codes Items Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesItemsNameImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsName()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES_ITEMS_NAME = eINSTANCE.getCodesinfosRootCodesItemsName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS_NAME__NAME = eINSTANCE.getCodesinfosRootCodesItemsName_Name();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesItemsClassnameImpl <em>Root Codes Items Classname</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesItemsClassnameImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsClassname()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME = eINSTANCE.getCodesinfosRootCodesItemsClassname();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME__CLASSNAME = eINSTANCE.getCodesinfosRootCodesItemsClassname_Classname();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesItemsNodenameImpl <em>Root Codes Items Nodename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesItemsNodenameImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsNodename()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES_ITEMS_NODENAME = eINSTANCE.getCodesinfosRootCodesItemsNodename();

		/**
		 * The meta object literal for the '<em><b>Nodename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME = eINSTANCE.getCodesinfosRootCodesItemsNodename_Nodename();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootPropertiesAbstractImpl <em>Root Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootPropertiesAbstractImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootPropertiesAbstract()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_PROPERTIES_ABSTRACT = eINSTANCE.getCodesinfosRootPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link codesinfos.impl.CodesinfosRootCodesItemsPropertiesAbstractImpl <em>Root Codes Items Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codesinfos.impl.CodesinfosRootCodesItemsPropertiesAbstractImpl
		 * @see codesinfos.impl.CodesinfosPackageImpl#getCodesinfosRootCodesItemsPropertiesAbstract()
		 * @generated
		 */
		EClass CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT = eINSTANCE.getCodesinfosRootCodesItemsPropertiesAbstract();

	}

} //CodesinfosPackage
