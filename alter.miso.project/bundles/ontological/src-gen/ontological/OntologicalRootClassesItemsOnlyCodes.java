/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Only Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsOnlyCodes#getOnlyCodes <em>Only Codes</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsOnlyCodes()
 * @model annotation="Type Type='boolean'"
 *        annotation="Comment Comment='this is the case when this particular class is or not with codes detection'"
 * @generated
 */
public interface OntologicalRootClassesItemsOnlyCodes extends OntologicalRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Codes</em>' attribute.
	 * @see #setOnlyCodes(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsOnlyCodes_OnlyCodes()
	 * @model required="true"
	 *        annotation="Keyword Keyword='onlyCodes'"
	 * @generated
	 */
	Boolean getOnlyCodes();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootClassesItemsOnlyCodes#getOnlyCodes <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Codes</em>' attribute.
	 * @see #getOnlyCodes()
	 * @generated
	 */
	void setOnlyCodes(Boolean value);

} // OntologicalRootClassesItemsOnlyCodes
