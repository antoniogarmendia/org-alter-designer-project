/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraints;
import graphic.GraphicRootClassesItemsConstraintsPropertiesAbstract;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getPlanes <em>Planes</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getIlumination <em>Ilumination</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getSizeMax <em>Size Max</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getSizeMin <em>Size Min</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getSizeInit <em>Size Init</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getOverlapping <em>Overlapping</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getXToOriginPos <em>XTo Origin Pos</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getYToOriginPos <em>YTo Origin Pos</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getZToOriginPos <em>ZTo Origin Pos</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getText <em>Text</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getTrim <em>Trim</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getCategoryBitMask <em>Category Bit Mask</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getCollisionBitMask <em>Collision Bit Mask</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsImpl#getContactTestBitMask <em>Contact Test Bit Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsImpl extends GraphicRootClassesItemsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraints {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsConstraintsPropertiesAbstract> constraints;

	/**
	 * The default value of the '{@link #getPlanes() <em>Planes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanes()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIlumination() <em>Ilumination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlumination()
	 * @generated
	 * @ordered
	 */
	protected static final String ILUMINATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizeMax() <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMax()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_MAX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizeMin() <em>Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMin()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_MIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizeInit() <em>Size Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInit()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_INIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOverlapping() <em>Overlapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapping()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERLAPPING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getXToOriginPos() <em>XTo Origin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXToOriginPos()
	 * @generated
	 * @ordered
	 */
	protected static final String XTO_ORIGIN_POS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getYToOriginPos() <em>YTo Origin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYToOriginPos()
	 * @generated
	 * @ordered
	 */
	protected static final String YTO_ORIGIN_POS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getZToOriginPos() <em>ZTo Origin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZToOriginPos()
	 * @generated
	 * @ordered
	 */
	protected static final String ZTO_ORIGIN_POS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTrim() <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRIM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategoryBitMask() <em>Category Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double CATEGORY_BIT_MASK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCollisionBitMask() <em>Collision Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double COLLISION_BIT_MASK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactTestBitMask() <em>Contact Test Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactTestBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONTACT_TEST_BIT_MASK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsConstraintsPropertiesAbstract> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<GraphicRootClassesItemsConstraintsPropertiesAbstract>(GraphicRootClassesItemsConstraintsPropertiesAbstract.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlanes() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsPlanes.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsPlanes.class::cast).map(instance->instance.getPlanes()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIlumination() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsIlumination.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsIlumination.class::cast).map(instance->instance.getIlumination()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeMax() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsSizeMax.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsSizeMax.class::cast).map(instance->instance.getSizeMax()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeMin() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsSizeMin.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsSizeMin.class::cast).map(instance->instance.getSizeMin()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeInit() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsSizeInit.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsSizeInit.class::cast).map(instance->instance.getSizeInit()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverlapping() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsOverlapping.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsOverlapping.class::cast).map(instance->instance.getOverlapping()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXToOriginPos() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsXToOriginPos.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsXToOriginPos.class::cast).map(instance->instance.getXToOriginPos()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYToOriginPos() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsYToOriginPos.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsYToOriginPos.class::cast).map(instance->instance.getYToOriginPos()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZToOriginPos() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsZToOriginPos.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsZToOriginPos.class::cast).map(instance->instance.getZToOriginPos()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRotation() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsRotation.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsRotation.class::cast).map(instance->instance.getRotation()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsText.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsText.class::cast).map(instance->instance.getText()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTrim() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsTrim.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsTrim.class::cast).map(instance->instance.getTrim()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCategoryBitMask() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsCategoryBitMask.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsCategoryBitMask.class::cast).map(instance->instance.getCategoryBitMask()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCollisionBitMask() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsCollisionBitMask.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsCollisionBitMask.class::cast).map(instance->instance.getCollisionBitMask()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getContactTestBitMask() {
		return this.getConstraints().stream().filter(graphic.GraphicRootClassesItemsConstraintsContactTestBitMask.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraintsContactTestBitMask.class::cast).map(instance->instance.getContactTestBitMask()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("planes".equals(key) ){return this.getPlanes();}
		
		if ("ilumination".equals(key) ){return this.getIlumination();}
		
		if ("sizeMax".equals(key) ){return this.getSizeMax();}
		
		if ("sizeMin".equals(key) ){return this.getSizeMin();}
		
		if ("sizeInit".equals(key) ){return this.getSizeInit();}
		
		if ("overlapping".equals(key) ){return this.getOverlapping();}
		
		if ("xToOriginPos".equals(key) ){return this.getXToOriginPos();}
		
		if ("yToOriginPos".equals(key) ){return this.getYToOriginPos();}
		
		if ("zToOriginPos".equals(key) ){return this.getZToOriginPos();}
		
		if ("rotation".equals(key) ){return this.getRotation();}
		
		if ("text".equals(key) ){return this.getText();}
		
		if ("trim".equals(key) ){return this.getTrim();}
		
		if ("categoryBitMask".equals(key) ){return this.getCategoryBitMask();}
		
		if ("collisionBitMask".equals(key) ){return this.getCollisionBitMask();}
		
		if ("contactTestBitMask".equals(key) ){return this.getContactTestBitMask();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GraphicRootClassesItemsConstraintsPropertiesAbstract child : this.constraints){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
				return getConstraints();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES:
				return getPlanes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION:
				return getIlumination();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX:
				return getSizeMax();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN:
				return getSizeMin();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT:
				return getSizeInit();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING:
				return getOverlapping();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS:
				return getXToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS:
				return getYToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS:
				return getZToOriginPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION:
				return getRotation();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT:
				return getText();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM:
				return getTrim();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK:
				return getCategoryBitMask();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK:
				return getCollisionBitMask();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK:
				return getContactTestBitMask();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends GraphicRootClassesItemsConstraintsPropertiesAbstract>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
				getConstraints().clear();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES:
				return PLANES_EDEFAULT == null ? getPlanes() != null : !PLANES_EDEFAULT.equals(getPlanes());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION:
				return ILUMINATION_EDEFAULT == null ? getIlumination() != null : !ILUMINATION_EDEFAULT.equals(getIlumination());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX:
				return SIZE_MAX_EDEFAULT == null ? getSizeMax() != null : !SIZE_MAX_EDEFAULT.equals(getSizeMax());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN:
				return SIZE_MIN_EDEFAULT == null ? getSizeMin() != null : !SIZE_MIN_EDEFAULT.equals(getSizeMin());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT:
				return SIZE_INIT_EDEFAULT == null ? getSizeInit() != null : !SIZE_INIT_EDEFAULT.equals(getSizeInit());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING:
				return OVERLAPPING_EDEFAULT == null ? getOverlapping() != null : !OVERLAPPING_EDEFAULT.equals(getOverlapping());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS:
				return XTO_ORIGIN_POS_EDEFAULT == null ? getXToOriginPos() != null : !XTO_ORIGIN_POS_EDEFAULT.equals(getXToOriginPos());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS:
				return YTO_ORIGIN_POS_EDEFAULT == null ? getYToOriginPos() != null : !YTO_ORIGIN_POS_EDEFAULT.equals(getYToOriginPos());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS:
				return ZTO_ORIGIN_POS_EDEFAULT == null ? getZToOriginPos() != null : !ZTO_ORIGIN_POS_EDEFAULT.equals(getZToOriginPos());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION:
				return ROTATION_EDEFAULT == null ? getRotation() != null : !ROTATION_EDEFAULT.equals(getRotation());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM:
				return TRIM_EDEFAULT == null ? getTrim() != null : !TRIM_EDEFAULT.equals(getTrim());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK:
				return CATEGORY_BIT_MASK_EDEFAULT == null ? getCategoryBitMask() != null : !CATEGORY_BIT_MASK_EDEFAULT.equals(getCategoryBitMask());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK:
				return COLLISION_BIT_MASK_EDEFAULT == null ? getCollisionBitMask() != null : !COLLISION_BIT_MASK_EDEFAULT.equals(getCollisionBitMask());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK:
				return CONTACT_TEST_BIT_MASK_EDEFAULT == null ? getContactTestBitMask() != null : !CONTACT_TEST_BIT_MASK_EDEFAULT.equals(getContactTestBitMask());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicRootClassesItemsConstraintsImpl
