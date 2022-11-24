/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Vname</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsVname#getVname <em>Vname</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVname#getV1 <em>V1</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVname#getV2 <em>V2</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVname#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVname()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GraphicRootClassesItemsVname extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Vname</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsVnamePropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vname</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVname_Vname()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='vname'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsVnamePropertiesAbstract> getVname();

	/**
	 * Returns the value of the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVname_V1()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getV1();

	/**
	 * Returns the value of the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVname_V2()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getV2();

	/**
	 * Returns the value of the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V3</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVname_V3()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getV3();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GraphicRootClassesItemsVname
