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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIshikawaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TAB", "RULE_NEWLINE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Effect'", "'description'", "'Category'", "'->'", "'Cause'", "'valueOfInterest'", "'{'", "'}'"
    };
    public static final int RULE_NEWLINE=7;
    public static final int RULE_TAB=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalIshikawaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIshikawaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIshikawaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIshikawa.g"; }



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




    // $ANTLR start "entryRuleEffect"
    // InternalIshikawa.g:64:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalIshikawa.g:64:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalIshikawa.g:65:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalIshikawa.g:71:1: ruleEffect returns [EObject current=null] : ( () otherlv_1= 'Effect' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )? ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_categories_5_0 = null;

        EObject lv_categories_6_0 = null;



        	enterRule();

        try {
            // InternalIshikawa.g:77:2: ( ( () otherlv_1= 'Effect' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )? ) )
            // InternalIshikawa.g:78:2: ( () otherlv_1= 'Effect' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )? )
            {
            // InternalIshikawa.g:78:2: ( () otherlv_1= 'Effect' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )? )
            // InternalIshikawa.g:79:3: () otherlv_1= 'Effect' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )?
            {
            // InternalIshikawa.g:79:3: ()
            // InternalIshikawa.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectAccess().getEffectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectAccess().getEffectKeyword_1());
            		
            // InternalIshikawa.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIshikawa.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalIshikawa.g:91:4: (lv_name_2_0= ruleEString )
            // InternalIshikawa.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEffectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ishikawa.Ishikawa.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIshikawa.g:109:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIshikawa.g:110:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIshikawa.g:114:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIshikawa.g:115:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIshikawa.g:115:5: (lv_description_4_0= ruleEString )
                    // InternalIshikawa.g:116:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEffectAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"ishikawa.Ishikawa.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIshikawa.g:134:3: ( ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIshikawa.g:135:4: ( (lv_categories_5_0= ruleCategory ) ) ( (lv_categories_6_0= ruleCategory ) )*
                    {
                    // InternalIshikawa.g:135:4: ( (lv_categories_5_0= ruleCategory ) )
                    // InternalIshikawa.g:136:5: (lv_categories_5_0= ruleCategory )
                    {
                    // InternalIshikawa.g:136:5: (lv_categories_5_0= ruleCategory )
                    // InternalIshikawa.g:137:6: lv_categories_5_0= ruleCategory
                    {

                    						newCompositeNode(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_categories_5_0=ruleCategory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectRule());
                    						}
                    						add(
                    							current,
                    							"categories",
                    							lv_categories_5_0,
                    							"ishikawa.Ishikawa.Category");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIshikawa.g:154:4: ( (lv_categories_6_0= ruleCategory ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalIshikawa.g:155:5: (lv_categories_6_0= ruleCategory )
                    	    {
                    	    // InternalIshikawa.g:155:5: (lv_categories_6_0= ruleCategory )
                    	    // InternalIshikawa.g:156:6: lv_categories_6_0= ruleCategory
                    	    {

                    	    						newCompositeNode(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_categories_6_0=ruleCategory();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEffectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"categories",
                    	    							lv_categories_6_0,
                    	    							"ishikawa.Ishikawa.Category");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleCategory"
    // InternalIshikawa.g:178:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalIshikawa.g:178:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalIshikawa.g:179:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalIshikawa.g:185:1: ruleCategory returns [EObject current=null] : ( () otherlv_1= 'Category' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )? ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_causes_6_0 = null;

        EObject lv_causes_8_0 = null;



        	enterRule();

        try {
            // InternalIshikawa.g:191:2: ( ( () otherlv_1= 'Category' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )? ) )
            // InternalIshikawa.g:192:2: ( () otherlv_1= 'Category' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )? )
            {
            // InternalIshikawa.g:192:2: ( () otherlv_1= 'Category' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )? )
            // InternalIshikawa.g:193:3: () otherlv_1= 'Category' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )?
            {
            // InternalIshikawa.g:193:3: ()
            // InternalIshikawa.g:194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCategoryAccess().getCategoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
            		
            // InternalIshikawa.g:204:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIshikawa.g:205:4: (lv_name_2_0= ruleEString )
            {
            // InternalIshikawa.g:205:4: (lv_name_2_0= ruleEString )
            // InternalIshikawa.g:206:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ishikawa.Ishikawa.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIshikawa.g:223:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIshikawa.g:224:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIshikawa.g:228:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIshikawa.g:229:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIshikawa.g:229:5: (lv_description_4_0= ruleEString )
                    // InternalIshikawa.g:230:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCategoryRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"ishikawa.Ishikawa.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIshikawa.g:248:3: (otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIshikawa.g:249:4: otherlv_5= '->' ( (lv_causes_6_0= ruleCause ) ) (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                    			
                    // InternalIshikawa.g:253:4: ( (lv_causes_6_0= ruleCause ) )
                    // InternalIshikawa.g:254:5: (lv_causes_6_0= ruleCause )
                    {
                    // InternalIshikawa.g:254:5: (lv_causes_6_0= ruleCause )
                    // InternalIshikawa.g:255:6: lv_causes_6_0= ruleCause
                    {

                    						newCompositeNode(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_causes_6_0=ruleCause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCategoryRule());
                    						}
                    						add(
                    							current,
                    							"causes",
                    							lv_causes_6_0,
                    							"ishikawa.Ishikawa.Cause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIshikawa.g:272:4: (otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIshikawa.g:273:5: otherlv_7= '->' ( (lv_causes_8_0= ruleCause ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0());
                    	    				
                    	    // InternalIshikawa.g:277:5: ( (lv_causes_8_0= ruleCause ) )
                    	    // InternalIshikawa.g:278:6: (lv_causes_8_0= ruleCause )
                    	    {
                    	    // InternalIshikawa.g:278:6: (lv_causes_8_0= ruleCause )
                    	    // InternalIshikawa.g:279:7: lv_causes_8_0= ruleCause
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_causes_8_0=ruleCause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"causes",
                    	    								lv_causes_8_0,
                    	    								"ishikawa.Ishikawa.Cause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleCause"
    // InternalIshikawa.g:302:1: entryRuleCause returns [EObject current=null] : iv_ruleCause= ruleCause EOF ;
    public final EObject entryRuleCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCause = null;


        try {
            // InternalIshikawa.g:302:46: (iv_ruleCause= ruleCause EOF )
            // InternalIshikawa.g:303:2: iv_ruleCause= ruleCause EOF
            {
             newCompositeNode(grammarAccess.getCauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCause=ruleCause();

            state._fsp--;

             current =iv_ruleCause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCause"


    // $ANTLR start "ruleCause"
    // InternalIshikawa.g:309:1: ruleCause returns [EObject current=null] : ( () otherlv_1= 'Cause' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )? (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_valueOfInterest_6_0 = null;

        EObject lv_subCauses_8_0 = null;

        EObject lv_subCauses_9_0 = null;



        	enterRule();

        try {
            // InternalIshikawa.g:315:2: ( ( () otherlv_1= 'Cause' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )? (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )? ) )
            // InternalIshikawa.g:316:2: ( () otherlv_1= 'Cause' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )? (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )? )
            {
            // InternalIshikawa.g:316:2: ( () otherlv_1= 'Cause' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )? (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )? )
            // InternalIshikawa.g:317:3: () otherlv_1= 'Cause' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )? (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )?
            {
            // InternalIshikawa.g:317:3: ()
            // InternalIshikawa.g:318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCauseAccess().getCauseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCauseAccess().getCauseKeyword_1());
            		
            // InternalIshikawa.g:328:3: ( (lv_name_2_0= ruleEString ) )
            // InternalIshikawa.g:329:4: (lv_name_2_0= ruleEString )
            {
            // InternalIshikawa.g:329:4: (lv_name_2_0= ruleEString )
            // InternalIshikawa.g:330:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCauseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ishikawa.Ishikawa.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIshikawa.g:347:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIshikawa.g:348:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCauseAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalIshikawa.g:352:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalIshikawa.g:353:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalIshikawa.g:353:5: (lv_description_4_0= ruleEString )
                    // InternalIshikawa.g:354:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCauseAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCauseRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"ishikawa.Ishikawa.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIshikawa.g:372:3: (otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIshikawa.g:373:4: otherlv_5= 'valueOfInterest' ( (lv_valueOfInterest_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCauseAccess().getValueOfInterestKeyword_4_0());
                    			
                    // InternalIshikawa.g:377:4: ( (lv_valueOfInterest_6_0= ruleEString ) )
                    // InternalIshikawa.g:378:5: (lv_valueOfInterest_6_0= ruleEString )
                    {
                    // InternalIshikawa.g:378:5: (lv_valueOfInterest_6_0= ruleEString )
                    // InternalIshikawa.g:379:6: lv_valueOfInterest_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCauseAccess().getValueOfInterestEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_valueOfInterest_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCauseRule());
                    						}
                    						set(
                    							current,
                    							"valueOfInterest",
                    							lv_valueOfInterest_6_0,
                    							"ishikawa.Ishikawa.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIshikawa.g:397:3: (otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIshikawa.g:398:4: otherlv_7= '{' ( (lv_subCauses_8_0= ruleCause ) ) ( (lv_subCauses_9_0= ruleCause ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getCauseAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalIshikawa.g:402:4: ( (lv_subCauses_8_0= ruleCause ) )
                    // InternalIshikawa.g:403:5: (lv_subCauses_8_0= ruleCause )
                    {
                    // InternalIshikawa.g:403:5: (lv_subCauses_8_0= ruleCause )
                    // InternalIshikawa.g:404:6: lv_subCauses_8_0= ruleCause
                    {

                    						newCompositeNode(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_subCauses_8_0=ruleCause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCauseRule());
                    						}
                    						add(
                    							current,
                    							"subCauses",
                    							lv_subCauses_8_0,
                    							"ishikawa.Ishikawa.Cause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIshikawa.g:421:4: ( (lv_subCauses_9_0= ruleCause ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIshikawa.g:422:5: (lv_subCauses_9_0= ruleCause )
                    	    {
                    	    // InternalIshikawa.g:422:5: (lv_subCauses_9_0= ruleCause )
                    	    // InternalIshikawa.g:423:6: lv_subCauses_9_0= ruleCause
                    	    {

                    	    						newCompositeNode(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_subCauses_9_0=ruleCause();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCauseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subCauses",
                    	    							lv_subCauses_9_0,
                    	    							"ishikawa.Ishikawa.Cause");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getCauseAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCause"


    // $ANTLR start "entryRuleEString"
    // InternalIshikawa.g:449:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalIshikawa.g:449:47: (iv_ruleEString= ruleEString EOF )
            // InternalIshikawa.g:450:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalIshikawa.g:456:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalIshikawa.g:462:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalIshikawa.g:463:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalIshikawa.g:463:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIshikawa.g:464:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIshikawa.g:472:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000120000L});

}