/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Input Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInputItems#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInputItems#getAttr <em>Attr</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInputItems#getAPIInput <em>API Input</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInputItems#getWay <em>Way</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInputItems#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsInputItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsInputItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems_Attr()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAttr();

	/**
	 * Returns the value of the '<em><b>API Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Input</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems_APIInput()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAPIInput();

	/**
	 * Returns the value of the '<em><b>Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems_Way()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getWay();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInputItems_Value()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRootExternalAccessItemsInputItems
