/**
 */
package graphic.util;

import graphic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see graphic.GraphicPackage
 * @generated
 */
public class GraphicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicSwitch() {
		if (modelPackage == null) {
			modelPackage = GraphicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GraphicPackage.GRAPHIC_ROOT: {
				GraphicRoot graphicRoot = (GraphicRoot)theEObject;
				T result = caseGraphicRoot(graphicRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_NAME: {
				GraphicRootName graphicRootName = (GraphicRootName)theEObject;
				T result = caseGraphicRootName(graphicRootName);
				if (result == null) result = caseGraphicRootPropertiesAbstract(graphicRootName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_URI: {
				GraphicRootURI graphicRootURI = (GraphicRootURI)theEObject;
				T result = caseGraphicRootURI(graphicRootURI);
				if (result == null) result = caseGraphicRootPropertiesAbstract(graphicRootURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES: {
				GraphicRootClasses graphicRootClasses = (GraphicRootClasses)theEObject;
				T result = caseGraphicRootClasses(graphicRootClasses);
				if (result == null) result = caseGraphicRootPropertiesAbstract(graphicRootClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS: {
				GraphicRootClassesItems graphicRootClassesItems = (GraphicRootClassesItems)theEObject;
				T result = caseGraphicRootClassesItems(graphicRootClassesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_NAME: {
				GraphicRootClassesItemsName graphicRootClassesItemsName = (GraphicRootClassesItemsName)theEObject;
				T result = caseGraphicRootClassesItemsName(graphicRootClassesItemsName);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS: {
				GraphicRootClassesItemsVersions graphicRootClassesItemsVersions = (GraphicRootClassesItemsVersions)theEObject;
				T result = caseGraphicRootClassesItemsVersions(graphicRootClassesItemsVersions);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsVersions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V1: {
				GraphicRootClassesItemsVersionsV1 graphicRootClassesItemsVersionsV1 = (GraphicRootClassesItemsVersionsV1)theEObject;
				T result = caseGraphicRootClassesItemsVersionsV1(graphicRootClassesItemsVersionsV1);
				if (result == null) result = caseGraphicRootClassesItemsVersionsPropertiesAbstract(graphicRootClassesItemsVersionsV1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V2: {
				GraphicRootClassesItemsVersionsV2 graphicRootClassesItemsVersionsV2 = (GraphicRootClassesItemsVersionsV2)theEObject;
				T result = caseGraphicRootClassesItemsVersionsV2(graphicRootClassesItemsVersionsV2);
				if (result == null) result = caseGraphicRootClassesItemsVersionsPropertiesAbstract(graphicRootClassesItemsVersionsV2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_V3: {
				GraphicRootClassesItemsVersionsV3 graphicRootClassesItemsVersionsV3 = (GraphicRootClassesItemsVersionsV3)theEObject;
				T result = caseGraphicRootClassesItemsVersionsV3(graphicRootClassesItemsVersionsV3);
				if (result == null) result = caseGraphicRootClassesItemsVersionsPropertiesAbstract(graphicRootClassesItemsVersionsV3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME: {
				GraphicRootClassesItemsVname graphicRootClassesItemsVname = (GraphicRootClassesItemsVname)theEObject;
				T result = caseGraphicRootClassesItemsVname(graphicRootClassesItemsVname);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsVname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V1: {
				GraphicRootClassesItemsVnameV1 graphicRootClassesItemsVnameV1 = (GraphicRootClassesItemsVnameV1)theEObject;
				T result = caseGraphicRootClassesItemsVnameV1(graphicRootClassesItemsVnameV1);
				if (result == null) result = caseGraphicRootClassesItemsVnamePropertiesAbstract(graphicRootClassesItemsVnameV1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V2: {
				GraphicRootClassesItemsVnameV2 graphicRootClassesItemsVnameV2 = (GraphicRootClassesItemsVnameV2)theEObject;
				T result = caseGraphicRootClassesItemsVnameV2(graphicRootClassesItemsVnameV2);
				if (result == null) result = caseGraphicRootClassesItemsVnamePropertiesAbstract(graphicRootClassesItemsVnameV2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_V3: {
				GraphicRootClassesItemsVnameV3 graphicRootClassesItemsVnameV3 = (GraphicRootClassesItemsVnameV3)theEObject;
				T result = caseGraphicRootClassesItemsVnameV3(graphicRootClassesItemsVnameV3);
				if (result == null) result = caseGraphicRootClassesItemsVnamePropertiesAbstract(graphicRootClassesItemsVnameV3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES: {
				GraphicRootClassesItemsShowAttributes graphicRootClassesItemsShowAttributes = (GraphicRootClassesItemsShowAttributes)theEObject;
				T result = caseGraphicRootClassesItemsShowAttributes(graphicRootClassesItemsShowAttributes);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsShowAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES_ITEMS: {
				GraphicRootClassesItemsShowAttributesItems graphicRootClassesItemsShowAttributesItems = (GraphicRootClassesItemsShowAttributesItems)theEObject;
				T result = caseGraphicRootClassesItemsShowAttributesItems(graphicRootClassesItemsShowAttributesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES: {
				GraphicRootClassesItemsMaterialAttributes graphicRootClassesItemsMaterialAttributes = (GraphicRootClassesItemsMaterialAttributes)theEObject;
				T result = caseGraphicRootClassesItemsMaterialAttributes(graphicRootClassesItemsMaterialAttributes);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsMaterialAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES_ITEMS: {
				GraphicRootClassesItemsMaterialAttributesItems graphicRootClassesItemsMaterialAttributesItems = (GraphicRootClassesItemsMaterialAttributesItems)theEObject;
				T result = caseGraphicRootClassesItemsMaterialAttributesItems(graphicRootClassesItemsMaterialAttributesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS: {
				GraphicRootClassesItemsConstraints graphicRootClassesItemsConstraints = (GraphicRootClassesItemsConstraints)theEObject;
				T result = caseGraphicRootClassesItemsConstraints(graphicRootClassesItemsConstraints);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PLANES: {
				GraphicRootClassesItemsConstraintsPlanes graphicRootClassesItemsConstraintsPlanes = (GraphicRootClassesItemsConstraintsPlanes)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsPlanes(graphicRootClassesItemsConstraintsPlanes);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsPlanes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ILUMINATION: {
				GraphicRootClassesItemsConstraintsIlumination graphicRootClassesItemsConstraintsIlumination = (GraphicRootClassesItemsConstraintsIlumination)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsIlumination(graphicRootClassesItemsConstraintsIlumination);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsIlumination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX: {
				GraphicRootClassesItemsConstraintsSizeMax graphicRootClassesItemsConstraintsSizeMax = (GraphicRootClassesItemsConstraintsSizeMax)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsSizeMax(graphicRootClassesItemsConstraintsSizeMax);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsSizeMax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MIN: {
				GraphicRootClassesItemsConstraintsSizeMin graphicRootClassesItemsConstraintsSizeMin = (GraphicRootClassesItemsConstraintsSizeMin)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsSizeMin(graphicRootClassesItemsConstraintsSizeMin);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsSizeMin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_INIT: {
				GraphicRootClassesItemsConstraintsSizeInit graphicRootClassesItemsConstraintsSizeInit = (GraphicRootClassesItemsConstraintsSizeInit)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsSizeInit(graphicRootClassesItemsConstraintsSizeInit);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsSizeInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING: {
				GraphicRootClassesItemsConstraintsOverlapping graphicRootClassesItemsConstraintsOverlapping = (GraphicRootClassesItemsConstraintsOverlapping)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsOverlapping(graphicRootClassesItemsConstraintsOverlapping);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsOverlapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_XTO_ORIGIN_POS: {
				GraphicRootClassesItemsConstraintsXToOriginPos graphicRootClassesItemsConstraintsXToOriginPos = (GraphicRootClassesItemsConstraintsXToOriginPos)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsXToOriginPos(graphicRootClassesItemsConstraintsXToOriginPos);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsXToOriginPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS: {
				GraphicRootClassesItemsConstraintsYToOriginPos graphicRootClassesItemsConstraintsYToOriginPos = (GraphicRootClassesItemsConstraintsYToOriginPos)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsYToOriginPos(graphicRootClassesItemsConstraintsYToOriginPos);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsYToOriginPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS: {
				GraphicRootClassesItemsConstraintsZToOriginPos graphicRootClassesItemsConstraintsZToOriginPos = (GraphicRootClassesItemsConstraintsZToOriginPos)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsZToOriginPos(graphicRootClassesItemsConstraintsZToOriginPos);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsZToOriginPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ROTATION: {
				GraphicRootClassesItemsConstraintsRotation graphicRootClassesItemsConstraintsRotation = (GraphicRootClassesItemsConstraintsRotation)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsRotation(graphicRootClassesItemsConstraintsRotation);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsRotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TEXT: {
				GraphicRootClassesItemsConstraintsText graphicRootClassesItemsConstraintsText = (GraphicRootClassesItemsConstraintsText)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsText(graphicRootClassesItemsConstraintsText);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_TRIM: {
				GraphicRootClassesItemsConstraintsTrim graphicRootClassesItemsConstraintsTrim = (GraphicRootClassesItemsConstraintsTrim)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsTrim(graphicRootClassesItemsConstraintsTrim);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsTrim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK: {
				GraphicRootClassesItemsConstraintsCategoryBitMask graphicRootClassesItemsConstraintsCategoryBitMask = (GraphicRootClassesItemsConstraintsCategoryBitMask)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsCategoryBitMask(graphicRootClassesItemsConstraintsCategoryBitMask);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsCategoryBitMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK: {
				GraphicRootClassesItemsConstraintsCollisionBitMask graphicRootClassesItemsConstraintsCollisionBitMask = (GraphicRootClassesItemsConstraintsCollisionBitMask)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsCollisionBitMask(graphicRootClassesItemsConstraintsCollisionBitMask);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsCollisionBitMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK: {
				GraphicRootClassesItemsConstraintsContactTestBitMask graphicRootClassesItemsConstraintsContactTestBitMask = (GraphicRootClassesItemsConstraintsContactTestBitMask)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsContactTestBitMask(graphicRootClassesItemsConstraintsContactTestBitMask);
				if (result == null) result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsContactTestBitMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS: {
				GraphicRootClassesItemsConnections graphicRootClassesItemsConnections = (GraphicRootClassesItemsConnections)theEObject;
				T result = caseGraphicRootClassesItemsConnections(graphicRootClassesItemsConnections);
				if (result == null) result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsConnections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS: {
				GraphicRootClassesItemsConnectionsItems graphicRootClassesItemsConnectionsItems = (GraphicRootClassesItemsConnectionsItems)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItems(graphicRootClassesItemsConnectionsItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_NAME: {
				GraphicRootClassesItemsConnectionsItemsName graphicRootClassesItemsConnectionsItemsName = (GraphicRootClassesItemsConnectionsItemsName)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsName(graphicRootClassesItemsConnectionsItemsName);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TYPE: {
				GraphicRootClassesItemsConnectionsItemsType graphicRootClassesItemsConnectionsItemsType = (GraphicRootClassesItemsConnectionsItemsType)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsType(graphicRootClassesItemsConnectionsItemsType);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_COLOR: {
				GraphicRootClassesItemsConnectionsItemsColor graphicRootClassesItemsConnectionsItemsColor = (GraphicRootClassesItemsConnectionsItemsColor)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsColor(graphicRootClassesItemsConnectionsItemsColor);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TEXT_COLOR: {
				GraphicRootClassesItemsConnectionsItemsTextColor graphicRootClassesItemsConnectionsItemsTextColor = (GraphicRootClassesItemsConnectionsItemsTextColor)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsTextColor(graphicRootClassesItemsConnectionsItemsTextColor);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsTextColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR: {
				GraphicRootClassesItemsConnectionsItemsDecorator graphicRootClassesItemsConnectionsItemsDecorator = (GraphicRootClassesItemsConnectionsItemsDecorator)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsDecorator(graphicRootClassesItemsConnectionsItemsDecorator);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsDecorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR: {
				GraphicRootClassesItemsConnectionsItemsDecoratorColor graphicRootClassesItemsConnectionsItemsDecoratorColor = (GraphicRootClassesItemsConnectionsItemsDecoratorColor)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsDecoratorColor(graphicRootClassesItemsConnectionsItemsDecoratorColor);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsDecoratorColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH: {
				GraphicRootClassesItemsConnectionsItemsDecoratorWidth graphicRootClassesItemsConnectionsItemsDecoratorWidth = (GraphicRootClassesItemsConnectionsItemsDecoratorWidth)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsDecoratorWidth(graphicRootClassesItemsConnectionsItemsDecoratorWidth);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsDecoratorWidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS: {
				GraphicRootClassesItemsConnectionsItemsDecoratorPos graphicRootClassesItemsConnectionsItemsDecoratorPos = (GraphicRootClassesItemsConnectionsItemsDecoratorPos)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsDecoratorPos(graphicRootClassesItemsConnectionsItemsDecoratorPos);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsDecoratorPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PATTERN: {
				GraphicRootClassesItemsConnectionsItemsPattern graphicRootClassesItemsConnectionsItemsPattern = (GraphicRootClassesItemsConnectionsItemsPattern)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsPattern(graphicRootClassesItemsConnectionsItemsPattern);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_WIDTH: {
				GraphicRootClassesItemsConnectionsItemsWidth graphicRootClassesItemsConnectionsItemsWidth = (GraphicRootClassesItemsConnectionsItemsWidth)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsWidth(graphicRootClassesItemsConnectionsItemsWidth);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsWidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_POSITION: {
				GraphicRootClassesItemsConnectionsItemsPosition graphicRootClassesItemsConnectionsItemsPosition = (GraphicRootClassesItemsConnectionsItemsPosition)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsPosition(graphicRootClassesItemsConnectionsItemsPosition);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_TARGET: {
				GraphicRootClassesItemsConnectionsItemsTarget graphicRootClassesItemsConnectionsItemsTarget = (GraphicRootClassesItemsConnectionsItemsTarget)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsTarget(graphicRootClassesItemsConnectionsItemsTarget);
				if (result == null) result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_PROPERTIES_ABSTRACT: {
				GraphicRootPropertiesAbstract graphicRootPropertiesAbstract = (GraphicRootPropertiesAbstract)theEObject;
				T result = caseGraphicRootPropertiesAbstract(graphicRootPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT: {
				GraphicRootClassesItemsPropertiesAbstract graphicRootClassesItemsPropertiesAbstract = (GraphicRootClassesItemsPropertiesAbstract)theEObject;
				T result = caseGraphicRootClassesItemsPropertiesAbstract(graphicRootClassesItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS_PROPERTIES_ABSTRACT: {
				GraphicRootClassesItemsVersionsPropertiesAbstract graphicRootClassesItemsVersionsPropertiesAbstract = (GraphicRootClassesItemsVersionsPropertiesAbstract)theEObject;
				T result = caseGraphicRootClassesItemsVersionsPropertiesAbstract(graphicRootClassesItemsVersionsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME_PROPERTIES_ABSTRACT: {
				GraphicRootClassesItemsVnamePropertiesAbstract graphicRootClassesItemsVnamePropertiesAbstract = (GraphicRootClassesItemsVnamePropertiesAbstract)theEObject;
				T result = caseGraphicRootClassesItemsVnamePropertiesAbstract(graphicRootClassesItemsVnamePropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_PROPERTIES_ABSTRACT: {
				GraphicRootClassesItemsConstraintsPropertiesAbstract graphicRootClassesItemsConstraintsPropertiesAbstract = (GraphicRootClassesItemsConstraintsPropertiesAbstract)theEObject;
				T result = caseGraphicRootClassesItemsConstraintsPropertiesAbstract(graphicRootClassesItemsConstraintsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_PROPERTIES_ABSTRACT: {
				GraphicRootClassesItemsConnectionsItemsPropertiesAbstract graphicRootClassesItemsConnectionsItemsPropertiesAbstract = (GraphicRootClassesItemsConnectionsItemsPropertiesAbstract)theEObject;
				T result = caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(graphicRootClassesItemsConnectionsItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRoot(GraphicRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootName(GraphicRootName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootURI(GraphicRootURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClasses(GraphicRootClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItems(GraphicRootClassesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsName(GraphicRootClassesItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Versions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Versions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVersions(GraphicRootClassesItemsVersions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Versions V1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Versions V1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVersionsV1(GraphicRootClassesItemsVersionsV1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Versions V2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Versions V2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVersionsV2(GraphicRootClassesItemsVersionsV2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Versions V3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Versions V3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVersionsV3(GraphicRootClassesItemsVersionsV3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Vname</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Vname</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVname(GraphicRootClassesItemsVname object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Vname V1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Vname V1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVnameV1(GraphicRootClassesItemsVnameV1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Vname V2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Vname V2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVnameV2(GraphicRootClassesItemsVnameV2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Vname V3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Vname V3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVnameV3(GraphicRootClassesItemsVnameV3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Show Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Show Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsShowAttributes(GraphicRootClassesItemsShowAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Show Attributes Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Show Attributes Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsShowAttributesItems(GraphicRootClassesItemsShowAttributesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Material Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Material Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsMaterialAttributes(GraphicRootClassesItemsMaterialAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Material Attributes Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Material Attributes Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsMaterialAttributesItems(GraphicRootClassesItemsMaterialAttributesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraints(GraphicRootClassesItemsConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Planes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Planes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsPlanes(GraphicRootClassesItemsConstraintsPlanes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Ilumination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Ilumination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsIlumination(GraphicRootClassesItemsConstraintsIlumination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsSizeMax(GraphicRootClassesItemsConstraintsSizeMax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsSizeMin(GraphicRootClassesItemsConstraintsSizeMin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Size Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsSizeInit(GraphicRootClassesItemsConstraintsSizeInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Overlapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Overlapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsOverlapping(GraphicRootClassesItemsConstraintsOverlapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints XTo Origin Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints XTo Origin Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsXToOriginPos(GraphicRootClassesItemsConstraintsXToOriginPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints YTo Origin Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints YTo Origin Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsYToOriginPos(GraphicRootClassesItemsConstraintsYToOriginPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints ZTo Origin Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints ZTo Origin Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsZToOriginPos(GraphicRootClassesItemsConstraintsZToOriginPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsRotation(GraphicRootClassesItemsConstraintsRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsText(GraphicRootClassesItemsConstraintsText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Trim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Trim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsTrim(GraphicRootClassesItemsConstraintsTrim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Category Bit Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Category Bit Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsCategoryBitMask(GraphicRootClassesItemsConstraintsCategoryBitMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Collision Bit Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Collision Bit Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsCollisionBitMask(GraphicRootClassesItemsConstraintsCollisionBitMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Contact Test Bit Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Contact Test Bit Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsContactTestBitMask(GraphicRootClassesItemsConstraintsContactTestBitMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnections(GraphicRootClassesItemsConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItems(GraphicRootClassesItemsConnectionsItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsName(GraphicRootClassesItemsConnectionsItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsType(GraphicRootClassesItemsConnectionsItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsColor(GraphicRootClassesItemsConnectionsItemsColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Text Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Text Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsTextColor(GraphicRootClassesItemsConnectionsItemsTextColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsDecorator(GraphicRootClassesItemsConnectionsItemsDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsDecoratorColor(GraphicRootClassesItemsConnectionsItemsDecoratorColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsDecoratorWidth(GraphicRootClassesItemsConnectionsItemsDecoratorWidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Decorator Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsDecoratorPos(GraphicRootClassesItemsConnectionsItemsDecoratorPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsPattern(GraphicRootClassesItemsConnectionsItemsPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsWidth(GraphicRootClassesItemsConnectionsItemsWidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsPosition(GraphicRootClassesItemsConnectionsItemsPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsTarget(GraphicRootClassesItemsConnectionsItemsTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootPropertiesAbstract(GraphicRootPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsPropertiesAbstract(GraphicRootClassesItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Versions Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Versions Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVersionsPropertiesAbstract(GraphicRootClassesItemsVersionsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Vname Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Vname Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsVnamePropertiesAbstract(GraphicRootClassesItemsVnamePropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Constraints Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConstraintsPropertiesAbstract(GraphicRootClassesItemsConstraintsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Connections Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(GraphicRootClassesItemsConnectionsItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GraphicSwitch
