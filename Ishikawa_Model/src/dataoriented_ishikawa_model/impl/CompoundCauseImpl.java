/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.Cause;
import dataoriented_ishikawa_model.CompoundCause;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.impl.CompoundCauseImpl#getSubCauses <em>Sub Causes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundCauseImpl extends CauseImpl implements CompoundCause {
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
	protected CompoundCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dataoriented_ishikawa_modelPackage.Literals.COMPOUND_CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cause> getSubCauses() {
		if (subCauses == null) {
			subCauses = new EObjectContainmentEList<Cause>(Cause.class, this, Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES);
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
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES:
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
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES:
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
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES:
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
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES:
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
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE__SUB_CAUSES:
				return subCauses != null && !subCauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundCauseImpl
