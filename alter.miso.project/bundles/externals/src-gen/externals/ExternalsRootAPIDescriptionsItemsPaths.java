/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPaths#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPaths()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPaths extends ExternalsRootAPIDescriptionsItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPaths_Paths()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='paths'"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItems> getPaths();

} // ExternalsRootAPIDescriptionsItemsPaths
