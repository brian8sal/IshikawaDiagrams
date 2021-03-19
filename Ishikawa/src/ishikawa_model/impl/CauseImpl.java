/**
 */
package ishikawa_model.impl;

import ishikawa_model.Cause;
import ishikawa_model.Ishikawa_modelPackage;

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
 * An implementation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ishikawa_model.impl.CauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ishikawa_model.impl.CauseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ishikawa_model.impl.CauseImpl#getValueOfInterest <em>Value Of Interest</em>}</li>
 *   <li>{@link ishikawa_model.impl.CauseImpl#getSubCauses <em>Sub Causes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CauseImpl extends MinimalEObjectImpl.Container implements Cause {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueOfInterest() <em>Value Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOfInterest()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_OF_INTEREST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueOfInterest() <em>Value Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOfInterest()
	 * @generated
	 * @ordered
	 */
	protected String valueOfInterest = VALUE_OF_INTEREST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubCauses() <em>Sub Causes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> subCauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ishikawa_modelPackage.Literals.CAUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ishikawa_modelPackage.CAUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ishikawa_modelPackage.CAUSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueOfInterest() {
		return valueOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOfInterest(String newValueOfInterest) {
		String oldValueOfInterest = valueOfInterest;
		valueOfInterest = newValueOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ishikawa_modelPackage.CAUSE__VALUE_OF_INTEREST, oldValueOfInterest, valueOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cause> getSubCauses() {
		if (subCauses == null) {
			subCauses = new EObjectContainmentEList<Cause>(Cause.class, this, Ishikawa_modelPackage.CAUSE__SUB_CAUSES);
		}
		return subCauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ishikawa_modelPackage.CAUSE__SUB_CAUSES:
				return ((InternalEList<?>)getSubCauses()).basicRemove(otherEnd, msgs);
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
			case Ishikawa_modelPackage.CAUSE__NAME:
				return getName();
			case Ishikawa_modelPackage.CAUSE__DESCRIPTION:
				return getDescription();
			case Ishikawa_modelPackage.CAUSE__VALUE_OF_INTEREST:
				return getValueOfInterest();
			case Ishikawa_modelPackage.CAUSE__SUB_CAUSES:
				return getSubCauses();
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
			case Ishikawa_modelPackage.CAUSE__NAME:
				setName((String)newValue);
				return;
			case Ishikawa_modelPackage.CAUSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ishikawa_modelPackage.CAUSE__VALUE_OF_INTEREST:
				setValueOfInterest((String)newValue);
				return;
			case Ishikawa_modelPackage.CAUSE__SUB_CAUSES:
				getSubCauses().clear();
				getSubCauses().addAll((Collection<? extends Cause>)newValue);
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
			case Ishikawa_modelPackage.CAUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ishikawa_modelPackage.CAUSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Ishikawa_modelPackage.CAUSE__VALUE_OF_INTEREST:
				setValueOfInterest(VALUE_OF_INTEREST_EDEFAULT);
				return;
			case Ishikawa_modelPackage.CAUSE__SUB_CAUSES:
				getSubCauses().clear();
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
			case Ishikawa_modelPackage.CAUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ishikawa_modelPackage.CAUSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Ishikawa_modelPackage.CAUSE__VALUE_OF_INTEREST:
				return VALUE_OF_INTEREST_EDEFAULT == null ? valueOfInterest != null : !VALUE_OF_INTEREST_EDEFAULT.equals(valueOfInterest);
			case Ishikawa_modelPackage.CAUSE__SUB_CAUSES:
				return subCauses != null && !subCauses.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", valueOfInterest: ");
		result.append(valueOfInterest);
		result.append(')');
		return result.toString();
	}

} //CauseImpl
