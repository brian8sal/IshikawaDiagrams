/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.DOF;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;
import dataoriented_ishikawa_model.Effect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.impl.DOFImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOFImpl extends MinimalEObjectImpl.Container implements DOF {
	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Effect effect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dataoriented_ishikawa_modelPackage.Literals.DOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Effect newEffect, NotificationChain msgs) {
		Effect oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DOF__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Effect newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DOF__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DOF__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DOF__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dataoriented_ishikawa_modelPackage.DOF__EFFECT:
				return basicSetEffect(null, msgs);
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
			case Dataoriented_ishikawa_modelPackage.DOF__EFFECT:
				return getEffect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dataoriented_ishikawa_modelPackage.DOF__EFFECT:
				setEffect((Effect)newValue);
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
			case Dataoriented_ishikawa_modelPackage.DOF__EFFECT:
				setEffect((Effect)null);
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
			case Dataoriented_ishikawa_modelPackage.DOF__EFFECT:
				return effect != null;
		}
		return super.eIsSet(featureID);
	}

} //DOFImpl
