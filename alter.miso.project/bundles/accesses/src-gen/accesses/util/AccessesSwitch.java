/**
 */
package accesses.util;

import accesses.*;

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
 * @see accesses.AccessesPackage
 * @generated
 */
public class AccessesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccessesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessesSwitch() {
		if (modelPackage == null) {
			modelPackage = AccessesPackage.eINSTANCE;
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
			case AccessesPackage.ACCESSES_ROOT: {
				AccessesRoot accessesRoot = (AccessesRoot)theEObject;
				T result = caseAccessesRoot(accessesRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS: {
				AccessesRootExternalAccess accessesRootExternalAccess = (AccessesRootExternalAccess)theEObject;
				T result = caseAccessesRootExternalAccess(accessesRootExternalAccess);
				if (result == null) result = caseAccessesRootPropertiesAbstract(accessesRootExternalAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS: {
				AccessesRootExternalAccessItems accessesRootExternalAccessItems = (AccessesRootExternalAccessItems)theEObject;
				T result = caseAccessesRootExternalAccessItems(accessesRootExternalAccessItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME: {
				AccessesRootExternalAccessItemsName accessesRootExternalAccessItemsName = (AccessesRootExternalAccessItemsName)theEObject;
				T result = caseAccessesRootExternalAccessItemsName(accessesRootExternalAccessItemsName);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH: {
				AccessesRootExternalAccessItemsPath accessesRootExternalAccessItemsPath = (AccessesRootExternalAccessItemsPath)theEObject;
				T result = caseAccessesRootExternalAccessItemsPath(accessesRootExternalAccessItemsPath);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL: {
				AccessesRootExternalAccessItemsOntological accessesRootExternalAccessItemsOntological = (AccessesRootExternalAccessItemsOntological)theEObject;
				T result = caseAccessesRootExternalAccessItemsOntological(accessesRootExternalAccessItemsOntological);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsOntological);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME: {
				AccessesRootExternalAccessItemsClassname accessesRootExternalAccessItemsClassname = (AccessesRootExternalAccessItemsClassname)theEObject;
				T result = caseAccessesRootExternalAccessItemsClassname(accessesRootExternalAccessItemsClassname);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsClassname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD: {
				AccessesRootExternalAccessItemsMethod accessesRootExternalAccessItemsMethod = (AccessesRootExternalAccessItemsMethod)theEObject;
				T result = caseAccessesRootExternalAccessItemsMethod(accessesRootExternalAccessItemsMethod);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH: {
				AccessesRootExternalAccessItemsAuth accessesRootExternalAccessItemsAuth = (AccessesRootExternalAccessItemsAuth)theEObject;
				T result = caseAccessesRootExternalAccessItemsAuth(accessesRootExternalAccessItemsAuth);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT: {
				AccessesRootExternalAccessItemsInput accessesRootExternalAccessItemsInput = (AccessesRootExternalAccessItemsInput)theEObject;
				T result = caseAccessesRootExternalAccessItemsInput(accessesRootExternalAccessItemsInput);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS: {
				AccessesRootExternalAccessItemsInputItems accessesRootExternalAccessItemsInputItems = (AccessesRootExternalAccessItemsInputItems)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItems(accessesRootExternalAccessItemsInputItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR: {
				AccessesRootExternalAccessItemsInputItemsAttr accessesRootExternalAccessItemsInputItemsAttr = (AccessesRootExternalAccessItemsInputItemsAttr)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItemsAttr(accessesRootExternalAccessItemsInputItemsAttr);
				if (result == null) result = caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(accessesRootExternalAccessItemsInputItemsAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT: {
				AccessesRootExternalAccessItemsInputItemsAPIInput accessesRootExternalAccessItemsInputItemsAPIInput = (AccessesRootExternalAccessItemsInputItemsAPIInput)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItemsAPIInput(accessesRootExternalAccessItemsInputItemsAPIInput);
				if (result == null) result = caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(accessesRootExternalAccessItemsInputItemsAPIInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY: {
				AccessesRootExternalAccessItemsInputItemsWay accessesRootExternalAccessItemsInputItemsWay = (AccessesRootExternalAccessItemsInputItemsWay)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItemsWay(accessesRootExternalAccessItemsInputItemsWay);
				if (result == null) result = caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(accessesRootExternalAccessItemsInputItemsWay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE: {
				AccessesRootExternalAccessItemsInputItemsValue accessesRootExternalAccessItemsInputItemsValue = (AccessesRootExternalAccessItemsInputItemsValue)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItemsValue(accessesRootExternalAccessItemsInputItemsValue);
				if (result == null) result = caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(accessesRootExternalAccessItemsInputItemsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT: {
				AccessesRootExternalAccessItemsOutput accessesRootExternalAccessItemsOutput = (AccessesRootExternalAccessItemsOutput)theEObject;
				T result = caseAccessesRootExternalAccessItemsOutput(accessesRootExternalAccessItemsOutput);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS: {
				AccessesRootExternalAccessItemsOutputItems accessesRootExternalAccessItemsOutputItems = (AccessesRootExternalAccessItemsOutputItems)theEObject;
				T result = caseAccessesRootExternalAccessItemsOutputItems(accessesRootExternalAccessItemsOutputItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR: {
				AccessesRootExternalAccessItemsOutputItemsAttr accessesRootExternalAccessItemsOutputItemsAttr = (AccessesRootExternalAccessItemsOutputItemsAttr)theEObject;
				T result = caseAccessesRootExternalAccessItemsOutputItemsAttr(accessesRootExternalAccessItemsOutputItemsAttr);
				if (result == null) result = caseAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(accessesRootExternalAccessItemsOutputItemsAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT: {
				AccessesRootExternalAccessItemsOutputItemsAPIOutput accessesRootExternalAccessItemsOutputItemsAPIOutput = (AccessesRootExternalAccessItemsOutputItemsAPIOutput)theEObject;
				T result = caseAccessesRootExternalAccessItemsOutputItemsAPIOutput(accessesRootExternalAccessItemsOutputItemsAPIOutput);
				if (result == null) result = caseAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(accessesRootExternalAccessItemsOutputItemsAPIOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY: {
				AccessesRootExternalAccessItemsBody accessesRootExternalAccessItemsBody = (AccessesRootExternalAccessItemsBody)theEObject;
				T result = caseAccessesRootExternalAccessItemsBody(accessesRootExternalAccessItemsBody);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS: {
				AccessesRootExternalAccessItemsBodyItems accessesRootExternalAccessItemsBodyItems = (AccessesRootExternalAccessItemsBodyItems)theEObject;
				T result = caseAccessesRootExternalAccessItemsBodyItems(accessesRootExternalAccessItemsBodyItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR: {
				AccessesRootExternalAccessItemsBodyItemsAttr accessesRootExternalAccessItemsBodyItemsAttr = (AccessesRootExternalAccessItemsBodyItemsAttr)theEObject;
				T result = caseAccessesRootExternalAccessItemsBodyItemsAttr(accessesRootExternalAccessItemsBodyItemsAttr);
				if (result == null) result = caseAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(accessesRootExternalAccessItemsBodyItemsAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY: {
				AccessesRootExternalAccessItemsBodyItemsAPIBody accessesRootExternalAccessItemsBodyItemsAPIBody = (AccessesRootExternalAccessItemsBodyItemsAPIBody)theEObject;
				T result = caseAccessesRootExternalAccessItemsBodyItemsAPIBody(accessesRootExternalAccessItemsBodyItemsAPIBody);
				if (result == null) result = caseAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(accessesRootExternalAccessItemsBodyItemsAPIBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER: {
				AccessesRootExternalAccessItemsTrigger accessesRootExternalAccessItemsTrigger = (AccessesRootExternalAccessItemsTrigger)theEObject;
				T result = caseAccessesRootExternalAccessItemsTrigger(accessesRootExternalAccessItemsTrigger);
				if (result == null) result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE: {
				AccessesRootExternalAccessItemsTriggerOnChange accessesRootExternalAccessItemsTriggerOnChange = (AccessesRootExternalAccessItemsTriggerOnChange)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnChange(accessesRootExternalAccessItemsTriggerOnChange);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE: {
				AccessesRootExternalAccessItemsTriggerOnCreate accessesRootExternalAccessItemsTriggerOnCreate = (AccessesRootExternalAccessItemsTriggerOnCreate)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnCreate(accessesRootExternalAccessItemsTriggerOnCreate);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE: {
				AccessesRootExternalAccessItemsTriggerOnMove accessesRootExternalAccessItemsTriggerOnMove = (AccessesRootExternalAccessItemsTriggerOnMove)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnMove(accessesRootExternalAccessItemsTriggerOnMove);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnMove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE: {
				AccessesRootExternalAccessItemsTriggerOnDelete accessesRootExternalAccessItemsTriggerOnDelete = (AccessesRootExternalAccessItemsTriggerOnDelete)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnDelete(accessesRootExternalAccessItemsTriggerOnDelete);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS: {
				AccessesRootExternalAccessItemsTriggerOnAccess accessesRootExternalAccessItemsTriggerOnAccess = (AccessesRootExternalAccessItemsTriggerOnAccess)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnAccess(accessesRootExternalAccessItemsTriggerOnAccess);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD: {
				AccessesRootExternalAccessItemsTriggerOnLoad accessesRootExternalAccessItemsTriggerOnLoad = (AccessesRootExternalAccessItemsTriggerOnLoad)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerOnLoad(accessesRootExternalAccessItemsTriggerOnLoad);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerOnLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER: {
				AccessesRootExternalAccessItemsTriggerTimeTrigger accessesRootExternalAccessItemsTriggerTimeTrigger = (AccessesRootExternalAccessItemsTriggerTimeTrigger)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerTimeTrigger(accessesRootExternalAccessItemsTriggerTimeTrigger);
				if (result == null) result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_PROPERTIES_ABSTRACT: {
				AccessesRootPropertiesAbstract accessesRootPropertiesAbstract = (AccessesRootPropertiesAbstract)theEObject;
				T result = caseAccessesRootPropertiesAbstract(accessesRootPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PROPERTIES_ABSTRACT: {
				AccessesRootExternalAccessItemsPropertiesAbstract accessesRootExternalAccessItemsPropertiesAbstract = (AccessesRootExternalAccessItemsPropertiesAbstract)theEObject;
				T result = caseAccessesRootExternalAccessItemsPropertiesAbstract(accessesRootExternalAccessItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_PROPERTIES_ABSTRACT: {
				AccessesRootExternalAccessItemsInputItemsPropertiesAbstract accessesRootExternalAccessItemsInputItemsPropertiesAbstract = (AccessesRootExternalAccessItemsInputItemsPropertiesAbstract)theEObject;
				T result = caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(accessesRootExternalAccessItemsInputItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_PROPERTIES_ABSTRACT: {
				AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract accessesRootExternalAccessItemsOutputItemsPropertiesAbstract = (AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract)theEObject;
				T result = caseAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(accessesRootExternalAccessItemsOutputItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_PROPERTIES_ABSTRACT: {
				AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract accessesRootExternalAccessItemsBodyItemsPropertiesAbstract = (AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract)theEObject;
				T result = caseAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(accessesRootExternalAccessItemsBodyItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_PROPERTIES_ABSTRACT: {
				AccessesRootExternalAccessItemsTriggerPropertiesAbstract accessesRootExternalAccessItemsTriggerPropertiesAbstract = (AccessesRootExternalAccessItemsTriggerPropertiesAbstract)theEObject;
				T result = caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(accessesRootExternalAccessItemsTriggerPropertiesAbstract);
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
	public T caseAccessesRoot(AccessesRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccess(AccessesRootExternalAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItems(AccessesRootExternalAccessItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsName(AccessesRootExternalAccessItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsPath(AccessesRootExternalAccessItemsPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Ontological</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Ontological</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOntological(AccessesRootExternalAccessItemsOntological object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Classname</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Classname</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsClassname(AccessesRootExternalAccessItemsClassname object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsMethod(AccessesRootExternalAccessItemsMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsAuth(AccessesRootExternalAccessItemsAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInput(AccessesRootExternalAccessItemsInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItems(AccessesRootExternalAccessItemsInputItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItemsAttr(AccessesRootExternalAccessItemsInputItemsAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items API Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items API Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItemsAPIInput(AccessesRootExternalAccessItemsInputItemsAPIInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Way</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Way</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItemsWay(AccessesRootExternalAccessItemsInputItemsWay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItemsValue(AccessesRootExternalAccessItemsInputItemsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOutput(AccessesRootExternalAccessItemsOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Output Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Output Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOutputItems(AccessesRootExternalAccessItemsOutputItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Output Items Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Output Items Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOutputItemsAttr(AccessesRootExternalAccessItemsOutputItemsAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Output Items API Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Output Items API Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOutputItemsAPIOutput(AccessesRootExternalAccessItemsOutputItemsAPIOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsBody(AccessesRootExternalAccessItemsBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Body Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Body Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsBodyItems(AccessesRootExternalAccessItemsBodyItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Body Items Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Body Items Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsBodyItemsAttr(AccessesRootExternalAccessItemsBodyItemsAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Body Items API Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Body Items API Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsBodyItemsAPIBody(AccessesRootExternalAccessItemsBodyItemsAPIBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTrigger(AccessesRootExternalAccessItemsTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnChange(AccessesRootExternalAccessItemsTriggerOnChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnCreate(AccessesRootExternalAccessItemsTriggerOnCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnMove(AccessesRootExternalAccessItemsTriggerOnMove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnDelete(AccessesRootExternalAccessItemsTriggerOnDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnAccess(AccessesRootExternalAccessItemsTriggerOnAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger On Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerOnLoad(AccessesRootExternalAccessItemsTriggerOnLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerTimeTrigger(AccessesRootExternalAccessItemsTriggerTimeTrigger object) {
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
	public T caseAccessesRootPropertiesAbstract(AccessesRootPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsPropertiesAbstract(AccessesRootExternalAccessItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Input Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(AccessesRootExternalAccessItemsInputItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Output Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Output Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Body Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Body Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External Access Items Trigger Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External Access Items Trigger Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(AccessesRootExternalAccessItemsTriggerPropertiesAbstract object) {
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

} //AccessesSwitch
