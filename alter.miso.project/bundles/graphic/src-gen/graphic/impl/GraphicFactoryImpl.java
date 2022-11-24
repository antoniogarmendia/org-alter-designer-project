/**
 */
package graphic.impl;

import graphic.*;

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
public class GraphicFactoryImpl extends EFactoryImpl implements GraphicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphicFactory init() {
		try {
			GraphicFactory theGraphicFactory = (GraphicFactory)EPackage.Registry.INSTANCE.getEFactory(GraphicPackage.eNS_URI);
			if (theGraphicFactory != null) {
				return theGraphicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicFactoryImpl() {
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
			case GraphicPackage.GRAPHIC_ROOT: return createGraphicRoot();
			case GraphicPackage.GRAPHIC_ROOT_NAME: return createGraphicRootName();
			case GraphicPackage.GRAPHIC_ROOT_URI: return createGraphicRootURI();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES: return createGraphicRootClasses();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS: return createGraphicRootClassesItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_NAME: return createGraphicRootClassesItemsName();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS: return createGraphicRootClassesItemsVersions();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1: return createGraphicRootClassesItemsVersionsV1();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2: return createGraphicRootClassesItemsVersionsV2();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3: return createGraphicRootClassesItemsVersionsV3();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME: return createGraphicRootClassesItemsVname();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1: return createGraphicRootClassesItemsVnameV1();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2: return createGraphicRootClassesItemsVnameV2();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3: return createGraphicRootClassesItemsVnameV3();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES: return createGraphicRootClassesItemsShowAttributes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS: return createGraphicRootClassesItemsShowAttributesItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES: return createGraphicRootClassesItemsMaterialAttributes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS: return createGraphicRootClassesItemsMaterialAttributesItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS: return createGraphicRootClassesItemsConstraints();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES: return createGraphicRootClassesItemsConstraintsPlanes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION: return createGraphicRootClassesItemsConstraintsIlumination();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX: return createGraphicRootClassesItemsConstraintsSizeMax();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN: return createGraphicRootClassesItemsConstraintsSizeMin();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT: return createGraphicRootClassesItemsConstraintsSizeInit();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING: return createGraphicRootClassesItemsConstraintsOverlapping();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS: return createGraphicRootClassesItemsConstraintsXToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS: return createGraphicRootClassesItemsConstraintsYToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS: return createGraphicRootClassesItemsConstraintsZToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION: return createGraphicRootClassesItemsConstraintsRotation();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT: return createGraphicRootClassesItemsConstraintsText();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM: return createGraphicRootClassesItemsConstraintsTrim();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK: return createGraphicRootClassesItemsConstraintsCategoryBitMask();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK: return createGraphicRootClassesItemsConstraintsCollisionBitMask();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK: return createGraphicRootClassesItemsConstraintsContactTestBitMask();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS: return createGraphicRootClassesItemsConnections();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS: return createGraphicRootClassesItemsConnectionsItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME: return createGraphicRootClassesItemsConnectionsItemsName();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE: return createGraphicRootClassesItemsConnectionsItemsType();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR: return createGraphicRootClassesItemsConnectionsItemsColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR: return createGraphicRootClassesItemsConnectionsItemsTextColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR: return createGraphicRootClassesItemsConnectionsItemsDecorator();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR: return createGraphicRootClassesItemsConnectionsItemsDecoratorColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH: return createGraphicRootClassesItemsConnectionsItemsDecoratorWidth();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS: return createGraphicRootClassesItemsConnectionsItemsDecoratorPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN: return createGraphicRootClassesItemsConnectionsItemsPattern();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH: return createGraphicRootClassesItemsConnectionsItemsWidth();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION: return createGraphicRootClassesItemsConnectionsItemsPosition();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET: return createGraphicRootClassesItemsConnectionsItemsTarget();
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
	public GraphicRoot createGraphicRoot() {
		GraphicRootImpl graphicRoot = new GraphicRootImpl();
		return graphicRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootName createGraphicRootName() {
		GraphicRootNameImpl graphicRootName = new GraphicRootNameImpl();
		return graphicRootName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootURI createGraphicRootURI() {
		GraphicRootURIImpl graphicRootURI = new GraphicRootURIImpl();
		return graphicRootURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClasses createGraphicRootClasses() {
		GraphicRootClassesImpl graphicRootClasses = new GraphicRootClassesImpl();
		return graphicRootClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItems createGraphicRootClassesItems() {
		GraphicRootClassesItemsImpl graphicRootClassesItems = new GraphicRootClassesItemsImpl();
		return graphicRootClassesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsName createGraphicRootClassesItemsName() {
		GraphicRootClassesItemsNameImpl graphicRootClassesItemsName = new GraphicRootClassesItemsNameImpl();
		return graphicRootClassesItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVersions createGraphicRootClassesItemsVersions() {
		GraphicRootClassesItemsVersionsImpl graphicRootClassesItemsVersions = new GraphicRootClassesItemsVersionsImpl();
		return graphicRootClassesItemsVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVersionsV1 createGraphicRootClassesItemsVersionsV1() {
		GraphicRootClassesItemsVersionsV1Impl graphicRootClassesItemsVersionsV1 = new GraphicRootClassesItemsVersionsV1Impl();
		return graphicRootClassesItemsVersionsV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVersionsV2 createGraphicRootClassesItemsVersionsV2() {
		GraphicRootClassesItemsVersionsV2Impl graphicRootClassesItemsVersionsV2 = new GraphicRootClassesItemsVersionsV2Impl();
		return graphicRootClassesItemsVersionsV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVersionsV3 createGraphicRootClassesItemsVersionsV3() {
		GraphicRootClassesItemsVersionsV3Impl graphicRootClassesItemsVersionsV3 = new GraphicRootClassesItemsVersionsV3Impl();
		return graphicRootClassesItemsVersionsV3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVname createGraphicRootClassesItemsVname() {
		GraphicRootClassesItemsVnameImpl graphicRootClassesItemsVname = new GraphicRootClassesItemsVnameImpl();
		return graphicRootClassesItemsVname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVnameV1 createGraphicRootClassesItemsVnameV1() {
		GraphicRootClassesItemsVnameV1Impl graphicRootClassesItemsVnameV1 = new GraphicRootClassesItemsVnameV1Impl();
		return graphicRootClassesItemsVnameV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVnameV2 createGraphicRootClassesItemsVnameV2() {
		GraphicRootClassesItemsVnameV2Impl graphicRootClassesItemsVnameV2 = new GraphicRootClassesItemsVnameV2Impl();
		return graphicRootClassesItemsVnameV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVnameV3 createGraphicRootClassesItemsVnameV3() {
		GraphicRootClassesItemsVnameV3Impl graphicRootClassesItemsVnameV3 = new GraphicRootClassesItemsVnameV3Impl();
		return graphicRootClassesItemsVnameV3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsShowAttributes createGraphicRootClassesItemsShowAttributes() {
		GraphicRootClassesItemsShowAttributesImpl graphicRootClassesItemsShowAttributes = new GraphicRootClassesItemsShowAttributesImpl();
		return graphicRootClassesItemsShowAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsShowAttributesItems createGraphicRootClassesItemsShowAttributesItems() {
		GraphicRootClassesItemsShowAttributesItemsImpl graphicRootClassesItemsShowAttributesItems = new GraphicRootClassesItemsShowAttributesItemsImpl();
		return graphicRootClassesItemsShowAttributesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsMaterialAttributes createGraphicRootClassesItemsMaterialAttributes() {
		GraphicRootClassesItemsMaterialAttributesImpl graphicRootClassesItemsMaterialAttributes = new GraphicRootClassesItemsMaterialAttributesImpl();
		return graphicRootClassesItemsMaterialAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsMaterialAttributesItems createGraphicRootClassesItemsMaterialAttributesItems() {
		GraphicRootClassesItemsMaterialAttributesItemsImpl graphicRootClassesItemsMaterialAttributesItems = new GraphicRootClassesItemsMaterialAttributesItemsImpl();
		return graphicRootClassesItemsMaterialAttributesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraints createGraphicRootClassesItemsConstraints() {
		GraphicRootClassesItemsConstraintsImpl graphicRootClassesItemsConstraints = new GraphicRootClassesItemsConstraintsImpl();
		return graphicRootClassesItemsConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsPlanes createGraphicRootClassesItemsConstraintsPlanes() {
		GraphicRootClassesItemsConstraintsPlanesImpl graphicRootClassesItemsConstraintsPlanes = new GraphicRootClassesItemsConstraintsPlanesImpl();
		return graphicRootClassesItemsConstraintsPlanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsIlumination createGraphicRootClassesItemsConstraintsIlumination() {
		GraphicRootClassesItemsConstraintsIluminationImpl graphicRootClassesItemsConstraintsIlumination = new GraphicRootClassesItemsConstraintsIluminationImpl();
		return graphicRootClassesItemsConstraintsIlumination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsSizeMax createGraphicRootClassesItemsConstraintsSizeMax() {
		GraphicRootClassesItemsConstraintsSizeMaxImpl graphicRootClassesItemsConstraintsSizeMax = new GraphicRootClassesItemsConstraintsSizeMaxImpl();
		return graphicRootClassesItemsConstraintsSizeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsSizeMin createGraphicRootClassesItemsConstraintsSizeMin() {
		GraphicRootClassesItemsConstraintsSizeMinImpl graphicRootClassesItemsConstraintsSizeMin = new GraphicRootClassesItemsConstraintsSizeMinImpl();
		return graphicRootClassesItemsConstraintsSizeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsSizeInit createGraphicRootClassesItemsConstraintsSizeInit() {
		GraphicRootClassesItemsConstraintsSizeInitImpl graphicRootClassesItemsConstraintsSizeInit = new GraphicRootClassesItemsConstraintsSizeInitImpl();
		return graphicRootClassesItemsConstraintsSizeInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsOverlapping createGraphicRootClassesItemsConstraintsOverlapping() {
		GraphicRootClassesItemsConstraintsOverlappingImpl graphicRootClassesItemsConstraintsOverlapping = new GraphicRootClassesItemsConstraintsOverlappingImpl();
		return graphicRootClassesItemsConstraintsOverlapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsXToOriginPos createGraphicRootClassesItemsConstraintsXToOriginPos() {
		GraphicRootClassesItemsConstraintsXToOriginPosImpl graphicRootClassesItemsConstraintsXToOriginPos = new GraphicRootClassesItemsConstraintsXToOriginPosImpl();
		return graphicRootClassesItemsConstraintsXToOriginPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsYToOriginPos createGraphicRootClassesItemsConstraintsYToOriginPos() {
		GraphicRootClassesItemsConstraintsYToOriginPosImpl graphicRootClassesItemsConstraintsYToOriginPos = new GraphicRootClassesItemsConstraintsYToOriginPosImpl();
		return graphicRootClassesItemsConstraintsYToOriginPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsZToOriginPos createGraphicRootClassesItemsConstraintsZToOriginPos() {
		GraphicRootClassesItemsConstraintsZToOriginPosImpl graphicRootClassesItemsConstraintsZToOriginPos = new GraphicRootClassesItemsConstraintsZToOriginPosImpl();
		return graphicRootClassesItemsConstraintsZToOriginPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsRotation createGraphicRootClassesItemsConstraintsRotation() {
		GraphicRootClassesItemsConstraintsRotationImpl graphicRootClassesItemsConstraintsRotation = new GraphicRootClassesItemsConstraintsRotationImpl();
		return graphicRootClassesItemsConstraintsRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsText createGraphicRootClassesItemsConstraintsText() {
		GraphicRootClassesItemsConstraintsTextImpl graphicRootClassesItemsConstraintsText = new GraphicRootClassesItemsConstraintsTextImpl();
		return graphicRootClassesItemsConstraintsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsTrim createGraphicRootClassesItemsConstraintsTrim() {
		GraphicRootClassesItemsConstraintsTrimImpl graphicRootClassesItemsConstraintsTrim = new GraphicRootClassesItemsConstraintsTrimImpl();
		return graphicRootClassesItemsConstraintsTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsCategoryBitMask createGraphicRootClassesItemsConstraintsCategoryBitMask() {
		GraphicRootClassesItemsConstraintsCategoryBitMaskImpl graphicRootClassesItemsConstraintsCategoryBitMask = new GraphicRootClassesItemsConstraintsCategoryBitMaskImpl();
		return graphicRootClassesItemsConstraintsCategoryBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsCollisionBitMask createGraphicRootClassesItemsConstraintsCollisionBitMask() {
		GraphicRootClassesItemsConstraintsCollisionBitMaskImpl graphicRootClassesItemsConstraintsCollisionBitMask = new GraphicRootClassesItemsConstraintsCollisionBitMaskImpl();
		return graphicRootClassesItemsConstraintsCollisionBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraintsContactTestBitMask createGraphicRootClassesItemsConstraintsContactTestBitMask() {
		GraphicRootClassesItemsConstraintsContactTestBitMaskImpl graphicRootClassesItemsConstraintsContactTestBitMask = new GraphicRootClassesItemsConstraintsContactTestBitMaskImpl();
		return graphicRootClassesItemsConstraintsContactTestBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnections createGraphicRootClassesItemsConnections() {
		GraphicRootClassesItemsConnectionsImpl graphicRootClassesItemsConnections = new GraphicRootClassesItemsConnectionsImpl();
		return graphicRootClassesItemsConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItems createGraphicRootClassesItemsConnectionsItems() {
		GraphicRootClassesItemsConnectionsItemsImpl graphicRootClassesItemsConnectionsItems = new GraphicRootClassesItemsConnectionsItemsImpl();
		return graphicRootClassesItemsConnectionsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsName createGraphicRootClassesItemsConnectionsItemsName() {
		GraphicRootClassesItemsConnectionsItemsNameImpl graphicRootClassesItemsConnectionsItemsName = new GraphicRootClassesItemsConnectionsItemsNameImpl();
		return graphicRootClassesItemsConnectionsItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsType createGraphicRootClassesItemsConnectionsItemsType() {
		GraphicRootClassesItemsConnectionsItemsTypeImpl graphicRootClassesItemsConnectionsItemsType = new GraphicRootClassesItemsConnectionsItemsTypeImpl();
		return graphicRootClassesItemsConnectionsItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsColor createGraphicRootClassesItemsConnectionsItemsColor() {
		GraphicRootClassesItemsConnectionsItemsColorImpl graphicRootClassesItemsConnectionsItemsColor = new GraphicRootClassesItemsConnectionsItemsColorImpl();
		return graphicRootClassesItemsConnectionsItemsColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsTextColor createGraphicRootClassesItemsConnectionsItemsTextColor() {
		GraphicRootClassesItemsConnectionsItemsTextColorImpl graphicRootClassesItemsConnectionsItemsTextColor = new GraphicRootClassesItemsConnectionsItemsTextColorImpl();
		return graphicRootClassesItemsConnectionsItemsTextColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsDecorator createGraphicRootClassesItemsConnectionsItemsDecorator() {
		GraphicRootClassesItemsConnectionsItemsDecoratorImpl graphicRootClassesItemsConnectionsItemsDecorator = new GraphicRootClassesItemsConnectionsItemsDecoratorImpl();
		return graphicRootClassesItemsConnectionsItemsDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsDecoratorColor createGraphicRootClassesItemsConnectionsItemsDecoratorColor() {
		GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl graphicRootClassesItemsConnectionsItemsDecoratorColor = new GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl();
		return graphicRootClassesItemsConnectionsItemsDecoratorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsDecoratorWidth createGraphicRootClassesItemsConnectionsItemsDecoratorWidth() {
		GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl graphicRootClassesItemsConnectionsItemsDecoratorWidth = new GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl();
		return graphicRootClassesItemsConnectionsItemsDecoratorWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsDecoratorPos createGraphicRootClassesItemsConnectionsItemsDecoratorPos() {
		GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl graphicRootClassesItemsConnectionsItemsDecoratorPos = new GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl();
		return graphicRootClassesItemsConnectionsItemsDecoratorPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsPattern createGraphicRootClassesItemsConnectionsItemsPattern() {
		GraphicRootClassesItemsConnectionsItemsPatternImpl graphicRootClassesItemsConnectionsItemsPattern = new GraphicRootClassesItemsConnectionsItemsPatternImpl();
		return graphicRootClassesItemsConnectionsItemsPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsWidth createGraphicRootClassesItemsConnectionsItemsWidth() {
		GraphicRootClassesItemsConnectionsItemsWidthImpl graphicRootClassesItemsConnectionsItemsWidth = new GraphicRootClassesItemsConnectionsItemsWidthImpl();
		return graphicRootClassesItemsConnectionsItemsWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsPosition createGraphicRootClassesItemsConnectionsItemsPosition() {
		GraphicRootClassesItemsConnectionsItemsPositionImpl graphicRootClassesItemsConnectionsItemsPosition = new GraphicRootClassesItemsConnectionsItemsPositionImpl();
		return graphicRootClassesItemsConnectionsItemsPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConnectionsItemsTarget createGraphicRootClassesItemsConnectionsItemsTarget() {
		GraphicRootClassesItemsConnectionsItemsTargetImpl graphicRootClassesItemsConnectionsItemsTarget = new GraphicRootClassesItemsConnectionsItemsTargetImpl();
		return graphicRootClassesItemsConnectionsItemsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicPackage getGraphicPackage() {
		return (GraphicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphicPackage getPackage() {
		return GraphicPackage.eINSTANCE;
	}

} //GraphicFactoryImpl
