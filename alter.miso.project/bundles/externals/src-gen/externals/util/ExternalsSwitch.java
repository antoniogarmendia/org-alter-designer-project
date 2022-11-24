/**
 */
package externals.util;

import externals.*;

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
 * @see externals.ExternalsPackage
 * @generated
 */
public class ExternalsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExternalsPackage.eINSTANCE;
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
			case ExternalsPackage.EXTERNALS_ROOT: {
				ExternalsRoot externalsRoot = (ExternalsRoot)theEObject;
				T result = caseExternalsRoot(externalsRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS: {
				ExternalsRootAPIDescriptions externalsRootAPIDescriptions = (ExternalsRootAPIDescriptions)theEObject;
				T result = caseExternalsRootAPIDescriptions(externalsRootAPIDescriptions);
				if (result == null) result = caseExternalsRootPropertiesAbstract(externalsRootAPIDescriptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS: {
				ExternalsRootAPIDescriptionsItems externalsRootAPIDescriptionsItems = (ExternalsRootAPIDescriptionsItems)theEObject;
				T result = caseExternalsRootAPIDescriptionsItems(externalsRootAPIDescriptionsItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_NAME: {
				ExternalsRootAPIDescriptionsItemsName externalsRootAPIDescriptionsItemsName = (ExternalsRootAPIDescriptionsItemsName)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsName(externalsRootAPIDescriptionsItemsName);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROTOCOL: {
				ExternalsRootAPIDescriptionsItemsProtocol externalsRootAPIDescriptionsItemsProtocol = (ExternalsRootAPIDescriptionsItemsProtocol)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsProtocol(externalsRootAPIDescriptionsItemsProtocol);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_URL: {
				ExternalsRootAPIDescriptionsItemsUrl externalsRootAPIDescriptionsItemsUrl = (ExternalsRootAPIDescriptionsItemsUrl)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsUrl(externalsRootAPIDescriptionsItemsUrl);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsUrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS: {
				ExternalsRootAPIDescriptionsItemsPaths externalsRootAPIDescriptionsItemsPaths = (ExternalsRootAPIDescriptionsItemsPaths)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPaths(externalsRootAPIDescriptionsItemsPaths);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPaths);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS: {
				ExternalsRootAPIDescriptionsItemsPathsItems externalsRootAPIDescriptionsItemsPathsItems = (ExternalsRootAPIDescriptionsItemsPathsItems)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItems(externalsRootAPIDescriptionsItemsPathsItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE: {
				ExternalsRootAPIDescriptionsItemsPathsItemsRoute externalsRootAPIDescriptionsItemsPathsItemsRoute = (ExternalsRootAPIDescriptionsItemsPathsItemsRoute)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsRoute(externalsRootAPIDescriptionsItemsPathsItemsRoute);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS: {
				ExternalsRootAPIDescriptionsItemsPathsItemsParameters externalsRootAPIDescriptionsItemsPathsItemsParameters = (ExternalsRootAPIDescriptionsItemsPathsItemsParameters)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsParameters(externalsRootAPIDescriptionsItemsPathsItemsParameters);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS: {
				ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems externalsRootAPIDescriptionsItemsPathsItemsParametersItems = (ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItems(externalsRootAPIDescriptionsItemsPathsItemsParametersItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_NAME: {
				ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName externalsRootAPIDescriptionsItemsPathsItemsParametersItemsName = (ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsName);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_TYPE: {
				ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType externalsRootAPIDescriptionsItemsPathsItemsParametersItemsType = (ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsType);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputs externalsRootAPIDescriptionsItemsPathsItemsOutputs = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputs)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputs(externalsRootAPIDescriptionsItemsPathsItemsOutputs);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsOutputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems externalsRootAPIDescriptionsItemsPathsItemsOutputsItems = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems(externalsRootAPIDescriptionsItemsPathsItemsOutputsItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_TYPE: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_JSON_PATH: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH: {
				ExternalsRootAPIDescriptionsItemsAPIAuth externalsRootAPIDescriptionsItemsAPIAuth = (ExternalsRootAPIDescriptionsItemsAPIAuth)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsAPIAuth(externalsRootAPIDescriptionsItemsAPIAuth);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsAPIAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS: {
				ExternalsRootAPIDescriptionsItemsAPIAuthItems externalsRootAPIDescriptionsItemsAPIAuthItems = (ExternalsRootAPIDescriptionsItemsAPIAuthItems)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsAPIAuthItems(externalsRootAPIDescriptionsItemsAPIAuthItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_NAME: {
				ExternalsRootAPIDescriptionsItemsAPIAuthItemsName externalsRootAPIDescriptionsItemsAPIAuthItemsName = (ExternalsRootAPIDescriptionsItemsAPIAuthItemsName)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsAPIAuthItemsName(externalsRootAPIDescriptionsItemsAPIAuthItemsName);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsAPIAuthItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_KEY: {
				ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey externalsRootAPIDescriptionsItemsAPIAuthItemsKey = (ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsAPIAuthItemsKey(externalsRootAPIDescriptionsItemsAPIAuthItemsKey);
				if (result == null) result = caseExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsAPIAuthItemsKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_PROPERTIES_ABSTRACT: {
				ExternalsRootPropertiesAbstract externalsRootPropertiesAbstract = (ExternalsRootPropertiesAbstract)theEObject;
				T result = caseExternalsRootPropertiesAbstract(externalsRootPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PROPERTIES_ABSTRACT: {
				ExternalsRootAPIDescriptionsItemsPropertiesAbstract externalsRootAPIDescriptionsItemsPropertiesAbstract = (ExternalsRootAPIDescriptionsItemsPropertiesAbstract)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PROPERTIES_ABSTRACT: {
				ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract = (ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_PARAMETERS_ITEMS_PROPERTIES_ABSTRACT: {
				ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract = (ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_PROPERTIES_ABSTRACT: {
				ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract = (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH_ITEMS_PROPERTIES_ABSTRACT: {
				ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract = (ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract)theEObject;
				T result = caseExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(externalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract);
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
	public T caseExternalsRoot(ExternalsRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptions(ExternalsRootAPIDescriptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItems(ExternalsRootAPIDescriptionsItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsName(ExternalsRootAPIDescriptionsItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsProtocol(ExternalsRootAPIDescriptionsItemsProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsUrl(ExternalsRootAPIDescriptionsItemsUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPaths(ExternalsRootAPIDescriptionsItemsPaths object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItems(ExternalsRootAPIDescriptionsItemsPathsItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsRoute(ExternalsRootAPIDescriptionsItemsPathsItemsRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsParameters(ExternalsRootAPIDescriptionsItemsPathsItemsParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItems(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputs(ExternalsRootAPIDescriptionsItemsPathsItemsOutputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items JSON Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsAPIAuth(ExternalsRootAPIDescriptionsItemsAPIAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsAPIAuthItems(ExternalsRootAPIDescriptionsItemsAPIAuthItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsAPIAuthItemsName(ExternalsRootAPIDescriptionsItemsAPIAuthItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsAPIAuthItemsKey(ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey object) {
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
	public T caseExternalsRootPropertiesAbstract(ExternalsRootPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Parameters Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items Paths Items Outputs Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root API Descriptions Items API Auth Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract(ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract object) {
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

} //ExternalsSwitch
