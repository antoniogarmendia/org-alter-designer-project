/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsConnections#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConnections()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GraphicRootClassesItemsConnections extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsConnectionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConnections_Connections()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='connections'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsConnectionsItems> getConnections();

} // GraphicRootClassesItemsConnections
