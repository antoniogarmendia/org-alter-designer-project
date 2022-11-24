/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClasses#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClasses()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GraphicRootClasses extends GraphicRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClasses_Classes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='classes'"
	 * @generated
	 */
	EList<GraphicRootClassesItems> getClasses();

} // GraphicRootClasses
