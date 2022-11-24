/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths Items Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputs()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPathsItemsOutputs extends ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputs_Outputs()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='outputs'"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems> getOutputs();

} // ExternalsRootAPIDescriptionsItemsPathsItemsOutputs
