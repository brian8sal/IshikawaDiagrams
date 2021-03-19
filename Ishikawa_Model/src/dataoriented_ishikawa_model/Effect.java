/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.Effect#getName <em>Name</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.Effect#getCategories <em>Categories</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.Effect#getDataFeeder <em>Data Feeder</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getEffect_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.Effect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link dataoriented_ishikawa_model.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getEffect_Categories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Data Feeder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Feeder</em>' containment reference.
	 * @see #setDataFeeder(DataFeeder)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getEffect_DataFeeder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataFeeder getDataFeeder();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.Effect#getDataFeeder <em>Data Feeder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Feeder</em>' containment reference.
	 * @see #getDataFeeder()
	 * @generated
	 */
	void setDataFeeder(DataFeeder value);

} // Effect
