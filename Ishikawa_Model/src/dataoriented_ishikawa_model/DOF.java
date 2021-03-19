/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.DOF#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDOF()
 * @model
 * @generated
 */
public interface DOF extends EObject {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Effect)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDOF_Effect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Effect getEffect();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.DOF#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Effect value);

} // DOF
