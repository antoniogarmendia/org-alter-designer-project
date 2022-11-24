/**
 */
package accesses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsPath()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsPath extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsPath_Path()
	 * @model required="true"
	 *        annotation="Keyword Keyword='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link accesses.AccessesRootExternalAccessItemsPath#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // AccessesRootExternalAccessItemsPath
