/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccess#getExternalAccess <em>External Access</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccess()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface AccessesRootExternalAccess extends AccessesRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>External Access</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Access</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccess_ExternalAccess()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='ExternalAccess'"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItems> getExternalAccess();

} // AccessesRootExternalAccess
