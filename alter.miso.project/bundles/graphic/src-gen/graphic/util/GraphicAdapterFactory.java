/**
 */
package graphic.util;

import graphic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see graphic.GraphicPackage
 * @generated
 */
public class GraphicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraphicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicSwitch<Adapter> modelSwitch =
		new GraphicSwitch<Adapter>() {
			@Override
			public Adapter caseGraphicRoot(GraphicRoot object) {
				return createGraphicRootAdapter();
			}
			@Override
			public Adapter caseGraphicRootName(GraphicRootName object) {
				return createGraphicRootNameAdapter();
			}
			@Override
			public Adapter caseGraphicRootURI(GraphicRootURI object) {
				return createGraphicRootURIAdapter();
			}
			@Override
			public Adapter caseGraphicRootClasses(GraphicRootClasses object) {
				return createGraphicRootClassesAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItems(GraphicRootClassesItems object) {
				return createGraphicRootClassesItemsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsName(GraphicRootClassesItemsName object) {
				return createGraphicRootClassesItemsNameAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVersions(GraphicRootClassesItemsVersions object) {
				return createGraphicRootClassesItemsVersionsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVersionsV1(GraphicRootClassesItemsVersionsV1 object) {
				return createGraphicRootClassesItemsVersionsV1Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVersionsV2(GraphicRootClassesItemsVersionsV2 object) {
				return createGraphicRootClassesItemsVersionsV2Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVersionsV3(GraphicRootClassesItemsVersionsV3 object) {
				return createGraphicRootClassesItemsVersionsV3Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVname(GraphicRootClassesItemsVname object) {
				return createGraphicRootClassesItemsVnameAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVnameV1(GraphicRootClassesItemsVnameV1 object) {
				return createGraphicRootClassesItemsVnameV1Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVnameV2(GraphicRootClassesItemsVnameV2 object) {
				return createGraphicRootClassesItemsVnameV2Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVnameV3(GraphicRootClassesItemsVnameV3 object) {
				return createGraphicRootClassesItemsVnameV3Adapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsShowAttributes(GraphicRootClassesItemsShowAttributes object) {
				return createGraphicRootClassesItemsShowAttributesAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsShowAttributesItems(GraphicRootClassesItemsShowAttributesItems object) {
				return createGraphicRootClassesItemsShowAttributesItemsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsMaterialAttributes(GraphicRootClassesItemsMaterialAttributes object) {
				return createGraphicRootClassesItemsMaterialAttributesAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsMaterialAttributesItems(GraphicRootClassesItemsMaterialAttributesItems object) {
				return createGraphicRootClassesItemsMaterialAttributesItemsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraints(GraphicRootClassesItemsConstraints object) {
				return createGraphicRootClassesItemsConstraintsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsPlanes(GraphicRootClassesItemsConstraintsPlanes object) {
				return createGraphicRootClassesItemsConstraintsPlanesAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsIlumination(GraphicRootClassesItemsConstraintsIlumination object) {
				return createGraphicRootClassesItemsConstraintsIluminationAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsSizeMax(GraphicRootClassesItemsConstraintsSizeMax object) {
				return createGraphicRootClassesItemsConstraintsSizeMaxAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsSizeMin(GraphicRootClassesItemsConstraintsSizeMin object) {
				return createGraphicRootClassesItemsConstraintsSizeMinAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsSizeInit(GraphicRootClassesItemsConstraintsSizeInit object) {
				return createGraphicRootClassesItemsConstraintsSizeInitAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsOverlapping(GraphicRootClassesItemsConstraintsOverlapping object) {
				return createGraphicRootClassesItemsConstraintsOverlappingAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsXToOriginPos(GraphicRootClassesItemsConstraintsXToOriginPos object) {
				return createGraphicRootClassesItemsConstraintsXToOriginPosAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsYToOriginPos(GraphicRootClassesItemsConstraintsYToOriginPos object) {
				return createGraphicRootClassesItemsConstraintsYToOriginPosAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsZToOriginPos(GraphicRootClassesItemsConstraintsZToOriginPos object) {
				return createGraphicRootClassesItemsConstraintsZToOriginPosAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsRotation(GraphicRootClassesItemsConstraintsRotation object) {
				return createGraphicRootClassesItemsConstraintsRotationAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsText(GraphicRootClassesItemsConstraintsText object) {
				return createGraphicRootClassesItemsConstraintsTextAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsTrim(GraphicRootClassesItemsConstraintsTrim object) {
				return createGraphicRootClassesItemsConstraintsTrimAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsCategoryBitMask(GraphicRootClassesItemsConstraintsCategoryBitMask object) {
				return createGraphicRootClassesItemsConstraintsCategoryBitMaskAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsCollisionBitMask(GraphicRootClassesItemsConstraintsCollisionBitMask object) {
				return createGraphicRootClassesItemsConstraintsCollisionBitMaskAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsContactTestBitMask(GraphicRootClassesItemsConstraintsContactTestBitMask object) {
				return createGraphicRootClassesItemsConstraintsContactTestBitMaskAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnections(GraphicRootClassesItemsConnections object) {
				return createGraphicRootClassesItemsConnectionsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItems(GraphicRootClassesItemsConnectionsItems object) {
				return createGraphicRootClassesItemsConnectionsItemsAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsName(GraphicRootClassesItemsConnectionsItemsName object) {
				return createGraphicRootClassesItemsConnectionsItemsNameAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsType(GraphicRootClassesItemsConnectionsItemsType object) {
				return createGraphicRootClassesItemsConnectionsItemsTypeAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsColor(GraphicRootClassesItemsConnectionsItemsColor object) {
				return createGraphicRootClassesItemsConnectionsItemsColorAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsTextColor(GraphicRootClassesItemsConnectionsItemsTextColor object) {
				return createGraphicRootClassesItemsConnectionsItemsTextColorAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsDecorator(GraphicRootClassesItemsConnectionsItemsDecorator object) {
				return createGraphicRootClassesItemsConnectionsItemsDecoratorAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsDecoratorColor(GraphicRootClassesItemsConnectionsItemsDecoratorColor object) {
				return createGraphicRootClassesItemsConnectionsItemsDecoratorColorAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsDecoratorWidth(GraphicRootClassesItemsConnectionsItemsDecoratorWidth object) {
				return createGraphicRootClassesItemsConnectionsItemsDecoratorWidthAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsDecoratorPos(GraphicRootClassesItemsConnectionsItemsDecoratorPos object) {
				return createGraphicRootClassesItemsConnectionsItemsDecoratorPosAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsPattern(GraphicRootClassesItemsConnectionsItemsPattern object) {
				return createGraphicRootClassesItemsConnectionsItemsPatternAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsWidth(GraphicRootClassesItemsConnectionsItemsWidth object) {
				return createGraphicRootClassesItemsConnectionsItemsWidthAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsPosition(GraphicRootClassesItemsConnectionsItemsPosition object) {
				return createGraphicRootClassesItemsConnectionsItemsPositionAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsTarget(GraphicRootClassesItemsConnectionsItemsTarget object) {
				return createGraphicRootClassesItemsConnectionsItemsTargetAdapter();
			}
			@Override
			public Adapter caseGraphicRootPropertiesAbstract(GraphicRootPropertiesAbstract object) {
				return createGraphicRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsPropertiesAbstract(GraphicRootClassesItemsPropertiesAbstract object) {
				return createGraphicRootClassesItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVersionsPropertiesAbstract(GraphicRootClassesItemsVersionsPropertiesAbstract object) {
				return createGraphicRootClassesItemsVersionsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsVnamePropertiesAbstract(GraphicRootClassesItemsVnamePropertiesAbstract object) {
				return createGraphicRootClassesItemsVnamePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConstraintsPropertiesAbstract(GraphicRootClassesItemsConstraintsPropertiesAbstract object) {
				return createGraphicRootClassesItemsConstraintsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGraphicRootClassesItemsConnectionsItemsPropertiesAbstract(GraphicRootClassesItemsConnectionsItemsPropertiesAbstract object) {
				return createGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRoot
	 * @generated
	 */
	public Adapter createGraphicRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootName
	 * @generated
	 */
	public Adapter createGraphicRootNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootURI <em>Root URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootURI
	 * @generated
	 */
	public Adapter createGraphicRootURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClasses <em>Root Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClasses
	 * @generated
	 */
	public Adapter createGraphicRootClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItems <em>Root Classes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItems
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsName <em>Root Classes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsName
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVersions <em>Root Classes Items Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVersions
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVersionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVersionsV1 <em>Root Classes Items Versions V1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVersionsV1
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVersionsV1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVersionsV2 <em>Root Classes Items Versions V2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVersionsV2
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVersionsV2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVersionsV3 <em>Root Classes Items Versions V3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVersionsV3
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVersionsV3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVname <em>Root Classes Items Vname</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVname
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVnameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVnameV1 <em>Root Classes Items Vname V1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVnameV1
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVnameV1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVnameV2 <em>Root Classes Items Vname V2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVnameV2
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVnameV2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVnameV3 <em>Root Classes Items Vname V3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVnameV3
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVnameV3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsShowAttributes <em>Root Classes Items Show Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsShowAttributes
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsShowAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsShowAttributesItems <em>Root Classes Items Show Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsShowAttributesItems
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsShowAttributesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsMaterialAttributes <em>Root Classes Items Material Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributes
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsMaterialAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsMaterialAttributesItems <em>Root Classes Items Material Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsMaterialAttributesItems
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsMaterialAttributesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraints <em>Root Classes Items Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraints
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsPlanes <em>Root Classes Items Constraints Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsPlanes
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsPlanesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsIlumination <em>Root Classes Items Constraints Ilumination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsIlumination
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsIluminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsSizeMax <em>Root Classes Items Constraints Size Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMax
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsSizeMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsSizeMin <em>Root Classes Items Constraints Size Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeMin
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsSizeMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsSizeInit <em>Root Classes Items Constraints Size Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsSizeInit
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsSizeInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsOverlapping <em>Root Classes Items Constraints Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsOverlapping
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsOverlappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsXToOriginPos <em>Root Classes Items Constraints XTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsXToOriginPos
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsXToOriginPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsYToOriginPos <em>Root Classes Items Constraints YTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsYToOriginPos
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsYToOriginPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsZToOriginPos <em>Root Classes Items Constraints ZTo Origin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsZToOriginPos
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsZToOriginPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsRotation <em>Root Classes Items Constraints Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsRotation
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsText <em>Root Classes Items Constraints Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsText
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsTrim <em>Root Classes Items Constraints Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsTrim
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsTrimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsCategoryBitMask <em>Root Classes Items Constraints Category Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsCategoryBitMask
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsCategoryBitMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsCollisionBitMask <em>Root Classes Items Constraints Collision Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsCollisionBitMask
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsCollisionBitMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsContactTestBitMask <em>Root Classes Items Constraints Contact Test Bit Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsContactTestBitMask
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsContactTestBitMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnections <em>Root Classes Items Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnections
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItems <em>Root Classes Items Connections Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItems
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsName <em>Root Classes Items Connections Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsName
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsType <em>Root Classes Items Connections Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsType
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsColor <em>Root Classes Items Connections Items Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsColor
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsTextColor <em>Root Classes Items Connections Items Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTextColor
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsTextColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecorator <em>Root Classes Items Connections Items Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecorator
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor <em>Root Classes Items Connections Items Decorator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsDecoratorColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth <em>Root Classes Items Connections Items Decorator Width</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsDecoratorWidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos <em>Root Classes Items Connections Items Decorator Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsDecoratorPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPattern <em>Root Classes Items Connections Items Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPattern
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsWidth <em>Root Classes Items Connections Items Width</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsWidth
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsWidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPosition <em>Root Classes Items Connections Items Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPosition
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsTarget <em>Root Classes Items Connections Items Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsTarget
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsPropertiesAbstract <em>Root Classes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVersionsPropertiesAbstract <em>Root Classes Items Versions Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVersionsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVersionsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsVnamePropertiesAbstract <em>Root Classes Items Vname Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsVnamePropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsVnamePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract <em>Root Classes Items Constraints Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConstraintsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract <em>Root Classes Items Connections Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GraphicAdapterFactory
