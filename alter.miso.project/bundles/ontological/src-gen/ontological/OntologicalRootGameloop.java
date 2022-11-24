/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Gameloop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootGameloop#getGameloop <em>Gameloop</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootGameloop()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface OntologicalRootGameloop extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Gameloop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameloop</em>' attribute.
	 * @see #setGameloop(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootGameloop_Gameloop()
	 * @model required="true"
	 *        annotation="Keyword Keyword='gameloop'"
	 * @generated
	 */
	Boolean getGameloop();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootGameloop#getGameloop <em>Gameloop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameloop</em>' attribute.
	 * @see #getGameloop()
	 * @generated
	 */
	void setGameloop(Boolean value);

} // OntologicalRootGameloop
