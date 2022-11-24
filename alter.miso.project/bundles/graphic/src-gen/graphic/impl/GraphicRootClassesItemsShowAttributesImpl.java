/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsShowAttributes;
import graphic.GraphicRootClassesItemsShowAttributesItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Show Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsShowAttributesImpl#getShowAttributes <em>Show Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsShowAttributesImpl extends GraphicRootClassesItemsPropertiesAbstractImpl implements GraphicRootClassesItemsShowAttributes {
	/**
	 * The cached value of the '{@link #getShowAttributes() <em>Show Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsShowAttributesItems> showAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsShowAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsShowAttributesItems> getShowAttributes() {
		if (showAttributes == null) {
			showAttributes = new EObjectContainmentEList<GraphicRootClassesItemsShowAttributesItems>(GraphicRootClassesItemsShowAttributesItems.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES);
		}
		return showAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES:
				return ((InternalEList<?>)getShowAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES:
				return getShowAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES:
				getShowAttributes().clear();
				getShowAttributes().addAll((Collection<? extends GraphicRootClassesItemsShowAttributesItems>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES:
				getShowAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_SHOW_ATTRIBUTES__SHOW_ATTRIBUTES:
				return showAttributes != null && !showAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphicRootClassesItemsShowAttributesImpl
