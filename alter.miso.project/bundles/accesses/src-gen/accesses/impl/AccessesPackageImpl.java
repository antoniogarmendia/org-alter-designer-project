/**
 */
package accesses.impl;

import accesses.AccessesFactory;
import accesses.AccessesPackage;
import accesses.AccessesRoot;
import accesses.AccessesRootExternalAccess;
import accesses.AccessesRootExternalAccessItems;
import accesses.AccessesRootExternalAccessItemsAuth;
import accesses.AccessesRootExternalAccessItemsBody;
import accesses.AccessesRootExternalAccessItemsBodyItems;
import accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody;
import accesses.AccessesRootExternalAccessItemsBodyItemsAttr;
import accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsClassname;
import accesses.AccessesRootExternalAccessItemsInput;
import accesses.AccessesRootExternalAccessItemsInputItems;
import accesses.AccessesRootExternalAccessItemsInputItemsAPIInput;
import accesses.AccessesRootExternalAccessItemsInputItemsAttr;
import accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsInputItemsValue;
import accesses.AccessesRootExternalAccessItemsInputItemsWay;
import accesses.AccessesRootExternalAccessItemsMethod;
import accesses.AccessesRootExternalAccessItemsName;
import accesses.AccessesRootExternalAccessItemsOntological;
import accesses.AccessesRootExternalAccessItemsOutput;
import accesses.AccessesRootExternalAccessItemsOutputItems;
import accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput;
import accesses.AccessesRootExternalAccessItemsOutputItemsAttr;
import accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsPath;
import accesses.AccessesRootExternalAccessItemsPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsTrigger;
import accesses.AccessesRootExternalAccessItemsTriggerOnAccess;
import accesses.AccessesRootExternalAccessItemsTriggerOnChange;
import accesses.AccessesRootExternalAccessItemsTriggerOnCreate;
import accesses.AccessesRootExternalAccessItemsTriggerOnDelete;
import accesses.AccessesRootExternalAccessItemsTriggerOnLoad;
import accesses.AccessesRootExternalAccessItemsTriggerOnMove;
import accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger;
import accesses.AccessesRootPropertiesAbstract;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessesPackageImpl extends EPackageImpl implements AccessesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOntologicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsClassnameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsAPIInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsWayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOutputItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOutputItemsAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOutputItemsAPIOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsBodyItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsBodyItemsAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsBodyItemsAPIBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnMoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnDeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerOnLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsInputItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsOutputItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsBodyItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessesRootExternalAccessItemsTriggerPropertiesAbstractEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see accesses.AccessesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessesPackageImpl() {
		super(eNS_URI, AccessesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AccessesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessesPackage init() {
		if (isInited) return (AccessesPackage)EPackage.Registry.INSTANCE.getEPackage(AccessesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessesPackageImpl theAccessesPackage = registeredAccessesPackage instanceof AccessesPackageImpl ? (AccessesPackageImpl)registeredAccessesPackage : new AccessesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAccessesPackage.createPackageContents();

		// Initialize created meta-data
		theAccessesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessesPackage.eNS_URI, theAccessesPackage);
		return theAccessesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRoot() {
		return accessesRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRoot_AccessesRoot() {
		return (EReference)accessesRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRoot_ExternalAccess() {
		return (EReference)accessesRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRoot__Get__String() {
		return accessesRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccess() {
		return accessesRootExternalAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccess_ExternalAccess() {
		return (EReference)accessesRootExternalAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItems() {
		return accessesRootExternalAccessItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItems_Items() {
		return (EReference)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Name() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Path() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Ontological() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Classname() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Method() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItems_Auth() {
		return (EAttribute)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItems_Input() {
		return (EReference)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItems_Output() {
		return (EReference)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItems_Body() {
		return (EReference)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItems_Trigger() {
		return (EReference)accessesRootExternalAccessItemsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRootExternalAccessItems__Get__String() {
		return accessesRootExternalAccessItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsName() {
		return accessesRootExternalAccessItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsName_Name() {
		return (EAttribute)accessesRootExternalAccessItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsPath() {
		return accessesRootExternalAccessItemsPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsPath_Path() {
		return (EAttribute)accessesRootExternalAccessItemsPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOntological() {
		return accessesRootExternalAccessItemsOntologicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsOntological_Ontological() {
		return (EAttribute)accessesRootExternalAccessItemsOntologicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsClassname() {
		return accessesRootExternalAccessItemsClassnameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsClassname_Classname() {
		return (EAttribute)accessesRootExternalAccessItemsClassnameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsMethod() {
		return accessesRootExternalAccessItemsMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsMethod_Method() {
		return (EAttribute)accessesRootExternalAccessItemsMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsAuth() {
		return accessesRootExternalAccessItemsAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsAuth_Auth() {
		return (EAttribute)accessesRootExternalAccessItemsAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInput() {
		return accessesRootExternalAccessItemsInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsInput_Input() {
		return (EReference)accessesRootExternalAccessItemsInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItems() {
		return accessesRootExternalAccessItemsInputItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsInputItems_Items() {
		return (EReference)accessesRootExternalAccessItemsInputItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItems_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItems_APIInput() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItems_Way() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItems_Value() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRootExternalAccessItemsInputItems__Get__String() {
		return accessesRootExternalAccessItemsInputItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItemsAttr() {
		return accessesRootExternalAccessItemsInputItemsAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItemsAttr_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItemsAPIInput() {
		return accessesRootExternalAccessItemsInputItemsAPIInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItemsAPIInput_APIInput() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsAPIInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItemsWay() {
		return accessesRootExternalAccessItemsInputItemsWayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItemsWay_Way() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsWayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItemsValue() {
		return accessesRootExternalAccessItemsInputItemsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsInputItemsValue_Value() {
		return (EAttribute)accessesRootExternalAccessItemsInputItemsValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOutput() {
		return accessesRootExternalAccessItemsOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsOutput_Output() {
		return (EReference)accessesRootExternalAccessItemsOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOutputItems() {
		return accessesRootExternalAccessItemsOutputItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsOutputItems_Items() {
		return (EReference)accessesRootExternalAccessItemsOutputItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsOutputItems_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsOutputItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsOutputItems_APIOutput() {
		return (EAttribute)accessesRootExternalAccessItemsOutputItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRootExternalAccessItemsOutputItems__Get__String() {
		return accessesRootExternalAccessItemsOutputItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOutputItemsAttr() {
		return accessesRootExternalAccessItemsOutputItemsAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsOutputItemsAttr_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsOutputItemsAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOutputItemsAPIOutput() {
		return accessesRootExternalAccessItemsOutputItemsAPIOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsOutputItemsAPIOutput_APIOutput() {
		return (EAttribute)accessesRootExternalAccessItemsOutputItemsAPIOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsBody() {
		return accessesRootExternalAccessItemsBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsBody_Body() {
		return (EReference)accessesRootExternalAccessItemsBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsBodyItems() {
		return accessesRootExternalAccessItemsBodyItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsBodyItems_Items() {
		return (EReference)accessesRootExternalAccessItemsBodyItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsBodyItems_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsBodyItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsBodyItems_APIBody() {
		return (EAttribute)accessesRootExternalAccessItemsBodyItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRootExternalAccessItemsBodyItems__Get__String() {
		return accessesRootExternalAccessItemsBodyItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsBodyItemsAttr() {
		return accessesRootExternalAccessItemsBodyItemsAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsBodyItemsAttr_Attr() {
		return (EAttribute)accessesRootExternalAccessItemsBodyItemsAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsBodyItemsAPIBody() {
		return accessesRootExternalAccessItemsBodyItemsAPIBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsBodyItemsAPIBody_APIBody() {
		return (EAttribute)accessesRootExternalAccessItemsBodyItemsAPIBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTrigger() {
		return accessesRootExternalAccessItemsTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessesRootExternalAccessItemsTrigger_Trigger() {
		return (EReference)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnChange() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnCreate() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnMove() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnDelete() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnAccess() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_OnLoad() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTrigger_TimeTrigger() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAccessesRootExternalAccessItemsTrigger__Get__String() {
		return accessesRootExternalAccessItemsTriggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnChange() {
		return accessesRootExternalAccessItemsTriggerOnChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnChange_OnChange() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnCreate() {
		return accessesRootExternalAccessItemsTriggerOnCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnMove() {
		return accessesRootExternalAccessItemsTriggerOnMoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnMove_OnMove() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnMoveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnDelete() {
		return accessesRootExternalAccessItemsTriggerOnDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnDeleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnAccess() {
		return accessesRootExternalAccessItemsTriggerOnAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnAccess_OnAccess() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerOnLoad() {
		return accessesRootExternalAccessItemsTriggerOnLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerOnLoad_OnLoad() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerOnLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerTimeTrigger() {
		return accessesRootExternalAccessItemsTriggerTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessesRootExternalAccessItemsTriggerTimeTrigger_TimeTrigger() {
		return (EAttribute)accessesRootExternalAccessItemsTriggerTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootPropertiesAbstract() {
		return accessesRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsPropertiesAbstract() {
		return accessesRootExternalAccessItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract() {
		return accessesRootExternalAccessItemsInputItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract() {
		return accessesRootExternalAccessItemsOutputItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract() {
		return accessesRootExternalAccessItemsBodyItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessesRootExternalAccessItemsTriggerPropertiesAbstract() {
		return accessesRootExternalAccessItemsTriggerPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesFactory getAccessesFactory() {
		return (AccessesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accessesRootEClass = createEClass(ACCESSES_ROOT);
		createEReference(accessesRootEClass, ACCESSES_ROOT__ACCESSES_ROOT);
		createEReference(accessesRootEClass, ACCESSES_ROOT__EXTERNAL_ACCESS);
		createEOperation(accessesRootEClass, ACCESSES_ROOT___GET__STRING);

		accessesRootExternalAccessEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS);
		createEReference(accessesRootExternalAccessEClass, ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS);

		accessesRootExternalAccessItemsEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS);
		createEReference(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__NAME);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__PATH);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ONTOLOGICAL);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__CLASSNAME);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__METHOD);
		createEAttribute(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__AUTH);
		createEReference(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__INPUT);
		createEReference(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__OUTPUT);
		createEReference(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__BODY);
		createEReference(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__TRIGGER);
		createEOperation(accessesRootExternalAccessItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS___GET__STRING);

		accessesRootExternalAccessItemsNameEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME);
		createEAttribute(accessesRootExternalAccessItemsNameEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME__NAME);

		accessesRootExternalAccessItemsPathEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH);
		createEAttribute(accessesRootExternalAccessItemsPathEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH__PATH);

		accessesRootExternalAccessItemsOntologicalEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL);
		createEAttribute(accessesRootExternalAccessItemsOntologicalEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL__ONTOLOGICAL);

		accessesRootExternalAccessItemsClassnameEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME);
		createEAttribute(accessesRootExternalAccessItemsClassnameEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME__CLASSNAME);

		accessesRootExternalAccessItemsMethodEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD);
		createEAttribute(accessesRootExternalAccessItemsMethodEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD__METHOD);

		accessesRootExternalAccessItemsAuthEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH);
		createEAttribute(accessesRootExternalAccessItemsAuthEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH__AUTH);

		accessesRootExternalAccessItemsInputEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT);
		createEReference(accessesRootExternalAccessItemsInputEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT__INPUT);

		accessesRootExternalAccessItemsInputItemsEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS);
		createEReference(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS);
		createEAttribute(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ATTR);
		createEAttribute(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__API_INPUT);
		createEAttribute(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__WAY);
		createEAttribute(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__VALUE);
		createEOperation(accessesRootExternalAccessItemsInputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS___GET__STRING);

		accessesRootExternalAccessItemsInputItemsAttrEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR);
		createEAttribute(accessesRootExternalAccessItemsInputItemsAttrEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR__ATTR);

		accessesRootExternalAccessItemsInputItemsAPIInputEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT);
		createEAttribute(accessesRootExternalAccessItemsInputItemsAPIInputEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT);

		accessesRootExternalAccessItemsInputItemsWayEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY);
		createEAttribute(accessesRootExternalAccessItemsInputItemsWayEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY__WAY);

		accessesRootExternalAccessItemsInputItemsValueEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE);
		createEAttribute(accessesRootExternalAccessItemsInputItemsValueEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE__VALUE);

		accessesRootExternalAccessItemsOutputEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT);
		createEReference(accessesRootExternalAccessItemsOutputEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT__OUTPUT);

		accessesRootExternalAccessItemsOutputItemsEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS);
		createEReference(accessesRootExternalAccessItemsOutputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ITEMS);
		createEAttribute(accessesRootExternalAccessItemsOutputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__ATTR);
		createEAttribute(accessesRootExternalAccessItemsOutputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS__API_OUTPUT);
		createEOperation(accessesRootExternalAccessItemsOutputItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS___GET__STRING);

		accessesRootExternalAccessItemsOutputItemsAttrEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR);
		createEAttribute(accessesRootExternalAccessItemsOutputItemsAttrEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR__ATTR);

		accessesRootExternalAccessItemsOutputItemsAPIOutputEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT);
		createEAttribute(accessesRootExternalAccessItemsOutputItemsAPIOutputEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT);

		accessesRootExternalAccessItemsBodyEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY);
		createEReference(accessesRootExternalAccessItemsBodyEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY__BODY);

		accessesRootExternalAccessItemsBodyItemsEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS);
		createEReference(accessesRootExternalAccessItemsBodyItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS);
		createEAttribute(accessesRootExternalAccessItemsBodyItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ATTR);
		createEAttribute(accessesRootExternalAccessItemsBodyItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__API_BODY);
		createEOperation(accessesRootExternalAccessItemsBodyItemsEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS___GET__STRING);

		accessesRootExternalAccessItemsBodyItemsAttrEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR);
		createEAttribute(accessesRootExternalAccessItemsBodyItemsAttrEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR__ATTR);

		accessesRootExternalAccessItemsBodyItemsAPIBodyEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY);
		createEAttribute(accessesRootExternalAccessItemsBodyItemsAPIBodyEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY__API_BODY);

		accessesRootExternalAccessItemsTriggerEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER);
		createEReference(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CHANGE);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CREATE);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_MOVE);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_DELETE);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_ACCESS);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_LOAD);
		createEAttribute(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TIME_TRIGGER);
		createEOperation(accessesRootExternalAccessItemsTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER___GET__STRING);

		accessesRootExternalAccessItemsTriggerOnChangeEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnChangeEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE__ON_CHANGE);

		accessesRootExternalAccessItemsTriggerOnCreateEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnCreateEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE);

		accessesRootExternalAccessItemsTriggerOnMoveEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnMoveEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE);

		accessesRootExternalAccessItemsTriggerOnDeleteEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnDeleteEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE);

		accessesRootExternalAccessItemsTriggerOnAccessEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnAccessEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS__ON_ACCESS);

		accessesRootExternalAccessItemsTriggerOnLoadEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD);
		createEAttribute(accessesRootExternalAccessItemsTriggerOnLoadEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD__ON_LOAD);

		accessesRootExternalAccessItemsTriggerTimeTriggerEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER);
		createEAttribute(accessesRootExternalAccessItemsTriggerTimeTriggerEClass, ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER);

		accessesRootPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_PROPERTIES_ABSTRACT);

		accessesRootExternalAccessItemsPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT);

		accessesRootExternalAccessItemsInputItemsPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT);

		accessesRootExternalAccessItemsOutputItemsPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT);

		accessesRootExternalAccessItemsBodyItemsPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT);

		accessesRootExternalAccessItemsTriggerPropertiesAbstractEClass = createEClass(ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessesRootExternalAccessEClass.getESuperTypes().add(this.getAccessesRootPropertiesAbstract());
		accessesRootExternalAccessItemsNameEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsPathEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsOntologicalEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsClassnameEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsMethodEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsAuthEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsInputEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsInputItemsAttrEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsInputItemsAPIInputEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsInputItemsWayEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsInputItemsValueEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsOutputEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsOutputItemsAttrEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsOutputItemsAPIOutputEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract());
		accessesRootExternalAccessItemsBodyEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsBodyItemsAttrEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract());
		accessesRootExternalAccessItemsBodyItemsAPIBodyEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnChangeEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnCreateEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnMoveEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnDeleteEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnAccessEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerOnLoadEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());
		accessesRootExternalAccessItemsTriggerTimeTriggerEClass.getESuperTypes().add(this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(accessesRootEClass, AccessesRoot.class, "AccessesRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRoot_AccessesRoot(), this.getAccessesRootPropertiesAbstract(), null, "accessesRoot", null, 0, -1, AccessesRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessesRoot_ExternalAccess(), this.getAccessesRootExternalAccessItems(), null, "ExternalAccess", null, 0, -1, AccessesRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getAccessesRoot__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessEClass, AccessesRootExternalAccess.class, "AccessesRootExternalAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccess_ExternalAccess(), this.getAccessesRootExternalAccessItems(), null, "ExternalAccess", null, 0, -1, AccessesRootExternalAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsEClass, AccessesRootExternalAccessItems.class, "AccessesRootExternalAccessItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItems_Items(), this.getAccessesRootExternalAccessItemsPropertiesAbstract(), null, "items", null, 0, -1, AccessesRootExternalAccessItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Path(), ecorePackage.getEString(), "path", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Ontological(), ecorePackage.getEString(), "ontological", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Method(), ecorePackage.getEString(), "method", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItems_Auth(), ecorePackage.getEString(), "auth", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessesRootExternalAccessItems_Input(), this.getAccessesRootExternalAccessItemsInputItems(), null, "input", null, 0, -1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessesRootExternalAccessItems_Output(), this.getAccessesRootExternalAccessItemsOutputItems(), null, "output", null, 0, -1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessesRootExternalAccessItems_Body(), this.getAccessesRootExternalAccessItemsBodyItems(), null, "body", null, 0, -1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessesRootExternalAccessItems_Trigger(), this.getAccessesRootExternalAccessItemsTrigger(), null, "trigger", null, 0, 1, AccessesRootExternalAccessItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessesRootExternalAccessItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsNameEClass, AccessesRootExternalAccessItemsName.class, "AccessesRootExternalAccessItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, AccessesRootExternalAccessItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsPathEClass, AccessesRootExternalAccessItemsPath.class, "AccessesRootExternalAccessItemsPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsPath_Path(), ecorePackage.getEString(), "path", null, 1, 1, AccessesRootExternalAccessItemsPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsOntologicalEClass, AccessesRootExternalAccessItemsOntological.class, "AccessesRootExternalAccessItemsOntological", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsOntological_Ontological(), ecorePackage.getEString(), "ontological", null, 1, 1, AccessesRootExternalAccessItemsOntological.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsClassnameEClass, AccessesRootExternalAccessItemsClassname.class, "AccessesRootExternalAccessItemsClassname", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsClassname_Classname(), ecorePackage.getEString(), "classname", null, 1, 1, AccessesRootExternalAccessItemsClassname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsMethodEClass, AccessesRootExternalAccessItemsMethod.class, "AccessesRootExternalAccessItemsMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsMethod_Method(), ecorePackage.getEString(), "method", null, 1, 1, AccessesRootExternalAccessItemsMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsAuthEClass, AccessesRootExternalAccessItemsAuth.class, "AccessesRootExternalAccessItemsAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsAuth_Auth(), ecorePackage.getEString(), "auth", null, 1, 1, AccessesRootExternalAccessItemsAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputEClass, AccessesRootExternalAccessItemsInput.class, "AccessesRootExternalAccessItemsInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsInput_Input(), this.getAccessesRootExternalAccessItemsInputItems(), null, "input", null, 0, -1, AccessesRootExternalAccessItemsInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputItemsEClass, AccessesRootExternalAccessItemsInputItems.class, "AccessesRootExternalAccessItemsInputItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsInputItems_Items(), this.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(), null, "items", null, 0, -1, AccessesRootExternalAccessItemsInputItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsInputItems_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, AccessesRootExternalAccessItemsInputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsInputItems_APIInput(), ecorePackage.getEString(), "APIInput", null, 0, 1, AccessesRootExternalAccessItemsInputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsInputItems_Way(), ecorePackage.getEString(), "way", null, 0, 1, AccessesRootExternalAccessItemsInputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsInputItems_Value(), ecorePackage.getEString(), "value", null, 0, 1, AccessesRootExternalAccessItemsInputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessesRootExternalAccessItemsInputItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputItemsAttrEClass, AccessesRootExternalAccessItemsInputItemsAttr.class, "AccessesRootExternalAccessItemsInputItemsAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsInputItemsAttr_Attr(), ecorePackage.getEString(), "attr", null, 1, 1, AccessesRootExternalAccessItemsInputItemsAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputItemsAPIInputEClass, AccessesRootExternalAccessItemsInputItemsAPIInput.class, "AccessesRootExternalAccessItemsInputItemsAPIInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsInputItemsAPIInput_APIInput(), ecorePackage.getEString(), "APIInput", null, 1, 1, AccessesRootExternalAccessItemsInputItemsAPIInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputItemsWayEClass, AccessesRootExternalAccessItemsInputItemsWay.class, "AccessesRootExternalAccessItemsInputItemsWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsInputItemsWay_Way(), ecorePackage.getEString(), "way", null, 1, 1, AccessesRootExternalAccessItemsInputItemsWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsInputItemsValueEClass, AccessesRootExternalAccessItemsInputItemsValue.class, "AccessesRootExternalAccessItemsInputItemsValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsInputItemsValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, AccessesRootExternalAccessItemsInputItemsValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsOutputEClass, AccessesRootExternalAccessItemsOutput.class, "AccessesRootExternalAccessItemsOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsOutput_Output(), this.getAccessesRootExternalAccessItemsOutputItems(), null, "output", null, 0, -1, AccessesRootExternalAccessItemsOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsOutputItemsEClass, AccessesRootExternalAccessItemsOutputItems.class, "AccessesRootExternalAccessItemsOutputItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsOutputItems_Items(), this.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(), null, "items", null, 0, -1, AccessesRootExternalAccessItemsOutputItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsOutputItems_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, AccessesRootExternalAccessItemsOutputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsOutputItems_APIOutput(), ecorePackage.getEString(), "APIOutput", null, 0, 1, AccessesRootExternalAccessItemsOutputItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessesRootExternalAccessItemsOutputItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsOutputItemsAttrEClass, AccessesRootExternalAccessItemsOutputItemsAttr.class, "AccessesRootExternalAccessItemsOutputItemsAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsOutputItemsAttr_Attr(), ecorePackage.getEString(), "attr", null, 1, 1, AccessesRootExternalAccessItemsOutputItemsAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsOutputItemsAPIOutputEClass, AccessesRootExternalAccessItemsOutputItemsAPIOutput.class, "AccessesRootExternalAccessItemsOutputItemsAPIOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsOutputItemsAPIOutput_APIOutput(), ecorePackage.getEString(), "APIOutput", null, 1, 1, AccessesRootExternalAccessItemsOutputItemsAPIOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsBodyEClass, AccessesRootExternalAccessItemsBody.class, "AccessesRootExternalAccessItemsBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsBody_Body(), this.getAccessesRootExternalAccessItemsBodyItems(), null, "body", null, 0, -1, AccessesRootExternalAccessItemsBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsBodyItemsEClass, AccessesRootExternalAccessItemsBodyItems.class, "AccessesRootExternalAccessItemsBodyItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsBodyItems_Items(), this.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(), null, "items", null, 0, -1, AccessesRootExternalAccessItemsBodyItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsBodyItems_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, AccessesRootExternalAccessItemsBodyItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsBodyItems_APIBody(), ecorePackage.getEString(), "APIBody", null, 0, 1, AccessesRootExternalAccessItemsBodyItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessesRootExternalAccessItemsBodyItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsBodyItemsAttrEClass, AccessesRootExternalAccessItemsBodyItemsAttr.class, "AccessesRootExternalAccessItemsBodyItemsAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsBodyItemsAttr_Attr(), ecorePackage.getEString(), "attr", null, 1, 1, AccessesRootExternalAccessItemsBodyItemsAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsBodyItemsAPIBodyEClass, AccessesRootExternalAccessItemsBodyItemsAPIBody.class, "AccessesRootExternalAccessItemsBodyItemsAPIBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsBodyItemsAPIBody_APIBody(), ecorePackage.getEString(), "APIBody", null, 1, 1, AccessesRootExternalAccessItemsBodyItemsAPIBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerEClass, AccessesRootExternalAccessItemsTrigger.class, "AccessesRootExternalAccessItemsTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessesRootExternalAccessItemsTrigger_Trigger(), this.getAccessesRootExternalAccessItemsTriggerPropertiesAbstract(), null, "trigger", null, 0, -1, AccessesRootExternalAccessItemsTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnChange(), ecorePackage.getEBooleanObject(), "onChange", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnCreate(), ecorePackage.getEBooleanObject(), "onCreate", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnMove(), ecorePackage.getEBooleanObject(), "onMove", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnDelete(), ecorePackage.getEBooleanObject(), "onDelete", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnAccess(), ecorePackage.getEBooleanObject(), "onAccess", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_OnLoad(), ecorePackage.getEBooleanObject(), "onLoad", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessesRootExternalAccessItemsTrigger_TimeTrigger(), ecorePackage.getEDoubleObject(), "timeTrigger", null, 0, 1, AccessesRootExternalAccessItemsTrigger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessesRootExternalAccessItemsTrigger__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnChangeEClass, AccessesRootExternalAccessItemsTriggerOnChange.class, "AccessesRootExternalAccessItemsTriggerOnChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnChange_OnChange(), ecorePackage.getEBooleanObject(), "onChange", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnCreateEClass, AccessesRootExternalAccessItemsTriggerOnCreate.class, "AccessesRootExternalAccessItemsTriggerOnCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate(), ecorePackage.getEBooleanObject(), "onCreate", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnMoveEClass, AccessesRootExternalAccessItemsTriggerOnMove.class, "AccessesRootExternalAccessItemsTriggerOnMove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnMove_OnMove(), ecorePackage.getEBooleanObject(), "onMove", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnMove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnDeleteEClass, AccessesRootExternalAccessItemsTriggerOnDelete.class, "AccessesRootExternalAccessItemsTriggerOnDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete(), ecorePackage.getEBooleanObject(), "onDelete", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnAccessEClass, AccessesRootExternalAccessItemsTriggerOnAccess.class, "AccessesRootExternalAccessItemsTriggerOnAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnAccess_OnAccess(), ecorePackage.getEBooleanObject(), "onAccess", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerOnLoadEClass, AccessesRootExternalAccessItemsTriggerOnLoad.class, "AccessesRootExternalAccessItemsTriggerOnLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerOnLoad_OnLoad(), ecorePackage.getEBooleanObject(), "onLoad", null, 1, 1, AccessesRootExternalAccessItemsTriggerOnLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootExternalAccessItemsTriggerTimeTriggerEClass, AccessesRootExternalAccessItemsTriggerTimeTrigger.class, "AccessesRootExternalAccessItemsTriggerTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessesRootExternalAccessItemsTriggerTimeTrigger_TimeTrigger(), ecorePackage.getEDoubleObject(), "timeTrigger", null, 1, 1, AccessesRootExternalAccessItemsTriggerTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessesRootPropertiesAbstractEClass, AccessesRootPropertiesAbstract.class, "AccessesRootPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessesRootExternalAccessItemsPropertiesAbstractEClass, AccessesRootExternalAccessItemsPropertiesAbstract.class, "AccessesRootExternalAccessItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessesRootExternalAccessItemsInputItemsPropertiesAbstractEClass, AccessesRootExternalAccessItemsInputItemsPropertiesAbstract.class, "AccessesRootExternalAccessItemsInputItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessesRootExternalAccessItemsOutputItemsPropertiesAbstractEClass, AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract.class, "AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessesRootExternalAccessItemsBodyItemsPropertiesAbstractEClass, AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract.class, "AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessesRootExternalAccessItemsTriggerPropertiesAbstractEClass, AccessesRootExternalAccessItemsTriggerPropertiesAbstract.class, "AccessesRootExternalAccessItemsTriggerPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Type
		createTypeAnnotations();
		// Keyword
		createKeywordAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Type</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTypeAnnotations() {
		String source = "Type";
		addAnnotation
		  (accessesRootEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsPathEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsOntologicalEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsClassnameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsMethodEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsAuthEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputItemsAttrEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputItemsAPIInputEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputItemsWayEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsInputItemsValueEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsOutputEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsOutputItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsOutputItemsAttrEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsOutputItemsAPIOutputEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsBodyEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsBodyItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsBodyItemsAttrEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsBodyItemsAPIBodyEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnChangeEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnCreateEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnMoveEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnDeleteEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnAccessEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerOnLoadEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (accessesRootExternalAccessItemsTriggerTimeTriggerEClass,
		   source,
		   new String[] {
			   "Type", "number"
		   });
	}

	/**
	 * Initializes the annotations for <b>Keyword</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKeywordAnnotations() {
		String source = "Keyword";
		addAnnotation
		  (getAccessesRootExternalAccess_ExternalAccess(),
		   source,
		   new String[] {
			   "Keyword", "ExternalAccess"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsPath_Path(),
		   source,
		   new String[] {
			   "Keyword", "path"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsOntological_Ontological(),
		   source,
		   new String[] {
			   "Keyword", "ontological"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsClassname_Classname(),
		   source,
		   new String[] {
			   "Keyword", "classname"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsMethod_Method(),
		   source,
		   new String[] {
			   "Keyword", "method"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsAuth_Auth(),
		   source,
		   new String[] {
			   "Keyword", "auth"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsInput_Input(),
		   source,
		   new String[] {
			   "Keyword", "input"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsInputItemsAttr_Attr(),
		   source,
		   new String[] {
			   "Keyword", "attr"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsInputItemsAPIInput_APIInput(),
		   source,
		   new String[] {
			   "Keyword", "APIInput"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsInputItemsWay_Way(),
		   source,
		   new String[] {
			   "Keyword", "way"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsInputItemsValue_Value(),
		   source,
		   new String[] {
			   "Keyword", "value"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsOutput_Output(),
		   source,
		   new String[] {
			   "Keyword", "output"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsOutputItemsAttr_Attr(),
		   source,
		   new String[] {
			   "Keyword", "attr"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsOutputItemsAPIOutput_APIOutput(),
		   source,
		   new String[] {
			   "Keyword", "APIOutput"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsBody_Body(),
		   source,
		   new String[] {
			   "Keyword", "body"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsBodyItemsAttr_Attr(),
		   source,
		   new String[] {
			   "Keyword", "attr"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsBodyItemsAPIBody_APIBody(),
		   source,
		   new String[] {
			   "Keyword", "APIBody"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTrigger_Trigger(),
		   source,
		   new String[] {
			   "Keyword", "trigger"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnChange_OnChange(),
		   source,
		   new String[] {
			   "Keyword", "onChange"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate(),
		   source,
		   new String[] {
			   "Keyword", "onCreate"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnMove_OnMove(),
		   source,
		   new String[] {
			   "Keyword", "onMove"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete(),
		   source,
		   new String[] {
			   "Keyword", "onDelete"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnAccess_OnAccess(),
		   source,
		   new String[] {
			   "Keyword", "onAccess"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerOnLoad_OnLoad(),
		   source,
		   new String[] {
			   "Keyword", "onLoad"
		   });
		addAnnotation
		  (getAccessesRootExternalAccessItemsTriggerTimeTrigger_TimeTrigger(),
		   source,
		   new String[] {
			   "Keyword", "timeTrigger"
		   });
	}

} //AccessesPackageImpl
