/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items API Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth#getAPIAuth <em>API Auth</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuth()
 * @model annotation="Type Type='array'"
 *        annotation="Comment Comment='can be empty'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsAPIAuth extends ExternalsRootAPIDescriptionsItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>API Auth</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Auth</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuth_APIAuth()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='APIAuth'"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsAPIAuthItems> getAPIAuth();

} // ExternalsRootAPIDescriptionsItemsAPIAuth
