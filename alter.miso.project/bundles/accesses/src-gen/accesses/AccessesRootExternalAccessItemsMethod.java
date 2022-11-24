/**
 */
package accesses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsMethod#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsMethod()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsMethod extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsMethod_Method()
	 * @model required="true"
	 *        annotation="Keyword Keyword='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link accesses.AccessesRootExternalAccessItemsMethod#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // AccessesRootExternalAccessItemsMethod
