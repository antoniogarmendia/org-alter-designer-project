/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items No SCN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsNoSCN#getNoSCN <em>No SCN</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsNoSCN()
 * @model annotation="Type Type='boolean'"
 *        annotation="Comment Comment='discard any SCN image search'"
 * @generated
 */
public interface OntologicalRootClassesItemsNoSCN extends OntologicalRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No SCN</em>' attribute.
	 * @see #setNoSCN(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsNoSCN_NoSCN()
	 * @model required="true"
	 *        annotation="Keyword Keyword='noSCN'"
	 * @generated
	 */
	Boolean getNoSCN();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootClassesItemsNoSCN#getNoSCN <em>No SCN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No SCN</em>' attribute.
	 * @see #getNoSCN()
	 * @generated
	 */
	void setNoSCN(Boolean value);

} // OntologicalRootClassesItemsNoSCN
