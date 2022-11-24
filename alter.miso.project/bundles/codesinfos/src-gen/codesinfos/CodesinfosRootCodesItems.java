/**
 */
package codesinfos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Codes Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codesinfos.CodesinfosRootCodesItems#getItems <em>Items</em>}</li>
 *   <li>{@link codesinfos.CodesinfosRootCodesItems#getName <em>Name</em>}</li>
 *   <li>{@link codesinfos.CodesinfosRootCodesItems#getClassname <em>Classname</em>}</li>
 *   <li>{@link codesinfos.CodesinfosRootCodesItems#getNodename <em>Nodename</em>}</li>
 * </ul>
 *
 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodesItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface CodesinfosRootCodesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link codesinfos.CodesinfosRootCodesItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodesItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodesinfosRootCodesItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodesItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodesItems_Classname()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getClassname();

	/**
	 * Returns the value of the '<em><b>Nodename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodename</em>' attribute.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodesItems_Nodename()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getNodename();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // CodesinfosRootCodesItems
