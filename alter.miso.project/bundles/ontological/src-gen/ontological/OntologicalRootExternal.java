/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootExternal#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootExternal()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface OntologicalRootExternal extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootExternal_External()
	 * @model required="true"
	 *        annotation="Keyword Keyword='external'"
	 * @generated
	 */
	Boolean getExternal();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootExternal#getExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(Boolean value);

} // OntologicalRootExternal
