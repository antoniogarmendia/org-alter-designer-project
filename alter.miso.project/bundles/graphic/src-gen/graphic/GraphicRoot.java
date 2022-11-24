/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRoot#getGraphicRoot <em>Graphic Root</em>}</li>
 *   <li>{@link graphic.GraphicRoot#getName <em>Name</em>}</li>
 *   <li>{@link graphic.GraphicRoot#getURI <em>URI</em>}</li>
 *   <li>{@link graphic.GraphicRoot#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRoot()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GraphicRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphic Root</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Root</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRoot_GraphicRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicRootPropertiesAbstract> getGraphicRoot();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRoot_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRoot_URI()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see graphic.GraphicPackage#getGraphicRoot_Classes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<GraphicRootClassesItems> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GraphicRoot
