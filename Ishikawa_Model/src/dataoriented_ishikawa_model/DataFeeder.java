/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Feeder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataoriented_ishikawa_model.DataFeeder#getDomainElementSelector <em>Domain Element Selector</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.DataFeeder#getIncludedReference <em>Included Reference</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.DataFeeder#getAttributefilter <em>Attributefilter</em>}</li>
 *   <li>{@link dataoriented_ishikawa_model.DataFeeder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataFeeder()
 * @model
 * @generated
 */
public interface DataFeeder extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Element Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element Selector</em>' attribute.
	 * @see #setDomainElementSelector(String)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataFeeder_DomainElementSelector()
	 * @model
	 * @generated
	 */
	String getDomainElementSelector();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.DataFeeder#getDomainElementSelector <em>Domain Element Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Element Selector</em>' attribute.
	 * @see #getDomainElementSelector()
	 * @generated
	 */
	void setDomainElementSelector(String value);

	/**
	 * Returns the value of the '<em><b>Included Reference</b></em>' containment reference list.
	 * The list contents are of type {@link dataoriented_ishikawa_model.IncludedReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Reference</em>' containment reference list.
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataFeeder_IncludedReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludedReference> getIncludedReference();

	/**
	 * Returns the value of the '<em><b>Attributefilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributefilter</em>' containment reference.
	 * @see #setAttributefilter(AttributeFilter)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataFeeder_Attributefilter()
	 * @model containment="true"
	 * @generated
	 */
	AttributeFilter getAttributefilter();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.DataFeeder#getAttributefilter <em>Attributefilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributefilter</em>' containment reference.
	 * @see #getAttributefilter()
	 * @generated
	 */
	void setAttributefilter(AttributeFilter value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#getDataFeeder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataoriented_ishikawa_model.DataFeeder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataFeeder
