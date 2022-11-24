/**
 */
package ontological.impl;

import ontological.OntologicalFactory;
import ontological.OntologicalPackage;
import ontological.OntologicalRoot;
import ontological.OntologicalRootBluetooth;
import ontological.OntologicalRootClasses;
import ontological.OntologicalRootClassesItems;
import ontological.OntologicalRootClassesItemsAbstract;
import ontological.OntologicalRootClassesItemsAttributes;
import ontological.OntologicalRootClassesItemsAttributesItems;
import ontological.OntologicalRootClassesItemsAttributesItemsDefault;
import ontological.OntologicalRootClassesItemsAttributesItemsIsKey;
import ontological.OntologicalRootClassesItemsAttributesItemsIsParam;
import ontological.OntologicalRootClassesItemsAttributesItemsMax;
import ontological.OntologicalRootClassesItemsAttributesItemsMin;
import ontological.OntologicalRootClassesItemsAttributesItemsName;
import ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract;
import ontological.OntologicalRootClassesItemsAttributesItemsReadOnly;
import ontological.OntologicalRootClassesItemsAttributesItemsType;
import ontological.OntologicalRootClassesItemsAutoID;
import ontological.OntologicalRootClassesItemsBluetooth;
import ontological.OntologicalRootClassesItemsName;
import ontological.OntologicalRootClassesItemsNoSCN;
import ontological.OntologicalRootClassesItemsOnlyCodes;
import ontological.OntologicalRootClassesItemsPropertiesAbstract;
import ontological.OntologicalRootClassesItemsReferences;
import ontological.OntologicalRootClassesItemsReferencesItems;
import ontological.OntologicalRootClassesItemsReferencesItemsContaintment;
import ontological.OntologicalRootClassesItemsReferencesItemsMax;
import ontological.OntologicalRootClassesItemsReferencesItemsMin;
import ontological.OntologicalRootClassesItemsReferencesItemsName;
import ontological.OntologicalRootClassesItemsReferencesItemsOpposite;
import ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract;
import ontological.OntologicalRootClassesItemsReferencesItemsTarget;
import ontological.OntologicalRootExternal;
import ontological.OntologicalRootFirebase;
import ontological.OntologicalRootGameloop;
import ontological.OntologicalRootName;
import ontological.OntologicalRootOnlyCodes;
import ontological.OntologicalRootPhysics;
import ontological.OntologicalRootPropertiesAbstract;
import ontological.OntologicalRootURI;

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
public class OntologicalPackageImpl extends EPackageImpl implements OntologicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootOnlyCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootBluetoothEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootFirebaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootPhysicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootGameloopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsMinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsMaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsReadOnlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsIsParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsIsKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsContaintmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsMinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsMaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsOppositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAutoIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsOnlyCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsBluetoothEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsNoSCNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsAttributesItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalRootClassesItemsReferencesItemsPropertiesAbstractEClass = null;

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
	 * @see ontological.OntologicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OntologicalPackageImpl() {
		super(eNS_URI, OntologicalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OntologicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OntologicalPackage init() {
		if (isInited) return (OntologicalPackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOntologicalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OntologicalPackageImpl theOntologicalPackage = registeredOntologicalPackage instanceof OntologicalPackageImpl ? (OntologicalPackageImpl)registeredOntologicalPackage : new OntologicalPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOntologicalPackage.createPackageContents();

		// Initialize created meta-data
		theOntologicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOntologicalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OntologicalPackage.eNS_URI, theOntologicalPackage);
		return theOntologicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRoot() {
		return ontologicalRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRoot_OntologicalRoot() {
		return (EReference)ontologicalRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_Name() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_URI() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_OnlyCodes() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_Bluetooth() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_External() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_Firebase() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_Physics() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRoot_Gameloop() {
		return (EAttribute)ontologicalRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRoot_Classes() {
		return (EReference)ontologicalRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOntologicalRoot__Get__String() {
		return ontologicalRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootName() {
		return ontologicalRootNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootName_Name() {
		return (EAttribute)ontologicalRootNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootURI() {
		return ontologicalRootURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootURI_URI() {
		return (EAttribute)ontologicalRootURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootOnlyCodes() {
		return ontologicalRootOnlyCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootOnlyCodes_OnlyCodes() {
		return (EAttribute)ontologicalRootOnlyCodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootBluetooth() {
		return ontologicalRootBluetoothEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootBluetooth_Bluetooth() {
		return (EAttribute)ontologicalRootBluetoothEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootExternal() {
		return ontologicalRootExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootExternal_External() {
		return (EAttribute)ontologicalRootExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootFirebase() {
		return ontologicalRootFirebaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootFirebase_Firebase() {
		return (EAttribute)ontologicalRootFirebaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootPhysics() {
		return ontologicalRootPhysicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootPhysics_Physics() {
		return (EAttribute)ontologicalRootPhysicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootGameloop() {
		return ontologicalRootGameloopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootGameloop_Gameloop() {
		return (EAttribute)ontologicalRootGameloopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClasses() {
		return ontologicalRootClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClasses_Classes() {
		return (EReference)ontologicalRootClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItems() {
		return ontologicalRootClassesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItems_Items() {
		return (EReference)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_Name() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_Abstract() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItems_Attributes() {
		return (EReference)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItems_References() {
		return (EReference)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_AutoID() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_OnlyCodes() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_Bluetooth() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItems_NoSCN() {
		return (EAttribute)ontologicalRootClassesItemsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOntologicalRootClassesItems__Get__String() {
		return ontologicalRootClassesItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsName() {
		return ontologicalRootClassesItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsName_Name() {
		return (EAttribute)ontologicalRootClassesItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAbstract() {
		return ontologicalRootClassesItemsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAbstract_Abstract() {
		return (EAttribute)ontologicalRootClassesItemsAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributes() {
		return ontologicalRootClassesItemsAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItemsAttributes_Attributes() {
		return (EReference)ontologicalRootClassesItemsAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItems() {
		return ontologicalRootClassesItemsAttributesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItemsAttributesItems_Items() {
		return (EReference)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_Name() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_Type() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_Min() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_Max() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_Default() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_ReadOnly() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_IsParam() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItems_IsKey() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOntologicalRootClassesItemsAttributesItems__Get__String() {
		return ontologicalRootClassesItemsAttributesItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsName() {
		return ontologicalRootClassesItemsAttributesItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsName_Name() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsType() {
		return ontologicalRootClassesItemsAttributesItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsType_Type() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsMin() {
		return ontologicalRootClassesItemsAttributesItemsMinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsMin_Min() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsMinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsMax() {
		return ontologicalRootClassesItemsAttributesItemsMaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsMax_Max() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsMaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsDefault() {
		return ontologicalRootClassesItemsAttributesItemsDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsDefault_Default() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsReadOnly() {
		return ontologicalRootClassesItemsAttributesItemsReadOnlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsReadOnly_ReadOnly() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsReadOnlyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsIsParam() {
		return ontologicalRootClassesItemsAttributesItemsIsParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsIsParam_IsParam() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsIsParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsIsKey() {
		return ontologicalRootClassesItemsAttributesItemsIsKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAttributesItemsIsKey_IsKey() {
		return (EAttribute)ontologicalRootClassesItemsAttributesItemsIsKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferences() {
		return ontologicalRootClassesItemsReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItemsReferences_References() {
		return (EReference)ontologicalRootClassesItemsReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItems() {
		return ontologicalRootClassesItemsReferencesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntologicalRootClassesItemsReferencesItems_Items() {
		return (EReference)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Name() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Containtment() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Min() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Max() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Target() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItems_Opposite() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOntologicalRootClassesItemsReferencesItems__Get__String() {
		return ontologicalRootClassesItemsReferencesItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsName() {
		return ontologicalRootClassesItemsReferencesItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsName_Name() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsContaintment() {
		return ontologicalRootClassesItemsReferencesItemsContaintmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsContaintment_Containtment() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsContaintmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsMin() {
		return ontologicalRootClassesItemsReferencesItemsMinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsMin_Min() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsMinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsMax() {
		return ontologicalRootClassesItemsReferencesItemsMaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsMax_Max() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsMaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsTarget() {
		return ontologicalRootClassesItemsReferencesItemsTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsTarget_Target() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsOpposite() {
		return ontologicalRootClassesItemsReferencesItemsOppositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsReferencesItemsOpposite_Opposite() {
		return (EAttribute)ontologicalRootClassesItemsReferencesItemsOppositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAutoID() {
		return ontologicalRootClassesItemsAutoIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsAutoID_AutoID() {
		return (EAttribute)ontologicalRootClassesItemsAutoIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsOnlyCodes() {
		return ontologicalRootClassesItemsOnlyCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsOnlyCodes_OnlyCodes() {
		return (EAttribute)ontologicalRootClassesItemsOnlyCodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsBluetooth() {
		return ontologicalRootClassesItemsBluetoothEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsBluetooth_Bluetooth() {
		return (EAttribute)ontologicalRootClassesItemsBluetoothEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsNoSCN() {
		return ontologicalRootClassesItemsNoSCNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologicalRootClassesItemsNoSCN_NoSCN() {
		return (EAttribute)ontologicalRootClassesItemsNoSCNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootPropertiesAbstract() {
		return ontologicalRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsPropertiesAbstract() {
		return ontologicalRootClassesItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract() {
		return ontologicalRootClassesItemsAttributesItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract() {
		return ontologicalRootClassesItemsReferencesItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalFactory getOntologicalFactory() {
		return (OntologicalFactory)getEFactoryInstance();
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
		ontologicalRootEClass = createEClass(ONTOLOGICAL_ROOT);
		createEReference(ontologicalRootEClass, ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__NAME);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__URI);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__ONLY_CODES);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__BLUETOOTH);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__EXTERNAL);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__FIREBASE);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__PHYSICS);
		createEAttribute(ontologicalRootEClass, ONTOLOGICAL_ROOT__GAMELOOP);
		createEReference(ontologicalRootEClass, ONTOLOGICAL_ROOT__CLASSES);
		createEOperation(ontologicalRootEClass, ONTOLOGICAL_ROOT___GET__STRING);

		ontologicalRootNameEClass = createEClass(ONTOLOGICAL_ROOT_NAME);
		createEAttribute(ontologicalRootNameEClass, ONTOLOGICAL_ROOT_NAME__NAME);

		ontologicalRootURIEClass = createEClass(ONTOLOGICAL_ROOT_URI);
		createEAttribute(ontologicalRootURIEClass, ONTOLOGICAL_ROOT_URI__URI);

		ontologicalRootOnlyCodesEClass = createEClass(ONTOLOGICAL_ROOT_ONLY_CODES);
		createEAttribute(ontologicalRootOnlyCodesEClass, ONTOLOGICAL_ROOT_ONLY_CODES__ONLY_CODES);

		ontologicalRootBluetoothEClass = createEClass(ONTOLOGICAL_ROOT_BLUETOOTH);
		createEAttribute(ontologicalRootBluetoothEClass, ONTOLOGICAL_ROOT_BLUETOOTH__BLUETOOTH);

		ontologicalRootExternalEClass = createEClass(ONTOLOGICAL_ROOT_EXTERNAL);
		createEAttribute(ontologicalRootExternalEClass, ONTOLOGICAL_ROOT_EXTERNAL__EXTERNAL);

		ontologicalRootFirebaseEClass = createEClass(ONTOLOGICAL_ROOT_FIREBASE);
		createEAttribute(ontologicalRootFirebaseEClass, ONTOLOGICAL_ROOT_FIREBASE__FIREBASE);

		ontologicalRootPhysicsEClass = createEClass(ONTOLOGICAL_ROOT_PHYSICS);
		createEAttribute(ontologicalRootPhysicsEClass, ONTOLOGICAL_ROOT_PHYSICS__PHYSICS);

		ontologicalRootGameloopEClass = createEClass(ONTOLOGICAL_ROOT_GAMELOOP);
		createEAttribute(ontologicalRootGameloopEClass, ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP);

		ontologicalRootClassesEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES);
		createEReference(ontologicalRootClassesEClass, ONTOLOGICAL_ROOT_CLASSES__CLASSES);

		ontologicalRootClassesItemsEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS);
		createEReference(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__NAME);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__ABSTRACT);
		createEReference(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__ATTRIBUTES);
		createEReference(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__REFERENCES);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__AUTO_ID);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__ONLY_CODES);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__BLUETOOTH);
		createEAttribute(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS__NO_SCN);
		createEOperation(ontologicalRootClassesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS___GET__STRING);

		ontologicalRootClassesItemsNameEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME);
		createEAttribute(ontologicalRootClassesItemsNameEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME__NAME);

		ontologicalRootClassesItemsAbstractEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT);
		createEAttribute(ontologicalRootClassesItemsAbstractEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT__ABSTRACT);

		ontologicalRootClassesItemsAttributesEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES);
		createEReference(ontologicalRootClassesItemsAttributesEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES__ATTRIBUTES);

		ontologicalRootClassesItemsAttributesItemsEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS);
		createEReference(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY);
		createEOperation(ontologicalRootClassesItemsAttributesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS___GET__STRING);

		ontologicalRootClassesItemsAttributesItemsNameEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsNameEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME__NAME);

		ontologicalRootClassesItemsAttributesItemsTypeEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsTypeEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE__TYPE);

		ontologicalRootClassesItemsAttributesItemsMinEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsMinEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN__MIN);

		ontologicalRootClassesItemsAttributesItemsMaxEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsMaxEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX__MAX);

		ontologicalRootClassesItemsAttributesItemsDefaultEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsDefaultEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT__DEFAULT);

		ontologicalRootClassesItemsAttributesItemsReadOnlyEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsReadOnlyEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY);

		ontologicalRootClassesItemsAttributesItemsIsParamEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsIsParamEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM);

		ontologicalRootClassesItemsAttributesItemsIsKeyEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY);
		createEAttribute(ontologicalRootClassesItemsAttributesItemsIsKeyEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY__IS_KEY);

		ontologicalRootClassesItemsReferencesEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES);
		createEReference(ontologicalRootClassesItemsReferencesEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES__REFERENCES);

		ontologicalRootClassesItemsReferencesItemsEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS);
		createEReference(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE);
		createEOperation(ontologicalRootClassesItemsReferencesItemsEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS___GET__STRING);

		ontologicalRootClassesItemsReferencesItemsNameEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsNameEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME__NAME);

		ontologicalRootClassesItemsReferencesItemsContaintmentEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsContaintmentEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT);

		ontologicalRootClassesItemsReferencesItemsMinEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsMinEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN__MIN);

		ontologicalRootClassesItemsReferencesItemsMaxEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsMaxEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX__MAX);

		ontologicalRootClassesItemsReferencesItemsTargetEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsTargetEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET__TARGET);

		ontologicalRootClassesItemsReferencesItemsOppositeEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE);
		createEAttribute(ontologicalRootClassesItemsReferencesItemsOppositeEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE);

		ontologicalRootClassesItemsAutoIDEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID);
		createEAttribute(ontologicalRootClassesItemsAutoIDEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID);

		ontologicalRootClassesItemsOnlyCodesEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES);
		createEAttribute(ontologicalRootClassesItemsOnlyCodesEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES__ONLY_CODES);

		ontologicalRootClassesItemsBluetoothEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH);
		createEAttribute(ontologicalRootClassesItemsBluetoothEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH__BLUETOOTH);

		ontologicalRootClassesItemsNoSCNEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN);
		createEAttribute(ontologicalRootClassesItemsNoSCNEClass, ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN__NO_SCN);

		ontologicalRootPropertiesAbstractEClass = createEClass(ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT);

		ontologicalRootClassesItemsPropertiesAbstractEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT);

		ontologicalRootClassesItemsAttributesItemsPropertiesAbstractEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT);

		ontologicalRootClassesItemsReferencesItemsPropertiesAbstractEClass = createEClass(ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT);
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
		ontologicalRootNameEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootURIEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootOnlyCodesEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootBluetoothEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootExternalEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootFirebaseEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootPhysicsEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootGameloopEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootClassesEClass.getESuperTypes().add(this.getOntologicalRootPropertiesAbstract());
		ontologicalRootClassesItemsNameEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAbstractEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsNameEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsTypeEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsMinEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsMaxEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsDefaultEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsReadOnlyEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsIsParamEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAttributesItemsIsKeyEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsNameEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsContaintmentEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsMinEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsMaxEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsTargetEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsReferencesItemsOppositeEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract());
		ontologicalRootClassesItemsAutoIDEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsOnlyCodesEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsBluetoothEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());
		ontologicalRootClassesItemsNoSCNEClass.getESuperTypes().add(this.getOntologicalRootClassesItemsPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(ontologicalRootEClass, OntologicalRoot.class, "OntologicalRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRoot_OntologicalRoot(), this.getOntologicalRootPropertiesAbstract(), null, "ontologicalRoot", null, 0, -1, OntologicalRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologicalRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_URI(), ecorePackage.getEString(), "URI", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_OnlyCodes(), ecorePackage.getEBooleanObject(), "onlyCodes", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_Bluetooth(), ecorePackage.getEBooleanObject(), "bluetooth", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_External(), ecorePackage.getEBooleanObject(), "external", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_Firebase(), ecorePackage.getEBooleanObject(), "firebase", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_Physics(), ecorePackage.getEBooleanObject(), "physics", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRoot_Gameloop(), ecorePackage.getEBooleanObject(), "gameloop", null, 0, 1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOntologicalRoot_Classes(), this.getOntologicalRootClassesItems(), null, "classes", null, 0, -1, OntologicalRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getOntologicalRoot__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ontologicalRootNameEClass, OntologicalRootName.class, "OntologicalRootName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootName_Name(), ecorePackage.getEString(), "name", null, 1, 1, OntologicalRootName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootURIEClass, OntologicalRootURI.class, "OntologicalRootURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootURI_URI(), ecorePackage.getEString(), "URI", null, 1, 1, OntologicalRootURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootOnlyCodesEClass, OntologicalRootOnlyCodes.class, "OntologicalRootOnlyCodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootOnlyCodes_OnlyCodes(), ecorePackage.getEBooleanObject(), "onlyCodes", null, 1, 1, OntologicalRootOnlyCodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootBluetoothEClass, OntologicalRootBluetooth.class, "OntologicalRootBluetooth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootBluetooth_Bluetooth(), ecorePackage.getEBooleanObject(), "bluetooth", null, 1, 1, OntologicalRootBluetooth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootExternalEClass, OntologicalRootExternal.class, "OntologicalRootExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootExternal_External(), ecorePackage.getEBooleanObject(), "external", null, 1, 1, OntologicalRootExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootFirebaseEClass, OntologicalRootFirebase.class, "OntologicalRootFirebase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootFirebase_Firebase(), ecorePackage.getEBooleanObject(), "firebase", null, 1, 1, OntologicalRootFirebase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootPhysicsEClass, OntologicalRootPhysics.class, "OntologicalRootPhysics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootPhysics_Physics(), ecorePackage.getEBooleanObject(), "physics", null, 1, 1, OntologicalRootPhysics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootGameloopEClass, OntologicalRootGameloop.class, "OntologicalRootGameloop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootGameloop_Gameloop(), ecorePackage.getEBooleanObject(), "gameloop", null, 1, 1, OntologicalRootGameloop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesEClass, OntologicalRootClasses.class, "OntologicalRootClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClasses_Classes(), this.getOntologicalRootClassesItems(), null, "classes", null, 0, -1, OntologicalRootClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsEClass, OntologicalRootClassesItems.class, "OntologicalRootClassesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClassesItems_Items(), this.getOntologicalRootClassesItemsPropertiesAbstract(), null, "items", null, 0, -1, OntologicalRootClassesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOntologicalRootClassesItems_Attributes(), this.getOntologicalRootClassesItemsAttributesItems(), null, "attributes", null, 0, -1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOntologicalRootClassesItems_References(), this.getOntologicalRootClassesItemsReferencesItems(), null, "references", null, 0, -1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_AutoID(), ecorePackage.getEBooleanObject(), "autoID", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_OnlyCodes(), ecorePackage.getEBooleanObject(), "onlyCodes", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_Bluetooth(), ecorePackage.getEBooleanObject(), "bluetooth", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItems_NoSCN(), ecorePackage.getEBooleanObject(), "noSCN", null, 0, 1, OntologicalRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOntologicalRootClassesItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsNameEClass, OntologicalRootClassesItemsName.class, "OntologicalRootClassesItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, OntologicalRootClassesItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAbstractEClass, OntologicalRootClassesItemsAbstract.class, "OntologicalRootClassesItemsAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAbstract_Abstract(), ecorePackage.getEString(), "abstract", null, 1, 1, OntologicalRootClassesItemsAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesEClass, OntologicalRootClassesItemsAttributes.class, "OntologicalRootClassesItemsAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClassesItemsAttributes_Attributes(), this.getOntologicalRootClassesItemsAttributesItems(), null, "attributes", null, 0, -1, OntologicalRootClassesItemsAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsEClass, OntologicalRootClassesItemsAttributesItems.class, "OntologicalRootClassesItemsAttributesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClassesItemsAttributesItems_Items(), this.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(), null, "items", null, 0, -1, OntologicalRootClassesItemsAttributesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_Type(), ecorePackage.getEString(), "type", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_Min(), ecorePackage.getEString(), "min", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_Max(), ecorePackage.getEString(), "max", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_Default(), ecorePackage.getEString(), "default", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_ReadOnly(), ecorePackage.getEBooleanObject(), "readOnly", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_IsParam(), ecorePackage.getEBooleanObject(), "isParam", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsAttributesItems_IsKey(), ecorePackage.getEBooleanObject(), "isKey", null, 0, 1, OntologicalRootClassesItemsAttributesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOntologicalRootClassesItemsAttributesItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsNameEClass, OntologicalRootClassesItemsAttributesItemsName.class, "OntologicalRootClassesItemsAttributesItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, OntologicalRootClassesItemsAttributesItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsTypeEClass, OntologicalRootClassesItemsAttributesItemsType.class, "OntologicalRootClassesItemsAttributesItemsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsType_Type(), ecorePackage.getEString(), "type", null, 1, 1, OntologicalRootClassesItemsAttributesItemsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsMinEClass, OntologicalRootClassesItemsAttributesItemsMin.class, "OntologicalRootClassesItemsAttributesItemsMin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsMin_Min(), ecorePackage.getEString(), "min", null, 1, 1, OntologicalRootClassesItemsAttributesItemsMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsMaxEClass, OntologicalRootClassesItemsAttributesItemsMax.class, "OntologicalRootClassesItemsAttributesItemsMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsMax_Max(), ecorePackage.getEString(), "max", null, 1, 1, OntologicalRootClassesItemsAttributesItemsMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsDefaultEClass, OntologicalRootClassesItemsAttributesItemsDefault.class, "OntologicalRootClassesItemsAttributesItemsDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsDefault_Default(), ecorePackage.getEString(), "default", null, 1, 1, OntologicalRootClassesItemsAttributesItemsDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsReadOnlyEClass, OntologicalRootClassesItemsAttributesItemsReadOnly.class, "OntologicalRootClassesItemsAttributesItemsReadOnly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsReadOnly_ReadOnly(), ecorePackage.getEBooleanObject(), "readOnly", null, 1, 1, OntologicalRootClassesItemsAttributesItemsReadOnly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsIsParamEClass, OntologicalRootClassesItemsAttributesItemsIsParam.class, "OntologicalRootClassesItemsAttributesItemsIsParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsIsParam_IsParam(), ecorePackage.getEBooleanObject(), "isParam", null, 1, 1, OntologicalRootClassesItemsAttributesItemsIsParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAttributesItemsIsKeyEClass, OntologicalRootClassesItemsAttributesItemsIsKey.class, "OntologicalRootClassesItemsAttributesItemsIsKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAttributesItemsIsKey_IsKey(), ecorePackage.getEBooleanObject(), "isKey", null, 1, 1, OntologicalRootClassesItemsAttributesItemsIsKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesEClass, OntologicalRootClassesItemsReferences.class, "OntologicalRootClassesItemsReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClassesItemsReferences_References(), this.getOntologicalRootClassesItemsReferencesItems(), null, "references", null, 0, -1, OntologicalRootClassesItemsReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsEClass, OntologicalRootClassesItemsReferencesItems.class, "OntologicalRootClassesItemsReferencesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalRootClassesItemsReferencesItems_Items(), this.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(), null, "items", null, 0, -1, OntologicalRootClassesItemsReferencesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Containtment(), ecorePackage.getEString(), "containtment", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Min(), ecorePackage.getEString(), "min", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Max(), ecorePackage.getEString(), "max", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Target(), ecorePackage.getEString(), "target", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOntologicalRootClassesItemsReferencesItems_Opposite(), ecorePackage.getEString(), "opposite", null, 0, 1, OntologicalRootClassesItemsReferencesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOntologicalRootClassesItemsReferencesItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsNameEClass, OntologicalRootClassesItemsReferencesItemsName.class, "OntologicalRootClassesItemsReferencesItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, OntologicalRootClassesItemsReferencesItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsContaintmentEClass, OntologicalRootClassesItemsReferencesItemsContaintment.class, "OntologicalRootClassesItemsReferencesItemsContaintment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsContaintment_Containtment(), ecorePackage.getEString(), "containtment", null, 1, 1, OntologicalRootClassesItemsReferencesItemsContaintment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsMinEClass, OntologicalRootClassesItemsReferencesItemsMin.class, "OntologicalRootClassesItemsReferencesItemsMin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsMin_Min(), ecorePackage.getEString(), "min", null, 1, 1, OntologicalRootClassesItemsReferencesItemsMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsMaxEClass, OntologicalRootClassesItemsReferencesItemsMax.class, "OntologicalRootClassesItemsReferencesItemsMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsMax_Max(), ecorePackage.getEString(), "max", null, 1, 1, OntologicalRootClassesItemsReferencesItemsMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsTargetEClass, OntologicalRootClassesItemsReferencesItemsTarget.class, "OntologicalRootClassesItemsReferencesItemsTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsTarget_Target(), ecorePackage.getEString(), "target", null, 1, 1, OntologicalRootClassesItemsReferencesItemsTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsReferencesItemsOppositeEClass, OntologicalRootClassesItemsReferencesItemsOpposite.class, "OntologicalRootClassesItemsReferencesItemsOpposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsReferencesItemsOpposite_Opposite(), ecorePackage.getEString(), "opposite", null, 1, 1, OntologicalRootClassesItemsReferencesItemsOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsAutoIDEClass, OntologicalRootClassesItemsAutoID.class, "OntologicalRootClassesItemsAutoID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsAutoID_AutoID(), ecorePackage.getEBooleanObject(), "autoID", null, 1, 1, OntologicalRootClassesItemsAutoID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsOnlyCodesEClass, OntologicalRootClassesItemsOnlyCodes.class, "OntologicalRootClassesItemsOnlyCodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsOnlyCodes_OnlyCodes(), ecorePackage.getEBooleanObject(), "onlyCodes", null, 1, 1, OntologicalRootClassesItemsOnlyCodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsBluetoothEClass, OntologicalRootClassesItemsBluetooth.class, "OntologicalRootClassesItemsBluetooth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsBluetooth_Bluetooth(), ecorePackage.getEBooleanObject(), "bluetooth", null, 1, 1, OntologicalRootClassesItemsBluetooth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootClassesItemsNoSCNEClass, OntologicalRootClassesItemsNoSCN.class, "OntologicalRootClassesItemsNoSCN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalRootClassesItemsNoSCN_NoSCN(), ecorePackage.getEBooleanObject(), "noSCN", null, 1, 1, OntologicalRootClassesItemsNoSCN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalRootPropertiesAbstractEClass, OntologicalRootPropertiesAbstract.class, "OntologicalRootPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologicalRootClassesItemsPropertiesAbstractEClass, OntologicalRootClassesItemsPropertiesAbstract.class, "OntologicalRootClassesItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologicalRootClassesItemsAttributesItemsPropertiesAbstractEClass, OntologicalRootClassesItemsAttributesItemsPropertiesAbstract.class, "OntologicalRootClassesItemsAttributesItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologicalRootClassesItemsReferencesItemsPropertiesAbstractEClass, OntologicalRootClassesItemsReferencesItemsPropertiesAbstract.class, "OntologicalRootClassesItemsReferencesItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Type
		createTypeAnnotations();
		// Keyword
		createKeywordAnnotations();
		// Comment
		createCommentAnnotations();
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
		  (ontologicalRootEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (ontologicalRootNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootURIEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootOnlyCodesEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootBluetoothEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootExternalEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootFirebaseEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootPhysicsEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootGameloopEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAbstractEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsTypeEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsMinEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsMaxEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsDefaultEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsReadOnlyEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsIsParamEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAttributesItemsIsKeyEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsContaintmentEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsMinEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsMaxEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsTargetEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsReferencesItemsOppositeEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsAutoIDEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsOnlyCodesEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsBluetoothEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsNoSCNEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
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
		  (getOntologicalRootName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getOntologicalRootURI_URI(),
		   source,
		   new String[] {
			   "Keyword", "URI"
		   });
		addAnnotation
		  (getOntologicalRootOnlyCodes_OnlyCodes(),
		   source,
		   new String[] {
			   "Keyword", "onlyCodes"
		   });
		addAnnotation
		  (getOntologicalRootBluetooth_Bluetooth(),
		   source,
		   new String[] {
			   "Keyword", "bluetooth"
		   });
		addAnnotation
		  (getOntologicalRootExternal_External(),
		   source,
		   new String[] {
			   "Keyword", "external"
		   });
		addAnnotation
		  (getOntologicalRootFirebase_Firebase(),
		   source,
		   new String[] {
			   "Keyword", "firebase"
		   });
		addAnnotation
		  (getOntologicalRootPhysics_Physics(),
		   source,
		   new String[] {
			   "Keyword", "physics"
		   });
		addAnnotation
		  (getOntologicalRootGameloop_Gameloop(),
		   source,
		   new String[] {
			   "Keyword", "gameloop"
		   });
		addAnnotation
		  (getOntologicalRootClasses_Classes(),
		   source,
		   new String[] {
			   "Keyword", "classes"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAbstract_Abstract(),
		   source,
		   new String[] {
			   "Keyword", "abstract"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributes_Attributes(),
		   source,
		   new String[] {
			   "Keyword", "attributes"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsType_Type(),
		   source,
		   new String[] {
			   "Keyword", "type"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsMin_Min(),
		   source,
		   new String[] {
			   "Keyword", "min"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsMax_Max(),
		   source,
		   new String[] {
			   "Keyword", "max"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsDefault_Default(),
		   source,
		   new String[] {
			   "Keyword", "default"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsReadOnly_ReadOnly(),
		   source,
		   new String[] {
			   "Keyword", "readOnly"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsIsParam_IsParam(),
		   source,
		   new String[] {
			   "Keyword", "isParam"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAttributesItemsIsKey_IsKey(),
		   source,
		   new String[] {
			   "Keyword", "isKey"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferences_References(),
		   source,
		   new String[] {
			   "Keyword", "references"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsContaintment_Containtment(),
		   source,
		   new String[] {
			   "Keyword", "containtment"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsMin_Min(),
		   source,
		   new String[] {
			   "Keyword", "min"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsMax_Max(),
		   source,
		   new String[] {
			   "Keyword", "max"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsTarget_Target(),
		   source,
		   new String[] {
			   "Keyword", "target"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsReferencesItemsOpposite_Opposite(),
		   source,
		   new String[] {
			   "Keyword", "opposite"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsAutoID_AutoID(),
		   source,
		   new String[] {
			   "Keyword", "autoID"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsOnlyCodes_OnlyCodes(),
		   source,
		   new String[] {
			   "Keyword", "onlyCodes"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsBluetooth_Bluetooth(),
		   source,
		   new String[] {
			   "Keyword", "bluetooth"
		   });
		addAnnotation
		  (getOntologicalRootClassesItemsNoSCN_NoSCN(),
		   source,
		   new String[] {
			   "Keyword", "noSCN"
		   });
	}

	/**
	 * Initializes the annotations for <b>Comment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCommentAnnotations() {
		String source = "Comment";
		addAnnotation
		  (ontologicalRootClassesItemsOnlyCodesEClass,
		   source,
		   new String[] {
			   "Comment", "this is the case when this particular class is or not with codes detection"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsBluetoothEClass,
		   source,
		   new String[] {
			   "Comment", "this is the case when this particular class is or not with bluetooth"
		   });
		addAnnotation
		  (ontologicalRootClassesItemsNoSCNEClass,
		   source,
		   new String[] {
			   "Comment", "discard any SCN image search"
		   });
	}

} //OntologicalPackageImpl
