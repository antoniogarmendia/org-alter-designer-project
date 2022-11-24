/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Show Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsShowAttributes#getShowAttributes <em>Show Attributes</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsShowAttributes()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GraphicRootClassesItemsShowAttributes extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Show Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsShowAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Attributes</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsShowAttributes_ShowAttributes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='showAttributes'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsShowAttributesItems> getShowAttributes();

} // GraphicRootClassesItemsShowAttributes
