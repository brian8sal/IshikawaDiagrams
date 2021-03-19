/**
 */
package dataoriented_ishikawa_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Linked Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.DataLinkedCause#getDataFeeder <em>Data Feeder</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataLinkedCause()
 * @model
 * @generated
 */
public interface DataLinkedCause extends Cause {
	/**
	 * Returns the value of the '<em><b>Data Feeder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Feeder</em>' containment reference.
	 * @see #setDataFeeder(DataFeeder)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataLinkedCause_DataFeeder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataFeeder getDataFeeder();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.DataLinkedCause#getDataFeeder <em>Data Feeder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Feeder</em>' containment reference.
	 * @see #getDataFeeder()
	 * @generated
	 */
	void setDataFeeder(DataFeeder value);

} // DataLinkedCause
