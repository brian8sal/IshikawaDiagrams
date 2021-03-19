/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.Category;
import dataoriented_ishikawa_model.DataFeeder;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;
import dataoriented_ishikawa_model.Effect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.impl.EffectImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.impl.EffectImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.impl.EffectImpl#getDataFeeder <em>Data Feeder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getDataFeeder() <em>Data Feeder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFeeder()
	 * @generated
	 * @ordered
	 */
	protected DataFeeder dataFeeder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dataoriented_ishikawa_modelPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.EFFECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFeeder getDataFeeder() {
		return dataFeeder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFeeder(DataFeeder newDataFeeder, NotificationChain msgs) {
		DataFeeder oldDataFeeder = dataFeeder;
		dataFeeder = newDataFeeder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER, oldDataFeeder, newDataFeeder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFeeder(DataFeeder newDataFeeder) {
		if (newDataFeeder != dataFeeder) {
			NotificationChain msgs = null;
			if (dataFeeder != null)
				msgs = ((InternalEObject)dataFeeder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER, null, msgs);
			if (newDataFeeder != null)
				msgs = ((InternalEObject)newDataFeeder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER, null, msgs);
			msgs = basicSetDataFeeder(newDataFeeder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER, newDataFeeder, newDataFeeder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER:
				return basicSetDataFeeder(null, msgs);
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
			case Dataoriented_ishikawa_modelPackage.EFFECT__NAME:
				return getName();
			case Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES:
				return getCategories();
			case Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER:
				return getDataFeeder();
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
			case Dataoriented_ishikawa_modelPackage.EFFECT__NAME:
				setName((String)newValue);
				return;
			case Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER:
				setDataFeeder((DataFeeder)newValue);
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
			case Dataoriented_ishikawa_modelPackage.EFFECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES:
				getCategories().clear();
				return;
			case Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER:
				setDataFeeder((DataFeeder)null);
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
			case Dataoriented_ishikawa_modelPackage.EFFECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Dataoriented_ishikawa_modelPackage.EFFECT__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case Dataoriented_ishikawa_modelPackage.EFFECT__DATA_FEEDER:
				return dataFeeder != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EffectImpl
