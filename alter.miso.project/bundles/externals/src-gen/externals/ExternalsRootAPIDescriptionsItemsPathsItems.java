/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getItems <em>Items</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getRoute <em>Route</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getParameters <em>Parameters</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItems#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPathsItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItems_Route()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getRoute();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItems_Parameters()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems> getParameters();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItems_Outputs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRootAPIDescriptionsItemsPathsItems
