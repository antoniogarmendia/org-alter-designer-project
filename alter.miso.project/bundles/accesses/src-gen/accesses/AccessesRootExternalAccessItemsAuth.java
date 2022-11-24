/**
 */
package accesses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsAuth#getAuth <em>Auth</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsAuth()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsAuth extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth</em>' attribute.
	 * @see #setAuth(String)
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsAuth_Auth()
	 * @model required="true"
	 *        annotation="Keyword Keyword='auth'"
	 * @generated
	 */
	String getAuth();

	/**
	 * Sets the value of the '{@link accesses.AccessesRootExternalAccessItemsAuth#getAuth <em>Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth</em>' attribute.
	 * @see #getAuth()
	 * @generated
	 */
	void setAuth(String value);

} // AccessesRootExternalAccessItemsAuth
