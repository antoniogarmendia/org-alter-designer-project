/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items Paths Items Parameters Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getItems <em>Items</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getName <em>Name</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsPathsItemsParametersItems_Type()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
