/**
 */
package dataoriented_ishikawa_model;

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
 *   <li>{@link dataoriented_ishikawa_model.Cause#getName <em>Name</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.Cause#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getCause()
 * @model abstract="true"
 * @generated
 */
public interface Cause extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getCause_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.Cause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' attribute.
	 * @see #setRealizes(String)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getCause_Realizes()
	 * @model
	 * @generated
	 */
	String getRealizes();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.Cause#getRealizes <em>Realizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' attribute.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(String value);

} // Cause
