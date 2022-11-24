/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getPlanes <em>Planes</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getIlumination <em>Ilumination</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getSizeMax <em>Size Max</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getSizeMin <em>Size Min</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getSizeInit <em>Size Init</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getOverlapping <em>Overlapping</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getXToOriginPos <em>XTo Origin Pos</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getYToOriginPos <em>YTo Origin Pos</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getZToOriginPos <em>ZTo Origin Pos</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getRotation <em>Rotation</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getText <em>Text</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getTrim <em>Trim</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getCategoryBitMask <em>Category Bit Mask</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getCollisionBitMask <em>Collision Bit Mask</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItemsConstraints#getContactTestBitMask <em>Contact Test Bit Mask</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GraphicRootClassesItemsConstraints extends GraphicRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Constraints()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='constraints'"
	 * @generated
	 */
	EList<GraphicRootClassesItemsConstraintsPropertiesAbstract> getConstraints();

	/**
	 * Returns the value of the '<em><b>Planes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planes</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Planes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getPlanes();

	/**
	 * Returns the value of the '<em><b>Ilumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ilumination</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Ilumination()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getIlumination();

	/**
	 * Returns the value of the '<em><b>Size Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Max</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_SizeMax()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getSizeMax();

	/**
	 * Returns the value of the '<em><b>Size Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Min</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_SizeMin()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getSizeMin();

	/**
	 * Returns the value of the '<em><b>Size Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Init</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_SizeInit()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getSizeInit();

	/**
	 * Returns the value of the '<em><b>Overlapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlapping</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Overlapping()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getOverlapping();

	/**
	 * Returns the value of the '<em><b>XTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XTo Origin Pos</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_XToOriginPos()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getXToOriginPos();

	/**
	 * Returns the value of the '<em><b>YTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YTo Origin Pos</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_YToOriginPos()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getYToOriginPos();

	/**
	 * Returns the value of the '<em><b>ZTo Origin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZTo Origin Pos</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_ZToOriginPos()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getZToOriginPos();

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Rotation()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getRotation();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Text()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getText();

	/**
	 * Returns the value of the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_Trim()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getTrim();

	/**
	 * Returns the value of the '<em><b>Category Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Bit Mask</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_CategoryBitMask()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getCategoryBitMask();

	/**
	 * Returns the value of the '<em><b>Collision Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision Bit Mask</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_CollisionBitMask()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getCollisionBitMask();

	/**
	 * Returns the value of the '<em><b>Contact Test Bit Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Test Bit Mask</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItemsConstraints_ContactTestBitMask()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getContactTestBitMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GraphicRootClassesItemsConstraints
