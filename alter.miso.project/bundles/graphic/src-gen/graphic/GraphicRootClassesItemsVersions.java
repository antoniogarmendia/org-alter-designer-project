/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Versions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsVersions#getVersions <em>Versions</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVersions#getV1 <em>V1</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVersions#getV2 <em>V2</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsVersions#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVersions()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GraphicRootClassesItemsVersions extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsVersionsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVersions_Versions()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='versions'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsVersionsPropertiesAbstract> getVersions();

	/**
	 * Returns the value of the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVersions_V1()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getV1();

	/**
	 * Returns the value of the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVersions_V2()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getV2();

	/**
	 * Returns the value of the '<em><b>V3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V3</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsVersions_V3()
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

} // GraphicRootClassesItemsVersions
