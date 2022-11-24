/**
 */
package ontological.util;

import ontological.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ontological.OntologicalPackage
 * @generated
 */
public class OntologicalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntologicalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OntologicalPackage.eINSTANCE;
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
	protected OntologicalSwitch<Adapter> modelSwitch =
		new OntologicalSwitch<Adapter>() {
			@Override
			public Adapter caseOntologicalRoot(OntologicalRoot object) {
				return createOntologicalRootAdapter();
			}
			@Override
			public Adapter caseOntologicalRootName(OntologicalRootName object) {
				return createOntologicalRootNameAdapter();
			}
			@Override
			public Adapter caseOntologicalRootURI(OntologicalRootURI object) {
				return createOntologicalRootURIAdapter();
			}
			@Override
			public Adapter caseOntologicalRootOnlyCodes(OntologicalRootOnlyCodes object) {
				return createOntologicalRootOnlyCodesAdapter();
			}
			@Override
			public Adapter caseOntologicalRootBluetooth(OntologicalRootBluetooth object) {
				return createOntologicalRootBluetoothAdapter();
			}
			@Override
			public Adapter caseOntologicalRootExternal(OntologicalRootExternal object) {
				return createOntologicalRootExternalAdapter();
			}
			@Override
			public Adapter caseOntologicalRootFirebase(OntologicalRootFirebase object) {
				return createOntologicalRootFirebaseAdapter();
			}
			@Override
			public Adapter caseOntologicalRootPhysics(OntologicalRootPhysics object) {
				return createOntologicalRootPhysicsAdapter();
			}
			@Override
			public Adapter caseOntologicalRootGameloop(OntologicalRootGameloop object) {
				return createOntologicalRootGameloopAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClasses(OntologicalRootClasses object) {
				return createOntologicalRootClassesAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItems(OntologicalRootClassesItems object) {
				return createOntologicalRootClassesItemsAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsName(OntologicalRootClassesItemsName object) {
				return createOntologicalRootClassesItemsNameAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAbstract(OntologicalRootClassesItemsAbstract object) {
				return createOntologicalRootClassesItemsAbstractAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributes(OntologicalRootClassesItemsAttributes object) {
				return createOntologicalRootClassesItemsAttributesAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItems(OntologicalRootClassesItemsAttributesItems object) {
				return createOntologicalRootClassesItemsAttributesItemsAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsName(OntologicalRootClassesItemsAttributesItemsName object) {
				return createOntologicalRootClassesItemsAttributesItemsNameAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsType(OntologicalRootClassesItemsAttributesItemsType object) {
				return createOntologicalRootClassesItemsAttributesItemsTypeAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsMin(OntologicalRootClassesItemsAttributesItemsMin object) {
				return createOntologicalRootClassesItemsAttributesItemsMinAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsMax(OntologicalRootClassesItemsAttributesItemsMax object) {
				return createOntologicalRootClassesItemsAttributesItemsMaxAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsDefault(OntologicalRootClassesItemsAttributesItemsDefault object) {
				return createOntologicalRootClassesItemsAttributesItemsDefaultAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsReadOnly(OntologicalRootClassesItemsAttributesItemsReadOnly object) {
				return createOntologicalRootClassesItemsAttributesItemsReadOnlyAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsIsParam(OntologicalRootClassesItemsAttributesItemsIsParam object) {
				return createOntologicalRootClassesItemsAttributesItemsIsParamAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsIsKey(OntologicalRootClassesItemsAttributesItemsIsKey object) {
				return createOntologicalRootClassesItemsAttributesItemsIsKeyAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferences(OntologicalRootClassesItemsReferences object) {
				return createOntologicalRootClassesItemsReferencesAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItems(OntologicalRootClassesItemsReferencesItems object) {
				return createOntologicalRootClassesItemsReferencesItemsAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsName(OntologicalRootClassesItemsReferencesItemsName object) {
				return createOntologicalRootClassesItemsReferencesItemsNameAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsContaintment(OntologicalRootClassesItemsReferencesItemsContaintment object) {
				return createOntologicalRootClassesItemsReferencesItemsContaintmentAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsMin(OntologicalRootClassesItemsReferencesItemsMin object) {
				return createOntologicalRootClassesItemsReferencesItemsMinAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsMax(OntologicalRootClassesItemsReferencesItemsMax object) {
				return createOntologicalRootClassesItemsReferencesItemsMaxAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsTarget(OntologicalRootClassesItemsReferencesItemsTarget object) {
				return createOntologicalRootClassesItemsReferencesItemsTargetAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsOpposite(OntologicalRootClassesItemsReferencesItemsOpposite object) {
				return createOntologicalRootClassesItemsReferencesItemsOppositeAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAutoID(OntologicalRootClassesItemsAutoID object) {
				return createOntologicalRootClassesItemsAutoIDAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsOnlyCodes(OntologicalRootClassesItemsOnlyCodes object) {
				return createOntologicalRootClassesItemsOnlyCodesAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsBluetooth(OntologicalRootClassesItemsBluetooth object) {
				return createOntologicalRootClassesItemsBluetoothAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsNoSCN(OntologicalRootClassesItemsNoSCN object) {
				return createOntologicalRootClassesItemsNoSCNAdapter();
			}
			@Override
			public Adapter caseOntologicalRootPropertiesAbstract(OntologicalRootPropertiesAbstract object) {
				return createOntologicalRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsPropertiesAbstract(OntologicalRootClassesItemsPropertiesAbstract object) {
				return createOntologicalRootClassesItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(OntologicalRootClassesItemsAttributesItemsPropertiesAbstract object) {
				return createOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(OntologicalRootClassesItemsReferencesItemsPropertiesAbstract object) {
				return createOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAdapter();
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
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRoot
	 * @generated
	 */
	public Adapter createOntologicalRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootName
	 * @generated
	 */
	public Adapter createOntologicalRootNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootURI <em>Root URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootURI
	 * @generated
	 */
	public Adapter createOntologicalRootURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootOnlyCodes <em>Root Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootOnlyCodes
	 * @generated
	 */
	public Adapter createOntologicalRootOnlyCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootBluetooth <em>Root Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootBluetooth
	 * @generated
	 */
	public Adapter createOntologicalRootBluetoothAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootExternal <em>Root External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootExternal
	 * @generated
	 */
	public Adapter createOntologicalRootExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootFirebase <em>Root Firebase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootFirebase
	 * @generated
	 */
	public Adapter createOntologicalRootFirebaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootPhysics <em>Root Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootPhysics
	 * @generated
	 */
	public Adapter createOntologicalRootPhysicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootGameloop <em>Root Gameloop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootGameloop
	 * @generated
	 */
	public Adapter createOntologicalRootGameloopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClasses <em>Root Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClasses
	 * @generated
	 */
	public Adapter createOntologicalRootClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItems <em>Root Classes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItems
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsName <em>Root Classes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsName
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAbstract <em>Root Classes Items Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAbstract
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributes <em>Root Classes Items Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributes
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItems <em>Root Classes Items Attributes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItems
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsName <em>Root Classes Items Attributes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsName
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsType <em>Root Classes Items Attributes Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsType
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsMin <em>Root Classes Items Attributes Items Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMin
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsMax <em>Root Classes Items Attributes Items Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsMax
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsDefault <em>Root Classes Items Attributes Items Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsDefault
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsReadOnly <em>Root Classes Items Attributes Items Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsReadOnly
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsReadOnlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsParam <em>Root Classes Items Attributes Items Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsParam
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsIsParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsIsKey <em>Root Classes Items Attributes Items Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsIsKey
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsIsKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferences <em>Root Classes Items References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferences
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItems <em>Root Classes Items References Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItems
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsName <em>Root Classes Items References Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsName
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsContaintment <em>Root Classes Items References Items Containtment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsContaintment
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsContaintmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsMin <em>Root Classes Items References Items Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMin
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsMax <em>Root Classes Items References Items Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsMax
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsTarget <em>Root Classes Items References Items Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsTarget
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsOpposite <em>Root Classes Items References Items Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsOpposite
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAutoID <em>Root Classes Items Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAutoID
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAutoIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsOnlyCodes <em>Root Classes Items Only Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsOnlyCodes
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsOnlyCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsBluetooth <em>Root Classes Items Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsBluetooth
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsBluetoothAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsNoSCN <em>Root Classes Items No SCN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsNoSCN
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsNoSCNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createOntologicalRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsPropertiesAbstract <em>Root Classes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract <em>Root Classes Items Attributes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract <em>Root Classes Items References Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAdapter() {
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

} //OntologicalAdapterFactory
