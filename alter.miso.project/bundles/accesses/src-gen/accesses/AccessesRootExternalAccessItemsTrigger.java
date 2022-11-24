/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnChange <em>On Change</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnCreate <em>On Create</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnMove <em>On Move</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnAccess <em>On Access</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getOnLoad <em>On Load</em>}</li>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTrigger#getTimeTrigger <em>Time Trigger</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsTrigger extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_Trigger()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='trigger'"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsTriggerPropertiesAbstract> getTrigger();

	/**
	 * Returns the value of the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Change</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnChange()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnChange();

	/**
	 * Returns the value of the '<em><b>On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Create</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnCreate()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnCreate();

	/**
	 * Returns the value of the '<em><b>On Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Move</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnMove()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnMove();

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnDelete()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnDelete();

	/**
	 * Returns the value of the '<em><b>On Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Access</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnAccess()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnAccess();

	/**
	 * Returns the value of the '<em><b>On Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Load</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_OnLoad()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnLoad();

	/**
	 * Returns the value of the '<em><b>Time Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Trigger</em>' attribute.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTrigger_TimeTrigger()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getTimeTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // AccessesRootExternalAccessItemsTrigger
