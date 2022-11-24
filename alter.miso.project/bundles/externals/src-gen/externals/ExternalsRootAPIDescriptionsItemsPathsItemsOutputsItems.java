/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths Items Outputs Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getItems <em>Items</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getName <em>Name</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getType <em>Type</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems#getJSONPath <em>JSON Path</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_Type()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>JSON Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JSON Path</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems_JSONPath()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getJSONPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
