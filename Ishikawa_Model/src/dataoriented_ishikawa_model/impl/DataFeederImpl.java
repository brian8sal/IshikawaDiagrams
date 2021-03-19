/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.AttributeFilter;
import dataoriented_ishikawa_model.DataFeeder;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;
import dataoriented_ishikawa_model.IncludedReference;

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
 * An implementation of the model object '<em><b>Data Feeder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.impl.DataFeederImpl#getDomainElementSelector <em>Domain Element Selector</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.impl.DataFeederImpl#getIncludedReference <em>Included Reference</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.impl.DataFeederImpl#getAttributefilter <em>Attributefilter</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.impl.DataFeederImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFeederImpl extends MinimalEObjectImpl.Container implements DataFeeder {
	/**
	 * The default value of the '{@link #getDomainElementSelector() <em>Domain Element Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElementSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ELEMENT_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainElementSelector() <em>Domain Element Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElementSelector()
	 * @generated
	 * @ordered
	 */
	protected String domainElementSelector = DOMAIN_ELEMENT_SELECTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedReference() <em>Included Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedReference()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedReference> includedReference;

	/**
	 * The cached value of the '{@link #getAttributefilter() <em>Attributefilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributefilter()
	 * @generated
	 * @ordered
	 */
	protected AttributeFilter attributefilter;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFeederImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dataoriented_ishikawa_modelPackage.Literals.DATA_FEEDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainElementSelector() {
		return domainElementSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainElementSelector(String newDomainElementSelector) {
		String oldDomainElementSelector = domainElementSelector;
		domainElementSelector = newDomainElementSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR, oldDomainElementSelector, domainElementSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedReference> getIncludedReference() {
		if (includedReference == null) {
			includedReference = new EObjectContainmentEList<IncludedReference>(IncludedReference.class, this, Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE);
		}
		return includedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFilter getAttributefilter() {
		return attributefilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributefilter(AttributeFilter newAttributefilter, NotificationChain msgs) {
		AttributeFilter oldAttributefilter = attributefilter;
		attributefilter = newAttributefilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER, oldAttributefilter, newAttributefilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributefilter(AttributeFilter newAttributefilter) {
		if (newAttributefilter != attributefilter) {
			NotificationChain msgs = null;
			if (attributefilter != null)
				msgs = ((InternalEObject)attributefilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER, null, msgs);
			if (newAttributefilter != null)
				msgs = ((InternalEObject)newAttributefilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER, null, msgs);
			msgs = basicSetAttributefilter(newAttributefilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER, newAttributefilter, newAttributefilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dataoriented_ishikawa_modelPackage.DATA_FEEDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE:
				return ((InternalEList<?>)getIncludedReference()).basicRemove(otherEnd, msgs);
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER:
				return basicSetAttributefilter(null, msgs);
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
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR:
				return getDomainElementSelector();
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE:
				return getIncludedReference();
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER:
				return getAttributefilter();
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__NAME:
				return getName();
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
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR:
				setDomainElementSelector((String)newValue);
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE:
				getIncludedReference().clear();
				getIncludedReference().addAll((Collection<? extends IncludedReference>)newValue);
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER:
				setAttributefilter((AttributeFilter)newValue);
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__NAME:
				setName((String)newValue);
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
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR:
				setDomainElementSelector(DOMAIN_ELEMENT_SELECTOR_EDEFAULT);
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE:
				getIncludedReference().clear();
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER:
				setAttributefilter((AttributeFilter)null);
				return;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__NAME:
				setName(NAME_EDEFAULT);
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
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR:
				return DOMAIN_ELEMENT_SELECTOR_EDEFAULT == null ? domainElementSelector != null : !DOMAIN_ELEMENT_SELECTOR_EDEFAULT.equals(domainElementSelector);
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__INCLUDED_REFERENCE:
				return includedReference != null && !includedReference.isEmpty();
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__ATTRIBUTEFILTER:
				return attributefilter != null;
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (domainElementSelector: ");
		result.append(domainElementSelector);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataFeederImpl
