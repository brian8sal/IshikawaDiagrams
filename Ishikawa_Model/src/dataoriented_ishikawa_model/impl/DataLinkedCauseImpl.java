/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.DataFeeder;
import dataoriented_ishikawa_model.DataLinkedCause;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Linked Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.impl.DataLinkedCauseImpl#getDataFeeder <em>Data Feeder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLinkedCauseImpl extends CauseImpl implements DataLinkedCause {
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
	protected DataLinkedCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dataoriented_ishikawa_modelPackage.Literals.DATA_LINKED_CAUSE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER, oldDataFeeder, newDataFeeder);
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
				msgs = ((InternalEObject)dataFeeder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER, null, msgs);
			if (newDataFeeder != null)
				msgs = ((InternalEObject)newDataFeeder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER, null, msgs);
			msgs = basicSetDataFeeder(newDataFeeder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER, newDataFeeder, newDataFeeder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER:
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
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER:
				return getDataFeeder();
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
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER:
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
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER:
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
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE__DATA_FEEDER:
				return dataFeeder != null;
		}
		return super.eIsSet(featureID);
	}

} //DataLinkedCauseImpl
