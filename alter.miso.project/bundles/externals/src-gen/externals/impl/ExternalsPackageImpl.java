/**
 */
package externals.impl;

import externals.ExternalsFactory;
import externals.ExternalsPackage;
import externals.ExternalsRoot;
import externals.ExternalsRootAPIDescriptions;
import externals.ExternalsRootAPIDescriptionsItems;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuth;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract;
import externals.ExternalsRootAPIDescriptionsItemsName;
import externals.ExternalsRootAPIDescriptionsItemsPaths;
import externals.ExternalsRootAPIDescriptionsItemsPathsItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute;
import externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract;
import externals.ExternalsRootAPIDescriptionsItemsProtocol;
import externals.ExternalsRootAPIDescriptionsItemsUrl;
import externals.ExternalsRootPropertiesAbstract;

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
public class ExternalsPackageImpl extends EPackageImpl implements ExternalsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsAPIAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsAPIAuthItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractEClass = null;

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
	 * @see externals.ExternalsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalsPackageImpl() {
		super(eNS_URI, ExternalsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternalsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalsPackage init() {
		if (isInited) return (ExternalsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExternalsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExternalsPackageImpl theExternalsPackage = registeredExternalsPackage instanceof ExternalsPackageImpl ? (ExternalsPackageImpl)registeredExternalsPackage : new ExternalsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExternalsPackage.createPackageContents();

		// Initialize created meta-data
		theExternalsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalsPackage.eNS_URI, theExternalsPackage);
		return theExternalsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRoot() {
		return externalsRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRoot_ExternalsRoot() {
		return (EReference)externalsRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRoot_APIDescriptions() {
		return (EReference)externalsRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRoot__Get__String() {
		return externalsRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptions() {
		return externalsRootAPIDescriptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptions_APIDescriptions() {
		return (EReference)externalsRootAPIDescriptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItems() {
		return externalsRootAPIDescriptionsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItems_Items() {
		return (EReference)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItems_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItems_Protocol() {
		return (EAttribute)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItems_Url() {
		return (EAttribute)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItems_Paths() {
		return (EReference)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItems_APIAuth() {
		return (EReference)externalsRootAPIDescriptionsItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRootAPIDescriptionsItems__Get__String() {
		return externalsRootAPIDescriptionsItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsName() {
		return externalsRootAPIDescriptionsItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsName_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsProtocol() {
		return externalsRootAPIDescriptionsItemsProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsProtocol_Protocol() {
		return (EAttribute)externalsRootAPIDescriptionsItemsProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsUrl() {
		return externalsRootAPIDescriptionsItemsUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsUrl_Url() {
		return (EAttribute)externalsRootAPIDescriptionsItemsUrlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPaths() {
		return externalsRootAPIDescriptionsItemsPathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPaths_Paths() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItems() {
		return externalsRootAPIDescriptionsItemsPathsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItems_Items() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItems_Route() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItems_Parameters() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItems_Outputs() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRootAPIDescriptionsItemsPathsItems__Get__String() {
		return externalsRootAPIDescriptionsItemsPathsItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsRoute() {
		return externalsRootAPIDescriptionsItemsPathsItemsRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsRoute_Route() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsRouteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsParameters() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Items() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Type() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Get__String() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_Type() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputs() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Items() {
		return (EReference)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Type() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_JSONPath() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Get__String() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_Type() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_JSONPath() {
		return (EAttribute)externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsAPIAuth() {
		return externalsRootAPIDescriptionsItemsAPIAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth() {
		return (EReference)externalsRootAPIDescriptionsItemsAPIAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsAPIAuthItems() {
		return externalsRootAPIDescriptionsItemsAPIAuthItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsRootAPIDescriptionsItemsAPIAuthItems_Items() {
		return (EReference)externalsRootAPIDescriptionsItemsAPIAuthItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItems_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsAPIAuthItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItems_Key() {
		return (EAttribute)externalsRootAPIDescriptionsItemsAPIAuthItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalsRootAPIDescriptionsItemsAPIAuthItems__Get__String() {
		return externalsRootAPIDescriptionsItemsAPIAuthItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsName() {
		return externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItemsName_Name() {
		return (EAttribute)externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() {
		return externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_Key() {
		return (EAttribute)externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootPropertiesAbstract() {
		return externalsRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPropertiesAbstract() {
		return externalsRootAPIDescriptionsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract() {
		return externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract() {
		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract() {
		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract() {
		return externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsFactory getExternalsFactory() {
		return (ExternalsFactory)getEFactoryInstance();
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
		externalsRootEClass = createEClass(EXTERNALS_ROOT);
		createEReference(externalsRootEClass, EXTERNALS_ROOT__EXTERNALS_ROOT);
		createEReference(externalsRootEClass, EXTERNALS_ROOT__API_DESCRIPTIONS);
		createEOperation(externalsRootEClass, EXTERNALS_ROOT___GET__STRING);

		externalsRootAPIDescriptionsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS);
		createEReference(externalsRootAPIDescriptionsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS);

		externalsRootAPIDescriptionsItemsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS);
		createEReference(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS);
		createEAttribute(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL);
		createEAttribute(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL);
		createEReference(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS);
		createEReference(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH);
		createEOperation(externalsRootAPIDescriptionsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS___GET__STRING);

		externalsRootAPIDescriptionsItemsNameEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsNameEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME__NAME);

		externalsRootAPIDescriptionsItemsProtocolEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL);
		createEAttribute(externalsRootAPIDescriptionsItemsProtocolEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL__PROTOCOL);

		externalsRootAPIDescriptionsItemsUrlEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL);
		createEAttribute(externalsRootAPIDescriptionsItemsUrlEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL__URL);

		externalsRootAPIDescriptionsItemsPathsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS);
		createEReference(externalsRootAPIDescriptionsItemsPathsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS__PATHS);

		externalsRootAPIDescriptionsItemsPathsItemsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ROUTE);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__PARAMETERS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__OUTPUTS);
		createEOperation(externalsRootAPIDescriptionsItemsPathsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS___GET__STRING);

		externalsRootAPIDescriptionsItemsPathsItemsRouteEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsRouteEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE);

		externalsRootAPIDescriptionsItemsPathsItemsParametersEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsParametersEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS__PARAMETERS);

		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__ITEMS);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS__TYPE);
		createEOperation(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS___GET__STRING);

		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME__NAME);

		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE__TYPE);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS__OUTPUTS);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS);
		createEReference(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__TYPE);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__JSON_PATH);
		createEOperation(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS___GET__STRING);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME__NAME);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE__TYPE);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH);
		createEAttribute(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH__JSON_PATH);

		externalsRootAPIDescriptionsItemsAPIAuthEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH);
		createEReference(externalsRootAPIDescriptionsItemsAPIAuthEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH);

		externalsRootAPIDescriptionsItemsAPIAuthItemsEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS);
		createEReference(externalsRootAPIDescriptionsItemsAPIAuthItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__ITEMS);
		createEAttribute(externalsRootAPIDescriptionsItemsAPIAuthItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsAPIAuthItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS__KEY);
		createEOperation(externalsRootAPIDescriptionsItemsAPIAuthItemsEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS___GET__STRING);

		externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME);
		createEAttribute(externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME__NAME);

		externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY);
		createEAttribute(externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass, EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY__KEY);

		externalsRootPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_PROPERTIES_ABSTRACT);

		externalsRootAPIDescriptionsItemsPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT);

		externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT);

		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT);

		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT);

		externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractEClass = createEClass(EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT);
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
		externalsRootAPIDescriptionsEClass.getESuperTypes().add(this.getExternalsRootPropertiesAbstract());
		externalsRootAPIDescriptionsItemsNameEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsProtocolEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsUrlEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsRouteEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsParametersEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsAPIAuthEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract());
		externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass.getESuperTypes().add(this.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(externalsRootEClass, ExternalsRoot.class, "ExternalsRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRoot_ExternalsRoot(), this.getExternalsRootPropertiesAbstract(), null, "externalsRoot", null, 0, -1, ExternalsRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalsRoot_APIDescriptions(), this.getExternalsRootAPIDescriptionsItems(), null, "APIDescriptions", null, 0, -1, ExternalsRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getExternalsRoot__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsEClass, ExternalsRootAPIDescriptions.class, "ExternalsRootAPIDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptions_APIDescriptions(), this.getExternalsRootAPIDescriptionsItems(), null, "APIDescriptions", null, 0, -1, ExternalsRootAPIDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsEClass, ExternalsRootAPIDescriptionsItems.class, "ExternalsRootAPIDescriptionsItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItems_Items(), this.getExternalsRootAPIDescriptionsItemsPropertiesAbstract(), null, "items", null, 0, -1, ExternalsRootAPIDescriptionsItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalsRootAPIDescriptionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItems_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ExternalsRootAPIDescriptionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItems_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExternalsRootAPIDescriptionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalsRootAPIDescriptionsItems_Paths(), this.getExternalsRootAPIDescriptionsItemsPathsItems(), null, "paths", null, 0, -1, ExternalsRootAPIDescriptionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalsRootAPIDescriptionsItems_APIAuth(), this.getExternalsRootAPIDescriptionsItemsAPIAuthItems(), null, "APIAuth", null, 0, -1, ExternalsRootAPIDescriptionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExternalsRootAPIDescriptionsItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsNameEClass, ExternalsRootAPIDescriptionsItemsName.class, "ExternalsRootAPIDescriptionsItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExternalsRootAPIDescriptionsItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsProtocolEClass, ExternalsRootAPIDescriptionsItemsProtocol.class, "ExternalsRootAPIDescriptionsItemsProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsProtocol_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, ExternalsRootAPIDescriptionsItemsProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsUrlEClass, ExternalsRootAPIDescriptionsItemsUrl.class, "ExternalsRootAPIDescriptionsItemsUrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsUrl_Url(), ecorePackage.getEString(), "url", null, 1, 1, ExternalsRootAPIDescriptionsItemsUrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsEClass, ExternalsRootAPIDescriptionsItemsPaths.class, "ExternalsRootAPIDescriptionsItemsPaths", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPaths_Paths(), this.getExternalsRootAPIDescriptionsItemsPathsItems(), null, "paths", null, 0, -1, ExternalsRootAPIDescriptionsItemsPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsEClass, ExternalsRootAPIDescriptionsItemsPathsItems.class, "ExternalsRootAPIDescriptionsItemsPathsItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItems_Items(), this.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(), null, "items", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItems_Route(), ecorePackage.getEString(), "route", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItems_Parameters(), this.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems(), null, "parameters", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItems_Outputs(), this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems(), null, "outputs", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExternalsRootAPIDescriptionsItemsPathsItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsRouteEClass, ExternalsRootAPIDescriptionsItemsPathsItemsRoute.class, "ExternalsRootAPIDescriptionsItemsPathsItemsRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsRoute_Route(), ecorePackage.getEString(), "route", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsParametersEClass, ExternalsRootAPIDescriptionsItemsPathsItemsParameters.class, "ExternalsRootAPIDescriptionsItemsPathsItemsParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters(), this.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems(), null, "parameters", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItemsParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems.class, "ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Items(), this.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(), null, "items", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName.class, "ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType.class, "ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_Type(), ecorePackage.getEString(), "type", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputs.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs(), this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems(), null, "outputs", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Items(), this.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(), null, "items", null, 0, -1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_JSONPath(), ecorePackage.getEString(), "JSONPath", null, 0, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_Type(), ecorePackage.getEString(), "type", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_JSONPath(), ecorePackage.getEString(), "JSONPath", null, 1, 1, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsAPIAuthEClass, ExternalsRootAPIDescriptionsItemsAPIAuth.class, "ExternalsRootAPIDescriptionsItemsAPIAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth(), this.getExternalsRootAPIDescriptionsItemsAPIAuthItems(), null, "APIAuth", null, 0, -1, ExternalsRootAPIDescriptionsItemsAPIAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsAPIAuthItemsEClass, ExternalsRootAPIDescriptionsItemsAPIAuthItems.class, "ExternalsRootAPIDescriptionsItemsAPIAuthItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsRootAPIDescriptionsItemsAPIAuthItems_Items(), this.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(), null, "items", null, 0, -1, ExternalsRootAPIDescriptionsItemsAPIAuthItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsAPIAuthItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalsRootAPIDescriptionsItemsAPIAuthItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalsRootAPIDescriptionsItemsAPIAuthItems_Key(), ecorePackage.getEString(), "key", null, 0, 1, ExternalsRootAPIDescriptionsItemsAPIAuthItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExternalsRootAPIDescriptionsItemsAPIAuthItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass, ExternalsRootAPIDescriptionsItemsAPIAuthItemsName.class, "ExternalsRootAPIDescriptionsItemsAPIAuthItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsAPIAuthItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExternalsRootAPIDescriptionsItemsAPIAuthItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass, ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey.class, "ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_Key(), ecorePackage.getEString(), "key", null, 1, 1, ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsRootPropertiesAbstractEClass, ExternalsRootPropertiesAbstract.class, "ExternalsRootPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalsRootAPIDescriptionsItemsPropertiesAbstractEClass, ExternalsRootAPIDescriptionsItemsPropertiesAbstract.class, "ExternalsRootAPIDescriptionsItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractEClass, ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract.class, "ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractEClass, ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract.class, "ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractEClass, ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract.class, "ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractEClass, ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract.class, "ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (externalsRootEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsProtocolEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsUrlEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsRouteEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsParametersEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsOutputsEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsAPIAuthEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsAPIAuthItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsAPIAuthItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (externalsRootAPIDescriptionsItemsAPIAuthItemsKeyEClass,
		   source,
		   new String[] {
			   "Type", "string"
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
		  (getExternalsRootAPIDescriptions_APIDescriptions(),
		   source,
		   new String[] {
			   "Keyword", "APIDescriptions"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsProtocol_Protocol(),
		   source,
		   new String[] {
			   "Keyword", "protocol"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsUrl_Url(),
		   source,
		   new String[] {
			   "Keyword", "url"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPaths_Paths(),
		   source,
		   new String[] {
			   "Keyword", "paths"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsRoute_Route(),
		   source,
		   new String[] {
			   "Keyword", "route"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters(),
		   source,
		   new String[] {
			   "Keyword", "parameters"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType_Type(),
		   source,
		   new String[] {
			   "Keyword", "type"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs(),
		   source,
		   new String[] {
			   "Keyword", "outputs"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType_Type(),
		   source,
		   new String[] {
			   "Keyword", "type"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath_JSONPath(),
		   source,
		   new String[] {
			   "Keyword", "JSONPath"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth(),
		   source,
		   new String[] {
			   "Keyword", "APIAuth"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsAPIAuthItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getExternalsRootAPIDescriptionsItemsAPIAuthItemsKey_Key(),
		   source,
		   new String[] {
			   "Keyword", "key"
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
		  (externalsRootAPIDescriptionsItemsAPIAuthEClass,
		   source,
		   new String[] {
			   "Comment", "can be empty"
		   });
	}

} //ExternalsPackageImpl
