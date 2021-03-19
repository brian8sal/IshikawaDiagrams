/**
 */
package ishikawa_model.impl;

import ishikawa_model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ishikawa_modelFactoryImpl extends EFactoryImpl implements Ishikawa_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ishikawa_modelFactory init() {
		try {
			Ishikawa_modelFactory theIshikawa_modelFactory = (Ishikawa_modelFactory)EPackage.Registry.INSTANCE.getEFactory(Ishikawa_modelPackage.eNS_URI);
			if (theIshikawa_modelFactory != null) {
				return theIshikawa_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ishikawa_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ishikawa_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ishikawa_modelPackage.EFFECT: return createEffect();
			case Ishikawa_modelPackage.CATEGORY: return createCategory();
			case Ishikawa_modelPackage.CAUSE: return createCause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffect() {
		EffectImpl effect = new EffectImpl();
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cause createCause() {
		CauseImpl cause = new CauseImpl();
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ishikawa_modelPackage getIshikawa_modelPackage() {
		return (Ishikawa_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ishikawa_modelPackage getPackage() {
		return Ishikawa_modelPackage.eINSTANCE;
	}

} //Ishikawa_modelFactoryImpl
