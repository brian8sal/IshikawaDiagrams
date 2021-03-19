/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.CompoundCause#getSubCauses <em>Sub Causes</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getCompoundCause()
 * @model
 * @generated
 */
public interface CompoundCause extends Cause {
	/**
	 * Returns the value of the '<em><b>Sub Causes</b></em>' containment reference list.
	 * The list contents are of type {@link dataoriented_ishikawa_model.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Causes</em>' containment reference list.
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getCompoundCause_SubCauses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cause> getSubCauses();

} // CompoundCause
