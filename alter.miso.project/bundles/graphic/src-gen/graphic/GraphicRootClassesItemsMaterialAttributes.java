/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Material Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsMaterialAttributes#getMaterialAttributes <em>Material Attributes</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsMaterialAttributes()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GraphicRootClassesItemsMaterialAttributes extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Material Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsMaterialAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Attributes</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsMaterialAttributes_MaterialAttributes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='materialAttributes'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsMaterialAttributesItems> getMaterialAttributes();

} // GraphicRootClassesItemsMaterialAttributes
