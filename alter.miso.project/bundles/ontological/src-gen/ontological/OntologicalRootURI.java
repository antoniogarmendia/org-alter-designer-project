/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootURI#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootURI()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface OntologicalRootURI extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see ontological.OntologicalPackage#getOntologicalRootURI_URI()
	 * @model required="true"
	 *        annotation="Keyword Keyword='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootURI#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // OntologicalRootURI
