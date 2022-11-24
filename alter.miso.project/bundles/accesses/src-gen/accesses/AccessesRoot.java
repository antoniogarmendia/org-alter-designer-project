/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRoot#getAccessesRoot <em>Accesses Root</em>}</li>
 *   <li>{@link accesses.AccessesRoot#getExternalAccess <em>External Access</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRoot()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Accesses Root</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Root</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRoot_AccessesRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessesRootPropertiesAbstract> getAccessesRoot();

	/**
	 * Returns the value of the '<em><b>External Access</b></em>' reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Access</em>' reference list.
	 * @see accesses.AccessesPackage#getAccessesRoot_ExternalAccess()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItems> getExternalAccess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRoot
