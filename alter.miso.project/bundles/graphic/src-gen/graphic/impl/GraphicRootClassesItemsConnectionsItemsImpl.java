/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItems;
import graphic.GraphicRootClassesItemsConnectionsItemsPropertiesAbstract;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Connections Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getType <em>Type</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getColor <em>Color</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getDecoratorColor <em>Decorator Color</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getDecoratorWidth <em>Decorator Width</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getDecoratorPos <em>Decorator Pos</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsImpl extends MinimalEObjectImpl.Container implements GraphicRootClassesItemsConnectionsItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsConnectionsItemsPropertiesAbstract> items;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecorator() <em>Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorator()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecoratorColor() <em>Decorator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecoratorWidth() <em>Decorator Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecoratorPos() <em>Decorator Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorPos()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_POS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConnectionsItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsConnectionsItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<GraphicRootClassesItemsConnectionsItemsPropertiesAbstract>(GraphicRootClassesItemsConnectionsItemsPropertiesAbstract.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsName.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsType.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsType.class::cast).map(instance->instance.getType()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsColor.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsColor.class::cast).map(instance->instance.getColor()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextColor() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsTextColor.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsTextColor.class::cast).map(instance->instance.getTextColor()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecorator() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsDecorator.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsDecorator.class::cast).map(instance->instance.getDecorator()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorColor() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor.class::cast).map(instance->instance.getDecoratorColor()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorWidth() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth.class::cast).map(instance->instance.getDecoratorWidth()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorPos() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos.class::cast).map(instance->instance.getDecoratorPos()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsPattern.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsPattern.class::cast).map(instance->instance.getPattern()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsWidth.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsWidth.class::cast).map(instance->instance.getWidth()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsPosition.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsPosition.class::cast).map(instance->instance.getPosition()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnectionsItemsTarget.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnectionsItemsTarget.class::cast).map(instance->instance.getTarget()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("type".equals(key) ){return this.getType();}
		
		if ("color".equals(key) ){return this.getColor();}
		
		if ("textColor".equals(key) ){return this.getTextColor();}
		
		if ("decorator".equals(key) ){return this.getDecorator();}
		
		if ("decoratorColor".equals(key) ){return this.getDecoratorColor();}
		
		if ("decoratorWidth".equals(key) ){return this.getDecoratorWidth();}
		
		if ("decoratorPos".equals(key) ){return this.getDecoratorPos();}
		
		if ("pattern".equals(key) ){return this.getPattern();}
		
		if ("width".equals(key) ){return this.getWidth();}
		
		if ("position".equals(key) ){return this.getPosition();}
		
		if ("target".equals(key) ){return this.getTarget();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GraphicRootClassesItemsConnectionsItemsPropertiesAbstract child : this.items){
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
				return getItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME:
				return getName();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE:
				return getType();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR:
				return getColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR:
				return getTextColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR:
				return getDecorator();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR:
				return getDecoratorColor();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH:
				return getDecoratorWidth();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS:
				return getDecoratorPos();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN:
				return getPattern();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH:
				return getWidth();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION:
				return getPosition();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET:
				return getTarget();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends GraphicRootClassesItemsConnectionsItemsPropertiesAbstract>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
				getItems().clear();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? getTextColor() != null : !TEXT_COLOR_EDEFAULT.equals(getTextColor());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR:
				return DECORATOR_EDEFAULT == null ? getDecorator() != null : !DECORATOR_EDEFAULT.equals(getDecorator());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR:
				return DECORATOR_COLOR_EDEFAULT == null ? getDecoratorColor() != null : !DECORATOR_COLOR_EDEFAULT.equals(getDecoratorColor());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH:
				return DECORATOR_WIDTH_EDEFAULT == null ? getDecoratorWidth() != null : !DECORATOR_WIDTH_EDEFAULT.equals(getDecoratorWidth());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS:
				return DECORATOR_POS_EDEFAULT == null ? getDecoratorPos() != null : !DECORATOR_POS_EDEFAULT.equals(getDecoratorPos());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN:
				return PATTERN_EDEFAULT == null ? getPattern() != null : !PATTERN_EDEFAULT.equals(getPattern());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH:
				return WIDTH_EDEFAULT == null ? getWidth() != null : !WIDTH_EDEFAULT.equals(getWidth());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION:
				return POSITION_EDEFAULT == null ? getPosition() != null : !POSITION_EDEFAULT.equals(getPosition());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicRootClassesItemsConnectionsItemsImpl
