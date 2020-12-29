package ishikawa.validation;

import org.eclipse.xtext.validation.Check;

import ishikawa_model.*;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class IshikawaValidator extends AbstractIshikawaValidator {
	
	public static final String INVALID_EFFECT_NAME = "invalidEffectName";
	public static final String INVALID_CATEGORY_NAME = "invalidCategoryName";
	public static final String INVALID_CAUSE_NAME = "invalidCauseName";
	public static final String NULL_NAME = "nullName";


	@Check
	public void checkEffectNameNotBlank(Effect effect) {
		if (effect.getName().isBlank()) {
			error("Effect's name must not be blank",
					Ishikawa_modelPackage.Literals.EFFECT__NAME,
					INVALID_EFFECT_NAME);
		}
	}
	
	@Check
	public void checkCategoryNameNotBlank(Category category) {
		if (category.getName().isBlank()) {
			error("Category's name must not be blank",
					Ishikawa_modelPackage.Literals.CATEGORY__NAME,
					INVALID_CATEGORY_NAME);
		}
	}
	
	@Check
	public void checkCauseNameNotBlank(Cause cause) {
		if (cause.getName().isBlank()) {
			error("Cause's name must not be blank",
					Ishikawa_modelPackage.Literals.CAUSE__NAME,
					INVALID_CAUSE_NAME);
		}
	}
	
	@Check
	public void checkEffectNameExists(Effect effect) {
		if (effect.getName()==null) {
			error("Effect's name must exist",
					Ishikawa_modelPackage.Literals.EFFECT__NAME,
					NULL_NAME);
		}
	}
	
	@Check
	public void checkCategoryNameExists(Category category) {
		if (category.getName()==null) {
			error("Category's name must exist",
					Ishikawa_modelPackage.Literals.CATEGORY__NAME,
					NULL_NAME);
		}
	}

	@Check
	public void checkCauseNameExists(Cause cause) {
		if (cause.getName()==null) {
			error("Cause's name must exist",
					Ishikawa_modelPackage.Literals.CAUSE__NAME,
					NULL_NAME);
		}
	}
}
