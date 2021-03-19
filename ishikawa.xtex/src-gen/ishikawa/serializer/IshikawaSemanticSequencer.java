/*
 * generated by Xtext 2.24.0
 */
package ishikawa.serializer;

import com.google.inject.Inject;
import ishikawa.services.IshikawaGrammarAccess;
import ishikawa_model.Category;
import ishikawa_model.Cause;
import ishikawa_model.Effect;
import ishikawa_model.Ishikawa_modelPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class IshikawaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IshikawaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Ishikawa_modelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Ishikawa_modelPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case Ishikawa_modelPackage.CAUSE:
				sequence_Cause(context, (Cause) semanticObject); 
				return; 
			case Ishikawa_modelPackage.EFFECT:
				sequence_Effect(context, (Effect) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Category returns Category
	 *
	 * Constraint:
	 *     (name=EString description=EString? (causes+=Cause causes+=Cause*)?)
	 */
	protected void sequence_Category(ISerializationContext context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cause returns Cause
	 *
	 * Constraint:
	 *     (name=EString description=EString? valueOfInterest=EString? (subCauses+=Cause subCauses+=Cause*)?)
	 */
	protected void sequence_Cause(ISerializationContext context, Cause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns Effect
	 *
	 * Constraint:
	 *     (name=EString description=EString? (categories+=Category categories+=Category*)?)
	 */
	protected void sequence_Effect(ISerializationContext context, Effect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
