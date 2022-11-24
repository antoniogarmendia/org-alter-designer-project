/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getName <em>Name</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getPath <em>Path</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getOntological <em>Ontological</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getClassname <em>Classname</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getMethod <em>Method</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getAuth <em>Auth</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getInput <em>Input</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getOutput <em>Output</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getBody <em>Body</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItems#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRootExternalAccessItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Path()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Ontological</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontological</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Ontological()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getOntological();

	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Classname()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getClassname();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Method()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getMethod();

	/**
	 * Returns the value of the '<em><b>Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Auth()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAuth();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsInputItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Input()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsInputItems> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsOutputItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Output()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsOutputItems> getOutput();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsBodyItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Body()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsBodyItems> getBody();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItems_Trigger()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	AccessesRootExternalAccessItemsTrigger getTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRootExternalAccessItems
