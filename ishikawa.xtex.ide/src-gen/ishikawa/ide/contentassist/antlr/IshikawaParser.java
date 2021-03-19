/*
 * generated by Xtext 2.24.0
 */
package ishikawa.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ishikawa.ide.contentassist.antlr.internal.InternalIshikawaParser;
import ishikawa.services.IshikawaGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class IshikawaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(IshikawaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, IshikawaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEffectAccess().getGroup(), "rule__Effect__Group__0");
			builder.put(grammarAccess.getEffectAccess().getGroup_3(), "rule__Effect__Group_3__0");
			builder.put(grammarAccess.getEffectAccess().getGroup_4(), "rule__Effect__Group_4__0");
			builder.put(grammarAccess.getCategoryAccess().getGroup(), "rule__Category__Group__0");
			builder.put(grammarAccess.getCategoryAccess().getGroup_3(), "rule__Category__Group_3__0");
			builder.put(grammarAccess.getCategoryAccess().getGroup_4(), "rule__Category__Group_4__0");
			builder.put(grammarAccess.getCategoryAccess().getGroup_4_2(), "rule__Category__Group_4_2__0");
			builder.put(grammarAccess.getCauseAccess().getGroup(), "rule__Cause__Group__0");
			builder.put(grammarAccess.getCauseAccess().getGroup_3(), "rule__Cause__Group_3__0");
			builder.put(grammarAccess.getCauseAccess().getGroup_4(), "rule__Cause__Group_4__0");
			builder.put(grammarAccess.getCauseAccess().getGroup_5(), "rule__Cause__Group_5__0");
			builder.put(grammarAccess.getEffectAccess().getNameAssignment_2(), "rule__Effect__NameAssignment_2");
			builder.put(grammarAccess.getEffectAccess().getDescriptionAssignment_3_1(), "rule__Effect__DescriptionAssignment_3_1");
			builder.put(grammarAccess.getEffectAccess().getCategoriesAssignment_4_0(), "rule__Effect__CategoriesAssignment_4_0");
			builder.put(grammarAccess.getEffectAccess().getCategoriesAssignment_4_1(), "rule__Effect__CategoriesAssignment_4_1");
			builder.put(grammarAccess.getCategoryAccess().getNameAssignment_2(), "rule__Category__NameAssignment_2");
			builder.put(grammarAccess.getCategoryAccess().getDescriptionAssignment_3_1(), "rule__Category__DescriptionAssignment_3_1");
			builder.put(grammarAccess.getCategoryAccess().getCausesAssignment_4_1(), "rule__Category__CausesAssignment_4_1");
			builder.put(grammarAccess.getCategoryAccess().getCausesAssignment_4_2_1(), "rule__Category__CausesAssignment_4_2_1");
			builder.put(grammarAccess.getCauseAccess().getNameAssignment_2(), "rule__Cause__NameAssignment_2");
			builder.put(grammarAccess.getCauseAccess().getDescriptionAssignment_3_1(), "rule__Cause__DescriptionAssignment_3_1");
			builder.put(grammarAccess.getCauseAccess().getValueOfInterestAssignment_4_1(), "rule__Cause__ValueOfInterestAssignment_4_1");
			builder.put(grammarAccess.getCauseAccess().getSubCausesAssignment_5_1(), "rule__Cause__SubCausesAssignment_5_1");
			builder.put(grammarAccess.getCauseAccess().getSubCausesAssignment_5_2(), "rule__Cause__SubCausesAssignment_5_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private IshikawaGrammarAccess grammarAccess;

	@Override
	protected InternalIshikawaParser createParser() {
		InternalIshikawaParser result = new InternalIshikawaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IshikawaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IshikawaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
