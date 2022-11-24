/**
 */
package codesinfos.util;

import codesinfos.*;

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
 * @see codesinfos.CodesinfosPackage
 * @generated
 */
public class CodesinfosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodesinfosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesinfosSwitch() {
		if (modelPackage == null) {
			modelPackage = CodesinfosPackage.eINSTANCE;
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
			case CodesinfosPackage.CODESINFOS_ROOT: {
				CodesinfosRoot codesinfosRoot = (CodesinfosRoot)theEObject;
				T result = caseCodesinfosRoot(codesinfosRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_NAME: {
				CodesinfosRootName codesinfosRootName = (CodesinfosRootName)theEObject;
				T result = caseCodesinfosRootName(codesinfosRootName);
				if (result == null) result = caseCodesinfosRootPropertiesAbstract(codesinfosRootName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES: {
				CodesinfosRootCodes codesinfosRootCodes = (CodesinfosRootCodes)theEObject;
				T result = caseCodesinfosRootCodes(codesinfosRootCodes);
				if (result == null) result = caseCodesinfosRootPropertiesAbstract(codesinfosRootCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS: {
				CodesinfosRootCodesItems codesinfosRootCodesItems = (CodesinfosRootCodesItems)theEObject;
				T result = caseCodesinfosRootCodesItems(codesinfosRootCodesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NAME: {
				CodesinfosRootCodesItemsName codesinfosRootCodesItemsName = (CodesinfosRootCodesItemsName)theEObject;
				T result = caseCodesinfosRootCodesItemsName(codesinfosRootCodesItemsName);
				if (result == null) result = caseCodesinfosRootCodesItemsPropertiesAbstract(codesinfosRootCodesItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME: {
				CodesinfosRootCodesItemsClassname codesinfosRootCodesItemsClassname = (CodesinfosRootCodesItemsClassname)theEObject;
				T result = caseCodesinfosRootCodesItemsClassname(codesinfosRootCodesItemsClassname);
				if (result == null) result = caseCodesinfosRootCodesItemsPropertiesAbstract(codesinfosRootCodesItemsClassname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME: {
				CodesinfosRootCodesItemsNodename codesinfosRootCodesItemsNodename = (CodesinfosRootCodesItemsNodename)theEObject;
				T result = caseCodesinfosRootCodesItemsNodename(codesinfosRootCodesItemsNodename);
				if (result == null) result = caseCodesinfosRootCodesItemsPropertiesAbstract(codesinfosRootCodesItemsNodename);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_PROPERTIES_ABSTRACT: {
				CodesinfosRootPropertiesAbstract codesinfosRootPropertiesAbstract = (CodesinfosRootPropertiesAbstract)theEObject;
				T result = caseCodesinfosRootPropertiesAbstract(codesinfosRootPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT: {
				CodesinfosRootCodesItemsPropertiesAbstract codesinfosRootCodesItemsPropertiesAbstract = (CodesinfosRootCodesItemsPropertiesAbstract)theEObject;
				T result = caseCodesinfosRootCodesItemsPropertiesAbstract(codesinfosRootCodesItemsPropertiesAbstract);
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
	public T caseCodesinfosRoot(CodesinfosRoot object) {
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
	public T caseCodesinfosRootName(CodesinfosRootName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodes(CodesinfosRootCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodesItems(CodesinfosRootCodesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodesItemsName(CodesinfosRootCodesItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes Items Classname</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes Items Classname</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodesItemsClassname(CodesinfosRootCodesItemsClassname object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes Items Nodename</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes Items Nodename</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodesItemsNodename(CodesinfosRootCodesItemsNodename object) {
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
	public T caseCodesinfosRootPropertiesAbstract(CodesinfosRootPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Codes Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Codes Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesinfosRootCodesItemsPropertiesAbstract(CodesinfosRootCodesItemsPropertiesAbstract object) {
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

} //CodesinfosSwitch
