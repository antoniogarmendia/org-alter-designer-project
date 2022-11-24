/**
 */
package accesses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Trigger On Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsTriggerOnDelete#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTriggerOnDelete()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsTriggerOnDelete extends AccessesRootExternalAccessItemsTriggerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see #setOnDelete(Boolean)
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsTriggerOnDelete_OnDelete()
	 * @model required="true"
	 *        annotation="Keyword Keyword='onDelete'"
	 * @generated
	 */
	Boolean getOnDelete();

	/**
	 * Sets the value of the '{@link accesses.AccessesRootExternalAccessItemsTriggerOnDelete#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(Boolean value);

} // AccessesRootExternalAccessItemsTriggerOnDelete
