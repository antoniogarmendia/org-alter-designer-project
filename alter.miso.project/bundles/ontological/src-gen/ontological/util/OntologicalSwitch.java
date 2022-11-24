/**
 */
package ontological.util;

import ontological.*;

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
 * @see ontological.OntologicalPackage
 * @generated
 */
public class OntologicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntologicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalSwitch() {
		if (modelPackage == null) {
			modelPackage = OntologicalPackage.eINSTANCE;
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
			case OntologicalPackage.ONTOLOGICAL_ROOT: {
				OntologicalRoot ontologicalRoot = (OntologicalRoot)theEObject;
				T result = caseOntologicalRoot(ontologicalRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_NAME: {
				OntologicalRootName ontologicalRootName = (OntologicalRootName)theEObject;
				T result = caseOntologicalRootName(ontologicalRootName);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_URI: {
				OntologicalRootURI ontologicalRootURI = (OntologicalRootURI)theEObject;
				T result = caseOntologicalRootURI(ontologicalRootURI);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_ONLY_CODES: {
				OntologicalRootOnlyCodes ontologicalRootOnlyCodes = (OntologicalRootOnlyCodes)theEObject;
				T result = caseOntologicalRootOnlyCodes(ontologicalRootOnlyCodes);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootOnlyCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_BLUETOOTH: {
				OntologicalRootBluetooth ontologicalRootBluetooth = (OntologicalRootBluetooth)theEObject;
				T result = caseOntologicalRootBluetooth(ontologicalRootBluetooth);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootBluetooth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_EXTERNAL: {
				OntologicalRootExternal ontologicalRootExternal = (OntologicalRootExternal)theEObject;
				T result = caseOntologicalRootExternal(ontologicalRootExternal);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_FIREBASE: {
				OntologicalRootFirebase ontologicalRootFirebase = (OntologicalRootFirebase)theEObject;
				T result = caseOntologicalRootFirebase(ontologicalRootFirebase);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootFirebase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS: {
				OntologicalRootPhysics ontologicalRootPhysics = (OntologicalRootPhysics)theEObject;
				T result = caseOntologicalRootPhysics(ontologicalRootPhysics);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootPhysics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP: {
				OntologicalRootGameloop ontologicalRootGameloop = (OntologicalRootGameloop)theEObject;
				T result = caseOntologicalRootGameloop(ontologicalRootGameloop);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootGameloop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES: {
				OntologicalRootClasses ontologicalRootClasses = (OntologicalRootClasses)theEObject;
				T result = caseOntologicalRootClasses(ontologicalRootClasses);
				if (result == null) result = caseOntologicalRootPropertiesAbstract(ontologicalRootClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS: {
				OntologicalRootClassesItems ontologicalRootClassesItems = (OntologicalRootClassesItems)theEObject;
				T result = caseOntologicalRootClassesItems(ontologicalRootClassesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME: {
				OntologicalRootClassesItemsName ontologicalRootClassesItemsName = (OntologicalRootClassesItemsName)theEObject;
				T result = caseOntologicalRootClassesItemsName(ontologicalRootClassesItemsName);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT: {
				OntologicalRootClassesItemsAbstract ontologicalRootClassesItemsAbstract = (OntologicalRootClassesItemsAbstract)theEObject;
				T result = caseOntologicalRootClassesItemsAbstract(ontologicalRootClassesItemsAbstract);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES: {
				OntologicalRootClassesItemsAttributes ontologicalRootClassesItemsAttributes = (OntologicalRootClassesItemsAttributes)theEObject;
				T result = caseOntologicalRootClassesItemsAttributes(ontologicalRootClassesItemsAttributes);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS: {
				OntologicalRootClassesItemsAttributesItems ontologicalRootClassesItemsAttributesItems = (OntologicalRootClassesItemsAttributesItems)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItems(ontologicalRootClassesItemsAttributesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME: {
				OntologicalRootClassesItemsAttributesItemsName ontologicalRootClassesItemsAttributesItemsName = (OntologicalRootClassesItemsAttributesItemsName)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsName(ontologicalRootClassesItemsAttributesItemsName);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE: {
				OntologicalRootClassesItemsAttributesItemsType ontologicalRootClassesItemsAttributesItemsType = (OntologicalRootClassesItemsAttributesItemsType)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsType(ontologicalRootClassesItemsAttributesItemsType);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN: {
				OntologicalRootClassesItemsAttributesItemsMin ontologicalRootClassesItemsAttributesItemsMin = (OntologicalRootClassesItemsAttributesItemsMin)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsMin(ontologicalRootClassesItemsAttributesItemsMin);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsMin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX: {
				OntologicalRootClassesItemsAttributesItemsMax ontologicalRootClassesItemsAttributesItemsMax = (OntologicalRootClassesItemsAttributesItemsMax)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsMax(ontologicalRootClassesItemsAttributesItemsMax);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsMax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT: {
				OntologicalRootClassesItemsAttributesItemsDefault ontologicalRootClassesItemsAttributesItemsDefault = (OntologicalRootClassesItemsAttributesItemsDefault)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsDefault(ontologicalRootClassesItemsAttributesItemsDefault);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY: {
				OntologicalRootClassesItemsAttributesItemsReadOnly ontologicalRootClassesItemsAttributesItemsReadOnly = (OntologicalRootClassesItemsAttributesItemsReadOnly)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsReadOnly(ontologicalRootClassesItemsAttributesItemsReadOnly);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsReadOnly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM: {
				OntologicalRootClassesItemsAttributesItemsIsParam ontologicalRootClassesItemsAttributesItemsIsParam = (OntologicalRootClassesItemsAttributesItemsIsParam)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsIsParam(ontologicalRootClassesItemsAttributesItemsIsParam);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsIsParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY: {
				OntologicalRootClassesItemsAttributesItemsIsKey ontologicalRootClassesItemsAttributesItemsIsKey = (OntologicalRootClassesItemsAttributesItemsIsKey)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsIsKey(ontologicalRootClassesItemsAttributesItemsIsKey);
				if (result == null) result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsIsKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES: {
				OntologicalRootClassesItemsReferences ontologicalRootClassesItemsReferences = (OntologicalRootClassesItemsReferences)theEObject;
				T result = caseOntologicalRootClassesItemsReferences(ontologicalRootClassesItemsReferences);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS: {
				OntologicalRootClassesItemsReferencesItems ontologicalRootClassesItemsReferencesItems = (OntologicalRootClassesItemsReferencesItems)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItems(ontologicalRootClassesItemsReferencesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME: {
				OntologicalRootClassesItemsReferencesItemsName ontologicalRootClassesItemsReferencesItemsName = (OntologicalRootClassesItemsReferencesItemsName)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsName(ontologicalRootClassesItemsReferencesItemsName);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT: {
				OntologicalRootClassesItemsReferencesItemsContaintment ontologicalRootClassesItemsReferencesItemsContaintment = (OntologicalRootClassesItemsReferencesItemsContaintment)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsContaintment(ontologicalRootClassesItemsReferencesItemsContaintment);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsContaintment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN: {
				OntologicalRootClassesItemsReferencesItemsMin ontologicalRootClassesItemsReferencesItemsMin = (OntologicalRootClassesItemsReferencesItemsMin)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsMin(ontologicalRootClassesItemsReferencesItemsMin);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsMin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX: {
				OntologicalRootClassesItemsReferencesItemsMax ontologicalRootClassesItemsReferencesItemsMax = (OntologicalRootClassesItemsReferencesItemsMax)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsMax(ontologicalRootClassesItemsReferencesItemsMax);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsMax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET: {
				OntologicalRootClassesItemsReferencesItemsTarget ontologicalRootClassesItemsReferencesItemsTarget = (OntologicalRootClassesItemsReferencesItemsTarget)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsTarget(ontologicalRootClassesItemsReferencesItemsTarget);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE: {
				OntologicalRootClassesItemsReferencesItemsOpposite ontologicalRootClassesItemsReferencesItemsOpposite = (OntologicalRootClassesItemsReferencesItemsOpposite)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsOpposite(ontologicalRootClassesItemsReferencesItemsOpposite);
				if (result == null) result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsOpposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID: {
				OntologicalRootClassesItemsAutoID ontologicalRootClassesItemsAutoID = (OntologicalRootClassesItemsAutoID)theEObject;
				T result = caseOntologicalRootClassesItemsAutoID(ontologicalRootClassesItemsAutoID);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsAutoID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES: {
				OntologicalRootClassesItemsOnlyCodes ontologicalRootClassesItemsOnlyCodes = (OntologicalRootClassesItemsOnlyCodes)theEObject;
				T result = caseOntologicalRootClassesItemsOnlyCodes(ontologicalRootClassesItemsOnlyCodes);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsOnlyCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH: {
				OntologicalRootClassesItemsBluetooth ontologicalRootClassesItemsBluetooth = (OntologicalRootClassesItemsBluetooth)theEObject;
				T result = caseOntologicalRootClassesItemsBluetooth(ontologicalRootClassesItemsBluetooth);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsBluetooth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN: {
				OntologicalRootClassesItemsNoSCN ontologicalRootClassesItemsNoSCN = (OntologicalRootClassesItemsNoSCN)theEObject;
				T result = caseOntologicalRootClassesItemsNoSCN(ontologicalRootClassesItemsNoSCN);
				if (result == null) result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsNoSCN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_PROPERTIES_ABSTRACT: {
				OntologicalRootPropertiesAbstract ontologicalRootPropertiesAbstract = (OntologicalRootPropertiesAbstract)theEObject;
				T result = caseOntologicalRootPropertiesAbstract(ontologicalRootPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_PROPERTIES_ABSTRACT: {
				OntologicalRootClassesItemsPropertiesAbstract ontologicalRootClassesItemsPropertiesAbstract = (OntologicalRootClassesItemsPropertiesAbstract)theEObject;
				T result = caseOntologicalRootClassesItemsPropertiesAbstract(ontologicalRootClassesItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_PROPERTIES_ABSTRACT: {
				OntologicalRootClassesItemsAttributesItemsPropertiesAbstract ontologicalRootClassesItemsAttributesItemsPropertiesAbstract = (OntologicalRootClassesItemsAttributesItemsPropertiesAbstract)theEObject;
				T result = caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(ontologicalRootClassesItemsAttributesItemsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_PROPERTIES_ABSTRACT: {
				OntologicalRootClassesItemsReferencesItemsPropertiesAbstract ontologicalRootClassesItemsReferencesItemsPropertiesAbstract = (OntologicalRootClassesItemsReferencesItemsPropertiesAbstract)theEObject;
				T result = caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(ontologicalRootClassesItemsReferencesItemsPropertiesAbstract);
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
	public T caseOntologicalRoot(OntologicalRoot object) {
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
	public T caseOntologicalRootName(OntologicalRootName object) {
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
	public T caseOntologicalRootURI(OntologicalRootURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Only Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Only Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootOnlyCodes(OntologicalRootOnlyCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Bluetooth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Bluetooth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootBluetooth(OntologicalRootBluetooth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootExternal(OntologicalRootExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Firebase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Firebase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootFirebase(OntologicalRootFirebase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Physics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Physics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootPhysics(OntologicalRootPhysics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Gameloop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Gameloop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootGameloop(OntologicalRootGameloop object) {
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
	public T caseOntologicalRootClasses(OntologicalRootClasses object) {
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
	public T caseOntologicalRootClassesItems(OntologicalRootClassesItems object) {
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
	public T caseOntologicalRootClassesItemsName(OntologicalRootClassesItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAbstract(OntologicalRootClassesItemsAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributes(OntologicalRootClassesItemsAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItems(OntologicalRootClassesItemsAttributesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsName(OntologicalRootClassesItemsAttributesItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsType(OntologicalRootClassesItemsAttributesItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsMin(OntologicalRootClassesItemsAttributesItemsMin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsMax(OntologicalRootClassesItemsAttributesItemsMax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsDefault(OntologicalRootClassesItemsAttributesItemsDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Read Only</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Read Only</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsReadOnly(OntologicalRootClassesItemsAttributesItemsReadOnly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Is Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Is Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsIsParam(OntologicalRootClassesItemsAttributesItemsIsParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Is Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Is Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsIsKey(OntologicalRootClassesItemsAttributesItemsIsKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferences(OntologicalRootClassesItemsReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItems(OntologicalRootClassesItemsReferencesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsName(OntologicalRootClassesItemsReferencesItemsName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Containtment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Containtment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsContaintment(OntologicalRootClassesItemsReferencesItemsContaintment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsMin(OntologicalRootClassesItemsReferencesItemsMin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsMax(OntologicalRootClassesItemsReferencesItemsMax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsTarget(OntologicalRootClassesItemsReferencesItemsTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Opposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Opposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsOpposite(OntologicalRootClassesItemsReferencesItemsOpposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Auto ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Auto ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAutoID(OntologicalRootClassesItemsAutoID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Only Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Only Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsOnlyCodes(OntologicalRootClassesItemsOnlyCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Bluetooth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Bluetooth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsBluetooth(OntologicalRootClassesItemsBluetooth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items No SCN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items No SCN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsNoSCN(OntologicalRootClassesItemsNoSCN object) {
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
	public T caseOntologicalRootPropertiesAbstract(OntologicalRootPropertiesAbstract object) {
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
	public T caseOntologicalRootClassesItemsPropertiesAbstract(OntologicalRootClassesItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items Attributes Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsAttributesItemsPropertiesAbstract(OntologicalRootClassesItemsAttributesItemsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Classes Items References Items Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Classes Items References Items Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalRootClassesItemsReferencesItemsPropertiesAbstract(OntologicalRootClassesItemsReferencesItemsPropertiesAbstract object) {
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

} //OntologicalSwitch
