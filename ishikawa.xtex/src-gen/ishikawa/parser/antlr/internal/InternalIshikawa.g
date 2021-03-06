/*
 * generated by Xtext 2.24.0
 */
grammar InternalIshikawa;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ishikawa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ishikawa.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ishikawa.services.IshikawaGrammarAccess;

}

@parser::members {

 	private IshikawaGrammarAccess grammarAccess;

    public InternalIshikawaParser(TokenStream input, IshikawaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Effect";
   	}

   	@Override
   	protected IshikawaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEffect
entryRuleEffect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEffectRule()); }
	iv_ruleEffect=ruleEffect
	{ $current=$iv_ruleEffect.current; }
	EOF;

// Rule Effect
ruleEffect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEffectAccess().getEffectAction_0(),
					$current);
			}
		)
		otherlv_1='Effect'
		{
			newLeafNode(otherlv_1, grammarAccess.getEffectAccess().getEffectKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEffectAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEffectRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"ishikawa.Ishikawa.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='description'
			{
				newLeafNode(otherlv_3, grammarAccess.getEffectAccess().getDescriptionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEffectAccess().getDescriptionEStringParserRuleCall_3_1_0());
					}
					lv_description_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEffectRule());
						}
						set(
							$current,
							"description",
							lv_description_4_0,
							"ishikawa.Ishikawa.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_0_0());
					}
					lv_categories_5_0=ruleCategory
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEffectRule());
						}
						add(
							$current,
							"categories",
							lv_categories_5_0,
							"ishikawa.Ishikawa.Category");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_1_0());
					}
					lv_categories_6_0=ruleCategory
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEffectRule());
						}
						add(
							$current,
							"categories",
							lv_categories_6_0,
							"ishikawa.Ishikawa.Category");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleCategory
entryRuleCategory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCategoryRule()); }
	iv_ruleCategory=ruleCategory
	{ $current=$iv_ruleCategory.current; }
	EOF;

// Rule Category
ruleCategory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCategoryAccess().getCategoryAction_0(),
					$current);
			}
		)
		otherlv_1='Category'
		{
			newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCategoryRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"ishikawa.Ishikawa.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='description'
			{
				newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getDescriptionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_3_1_0());
					}
					lv_description_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCategoryRule());
						}
						set(
							$current,
							"description",
							lv_description_4_0,
							"ishikawa.Ishikawa.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='->'
			{
				newLeafNode(otherlv_5, grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_1_0());
					}
					lv_causes_6_0=ruleCause
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCategoryRule());
						}
						add(
							$current,
							"causes",
							lv_causes_6_0,
							"ishikawa.Ishikawa.Cause");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7='->'
				{
					newLeafNode(otherlv_7, grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_2_1_0());
						}
						lv_causes_8_0=ruleCause
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCategoryRule());
							}
							add(
								$current,
								"causes",
								lv_causes_8_0,
								"ishikawa.Ishikawa.Cause");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleCause
entryRuleCause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCauseRule()); }
	iv_ruleCause=ruleCause
	{ $current=$iv_ruleCause.current; }
	EOF;

// Rule Cause
ruleCause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCauseAccess().getCauseAction_0(),
					$current);
			}
		)
		otherlv_1='Cause'
		{
			newLeafNode(otherlv_1, grammarAccess.getCauseAccess().getCauseKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCauseAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCauseRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"ishikawa.Ishikawa.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='description'
			{
				newLeafNode(otherlv_3, grammarAccess.getCauseAccess().getDescriptionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCauseAccess().getDescriptionEStringParserRuleCall_3_1_0());
					}
					lv_description_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCauseRule());
						}
						set(
							$current,
							"description",
							lv_description_4_0,
							"ishikawa.Ishikawa.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='valueOfInterest'
			{
				newLeafNode(otherlv_5, grammarAccess.getCauseAccess().getValueOfInterestKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCauseAccess().getValueOfInterestEStringParserRuleCall_4_1_0());
					}
					lv_valueOfInterest_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCauseRule());
						}
						set(
							$current,
							"valueOfInterest",
							lv_valueOfInterest_6_0,
							"ishikawa.Ishikawa.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getCauseAccess().getLeftCurlyBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_1_0());
					}
					lv_subCauses_8_0=ruleCause
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCauseRule());
						}
						add(
							$current,
							"subCauses",
							lv_subCauses_8_0,
							"ishikawa.Ishikawa.Cause");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_2_0());
					}
					lv_subCauses_9_0=ruleCause
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCauseRule());
						}
						add(
							$current,
							"subCauses",
							lv_subCauses_9_0,
							"ishikawa.Ishikawa.Cause");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getCauseAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_TAB : '\t'+;

RULE_NEWLINE : ('\r'? '\n')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
