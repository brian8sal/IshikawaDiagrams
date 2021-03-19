/**
 */
package ishikawa_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ishikawa_model.Category#getName <em>Name</em>}</li>
 *   <li>{@link ishikawa_model.Category#getDescription <em>Description</em>}</li>
 *   <li>{@link ishikawa_model.Category#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see ishikawa_model.Ishikawa_modelPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ishikawa_model.Ishikawa_modelPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ishikawa_model.Category#getName <em>Name</em>}' attribute.
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
	 * @see ishikawa_model.Ishikawa_modelPackage#getCategory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ishikawa_model.Category#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link ishikawa_model.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see ishikawa_model.Ishikawa_modelPackage#getCategory_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getCauses();

} // Category
