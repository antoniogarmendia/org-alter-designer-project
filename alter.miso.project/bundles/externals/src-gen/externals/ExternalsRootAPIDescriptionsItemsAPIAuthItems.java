/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items API Auth Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getItems <em>Items</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getName <em>Name</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuthItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItemsAPIAuthItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuthItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuthItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItemsAPIAuthItems_Key()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRootAPIDescriptionsItemsAPIAuthItems
