/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Output Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsOutputItems#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsOutputItems#getAttr <em>Attr</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsOutputItems#getAPIOutput <em>API Output</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutputItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsOutputItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutputItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutputItems_Attr()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAttr();

	/**
	 * Returns the value of the '<em><b>API Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Output</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutputItems_APIOutput()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAPIOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRootExternalAccessItemsOutputItems
