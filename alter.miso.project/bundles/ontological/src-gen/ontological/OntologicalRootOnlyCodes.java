/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Only Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootOnlyCodes#getOnlyCodes <em>Only Codes</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootOnlyCodes()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface OntologicalRootOnlyCodes extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Codes</em>' attribute.
	 * @see #setOnlyCodes(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootOnlyCodes_OnlyCodes()
	 * @model required="true"
	 *        annotation="Keyword Keyword='onlyCodes'"
	 * @generated
	 */
	Boolean getOnlyCodes();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootOnlyCodes#getOnlyCodes <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Codes</em>' attribute.
	 * @see #getOnlyCodes()
	 * @generated
	 */
	void setOnlyCodes(Boolean value);

} // OntologicalRootOnlyCodes
