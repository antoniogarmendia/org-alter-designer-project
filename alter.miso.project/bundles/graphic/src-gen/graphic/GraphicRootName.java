/**
 */
package graphic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootName()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface GraphicRootName extends GraphicRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graphic.GraphicPackage#getGraphicRootName_Name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graphic.GraphicRootName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GraphicRootName
