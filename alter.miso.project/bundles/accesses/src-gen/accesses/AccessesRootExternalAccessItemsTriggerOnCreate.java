/**
 */
package accesses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Trigger On Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTriggerOnCreate#getOnCreate <em>On Create</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTriggerOnCreate()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsTriggerOnCreate extends AccessesRootExternalAccessItemsTriggerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Create</em>' attribute.
	 * @see #setOnCreate(Boolean)
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTriggerOnCreate_OnCreate()
	 * @model required="true"
	 *        annotation="Keyword Keyword='onCreate'"
	 * @generated
	 */
	Boolean getOnCreate();

	/**
	 * Sets the value of the '{@link accesses.AccessesRootExternalAccessItemsTriggerOnCreate#getOnCreate <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Create</em>' attribute.
	 * @see #getOnCreate()
	 * @generated
	 */
	void setOnCreate(Boolean value);

} // AccessesRootExternalAccessItemsTriggerOnCreate
