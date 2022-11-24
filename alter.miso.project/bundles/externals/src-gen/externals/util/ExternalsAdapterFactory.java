/**
 */
package externals.util;

import externals.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see externals.ExternalsPackage
 * @generated
 */
public class ExternalsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExternalsPackage.eINSTANCE;
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
	protected ExternalsSwitch<Adapter> modelSwitch =
		new ExternalsSwitch<Adapter>() {
			@Override
			public Adapter caseExternalsRoot(ExternalsRoot object) {
				return createExternalsRootAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptions(ExternalsRootAPIDescriptions object) {
				return createExternalsRootAPIDescriptionsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItems(ExternalsRootAPIDescriptionsItems object) {
				return createExternalsRootAPIDescriptionsItemsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsName(ExternalsRootAPIDescriptionsItemsName object) {
				return createExternalsRootAPIDescriptionsItemsNameAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsProtocol(ExternalsRootAPIDescriptionsItemsProtocol object) {
				return createExternalsRootAPIDescriptionsItemsProtocolAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsUrl(ExternalsRootAPIDescriptionsItemsUrl object) {
				return createExternalsRootAPIDescriptionsItemsUrlAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPaths(ExternalsRootAPIDescriptionsItemsPaths object) {
				return createExternalsRootAPIDescriptionsItemsPathsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItems(ExternalsRootAPIDescriptionsItemsPathsItems object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsRoute(ExternalsRootAPIDescriptionsItemsPathsItemsRoute object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsRouteAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsParameters(ExternalsRootAPIDescriptionsItemsPathsItemsParameters object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsParametersAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItems(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputs(ExternalsRootAPIDescriptionsItemsPathsItemsOutputs object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsAPIAuth(ExternalsRootAPIDescriptionsItemsAPIAuth object) {
				return createExternalsRootAPIDescriptionsItemsAPIAuthAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsAPIAuthItems(ExternalsRootAPIDescriptionsItemsAPIAuthItems object) {
				return createExternalsRootAPIDescriptionsItemsAPIAuthItemsAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsAPIAuthItemsName(ExternalsRootAPIDescriptionsItemsAPIAuthItemsName object) {
				return createExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsAPIAuthItemsKey(ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey object) {
				return createExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAdapter();
			}
			@Override
			public Adapter caseExternalsRootPropertiesAbstract(ExternalsRootPropertiesAbstract object) {
				return createExternalsRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPropertiesAbstract object) {
				return createExternalsRootAPIDescriptionsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract object) {
				return createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract object) {
				return createExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAdapter();
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
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRoot
	 * @generated
	 */
	public Adapter createExternalsRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptions <em>Root API Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptions
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItems <em>Root API Descriptions Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItems
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsName <em>Root API Descriptions Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsName
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsProtocol <em>Root API Descriptions Items Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsProtocol
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsUrl <em>Root API Descriptions Items Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsUrl
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPaths <em>Root API Descriptions Items Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPaths
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems <em>Root API Descriptions Items Paths Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItems
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute <em>Root API Descriptions Items Paths Items Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters <em>Root API Descriptions Items Paths Items Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems <em>Root API Descriptions Items Paths Items Parameters Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName <em>Root API Descriptions Items Paths Items Parameters Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType <em>Root API Descriptions Items Paths Items Parameters Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs <em>Root API Descriptions Items Paths Items Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems <em>Root API Descriptions Items Paths Items Outputs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName <em>Root API Descriptions Items Paths Items Outputs Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType <em>Root API Descriptions Items Paths Items Outputs Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath <em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth <em>Root API Descriptions Items API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuth
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems <em>Root API Descriptions Items API Auth Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName <em>Root API Descriptions Items API Auth Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey <em>Root API Descriptions Items API Auth Items Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract <em>Root API Descriptions Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract <em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract <em>Root API Descriptions Items API Auth Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAdapter() {
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

} //ExternalsAdapterFactory
