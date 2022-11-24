/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptions#getAPIDescriptions <em>API Descriptions</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptions()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface ExternalsRootAPIDescriptions extends ExternalsRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>API Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Descriptions</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptions_APIDescriptions()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='APIDescriptions'"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItems> getAPIDescriptions();

} // ExternalsRootAPIDescriptions
