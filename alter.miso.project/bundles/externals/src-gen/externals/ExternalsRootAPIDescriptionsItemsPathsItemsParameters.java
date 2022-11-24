/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths Items Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParameters()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPathsItemsParameters extends ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParameters_Parameters()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='parameters'"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems> getParameters();

} // ExternalsRootAPIDescriptionsItemsPathsItemsParameters
