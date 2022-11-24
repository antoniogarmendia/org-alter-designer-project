/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsBody#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBody()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsBody extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsBodyItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBody_Body()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='body'"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsBodyItems> getBody();

} // AccessesRootExternalAccessItemsBody
