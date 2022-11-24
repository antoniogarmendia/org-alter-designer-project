/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsMaterialAttributes;
import graphic.GraphicRootClassesItemsMaterialAttributesItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Material Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsMaterialAttributesImpl#getMaterialAttributes <em>Material Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsMaterialAttributesImpl extends GraphicRootClassesItemsPropertiesAbstractImpl implements GraphicRootClassesItemsMaterialAttributes {
	/**
	 * The cached value of the '{@link #getMaterialAttributes() <em>Material Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsMaterialAttributesItems> materialAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsMaterialAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsMaterialAttributesItems> getMaterialAttributes() {
		if (materialAttributes == null) {
			materialAttributes = new EObjectContainmentEList<GraphicRootClassesItemsMaterialAttributesItems>(GraphicRootClassesItemsMaterialAttributesItems.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES);
		}
		return materialAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES:
				return ((InternalEList<?>)getMaterialAttributes()).basicRemove(otherEnd, msgs);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES:
				return getMaterialAttributes();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES:
				getMaterialAttributes().clear();
				getMaterialAttributes().addAll((Collection<? extends GraphicRootClassesItemsMaterialAttributesItems>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES:
				getMaterialAttributes().clear();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_MATERIAL_ATTRIBUTES__MATERIAL_ATTRIBUTES:
				return materialAttributes != null && !materialAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphicRootClassesItemsMaterialAttributesImpl
