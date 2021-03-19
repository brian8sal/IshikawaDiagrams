/**
 */
package dataoriented_ishikawa_model.util;

import dataoriented_ishikawa_model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage
 * @generated
 */
public class Dataoriented_ishikawa_modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dataoriented_ishikawa_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataoriented_ishikawa_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Dataoriented_ishikawa_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Dataoriented_ishikawa_modelPackage.EFFECT: {
				Effect effect = (Effect)theEObject;
				T result = caseEffect(effect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.CAUSE: {
				Cause cause = (Cause)theEObject;
				T result = caseCause(cause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE: {
				CompoundCause compoundCause = (CompoundCause)theEObject;
				T result = caseCompoundCause(compoundCause);
				if (result == null) result = caseCause(compoundCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE: {
				DataLinkedCause dataLinkedCause = (DataLinkedCause)theEObject;
				T result = caseDataLinkedCause(dataLinkedCause);
				if (result == null) result = caseCause(dataLinkedCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.NOT_MAPPED_CAUSE: {
				NotMappedCause notMappedCause = (NotMappedCause)theEObject;
				T result = caseNotMappedCause(notMappedCause);
				if (result == null) result = caseCause(notMappedCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.ATTRIBUTE_FILTER: {
				AttributeFilter attributeFilter = (AttributeFilter)theEObject;
				T result = caseAttributeFilter(attributeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.INCLUDED_REFERENCE: {
				IncludedReference includedReference = (IncludedReference)theEObject;
				T result = caseIncludedReference(includedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.DOF: {
				DOF dof = (DOF)theEObject;
				T result = caseDOF(dof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER: {
				DataFeeder dataFeeder = (DataFeeder)theEObject;
				T result = caseDataFeeder(dataFeeder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffect(Effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCause(Cause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCause(CompoundCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Linked Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Linked Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkedCause(DataLinkedCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Mapped Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Mapped Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotMappedCause(NotMappedCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeFilter(AttributeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedReference(IncludedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOF(DOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Feeder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Feeder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFeeder(DataFeeder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Dataoriented_ishikawa_modelSwitch
