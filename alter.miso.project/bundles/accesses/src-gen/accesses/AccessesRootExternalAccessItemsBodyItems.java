/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Body Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsBodyItems#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsBodyItems#getAttr <em>Attr</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsBodyItems#getAPIBody <em>API Body</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBodyItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsBodyItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBodyItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBodyItems_Attr()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAttr();

	/**
	 * Returns the value of the '<em><b>API Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Body</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsBodyItems_APIBody()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAPIBody();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRootExternalAccessItemsBodyItems
