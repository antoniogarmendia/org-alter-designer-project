/**
 */
package graphic.impl;

import graphic.GraphicFactory;
import graphic.GraphicPackage;
import graphic.GraphicRoot;
import graphic.GraphicRootClasses;
import graphic.GraphicRootClassesItems;
import graphic.GraphicRootClassesItemsConnections;
import graphic.GraphicRootClassesItemsConnectionsItems;
import graphic.GraphicRootClassesItemsConnectionsItemsColor;
import graphic.GraphicRootClassesItemsConnectionsItemsDecorator;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth;
import graphic.GraphicRootClassesItemsConnectionsItemsName;
import graphic.GraphicRootClassesItemsConnectionsItemsPattern;
import graphic.GraphicRootClassesItemsConnectionsItemsPosition;
import graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract;
import graphic.GraphicRootClassesItemsConnectionsItemsTarget;
import graphic.GraphicRootClassesItemsConnectionsItemsTextColor;
import graphic.GraphicRootClassesItemsConnectionsItemsType;
import graphic.GraphicRootClassesItemsConnectionsItemsWidth;
import graphic.GraphicRootClassesItemsConstraints;
import graphic.GraphicRootClassesItemsConstraintsCategoryBitMask;
import graphic.GraphicRootClassesItemsConstraintsCollisionBitMask;
import graphic.GraphicRootClassesItemsConstraintsContactTestBitMask;
import graphic.GraphicRootClassesItemsConstraintsIlumination;
import graphic.GraphicRootClassesItemsConstraintsOverlapping;
import graphic.GraphicRootClassesItemsConstraintsPlanes;
import graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract;
import graphic.GraphicRootClassesItemsConstraintsRotation;
import graphic.GraphicRootClassesItemsConstraintsSizeInit;
import graphic.GraphicRootClassesItemsConstraintsSizeMax;
import graphic.GraphicRootClassesItemsConstraintsSizeMin;
import graphic.GraphicRootClassesItemsConstraintsText;
import graphic.GraphicRootClassesItemsConstraintsTrim;
import graphic.GraphicRootClassesItemsConstraintsXToOriginPos;
import graphic.GraphicRootClassesItemsConstraintsYToOriginPos;
import graphic.GraphicRootClassesItemsConstraintsZToOriginPos;
import graphic.GraphicRootClassesItemsMaterialAttributes;
import graphic.GraphicRootClassesItemsMaterialAttributesItems;
import graphic.GraphicRootClassesItemsName;
import graphic.GraphicRootClassesItemsPropertiesAbstract;
import graphic.GraphicRootClassesItemsShowAttributes;
import graphic.GraphicRootClassesItemsShowAttributesItems;
import graphic.GraphicRootClassesItemsVersions;
import graphic.GraphicRootClassesItemsVersionsPropertiesAbstract;
import graphic.GraphicRootClassesItemsVersionsV1;
import graphic.GraphicRootClassesItemsVersionsV2;
import graphic.GraphicRootClassesItemsVersionsV3;
import graphic.GraphicRootClassesItemsVname;
import graphic.GraphicRootClassesItemsVnamePropertiesAbstract;
import graphic.GraphicRootClassesItemsVnameV1;
import graphic.GraphicRootClassesItemsVnameV2;
import graphic.GraphicRootClassesItemsVnameV3;
import graphic.GraphicRootName;
import graphic.GraphicRootPropertiesAbstract;
import graphic.GraphicRootURI;

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
public class GraphicPackageImpl extends EPackageImpl implements GraphicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVersionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVersionsV1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVersionsV2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVersionsV3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVnameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVnameV1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVnameV2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVnameV3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsShowAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsShowAttributesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsMaterialAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsMaterialAttributesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsPlanesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsIluminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsSizeMaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsSizeMinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsSizeInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsOverlappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsXToOriginPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsYToOriginPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsZToOriginPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsRotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsTrimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsCategoryBitMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsCollisionBitMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsContactTestBitMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsTextColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsDecoratorColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsDecoratorPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsWidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVersionsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsVnamePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConstraintsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRootClassesItemsConnectionsItemsPropertiesAbstractEClass = null;

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
	 * @see graphic.GraphicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphicPackageImpl() {
		super(eNS_URI, GraphicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphicPackage init() {
		if (isInited) return (GraphicPackage)EPackage.Registry.INSTANCE.getEPackage(GraphicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphicPackageImpl theGraphicPackage = registeredGraphicPackage instanceof GraphicPackageImpl ? (GraphicPackageImpl)registeredGraphicPackage : new GraphicPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGraphicPackage.createPackageContents();

		// Initialize created meta-data
		theGraphicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphicPackage.eNS_URI, theGraphicPackage);
		return theGraphicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRoot() {
		return graphicRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRoot_GraphicRoot() {
		return (EReference)graphicRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRoot_Name() {
		return (EAttribute)graphicRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRoot_URI() {
		return (EAttribute)graphicRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRoot_Classes() {
		return (EReference)graphicRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRoot__Get__String() {
		return graphicRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootName() {
		return graphicRootNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootName_Name() {
		return (EAttribute)graphicRootNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootURI() {
		return graphicRootURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootURI_URI() {
		return (EAttribute)graphicRootURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClasses() {
		return graphicRootClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClasses_Classes() {
		return (EReference)graphicRootClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItems() {
		return graphicRootClassesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_Items() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItems_Name() {
		return (EAttribute)graphicRootClassesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_Versions() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_Vname() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_ShowAttributes() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_MaterialAttributes() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_Constraints() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItems_Connections() {
		return (EReference)graphicRootClassesItemsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRootClassesItems__Get__String() {
		return graphicRootClassesItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsName() {
		return graphicRootClassesItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsName_Name() {
		return (EAttribute)graphicRootClassesItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVersions() {
		return graphicRootClassesItemsVersionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsVersions_Versions() {
		return (EReference)graphicRootClassesItemsVersionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersions_V1() {
		return (EAttribute)graphicRootClassesItemsVersionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersions_V2() {
		return (EAttribute)graphicRootClassesItemsVersionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersions_V3() {
		return (EAttribute)graphicRootClassesItemsVersionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRootClassesItemsVersions__Get__String() {
		return graphicRootClassesItemsVersionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVersionsV1() {
		return graphicRootClassesItemsVersionsV1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersionsV1_V1() {
		return (EAttribute)graphicRootClassesItemsVersionsV1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVersionsV2() {
		return graphicRootClassesItemsVersionsV2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersionsV2_V2() {
		return (EAttribute)graphicRootClassesItemsVersionsV2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVersionsV3() {
		return graphicRootClassesItemsVersionsV3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVersionsV3_V3() {
		return (EAttribute)graphicRootClassesItemsVersionsV3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVname() {
		return graphicRootClassesItemsVnameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsVname_Vname() {
		return (EReference)graphicRootClassesItemsVnameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVname_V1() {
		return (EAttribute)graphicRootClassesItemsVnameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVname_V2() {
		return (EAttribute)graphicRootClassesItemsVnameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVname_V3() {
		return (EAttribute)graphicRootClassesItemsVnameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRootClassesItemsVname__Get__String() {
		return graphicRootClassesItemsVnameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVnameV1() {
		return graphicRootClassesItemsVnameV1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVnameV1_V1() {
		return (EAttribute)graphicRootClassesItemsVnameV1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVnameV2() {
		return graphicRootClassesItemsVnameV2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVnameV2_V2() {
		return (EAttribute)graphicRootClassesItemsVnameV2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVnameV3() {
		return graphicRootClassesItemsVnameV3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsVnameV3_V3() {
		return (EAttribute)graphicRootClassesItemsVnameV3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsShowAttributes() {
		return graphicRootClassesItemsShowAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsShowAttributes_ShowAttributes() {
		return (EReference)graphicRootClassesItemsShowAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsShowAttributesItems() {
		return graphicRootClassesItemsShowAttributesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsShowAttributesItems_Items() {
		return (EAttribute)graphicRootClassesItemsShowAttributesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsMaterialAttributes() {
		return graphicRootClassesItemsMaterialAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes() {
		return (EReference)graphicRootClassesItemsMaterialAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsMaterialAttributesItems() {
		return graphicRootClassesItemsMaterialAttributesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsMaterialAttributesItems_Items() {
		return (EAttribute)graphicRootClassesItemsMaterialAttributesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraints() {
		return graphicRootClassesItemsConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsConstraints_Constraints() {
		return (EReference)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Planes() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Ilumination() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_SizeMax() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_SizeMin() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_SizeInit() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Overlapping() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_XToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_YToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_ZToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Rotation() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Text() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_Trim() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_CategoryBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_CollisionBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraints_ContactTestBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRootClassesItemsConstraints__Get__String() {
		return graphicRootClassesItemsConstraintsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsPlanes() {
		return graphicRootClassesItemsConstraintsPlanesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsPlanes_Planes() {
		return (EAttribute)graphicRootClassesItemsConstraintsPlanesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsIlumination() {
		return graphicRootClassesItemsConstraintsIluminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsIlumination_Ilumination() {
		return (EAttribute)graphicRootClassesItemsConstraintsIluminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsSizeMax() {
		return graphicRootClassesItemsConstraintsSizeMaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsSizeMax_SizeMax() {
		return (EAttribute)graphicRootClassesItemsConstraintsSizeMaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsSizeMin() {
		return graphicRootClassesItemsConstraintsSizeMinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsSizeMin_SizeMin() {
		return (EAttribute)graphicRootClassesItemsConstraintsSizeMinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsSizeInit() {
		return graphicRootClassesItemsConstraintsSizeInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsSizeInit_SizeInit() {
		return (EAttribute)graphicRootClassesItemsConstraintsSizeInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsOverlapping() {
		return graphicRootClassesItemsConstraintsOverlappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsOverlapping_Overlapping() {
		return (EAttribute)graphicRootClassesItemsConstraintsOverlappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsXToOriginPos() {
		return graphicRootClassesItemsConstraintsXToOriginPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsXToOriginPos_XToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsXToOriginPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsYToOriginPos() {
		return graphicRootClassesItemsConstraintsYToOriginPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsYToOriginPos_YToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsYToOriginPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsZToOriginPos() {
		return graphicRootClassesItemsConstraintsZToOriginPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsZToOriginPos_ZToOriginPos() {
		return (EAttribute)graphicRootClassesItemsConstraintsZToOriginPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsRotation() {
		return graphicRootClassesItemsConstraintsRotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsRotation_Rotation() {
		return (EAttribute)graphicRootClassesItemsConstraintsRotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsText() {
		return graphicRootClassesItemsConstraintsTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsText_Text() {
		return (EAttribute)graphicRootClassesItemsConstraintsTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsTrim() {
		return graphicRootClassesItemsConstraintsTrimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsTrim_Trim() {
		return (EAttribute)graphicRootClassesItemsConstraintsTrimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsCategoryBitMask() {
		return graphicRootClassesItemsConstraintsCategoryBitMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsCategoryBitMask_CategoryBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsCategoryBitMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsCollisionBitMask() {
		return graphicRootClassesItemsConstraintsCollisionBitMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsCollisionBitMask_CollisionBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsCollisionBitMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsContactTestBitMask() {
		return graphicRootClassesItemsConstraintsContactTestBitMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConstraintsContactTestBitMask_ContactTestBitMask() {
		return (EAttribute)graphicRootClassesItemsConstraintsContactTestBitMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnections() {
		return graphicRootClassesItemsConnectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsConnections_Connections() {
		return (EReference)graphicRootClassesItemsConnectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItems() {
		return graphicRootClassesItemsConnectionsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicRootClassesItemsConnectionsItems_Items() {
		return (EReference)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Name() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Type() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Color() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_TextColor() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Decorator() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorColor() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorWidth() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_DecoratorPos() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Pattern() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Width() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Position() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItems_Target() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphicRootClassesItemsConnectionsItems__Get__String() {
		return graphicRootClassesItemsConnectionsItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsName() {
		return graphicRootClassesItemsConnectionsItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsName_Name() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsType() {
		return graphicRootClassesItemsConnectionsItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsType_Type() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsColor() {
		return graphicRootClassesItemsConnectionsItemsColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsColor_Color() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsTextColor() {
		return graphicRootClassesItemsConnectionsItemsTextColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsTextColor_TextColor() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsTextColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsDecorator() {
		return graphicRootClassesItemsConnectionsItemsDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsDecorator_Decorator() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsDecoratorColor() {
		return graphicRootClassesItemsConnectionsItemsDecoratorColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorColor_DecoratorColor() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsDecoratorColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsDecoratorWidth() {
		return graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorWidth_DecoratorWidth() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsDecoratorPos() {
		return graphicRootClassesItemsConnectionsItemsDecoratorPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsDecoratorPos_DecoratorPos() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsDecoratorPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsPattern() {
		return graphicRootClassesItemsConnectionsItemsPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsPattern_Pattern() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsWidth() {
		return graphicRootClassesItemsConnectionsItemsWidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsWidth_Width() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsWidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsPosition() {
		return graphicRootClassesItemsConnectionsItemsPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsPosition_Position() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsTarget() {
		return graphicRootClassesItemsConnectionsItemsTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicRootClassesItemsConnectionsItemsTarget_Target() {
		return (EAttribute)graphicRootClassesItemsConnectionsItemsTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootPropertiesAbstract() {
		return graphicRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsPropertiesAbstract() {
		return graphicRootClassesItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVersionsPropertiesAbstract() {
		return graphicRootClassesItemsVersionsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsVnamePropertiesAbstract() {
		return graphicRootClassesItemsVnamePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConstraintsPropertiesAbstract() {
		return graphicRootClassesItemsConstraintsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract() {
		return graphicRootClassesItemsConnectionsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicFactory getGraphicFactory() {
		return (GraphicFactory)getEFactoryInstance();
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
		graphicRootEClass = createEClass(GRAPHIC_ROOT);
		createEReference(graphicRootEClass, GRAPHIC_ROOT__GRAPHIC_ROOT);
		createEAttribute(graphicRootEClass, GRAPHIC_ROOT__NAME);
		createEAttribute(graphicRootEClass, GRAPHIC_ROOT__URI);
		createEReference(graphicRootEClass, GRAPHIC_ROOT__CLASSES);
		createEOperation(graphicRootEClass, GRAPHIC_ROOT___GET__STRING);

		graphicRootNameEClass = createEClass(GRAPHIC_ROOT_NAME);
		createEAttribute(graphicRootNameEClass, GRAPHIC_ROOT_NAME__NAME);

		graphicRootURIEClass = createEClass(GRAPHIC_ROOT_URI);
		createEAttribute(graphicRootURIEClass, GRAPHIC_ROOT_URI__URI);

		graphicRootClassesEClass = createEClass(GRAPHIC_ROOT_CLASSES);
		createEReference(graphicRootClassesEClass, GRAPHIC_ROOT_CLASSES__CLASSES);

		graphicRootClassesItemsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS);
		createEAttribute(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__NAME);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__VNAME);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS);
		createEReference(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS);
		createEOperation(graphicRootClassesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS___GET__STRING);

		graphicRootClassesItemsNameEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_NAME);
		createEAttribute(graphicRootClassesItemsNameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_NAME__NAME);

		graphicRootClassesItemsVersionsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS);
		createEReference(graphicRootClassesItemsVersionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS);
		createEAttribute(graphicRootClassesItemsVersionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V1);
		createEAttribute(graphicRootClassesItemsVersionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V2);
		createEAttribute(graphicRootClassesItemsVersionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V3);
		createEOperation(graphicRootClassesItemsVersionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS___GET__STRING);

		graphicRootClassesItemsVersionsV1EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1);
		createEAttribute(graphicRootClassesItemsVersionsV1EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1__V1);

		graphicRootClassesItemsVersionsV2EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2);
		createEAttribute(graphicRootClassesItemsVersionsV2EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2__V2);

		graphicRootClassesItemsVersionsV3EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3);
		createEAttribute(graphicRootClassesItemsVersionsV3EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3__V3);

		graphicRootClassesItemsVnameEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VNAME);
		createEReference(graphicRootClassesItemsVnameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME);
		createEAttribute(graphicRootClassesItemsVnameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V1);
		createEAttribute(graphicRootClassesItemsVnameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V2);
		createEAttribute(graphicRootClassesItemsVnameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V3);
		createEOperation(graphicRootClassesItemsVnameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME___GET__STRING);

		graphicRootClassesItemsVnameV1EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1);
		createEAttribute(graphicRootClassesItemsVnameV1EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1__V1);

		graphicRootClassesItemsVnameV2EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2);
		createEAttribute(graphicRootClassesItemsVnameV2EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2__V2);

		graphicRootClassesItemsVnameV3EClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3);
		createEAttribute(graphicRootClassesItemsVnameV3EClass, GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3__V3);

		graphicRootClassesItemsShowAttributesEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES);
		createEReference(graphicRootClassesItemsShowAttributesEClass, GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES);

		graphicRootClassesItemsShowAttributesItemsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS);
		createEAttribute(graphicRootClassesItemsShowAttributesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS__ITEMS);

		graphicRootClassesItemsMaterialAttributesEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES);
		createEReference(graphicRootClassesItemsMaterialAttributesEClass, GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES);

		graphicRootClassesItemsMaterialAttributesItemsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS);
		createEAttribute(graphicRootClassesItemsMaterialAttributesItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS__ITEMS);

		graphicRootClassesItemsConstraintsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS);
		createEReference(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK);
		createEAttribute(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK);
		createEOperation(graphicRootClassesItemsConstraintsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS___GET__STRING);

		graphicRootClassesItemsConstraintsPlanesEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES);
		createEAttribute(graphicRootClassesItemsConstraintsPlanesEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES__PLANES);

		graphicRootClassesItemsConstraintsIluminationEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION);
		createEAttribute(graphicRootClassesItemsConstraintsIluminationEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION__ILUMINATION);

		graphicRootClassesItemsConstraintsSizeMaxEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX);
		createEAttribute(graphicRootClassesItemsConstraintsSizeMaxEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX);

		graphicRootClassesItemsConstraintsSizeMinEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN);
		createEAttribute(graphicRootClassesItemsConstraintsSizeMinEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN__SIZE_MIN);

		graphicRootClassesItemsConstraintsSizeInitEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT);
		createEAttribute(graphicRootClassesItemsConstraintsSizeInitEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT__SIZE_INIT);

		graphicRootClassesItemsConstraintsOverlappingEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING);
		createEAttribute(graphicRootClassesItemsConstraintsOverlappingEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING);

		graphicRootClassesItemsConstraintsXToOriginPosEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsXToOriginPosEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS__XTO_ORIGIN_POS);

		graphicRootClassesItemsConstraintsYToOriginPosEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsYToOriginPosEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS__YTO_ORIGIN_POS);

		graphicRootClassesItemsConstraintsZToOriginPosEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS);
		createEAttribute(graphicRootClassesItemsConstraintsZToOriginPosEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS);

		graphicRootClassesItemsConstraintsRotationEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION);
		createEAttribute(graphicRootClassesItemsConstraintsRotationEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION__ROTATION);

		graphicRootClassesItemsConstraintsTextEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT);
		createEAttribute(graphicRootClassesItemsConstraintsTextEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT__TEXT);

		graphicRootClassesItemsConstraintsTrimEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM);
		createEAttribute(graphicRootClassesItemsConstraintsTrimEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM__TRIM);

		graphicRootClassesItemsConstraintsCategoryBitMaskEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK);
		createEAttribute(graphicRootClassesItemsConstraintsCategoryBitMaskEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK);

		graphicRootClassesItemsConstraintsCollisionBitMaskEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK);
		createEAttribute(graphicRootClassesItemsConstraintsCollisionBitMaskEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK);

		graphicRootClassesItemsConstraintsContactTestBitMaskEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK);
		createEAttribute(graphicRootClassesItemsConstraintsContactTestBitMaskEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK);

		graphicRootClassesItemsConnectionsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS);
		createEReference(graphicRootClassesItemsConnectionsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS__CONNECTIONS);

		graphicRootClassesItemsConnectionsItemsEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS);
		createEReference(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION);
		createEAttribute(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET);
		createEOperation(graphicRootClassesItemsConnectionsItemsEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS___GET__STRING);

		graphicRootClassesItemsConnectionsItemsNameEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME);
		createEAttribute(graphicRootClassesItemsConnectionsItemsNameEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME__NAME);

		graphicRootClassesItemsConnectionsItemsTypeEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE);
		createEAttribute(graphicRootClassesItemsConnectionsItemsTypeEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE__TYPE);

		graphicRootClassesItemsConnectionsItemsColorEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsColorEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR__COLOR);

		graphicRootClassesItemsConnectionsItemsTextColorEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsTextColorEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR__TEXT_COLOR);

		graphicRootClassesItemsConnectionsItemsDecoratorEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsDecoratorEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR);

		graphicRootClassesItemsConnectionsItemsDecoratorColorEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR);
		createEAttribute(graphicRootClassesItemsConnectionsItemsDecoratorColorEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR);

		graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH);
		createEAttribute(graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH);

		graphicRootClassesItemsConnectionsItemsDecoratorPosEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS);
		createEAttribute(graphicRootClassesItemsConnectionsItemsDecoratorPosEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS);

		graphicRootClassesItemsConnectionsItemsPatternEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN);
		createEAttribute(graphicRootClassesItemsConnectionsItemsPatternEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN__PATTERN);

		graphicRootClassesItemsConnectionsItemsWidthEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH);
		createEAttribute(graphicRootClassesItemsConnectionsItemsWidthEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH__WIDTH);

		graphicRootClassesItemsConnectionsItemsPositionEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION);
		createEAttribute(graphicRootClassesItemsConnectionsItemsPositionEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION__POSITION);

		graphicRootClassesItemsConnectionsItemsTargetEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET);
		createEAttribute(graphicRootClassesItemsConnectionsItemsTargetEClass, GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET__TARGET);

		graphicRootPropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_PROPERTIES_ABSTRACT);

		graphicRootClassesItemsPropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT);

		graphicRootClassesItemsVersionsPropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT);

		graphicRootClassesItemsVnamePropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT);

		graphicRootClassesItemsConstraintsPropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT);

		graphicRootClassesItemsConnectionsItemsPropertiesAbstractEClass = createEClass(GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT);
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
		graphicRootNameEClass.getESuperTypes().add(this.getGraphicRootPropertiesAbstract());
		graphicRootURIEClass.getESuperTypes().add(this.getGraphicRootPropertiesAbstract());
		graphicRootClassesEClass.getESuperTypes().add(this.getGraphicRootPropertiesAbstract());
		graphicRootClassesItemsNameEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsVersionsEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsVersionsV1EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVersionsPropertiesAbstract());
		graphicRootClassesItemsVersionsV2EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVersionsPropertiesAbstract());
		graphicRootClassesItemsVersionsV3EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVersionsPropertiesAbstract());
		graphicRootClassesItemsVnameEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsVnameV1EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVnamePropertiesAbstract());
		graphicRootClassesItemsVnameV2EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVnamePropertiesAbstract());
		graphicRootClassesItemsVnameV3EClass.getESuperTypes().add(this.getGraphicRootClassesItemsVnamePropertiesAbstract());
		graphicRootClassesItemsShowAttributesEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsMaterialAttributesEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsConstraintsEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsConstraintsPlanesEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsIluminationEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsSizeMaxEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsSizeMinEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsSizeInitEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsOverlappingEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsXToOriginPosEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsYToOriginPosEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsZToOriginPosEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsRotationEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsTextEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsTrimEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsCategoryBitMaskEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsCollisionBitMaskEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConstraintsContactTestBitMaskEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConstraintsPropertiesAbstract());
		graphicRootClassesItemsConnectionsEClass.getESuperTypes().add(this.getGraphicRootClassesItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsNameEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsTypeEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsColorEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsTextColorEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsDecoratorEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsDecoratorColorEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsDecoratorPosEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsPatternEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsWidthEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsPositionEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());
		graphicRootClassesItemsConnectionsItemsTargetEClass.getESuperTypes().add(this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(graphicRootEClass, GraphicRoot.class, "GraphicRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRoot_GraphicRoot(), this.getGraphicRootPropertiesAbstract(), null, "graphicRoot", null, 0, -1, GraphicRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRoot_URI(), ecorePackage.getEString(), "URI", null, 0, 1, GraphicRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRoot_Classes(), this.getGraphicRootClassesItems(), null, "classes", null, 0, -1, GraphicRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getGraphicRoot__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootNameEClass, GraphicRootName.class, "GraphicRootName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootName_Name(), ecorePackage.getEString(), "name", null, 1, 1, GraphicRootName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootURIEClass, GraphicRootURI.class, "GraphicRootURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootURI_URI(), ecorePackage.getEString(), "URI", null, 1, 1, GraphicRootURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesEClass, GraphicRootClasses.class, "GraphicRootClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClasses_Classes(), this.getGraphicRootClassesItems(), null, "classes", null, 0, -1, GraphicRootClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsEClass, GraphicRootClassesItems.class, "GraphicRootClassesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItems_Items(), this.getGraphicRootClassesItemsPropertiesAbstract(), null, "items", null, 0, -1, GraphicRootClassesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRootClassesItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_Versions(), this.getGraphicRootClassesItemsVersions(), null, "versions", null, 0, 1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_Vname(), this.getGraphicRootClassesItemsVname(), null, "vname", null, 0, 1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_ShowAttributes(), this.getGraphicRootClassesItemsShowAttributesItems(), null, "showAttributes", null, 0, -1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_MaterialAttributes(), this.getGraphicRootClassesItemsMaterialAttributesItems(), null, "materialAttributes", null, 0, -1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_Constraints(), this.getGraphicRootClassesItemsConstraints(), null, "constraints", null, 0, 1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraphicRootClassesItems_Connections(), this.getGraphicRootClassesItemsConnectionsItems(), null, "connections", null, 0, -1, GraphicRootClassesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGraphicRootClassesItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootClassesItemsNameEClass, GraphicRootClassesItemsName.class, "GraphicRootClassesItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, GraphicRootClassesItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVersionsEClass, GraphicRootClassesItemsVersions.class, "GraphicRootClassesItemsVersions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsVersions_Versions(), this.getGraphicRootClassesItemsVersionsPropertiesAbstract(), null, "versions", null, 0, -1, GraphicRootClassesItemsVersions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVersions_V1(), ecorePackage.getEString(), "v1", null, 0, 1, GraphicRootClassesItemsVersions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVersions_V2(), ecorePackage.getEString(), "v2", null, 0, 1, GraphicRootClassesItemsVersions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVersions_V3(), ecorePackage.getEString(), "v3", null, 0, 1, GraphicRootClassesItemsVersions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGraphicRootClassesItemsVersions__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootClassesItemsVersionsV1EClass, GraphicRootClassesItemsVersionsV1.class, "GraphicRootClassesItemsVersionsV1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVersionsV1_V1(), ecorePackage.getEString(), "v1", null, 1, 1, GraphicRootClassesItemsVersionsV1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVersionsV2EClass, GraphicRootClassesItemsVersionsV2.class, "GraphicRootClassesItemsVersionsV2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVersionsV2_V2(), ecorePackage.getEString(), "v2", null, 1, 1, GraphicRootClassesItemsVersionsV2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVersionsV3EClass, GraphicRootClassesItemsVersionsV3.class, "GraphicRootClassesItemsVersionsV3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVersionsV3_V3(), ecorePackage.getEString(), "v3", null, 1, 1, GraphicRootClassesItemsVersionsV3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVnameEClass, GraphicRootClassesItemsVname.class, "GraphicRootClassesItemsVname", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsVname_Vname(), this.getGraphicRootClassesItemsVnamePropertiesAbstract(), null, "vname", null, 0, -1, GraphicRootClassesItemsVname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVname_V1(), ecorePackage.getEString(), "v1", null, 0, 1, GraphicRootClassesItemsVname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVname_V2(), ecorePackage.getEString(), "v2", null, 0, 1, GraphicRootClassesItemsVname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsVname_V3(), ecorePackage.getEString(), "v3", null, 0, 1, GraphicRootClassesItemsVname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGraphicRootClassesItemsVname__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootClassesItemsVnameV1EClass, GraphicRootClassesItemsVnameV1.class, "GraphicRootClassesItemsVnameV1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVnameV1_V1(), ecorePackage.getEString(), "v1", null, 1, 1, GraphicRootClassesItemsVnameV1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVnameV2EClass, GraphicRootClassesItemsVnameV2.class, "GraphicRootClassesItemsVnameV2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVnameV2_V2(), ecorePackage.getEString(), "v2", null, 1, 1, GraphicRootClassesItemsVnameV2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsVnameV3EClass, GraphicRootClassesItemsVnameV3.class, "GraphicRootClassesItemsVnameV3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsVnameV3_V3(), ecorePackage.getEString(), "v3", null, 1, 1, GraphicRootClassesItemsVnameV3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsShowAttributesEClass, GraphicRootClassesItemsShowAttributes.class, "GraphicRootClassesItemsShowAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsShowAttributes_ShowAttributes(), this.getGraphicRootClassesItemsShowAttributesItems(), null, "showAttributes", null, 0, -1, GraphicRootClassesItemsShowAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsShowAttributesItemsEClass, GraphicRootClassesItemsShowAttributesItems.class, "GraphicRootClassesItemsShowAttributesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsShowAttributesItems_Items(), ecorePackage.getEString(), "items", null, 1, 1, GraphicRootClassesItemsShowAttributesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsMaterialAttributesEClass, GraphicRootClassesItemsMaterialAttributes.class, "GraphicRootClassesItemsMaterialAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes(), this.getGraphicRootClassesItemsMaterialAttributesItems(), null, "materialAttributes", null, 0, -1, GraphicRootClassesItemsMaterialAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsMaterialAttributesItemsEClass, GraphicRootClassesItemsMaterialAttributesItems.class, "GraphicRootClassesItemsMaterialAttributesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsMaterialAttributesItems_Items(), ecorePackage.getEString(), "items", null, 1, 1, GraphicRootClassesItemsMaterialAttributesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsEClass, GraphicRootClassesItemsConstraints.class, "GraphicRootClassesItemsConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsConstraints_Constraints(), this.getGraphicRootClassesItemsConstraintsPropertiesAbstract(), null, "constraints", null, 0, -1, GraphicRootClassesItemsConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Planes(), ecorePackage.getEString(), "planes", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Ilumination(), ecorePackage.getEString(), "ilumination", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_SizeMax(), ecorePackage.getEString(), "sizeMax", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_SizeMin(), ecorePackage.getEString(), "sizeMin", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_SizeInit(), ecorePackage.getEString(), "sizeInit", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Overlapping(), ecorePackage.getEString(), "overlapping", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_XToOriginPos(), ecorePackage.getEString(), "xToOriginPos", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_YToOriginPos(), ecorePackage.getEString(), "yToOriginPos", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_ZToOriginPos(), ecorePackage.getEString(), "zToOriginPos", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Rotation(), ecorePackage.getEString(), "rotation", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Text(), ecorePackage.getEString(), "text", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_Trim(), ecorePackage.getEBooleanObject(), "trim", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_CategoryBitMask(), ecorePackage.getEDoubleObject(), "categoryBitMask", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_CollisionBitMask(), ecorePackage.getEDoubleObject(), "collisionBitMask", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConstraints_ContactTestBitMask(), ecorePackage.getEDoubleObject(), "contactTestBitMask", null, 0, 1, GraphicRootClassesItemsConstraints.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGraphicRootClassesItemsConstraints__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsPlanesEClass, GraphicRootClassesItemsConstraintsPlanes.class, "GraphicRootClassesItemsConstraintsPlanes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsPlanes_Planes(), ecorePackage.getEString(), "planes", null, 1, 1, GraphicRootClassesItemsConstraintsPlanes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsIluminationEClass, GraphicRootClassesItemsConstraintsIlumination.class, "GraphicRootClassesItemsConstraintsIlumination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsIlumination_Ilumination(), ecorePackage.getEString(), "ilumination", null, 1, 1, GraphicRootClassesItemsConstraintsIlumination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsSizeMaxEClass, GraphicRootClassesItemsConstraintsSizeMax.class, "GraphicRootClassesItemsConstraintsSizeMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsSizeMax_SizeMax(), ecorePackage.getEString(), "sizeMax", null, 1, 1, GraphicRootClassesItemsConstraintsSizeMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsSizeMinEClass, GraphicRootClassesItemsConstraintsSizeMin.class, "GraphicRootClassesItemsConstraintsSizeMin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsSizeMin_SizeMin(), ecorePackage.getEString(), "sizeMin", null, 1, 1, GraphicRootClassesItemsConstraintsSizeMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsSizeInitEClass, GraphicRootClassesItemsConstraintsSizeInit.class, "GraphicRootClassesItemsConstraintsSizeInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsSizeInit_SizeInit(), ecorePackage.getEString(), "sizeInit", null, 1, 1, GraphicRootClassesItemsConstraintsSizeInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsOverlappingEClass, GraphicRootClassesItemsConstraintsOverlapping.class, "GraphicRootClassesItemsConstraintsOverlapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsOverlapping_Overlapping(), ecorePackage.getEString(), "overlapping", null, 1, 1, GraphicRootClassesItemsConstraintsOverlapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsXToOriginPosEClass, GraphicRootClassesItemsConstraintsXToOriginPos.class, "GraphicRootClassesItemsConstraintsXToOriginPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsXToOriginPos_XToOriginPos(), ecorePackage.getEString(), "xToOriginPos", null, 1, 1, GraphicRootClassesItemsConstraintsXToOriginPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsYToOriginPosEClass, GraphicRootClassesItemsConstraintsYToOriginPos.class, "GraphicRootClassesItemsConstraintsYToOriginPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsYToOriginPos_YToOriginPos(), ecorePackage.getEString(), "yToOriginPos", null, 1, 1, GraphicRootClassesItemsConstraintsYToOriginPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsZToOriginPosEClass, GraphicRootClassesItemsConstraintsZToOriginPos.class, "GraphicRootClassesItemsConstraintsZToOriginPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsZToOriginPos_ZToOriginPos(), ecorePackage.getEString(), "zToOriginPos", null, 1, 1, GraphicRootClassesItemsConstraintsZToOriginPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsRotationEClass, GraphicRootClassesItemsConstraintsRotation.class, "GraphicRootClassesItemsConstraintsRotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsRotation_Rotation(), ecorePackage.getEString(), "rotation", null, 1, 1, GraphicRootClassesItemsConstraintsRotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsTextEClass, GraphicRootClassesItemsConstraintsText.class, "GraphicRootClassesItemsConstraintsText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsText_Text(), ecorePackage.getEString(), "text", null, 1, 1, GraphicRootClassesItemsConstraintsText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsTrimEClass, GraphicRootClassesItemsConstraintsTrim.class, "GraphicRootClassesItemsConstraintsTrim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsTrim_Trim(), ecorePackage.getEBooleanObject(), "trim", null, 1, 1, GraphicRootClassesItemsConstraintsTrim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsCategoryBitMaskEClass, GraphicRootClassesItemsConstraintsCategoryBitMask.class, "GraphicRootClassesItemsConstraintsCategoryBitMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsCategoryBitMask_CategoryBitMask(), ecorePackage.getEDoubleObject(), "categoryBitMask", null, 1, 1, GraphicRootClassesItemsConstraintsCategoryBitMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsCollisionBitMaskEClass, GraphicRootClassesItemsConstraintsCollisionBitMask.class, "GraphicRootClassesItemsConstraintsCollisionBitMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsCollisionBitMask_CollisionBitMask(), ecorePackage.getEDoubleObject(), "collisionBitMask", null, 1, 1, GraphicRootClassesItemsConstraintsCollisionBitMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConstraintsContactTestBitMaskEClass, GraphicRootClassesItemsConstraintsContactTestBitMask.class, "GraphicRootClassesItemsConstraintsContactTestBitMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConstraintsContactTestBitMask_ContactTestBitMask(), ecorePackage.getEDoubleObject(), "contactTestBitMask", null, 1, 1, GraphicRootClassesItemsConstraintsContactTestBitMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsEClass, GraphicRootClassesItemsConnections.class, "GraphicRootClassesItemsConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsConnections_Connections(), this.getGraphicRootClassesItemsConnectionsItems(), null, "connections", null, 0, -1, GraphicRootClassesItemsConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsEClass, GraphicRootClassesItemsConnectionsItems.class, "GraphicRootClassesItemsConnectionsItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRootClassesItemsConnectionsItems_Items(), this.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(), null, "items", null, 0, -1, GraphicRootClassesItemsConnectionsItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Type(), ecorePackage.getEString(), "type", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Color(), ecorePackage.getEString(), "color", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_TextColor(), ecorePackage.getEString(), "textColor", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Decorator(), ecorePackage.getEString(), "decorator", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_DecoratorColor(), ecorePackage.getEString(), "decoratorColor", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_DecoratorWidth(), ecorePackage.getEString(), "decoratorWidth", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_DecoratorPos(), ecorePackage.getEString(), "decoratorPos", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Width(), ecorePackage.getEString(), "width", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Position(), ecorePackage.getEString(), "position", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicRootClassesItemsConnectionsItems_Target(), ecorePackage.getEString(), "target", null, 0, 1, GraphicRootClassesItemsConnectionsItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGraphicRootClassesItemsConnectionsItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsNameEClass, GraphicRootClassesItemsConnectionsItemsName.class, "GraphicRootClassesItemsConnectionsItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, GraphicRootClassesItemsConnectionsItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsTypeEClass, GraphicRootClassesItemsConnectionsItemsType.class, "GraphicRootClassesItemsConnectionsItemsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsType_Type(), ecorePackage.getEString(), "type", null, 1, 1, GraphicRootClassesItemsConnectionsItemsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsColorEClass, GraphicRootClassesItemsConnectionsItemsColor.class, "GraphicRootClassesItemsConnectionsItemsColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsColor_Color(), ecorePackage.getEString(), "color", null, 1, 1, GraphicRootClassesItemsConnectionsItemsColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsTextColorEClass, GraphicRootClassesItemsConnectionsItemsTextColor.class, "GraphicRootClassesItemsConnectionsItemsTextColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsTextColor_TextColor(), ecorePackage.getEString(), "textColor", null, 1, 1, GraphicRootClassesItemsConnectionsItemsTextColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsDecoratorEClass, GraphicRootClassesItemsConnectionsItemsDecorator.class, "GraphicRootClassesItemsConnectionsItemsDecorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsDecorator_Decorator(), ecorePackage.getEString(), "decorator", null, 1, 1, GraphicRootClassesItemsConnectionsItemsDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsDecoratorColorEClass, GraphicRootClassesItemsConnectionsItemsDecoratorColor.class, "GraphicRootClassesItemsConnectionsItemsDecoratorColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsDecoratorColor_DecoratorColor(), ecorePackage.getEString(), "decoratorColor", null, 1, 1, GraphicRootClassesItemsConnectionsItemsDecoratorColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass, GraphicRootClassesItemsConnectionsItemsDecoratorWidth.class, "GraphicRootClassesItemsConnectionsItemsDecoratorWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsDecoratorWidth_DecoratorWidth(), ecorePackage.getEString(), "decoratorWidth", null, 1, 1, GraphicRootClassesItemsConnectionsItemsDecoratorWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsDecoratorPosEClass, GraphicRootClassesItemsConnectionsItemsDecoratorPos.class, "GraphicRootClassesItemsConnectionsItemsDecoratorPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsDecoratorPos_DecoratorPos(), ecorePackage.getEString(), "decoratorPos", null, 1, 1, GraphicRootClassesItemsConnectionsItemsDecoratorPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsPatternEClass, GraphicRootClassesItemsConnectionsItemsPattern.class, "GraphicRootClassesItemsConnectionsItemsPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsPattern_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, GraphicRootClassesItemsConnectionsItemsPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsWidthEClass, GraphicRootClassesItemsConnectionsItemsWidth.class, "GraphicRootClassesItemsConnectionsItemsWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsWidth_Width(), ecorePackage.getEString(), "width", null, 1, 1, GraphicRootClassesItemsConnectionsItemsWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsPositionEClass, GraphicRootClassesItemsConnectionsItemsPosition.class, "GraphicRootClassesItemsConnectionsItemsPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsPosition_Position(), ecorePackage.getEString(), "position", null, 1, 1, GraphicRootClassesItemsConnectionsItemsPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootClassesItemsConnectionsItemsTargetEClass, GraphicRootClassesItemsConnectionsItemsTarget.class, "GraphicRootClassesItemsConnectionsItemsTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicRootClassesItemsConnectionsItemsTarget_Target(), ecorePackage.getEString(), "target", null, 1, 1, GraphicRootClassesItemsConnectionsItemsTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRootPropertiesAbstractEClass, GraphicRootPropertiesAbstract.class, "GraphicRootPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicRootClassesItemsPropertiesAbstractEClass, GraphicRootClassesItemsPropertiesAbstract.class, "GraphicRootClassesItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicRootClassesItemsVersionsPropertiesAbstractEClass, GraphicRootClassesItemsVersionsPropertiesAbstract.class, "GraphicRootClassesItemsVersionsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicRootClassesItemsVnamePropertiesAbstractEClass, GraphicRootClassesItemsVnamePropertiesAbstract.class, "GraphicRootClassesItemsVnamePropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicRootClassesItemsConstraintsPropertiesAbstractEClass, GraphicRootClassesItemsConstraintsPropertiesAbstract.class, "GraphicRootClassesItemsConstraintsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicRootClassesItemsConnectionsItemsPropertiesAbstractEClass, GraphicRootClassesItemsConnectionsItemsPropertiesAbstract.class, "GraphicRootClassesItemsConnectionsItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (graphicRootEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootURIEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (graphicRootClassesItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootClassesItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVersionsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootClassesItemsVersionsV1EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVersionsV2EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVersionsV3EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVnameEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootClassesItemsVnameV1EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVnameV2EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsVnameV3EClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsShowAttributesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (graphicRootClassesItemsShowAttributesItemsEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsMaterialAttributesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (graphicRootClassesItemsMaterialAttributesItemsEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsPlanesEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsIluminationEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsSizeMaxEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsSizeMinEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsSizeInitEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsOverlappingEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsXToOriginPosEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsYToOriginPosEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsZToOriginPosEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsRotationEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsTextEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsTrimEClass,
		   source,
		   new String[] {
			   "Type", "boolean"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsCategoryBitMaskEClass,
		   source,
		   new String[] {
			   "Type", "integer"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsCollisionBitMaskEClass,
		   source,
		   new String[] {
			   "Type", "integer"
		   });
		addAnnotation
		  (graphicRootClassesItemsConstraintsContactTestBitMaskEClass,
		   source,
		   new String[] {
			   "Type", "integer"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsTypeEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsColorEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsTextColorEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsDecoratorEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsDecoratorColorEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsDecoratorWidthEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsDecoratorPosEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsPatternEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsWidthEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsPositionEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (graphicRootClassesItemsConnectionsItemsTargetEClass,
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
		  (getGraphicRootName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getGraphicRootURI_URI(),
		   source,
		   new String[] {
			   "Keyword", "URI"
		   });
		addAnnotation
		  (getGraphicRootClasses_Classes(),
		   source,
		   new String[] {
			   "Keyword", "classes"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVersions_Versions(),
		   source,
		   new String[] {
			   "Keyword", "versions"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVersionsV1_V1(),
		   source,
		   new String[] {
			   "Keyword", "v1"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVersionsV2_V2(),
		   source,
		   new String[] {
			   "Keyword", "v2"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVersionsV3_V3(),
		   source,
		   new String[] {
			   "Keyword", "v3"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVname_Vname(),
		   source,
		   new String[] {
			   "Keyword", "vname"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVnameV1_V1(),
		   source,
		   new String[] {
			   "Keyword", "v1"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVnameV2_V2(),
		   source,
		   new String[] {
			   "Keyword", "v2"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsVnameV3_V3(),
		   source,
		   new String[] {
			   "Keyword", "v3"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsShowAttributes_ShowAttributes(),
		   source,
		   new String[] {
			   "Keyword", "showAttributes"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes(),
		   source,
		   new String[] {
			   "Keyword", "materialAttributes"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraints_Constraints(),
		   source,
		   new String[] {
			   "Keyword", "constraints"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsPlanes_Planes(),
		   source,
		   new String[] {
			   "Keyword", "planes"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsIlumination_Ilumination(),
		   source,
		   new String[] {
			   "Keyword", "ilumination"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsSizeMax_SizeMax(),
		   source,
		   new String[] {
			   "Keyword", "sizeMax"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsSizeMin_SizeMin(),
		   source,
		   new String[] {
			   "Keyword", "sizeMin"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsSizeInit_SizeInit(),
		   source,
		   new String[] {
			   "Keyword", "sizeInit"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsOverlapping_Overlapping(),
		   source,
		   new String[] {
			   "Keyword", "overlapping"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsXToOriginPos_XToOriginPos(),
		   source,
		   new String[] {
			   "Keyword", "xToOriginPos"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsYToOriginPos_YToOriginPos(),
		   source,
		   new String[] {
			   "Keyword", "yToOriginPos"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsZToOriginPos_ZToOriginPos(),
		   source,
		   new String[] {
			   "Keyword", "zToOriginPos"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsRotation_Rotation(),
		   source,
		   new String[] {
			   "Keyword", "rotation"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsText_Text(),
		   source,
		   new String[] {
			   "Keyword", "text"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsTrim_Trim(),
		   source,
		   new String[] {
			   "Keyword", "trim"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsCategoryBitMask_CategoryBitMask(),
		   source,
		   new String[] {
			   "Keyword", "categoryBitMask"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsCollisionBitMask_CollisionBitMask(),
		   source,
		   new String[] {
			   "Keyword", "collisionBitMask"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConstraintsContactTestBitMask_ContactTestBitMask(),
		   source,
		   new String[] {
			   "Keyword", "contactTestBitMask"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnections_Connections(),
		   source,
		   new String[] {
			   "Keyword", "connections"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsType_Type(),
		   source,
		   new String[] {
			   "Keyword", "type"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsColor_Color(),
		   source,
		   new String[] {
			   "Keyword", "color"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsTextColor_TextColor(),
		   source,
		   new String[] {
			   "Keyword", "textColor"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsDecorator_Decorator(),
		   source,
		   new String[] {
			   "Keyword", "decorator"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsDecoratorColor_DecoratorColor(),
		   source,
		   new String[] {
			   "Keyword", "decoratorColor"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsDecoratorWidth_DecoratorWidth(),
		   source,
		   new String[] {
			   "Keyword", "decoratorWidth"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsDecoratorPos_DecoratorPos(),
		   source,
		   new String[] {
			   "Keyword", "decoratorPos"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsPattern_Pattern(),
		   source,
		   new String[] {
			   "Keyword", "pattern"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsWidth_Width(),
		   source,
		   new String[] {
			   "Keyword", "width"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsPosition_Position(),
		   source,
		   new String[] {
			   "Keyword", "position"
		   });
		addAnnotation
		  (getGraphicRootClassesItemsConnectionsItemsTarget_Target(),
		   source,
		   new String[] {
			   "Keyword", "target"
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
		  (graphicRootClassesItemsConstraintsPlanesEClass,
		   source,
		   new String[] {
			   "Comment", "only values horizontal, verical or any"
		   });
	}

} //GraphicPackageImpl
