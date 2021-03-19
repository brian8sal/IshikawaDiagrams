/**
 */
package ishikawa_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ishikawa_model.Cause#getName <em>Name</em>}</li>
 *   <li>{@link ishikawa_model.Cause#getDescription <em>Description</em>}</li>
 *   <li>{@link ishikawa_model.Cause#getValueOfInterest <em>Value Of Interest</em>}</li>
 *   <li>{@link ishikawa_model.Cause#getSubCauses <em>Sub Causes</em>}</li>
 * </ul>
 *
 * @see ishikawa_model.Ishikawa_modelPackage#getCause()
 * @model
 * @generated
 */
public interface Cause extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ishikawa_model.Ishikawa_modelPackage#getCause_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ishikawa_model.Cause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ishikawa_model.Ishikawa_modelPackage#getCause_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ishikawa_model.Cause#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value Of Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of Interest</em>' attribute.
	 * @see #setValueOfInterest(String)
	 * @see ishikawa_model.Ishikawa_modelPackage#getCause_ValueOfInterest()
	 * @model
	 * @generated
	 */
	String getValueOfInterest();

	/**
	 * Sets the value of the '{@link ishikawa_model.Cause#getValueOfInterest <em>Value Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Of Interest</em>' attribute.
	 * @see #getValueOfInterest()
	 * @generated
	 */
	void setValueOfInterest(String value);

	/**
	 * Returns the value of the '<em><b>Sub Causes</b></em>' containment reference list.
	 * The list contents are of type {@link ishikawa_model.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Causes</em>' containment reference list.
	 * @see ishikawa_model.Ishikawa_modelPackage#getCause_SubCauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getSubCauses();

} // Cause
