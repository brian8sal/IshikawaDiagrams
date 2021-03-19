package ishikawa.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ishikawa.services.IshikawaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIshikawaParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(IshikawaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEffect"
    // InternalIshikawa.g:53:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalIshikawa.g:54:1: ( ruleEffect EOF )
            // InternalIshikawa.g:55:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalIshikawa.g:62:1: ruleEffect : ( ( rule__Effect__Group__0 ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:66:2: ( ( ( rule__Effect__Group__0 ) ) )
            // InternalIshikawa.g:67:2: ( ( rule__Effect__Group__0 ) )
            {
            // InternalIshikawa.g:67:2: ( ( rule__Effect__Group__0 ) )
            // InternalIshikawa.g:68:3: ( rule__Effect__Group__0 )
            {
             before(grammarAccess.getEffectAccess().getGroup()); 
            // InternalIshikawa.g:69:3: ( rule__Effect__Group__0 )
            // InternalIshikawa.g:69:4: rule__Effect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleCategory"
    // InternalIshikawa.g:78:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalIshikawa.g:79:1: ( ruleCategory EOF )
            // InternalIshikawa.g:80:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalIshikawa.g:87:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:91:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalIshikawa.g:92:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalIshikawa.g:92:2: ( ( rule__Category__Group__0 ) )
            // InternalIshikawa.g:93:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalIshikawa.g:94:3: ( rule__Category__Group__0 )
            // InternalIshikawa.g:94:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleCause"
    // InternalIshikawa.g:103:1: entryRuleCause : ruleCause EOF ;
    public final void entryRuleCause() throws RecognitionException {
        try {
            // InternalIshikawa.g:104:1: ( ruleCause EOF )
            // InternalIshikawa.g:105:1: ruleCause EOF
            {
             before(grammarAccess.getCauseRule()); 
            pushFollow(FOLLOW_1);
            ruleCause();

            state._fsp--;

             after(grammarAccess.getCauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCause"


    // $ANTLR start "ruleCause"
    // InternalIshikawa.g:112:1: ruleCause : ( ( rule__Cause__Group__0 ) ) ;
    public final void ruleCause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:116:2: ( ( ( rule__Cause__Group__0 ) ) )
            // InternalIshikawa.g:117:2: ( ( rule__Cause__Group__0 ) )
            {
            // InternalIshikawa.g:117:2: ( ( rule__Cause__Group__0 ) )
            // InternalIshikawa.g:118:3: ( rule__Cause__Group__0 )
            {
             before(grammarAccess.getCauseAccess().getGroup()); 
            // InternalIshikawa.g:119:3: ( rule__Cause__Group__0 )
            // InternalIshikawa.g:119:4: rule__Cause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCause"


    // $ANTLR start "entryRuleEString"
    // InternalIshikawa.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalIshikawa.g:129:1: ( ruleEString EOF )
            // InternalIshikawa.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalIshikawa.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalIshikawa.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalIshikawa.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalIshikawa.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalIshikawa.g:144:3: ( rule__EString__Alternatives )
            // InternalIshikawa.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalIshikawa.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalIshikawa.g:157:2: ( RULE_STRING )
                    {
                    // InternalIshikawa.g:157:2: ( RULE_STRING )
                    // InternalIshikawa.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIshikawa.g:163:2: ( RULE_ID )
                    {
                    // InternalIshikawa.g:163:2: ( RULE_ID )
                    // InternalIshikawa.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Effect__Group__0"
    // InternalIshikawa.g:173:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:177:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // InternalIshikawa.g:178:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0"


    // $ANTLR start "rule__Effect__Group__0__Impl"
    // InternalIshikawa.g:185:1: rule__Effect__Group__0__Impl : ( () ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:189:1: ( ( () ) )
            // InternalIshikawa.g:190:1: ( () )
            {
            // InternalIshikawa.g:190:1: ( () )
            // InternalIshikawa.g:191:2: ()
            {
             before(grammarAccess.getEffectAccess().getEffectAction_0()); 
            // InternalIshikawa.g:192:2: ()
            // InternalIshikawa.g:192:3: 
            {
            }

             after(grammarAccess.getEffectAccess().getEffectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0__Impl"


    // $ANTLR start "rule__Effect__Group__1"
    // InternalIshikawa.g:200:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl rule__Effect__Group__2 ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:204:1: ( rule__Effect__Group__1__Impl rule__Effect__Group__2 )
            // InternalIshikawa.g:205:2: rule__Effect__Group__1__Impl rule__Effect__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Effect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1"


    // $ANTLR start "rule__Effect__Group__1__Impl"
    // InternalIshikawa.g:212:1: rule__Effect__Group__1__Impl : ( 'Effect' ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:216:1: ( ( 'Effect' ) )
            // InternalIshikawa.g:217:1: ( 'Effect' )
            {
            // InternalIshikawa.g:217:1: ( 'Effect' )
            // InternalIshikawa.g:218:2: 'Effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getEffectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__2"
    // InternalIshikawa.g:227:1: rule__Effect__Group__2 : rule__Effect__Group__2__Impl rule__Effect__Group__3 ;
    public final void rule__Effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:231:1: ( rule__Effect__Group__2__Impl rule__Effect__Group__3 )
            // InternalIshikawa.g:232:2: rule__Effect__Group__2__Impl rule__Effect__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Effect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2"


    // $ANTLR start "rule__Effect__Group__2__Impl"
    // InternalIshikawa.g:239:1: rule__Effect__Group__2__Impl : ( ( rule__Effect__NameAssignment_2 ) ) ;
    public final void rule__Effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:243:1: ( ( ( rule__Effect__NameAssignment_2 ) ) )
            // InternalIshikawa.g:244:1: ( ( rule__Effect__NameAssignment_2 ) )
            {
            // InternalIshikawa.g:244:1: ( ( rule__Effect__NameAssignment_2 ) )
            // InternalIshikawa.g:245:2: ( rule__Effect__NameAssignment_2 )
            {
             before(grammarAccess.getEffectAccess().getNameAssignment_2()); 
            // InternalIshikawa.g:246:2: ( rule__Effect__NameAssignment_2 )
            // InternalIshikawa.g:246:3: rule__Effect__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Effect__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2__Impl"


    // $ANTLR start "rule__Effect__Group__3"
    // InternalIshikawa.g:254:1: rule__Effect__Group__3 : rule__Effect__Group__3__Impl rule__Effect__Group__4 ;
    public final void rule__Effect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:258:1: ( rule__Effect__Group__3__Impl rule__Effect__Group__4 )
            // InternalIshikawa.g:259:2: rule__Effect__Group__3__Impl rule__Effect__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Effect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__3"


    // $ANTLR start "rule__Effect__Group__3__Impl"
    // InternalIshikawa.g:266:1: rule__Effect__Group__3__Impl : ( ( rule__Effect__Group_3__0 )? ) ;
    public final void rule__Effect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:270:1: ( ( ( rule__Effect__Group_3__0 )? ) )
            // InternalIshikawa.g:271:1: ( ( rule__Effect__Group_3__0 )? )
            {
            // InternalIshikawa.g:271:1: ( ( rule__Effect__Group_3__0 )? )
            // InternalIshikawa.g:272:2: ( rule__Effect__Group_3__0 )?
            {
             before(grammarAccess.getEffectAccess().getGroup_3()); 
            // InternalIshikawa.g:273:2: ( rule__Effect__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIshikawa.g:273:3: rule__Effect__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Effect__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__3__Impl"


    // $ANTLR start "rule__Effect__Group__4"
    // InternalIshikawa.g:281:1: rule__Effect__Group__4 : rule__Effect__Group__4__Impl ;
    public final void rule__Effect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:285:1: ( rule__Effect__Group__4__Impl )
            // InternalIshikawa.g:286:2: rule__Effect__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__4"


    // $ANTLR start "rule__Effect__Group__4__Impl"
    // InternalIshikawa.g:292:1: rule__Effect__Group__4__Impl : ( ( rule__Effect__Group_4__0 )? ) ;
    public final void rule__Effect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:296:1: ( ( ( rule__Effect__Group_4__0 )? ) )
            // InternalIshikawa.g:297:1: ( ( rule__Effect__Group_4__0 )? )
            {
            // InternalIshikawa.g:297:1: ( ( rule__Effect__Group_4__0 )? )
            // InternalIshikawa.g:298:2: ( rule__Effect__Group_4__0 )?
            {
             before(grammarAccess.getEffectAccess().getGroup_4()); 
            // InternalIshikawa.g:299:2: ( rule__Effect__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIshikawa.g:299:3: rule__Effect__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Effect__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__4__Impl"


    // $ANTLR start "rule__Effect__Group_3__0"
    // InternalIshikawa.g:308:1: rule__Effect__Group_3__0 : rule__Effect__Group_3__0__Impl rule__Effect__Group_3__1 ;
    public final void rule__Effect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:312:1: ( rule__Effect__Group_3__0__Impl rule__Effect__Group_3__1 )
            // InternalIshikawa.g:313:2: rule__Effect__Group_3__0__Impl rule__Effect__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Effect__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_3__0"


    // $ANTLR start "rule__Effect__Group_3__0__Impl"
    // InternalIshikawa.g:320:1: rule__Effect__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Effect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:324:1: ( ( 'description' ) )
            // InternalIshikawa.g:325:1: ( 'description' )
            {
            // InternalIshikawa.g:325:1: ( 'description' )
            // InternalIshikawa.g:326:2: 'description'
            {
             before(grammarAccess.getEffectAccess().getDescriptionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_3__0__Impl"


    // $ANTLR start "rule__Effect__Group_3__1"
    // InternalIshikawa.g:335:1: rule__Effect__Group_3__1 : rule__Effect__Group_3__1__Impl ;
    public final void rule__Effect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:339:1: ( rule__Effect__Group_3__1__Impl )
            // InternalIshikawa.g:340:2: rule__Effect__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_3__1"


    // $ANTLR start "rule__Effect__Group_3__1__Impl"
    // InternalIshikawa.g:346:1: rule__Effect__Group_3__1__Impl : ( ( rule__Effect__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Effect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:350:1: ( ( ( rule__Effect__DescriptionAssignment_3_1 ) ) )
            // InternalIshikawa.g:351:1: ( ( rule__Effect__DescriptionAssignment_3_1 ) )
            {
            // InternalIshikawa.g:351:1: ( ( rule__Effect__DescriptionAssignment_3_1 ) )
            // InternalIshikawa.g:352:2: ( rule__Effect__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getEffectAccess().getDescriptionAssignment_3_1()); 
            // InternalIshikawa.g:353:2: ( rule__Effect__DescriptionAssignment_3_1 )
            // InternalIshikawa.g:353:3: rule__Effect__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Effect__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_3__1__Impl"


    // $ANTLR start "rule__Effect__Group_4__0"
    // InternalIshikawa.g:362:1: rule__Effect__Group_4__0 : rule__Effect__Group_4__0__Impl rule__Effect__Group_4__1 ;
    public final void rule__Effect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:366:1: ( rule__Effect__Group_4__0__Impl rule__Effect__Group_4__1 )
            // InternalIshikawa.g:367:2: rule__Effect__Group_4__0__Impl rule__Effect__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Effect__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_4__0"


    // $ANTLR start "rule__Effect__Group_4__0__Impl"
    // InternalIshikawa.g:374:1: rule__Effect__Group_4__0__Impl : ( ( rule__Effect__CategoriesAssignment_4_0 ) ) ;
    public final void rule__Effect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:378:1: ( ( ( rule__Effect__CategoriesAssignment_4_0 ) ) )
            // InternalIshikawa.g:379:1: ( ( rule__Effect__CategoriesAssignment_4_0 ) )
            {
            // InternalIshikawa.g:379:1: ( ( rule__Effect__CategoriesAssignment_4_0 ) )
            // InternalIshikawa.g:380:2: ( rule__Effect__CategoriesAssignment_4_0 )
            {
             before(grammarAccess.getEffectAccess().getCategoriesAssignment_4_0()); 
            // InternalIshikawa.g:381:2: ( rule__Effect__CategoriesAssignment_4_0 )
            // InternalIshikawa.g:381:3: rule__Effect__CategoriesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Effect__CategoriesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getCategoriesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_4__0__Impl"


    // $ANTLR start "rule__Effect__Group_4__1"
    // InternalIshikawa.g:389:1: rule__Effect__Group_4__1 : rule__Effect__Group_4__1__Impl ;
    public final void rule__Effect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:393:1: ( rule__Effect__Group_4__1__Impl )
            // InternalIshikawa.g:394:2: rule__Effect__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_4__1"


    // $ANTLR start "rule__Effect__Group_4__1__Impl"
    // InternalIshikawa.g:400:1: rule__Effect__Group_4__1__Impl : ( ( rule__Effect__CategoriesAssignment_4_1 )* ) ;
    public final void rule__Effect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:404:1: ( ( ( rule__Effect__CategoriesAssignment_4_1 )* ) )
            // InternalIshikawa.g:405:1: ( ( rule__Effect__CategoriesAssignment_4_1 )* )
            {
            // InternalIshikawa.g:405:1: ( ( rule__Effect__CategoriesAssignment_4_1 )* )
            // InternalIshikawa.g:406:2: ( rule__Effect__CategoriesAssignment_4_1 )*
            {
             before(grammarAccess.getEffectAccess().getCategoriesAssignment_4_1()); 
            // InternalIshikawa.g:407:2: ( rule__Effect__CategoriesAssignment_4_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIshikawa.g:407:3: rule__Effect__CategoriesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Effect__CategoriesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEffectAccess().getCategoriesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_4__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalIshikawa.g:416:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:420:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalIshikawa.g:421:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalIshikawa.g:428:1: rule__Category__Group__0__Impl : ( () ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:432:1: ( ( () ) )
            // InternalIshikawa.g:433:1: ( () )
            {
            // InternalIshikawa.g:433:1: ( () )
            // InternalIshikawa.g:434:2: ()
            {
             before(grammarAccess.getCategoryAccess().getCategoryAction_0()); 
            // InternalIshikawa.g:435:2: ()
            // InternalIshikawa.g:435:3: 
            {
            }

             after(grammarAccess.getCategoryAccess().getCategoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalIshikawa.g:443:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:447:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // InternalIshikawa.g:448:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalIshikawa.g:455:1: rule__Category__Group__1__Impl : ( 'Category' ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:459:1: ( ( 'Category' ) )
            // InternalIshikawa.g:460:1: ( 'Category' )
            {
            // InternalIshikawa.g:460:1: ( 'Category' )
            // InternalIshikawa.g:461:2: 'Category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // InternalIshikawa.g:470:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:474:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // InternalIshikawa.g:475:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // InternalIshikawa.g:482:1: rule__Category__Group__2__Impl : ( ( rule__Category__NameAssignment_2 ) ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:486:1: ( ( ( rule__Category__NameAssignment_2 ) ) )
            // InternalIshikawa.g:487:1: ( ( rule__Category__NameAssignment_2 ) )
            {
            // InternalIshikawa.g:487:1: ( ( rule__Category__NameAssignment_2 ) )
            // InternalIshikawa.g:488:2: ( rule__Category__NameAssignment_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_2()); 
            // InternalIshikawa.g:489:2: ( rule__Category__NameAssignment_2 )
            // InternalIshikawa.g:489:3: rule__Category__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // InternalIshikawa.g:497:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:501:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // InternalIshikawa.g:502:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // InternalIshikawa.g:509:1: rule__Category__Group__3__Impl : ( ( rule__Category__Group_3__0 )? ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:513:1: ( ( ( rule__Category__Group_3__0 )? ) )
            // InternalIshikawa.g:514:1: ( ( rule__Category__Group_3__0 )? )
            {
            // InternalIshikawa.g:514:1: ( ( rule__Category__Group_3__0 )? )
            // InternalIshikawa.g:515:2: ( rule__Category__Group_3__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_3()); 
            // InternalIshikawa.g:516:2: ( rule__Category__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIshikawa.g:516:3: rule__Category__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group__4"
    // InternalIshikawa.g:524:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:528:1: ( rule__Category__Group__4__Impl )
            // InternalIshikawa.g:529:2: rule__Category__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // InternalIshikawa.g:535:1: rule__Category__Group__4__Impl : ( ( rule__Category__Group_4__0 )? ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:539:1: ( ( ( rule__Category__Group_4__0 )? ) )
            // InternalIshikawa.g:540:1: ( ( rule__Category__Group_4__0 )? )
            {
            // InternalIshikawa.g:540:1: ( ( rule__Category__Group_4__0 )? )
            // InternalIshikawa.g:541:2: ( rule__Category__Group_4__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_4()); 
            // InternalIshikawa.g:542:2: ( rule__Category__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIshikawa.g:542:3: rule__Category__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Category__Group_3__0"
    // InternalIshikawa.g:551:1: rule__Category__Group_3__0 : rule__Category__Group_3__0__Impl rule__Category__Group_3__1 ;
    public final void rule__Category__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:555:1: ( rule__Category__Group_3__0__Impl rule__Category__Group_3__1 )
            // InternalIshikawa.g:556:2: rule__Category__Group_3__0__Impl rule__Category__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_3__0"


    // $ANTLR start "rule__Category__Group_3__0__Impl"
    // InternalIshikawa.g:563:1: rule__Category__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Category__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:567:1: ( ( 'description' ) )
            // InternalIshikawa.g:568:1: ( 'description' )
            {
            // InternalIshikawa.g:568:1: ( 'description' )
            // InternalIshikawa.g:569:2: 'description'
            {
             before(grammarAccess.getCategoryAccess().getDescriptionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_3__0__Impl"


    // $ANTLR start "rule__Category__Group_3__1"
    // InternalIshikawa.g:578:1: rule__Category__Group_3__1 : rule__Category__Group_3__1__Impl ;
    public final void rule__Category__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:582:1: ( rule__Category__Group_3__1__Impl )
            // InternalIshikawa.g:583:2: rule__Category__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_3__1"


    // $ANTLR start "rule__Category__Group_3__1__Impl"
    // InternalIshikawa.g:589:1: rule__Category__Group_3__1__Impl : ( ( rule__Category__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Category__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:593:1: ( ( ( rule__Category__DescriptionAssignment_3_1 ) ) )
            // InternalIshikawa.g:594:1: ( ( rule__Category__DescriptionAssignment_3_1 ) )
            {
            // InternalIshikawa.g:594:1: ( ( rule__Category__DescriptionAssignment_3_1 ) )
            // InternalIshikawa.g:595:2: ( rule__Category__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCategoryAccess().getDescriptionAssignment_3_1()); 
            // InternalIshikawa.g:596:2: ( rule__Category__DescriptionAssignment_3_1 )
            // InternalIshikawa.g:596:3: rule__Category__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_3__1__Impl"


    // $ANTLR start "rule__Category__Group_4__0"
    // InternalIshikawa.g:605:1: rule__Category__Group_4__0 : rule__Category__Group_4__0__Impl rule__Category__Group_4__1 ;
    public final void rule__Category__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:609:1: ( rule__Category__Group_4__0__Impl rule__Category__Group_4__1 )
            // InternalIshikawa.g:610:2: rule__Category__Group_4__0__Impl rule__Category__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Category__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__0"


    // $ANTLR start "rule__Category__Group_4__0__Impl"
    // InternalIshikawa.g:617:1: rule__Category__Group_4__0__Impl : ( '->' ) ;
    public final void rule__Category__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:621:1: ( ( '->' ) )
            // InternalIshikawa.g:622:1: ( '->' )
            {
            // InternalIshikawa.g:622:1: ( '->' )
            // InternalIshikawa.g:623:2: '->'
            {
             before(grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__0__Impl"


    // $ANTLR start "rule__Category__Group_4__1"
    // InternalIshikawa.g:632:1: rule__Category__Group_4__1 : rule__Category__Group_4__1__Impl rule__Category__Group_4__2 ;
    public final void rule__Category__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:636:1: ( rule__Category__Group_4__1__Impl rule__Category__Group_4__2 )
            // InternalIshikawa.g:637:2: rule__Category__Group_4__1__Impl rule__Category__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Category__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__1"


    // $ANTLR start "rule__Category__Group_4__1__Impl"
    // InternalIshikawa.g:644:1: rule__Category__Group_4__1__Impl : ( ( rule__Category__CausesAssignment_4_1 ) ) ;
    public final void rule__Category__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:648:1: ( ( ( rule__Category__CausesAssignment_4_1 ) ) )
            // InternalIshikawa.g:649:1: ( ( rule__Category__CausesAssignment_4_1 ) )
            {
            // InternalIshikawa.g:649:1: ( ( rule__Category__CausesAssignment_4_1 ) )
            // InternalIshikawa.g:650:2: ( rule__Category__CausesAssignment_4_1 )
            {
             before(grammarAccess.getCategoryAccess().getCausesAssignment_4_1()); 
            // InternalIshikawa.g:651:2: ( rule__Category__CausesAssignment_4_1 )
            // InternalIshikawa.g:651:3: rule__Category__CausesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__CausesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getCausesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__1__Impl"


    // $ANTLR start "rule__Category__Group_4__2"
    // InternalIshikawa.g:659:1: rule__Category__Group_4__2 : rule__Category__Group_4__2__Impl ;
    public final void rule__Category__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:663:1: ( rule__Category__Group_4__2__Impl )
            // InternalIshikawa.g:664:2: rule__Category__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__2"


    // $ANTLR start "rule__Category__Group_4__2__Impl"
    // InternalIshikawa.g:670:1: rule__Category__Group_4__2__Impl : ( ( rule__Category__Group_4_2__0 )* ) ;
    public final void rule__Category__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:674:1: ( ( ( rule__Category__Group_4_2__0 )* ) )
            // InternalIshikawa.g:675:1: ( ( rule__Category__Group_4_2__0 )* )
            {
            // InternalIshikawa.g:675:1: ( ( rule__Category__Group_4_2__0 )* )
            // InternalIshikawa.g:676:2: ( rule__Category__Group_4_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_4_2()); 
            // InternalIshikawa.g:677:2: ( rule__Category__Group_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIshikawa.g:677:3: rule__Category__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Category__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4__2__Impl"


    // $ANTLR start "rule__Category__Group_4_2__0"
    // InternalIshikawa.g:686:1: rule__Category__Group_4_2__0 : rule__Category__Group_4_2__0__Impl rule__Category__Group_4_2__1 ;
    public final void rule__Category__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:690:1: ( rule__Category__Group_4_2__0__Impl rule__Category__Group_4_2__1 )
            // InternalIshikawa.g:691:2: rule__Category__Group_4_2__0__Impl rule__Category__Group_4_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Category__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4_2__0"


    // $ANTLR start "rule__Category__Group_4_2__0__Impl"
    // InternalIshikawa.g:698:1: rule__Category__Group_4_2__0__Impl : ( '->' ) ;
    public final void rule__Category__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:702:1: ( ( '->' ) )
            // InternalIshikawa.g:703:1: ( '->' )
            {
            // InternalIshikawa.g:703:1: ( '->' )
            // InternalIshikawa.g:704:2: '->'
            {
             before(grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4_2__0__Impl"


    // $ANTLR start "rule__Category__Group_4_2__1"
    // InternalIshikawa.g:713:1: rule__Category__Group_4_2__1 : rule__Category__Group_4_2__1__Impl ;
    public final void rule__Category__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:717:1: ( rule__Category__Group_4_2__1__Impl )
            // InternalIshikawa.g:718:2: rule__Category__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4_2__1"


    // $ANTLR start "rule__Category__Group_4_2__1__Impl"
    // InternalIshikawa.g:724:1: rule__Category__Group_4_2__1__Impl : ( ( rule__Category__CausesAssignment_4_2_1 ) ) ;
    public final void rule__Category__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:728:1: ( ( ( rule__Category__CausesAssignment_4_2_1 ) ) )
            // InternalIshikawa.g:729:1: ( ( rule__Category__CausesAssignment_4_2_1 ) )
            {
            // InternalIshikawa.g:729:1: ( ( rule__Category__CausesAssignment_4_2_1 ) )
            // InternalIshikawa.g:730:2: ( rule__Category__CausesAssignment_4_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getCausesAssignment_4_2_1()); 
            // InternalIshikawa.g:731:2: ( rule__Category__CausesAssignment_4_2_1 )
            // InternalIshikawa.g:731:3: rule__Category__CausesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__CausesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getCausesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_4_2__1__Impl"


    // $ANTLR start "rule__Cause__Group__0"
    // InternalIshikawa.g:740:1: rule__Cause__Group__0 : rule__Cause__Group__0__Impl rule__Cause__Group__1 ;
    public final void rule__Cause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:744:1: ( rule__Cause__Group__0__Impl rule__Cause__Group__1 )
            // InternalIshikawa.g:745:2: rule__Cause__Group__0__Impl rule__Cause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Cause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__0"


    // $ANTLR start "rule__Cause__Group__0__Impl"
    // InternalIshikawa.g:752:1: rule__Cause__Group__0__Impl : ( () ) ;
    public final void rule__Cause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:756:1: ( ( () ) )
            // InternalIshikawa.g:757:1: ( () )
            {
            // InternalIshikawa.g:757:1: ( () )
            // InternalIshikawa.g:758:2: ()
            {
             before(grammarAccess.getCauseAccess().getCauseAction_0()); 
            // InternalIshikawa.g:759:2: ()
            // InternalIshikawa.g:759:3: 
            {
            }

             after(grammarAccess.getCauseAccess().getCauseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__0__Impl"


    // $ANTLR start "rule__Cause__Group__1"
    // InternalIshikawa.g:767:1: rule__Cause__Group__1 : rule__Cause__Group__1__Impl rule__Cause__Group__2 ;
    public final void rule__Cause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:771:1: ( rule__Cause__Group__1__Impl rule__Cause__Group__2 )
            // InternalIshikawa.g:772:2: rule__Cause__Group__1__Impl rule__Cause__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Cause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__1"


    // $ANTLR start "rule__Cause__Group__1__Impl"
    // InternalIshikawa.g:779:1: rule__Cause__Group__1__Impl : ( 'Cause' ) ;
    public final void rule__Cause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:783:1: ( ( 'Cause' ) )
            // InternalIshikawa.g:784:1: ( 'Cause' )
            {
            // InternalIshikawa.g:784:1: ( 'Cause' )
            // InternalIshikawa.g:785:2: 'Cause'
            {
             before(grammarAccess.getCauseAccess().getCauseKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCauseAccess().getCauseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__1__Impl"


    // $ANTLR start "rule__Cause__Group__2"
    // InternalIshikawa.g:794:1: rule__Cause__Group__2 : rule__Cause__Group__2__Impl rule__Cause__Group__3 ;
    public final void rule__Cause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:798:1: ( rule__Cause__Group__2__Impl rule__Cause__Group__3 )
            // InternalIshikawa.g:799:2: rule__Cause__Group__2__Impl rule__Cause__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Cause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__2"


    // $ANTLR start "rule__Cause__Group__2__Impl"
    // InternalIshikawa.g:806:1: rule__Cause__Group__2__Impl : ( ( rule__Cause__NameAssignment_2 ) ) ;
    public final void rule__Cause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:810:1: ( ( ( rule__Cause__NameAssignment_2 ) ) )
            // InternalIshikawa.g:811:1: ( ( rule__Cause__NameAssignment_2 ) )
            {
            // InternalIshikawa.g:811:1: ( ( rule__Cause__NameAssignment_2 ) )
            // InternalIshikawa.g:812:2: ( rule__Cause__NameAssignment_2 )
            {
             before(grammarAccess.getCauseAccess().getNameAssignment_2()); 
            // InternalIshikawa.g:813:2: ( rule__Cause__NameAssignment_2 )
            // InternalIshikawa.g:813:3: rule__Cause__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cause__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCauseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__2__Impl"


    // $ANTLR start "rule__Cause__Group__3"
    // InternalIshikawa.g:821:1: rule__Cause__Group__3 : rule__Cause__Group__3__Impl rule__Cause__Group__4 ;
    public final void rule__Cause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:825:1: ( rule__Cause__Group__3__Impl rule__Cause__Group__4 )
            // InternalIshikawa.g:826:2: rule__Cause__Group__3__Impl rule__Cause__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Cause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__3"


    // $ANTLR start "rule__Cause__Group__3__Impl"
    // InternalIshikawa.g:833:1: rule__Cause__Group__3__Impl : ( ( rule__Cause__Group_3__0 )? ) ;
    public final void rule__Cause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:837:1: ( ( ( rule__Cause__Group_3__0 )? ) )
            // InternalIshikawa.g:838:1: ( ( rule__Cause__Group_3__0 )? )
            {
            // InternalIshikawa.g:838:1: ( ( rule__Cause__Group_3__0 )? )
            // InternalIshikawa.g:839:2: ( rule__Cause__Group_3__0 )?
            {
             before(grammarAccess.getCauseAccess().getGroup_3()); 
            // InternalIshikawa.g:840:2: ( rule__Cause__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIshikawa.g:840:3: rule__Cause__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cause__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__3__Impl"


    // $ANTLR start "rule__Cause__Group__4"
    // InternalIshikawa.g:848:1: rule__Cause__Group__4 : rule__Cause__Group__4__Impl rule__Cause__Group__5 ;
    public final void rule__Cause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:852:1: ( rule__Cause__Group__4__Impl rule__Cause__Group__5 )
            // InternalIshikawa.g:853:2: rule__Cause__Group__4__Impl rule__Cause__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Cause__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__4"


    // $ANTLR start "rule__Cause__Group__4__Impl"
    // InternalIshikawa.g:860:1: rule__Cause__Group__4__Impl : ( ( rule__Cause__Group_4__0 )? ) ;
    public final void rule__Cause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:864:1: ( ( ( rule__Cause__Group_4__0 )? ) )
            // InternalIshikawa.g:865:1: ( ( rule__Cause__Group_4__0 )? )
            {
            // InternalIshikawa.g:865:1: ( ( rule__Cause__Group_4__0 )? )
            // InternalIshikawa.g:866:2: ( rule__Cause__Group_4__0 )?
            {
             before(grammarAccess.getCauseAccess().getGroup_4()); 
            // InternalIshikawa.g:867:2: ( rule__Cause__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIshikawa.g:867:3: rule__Cause__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cause__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCauseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__4__Impl"


    // $ANTLR start "rule__Cause__Group__5"
    // InternalIshikawa.g:875:1: rule__Cause__Group__5 : rule__Cause__Group__5__Impl ;
    public final void rule__Cause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:879:1: ( rule__Cause__Group__5__Impl )
            // InternalIshikawa.g:880:2: rule__Cause__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cause__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__5"


    // $ANTLR start "rule__Cause__Group__5__Impl"
    // InternalIshikawa.g:886:1: rule__Cause__Group__5__Impl : ( ( rule__Cause__Group_5__0 )? ) ;
    public final void rule__Cause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:890:1: ( ( ( rule__Cause__Group_5__0 )? ) )
            // InternalIshikawa.g:891:1: ( ( rule__Cause__Group_5__0 )? )
            {
            // InternalIshikawa.g:891:1: ( ( rule__Cause__Group_5__0 )? )
            // InternalIshikawa.g:892:2: ( rule__Cause__Group_5__0 )?
            {
             before(grammarAccess.getCauseAccess().getGroup_5()); 
            // InternalIshikawa.g:893:2: ( rule__Cause__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIshikawa.g:893:3: rule__Cause__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cause__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCauseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group__5__Impl"


    // $ANTLR start "rule__Cause__Group_3__0"
    // InternalIshikawa.g:902:1: rule__Cause__Group_3__0 : rule__Cause__Group_3__0__Impl rule__Cause__Group_3__1 ;
    public final void rule__Cause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:906:1: ( rule__Cause__Group_3__0__Impl rule__Cause__Group_3__1 )
            // InternalIshikawa.g:907:2: rule__Cause__Group_3__0__Impl rule__Cause__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Cause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_3__0"


    // $ANTLR start "rule__Cause__Group_3__0__Impl"
    // InternalIshikawa.g:914:1: rule__Cause__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Cause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:918:1: ( ( 'description' ) )
            // InternalIshikawa.g:919:1: ( 'description' )
            {
            // InternalIshikawa.g:919:1: ( 'description' )
            // InternalIshikawa.g:920:2: 'description'
            {
             before(grammarAccess.getCauseAccess().getDescriptionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCauseAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_3__0__Impl"


    // $ANTLR start "rule__Cause__Group_3__1"
    // InternalIshikawa.g:929:1: rule__Cause__Group_3__1 : rule__Cause__Group_3__1__Impl ;
    public final void rule__Cause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:933:1: ( rule__Cause__Group_3__1__Impl )
            // InternalIshikawa.g:934:2: rule__Cause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cause__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_3__1"


    // $ANTLR start "rule__Cause__Group_3__1__Impl"
    // InternalIshikawa.g:940:1: rule__Cause__Group_3__1__Impl : ( ( rule__Cause__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Cause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:944:1: ( ( ( rule__Cause__DescriptionAssignment_3_1 ) ) )
            // InternalIshikawa.g:945:1: ( ( rule__Cause__DescriptionAssignment_3_1 ) )
            {
            // InternalIshikawa.g:945:1: ( ( rule__Cause__DescriptionAssignment_3_1 ) )
            // InternalIshikawa.g:946:2: ( rule__Cause__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCauseAccess().getDescriptionAssignment_3_1()); 
            // InternalIshikawa.g:947:2: ( rule__Cause__DescriptionAssignment_3_1 )
            // InternalIshikawa.g:947:3: rule__Cause__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Cause__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCauseAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_3__1__Impl"


    // $ANTLR start "rule__Cause__Group_4__0"
    // InternalIshikawa.g:956:1: rule__Cause__Group_4__0 : rule__Cause__Group_4__0__Impl rule__Cause__Group_4__1 ;
    public final void rule__Cause__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:960:1: ( rule__Cause__Group_4__0__Impl rule__Cause__Group_4__1 )
            // InternalIshikawa.g:961:2: rule__Cause__Group_4__0__Impl rule__Cause__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Cause__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_4__0"


    // $ANTLR start "rule__Cause__Group_4__0__Impl"
    // InternalIshikawa.g:968:1: rule__Cause__Group_4__0__Impl : ( 'valueOfInterest' ) ;
    public final void rule__Cause__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:972:1: ( ( 'valueOfInterest' ) )
            // InternalIshikawa.g:973:1: ( 'valueOfInterest' )
            {
            // InternalIshikawa.g:973:1: ( 'valueOfInterest' )
            // InternalIshikawa.g:974:2: 'valueOfInterest'
            {
             before(grammarAccess.getCauseAccess().getValueOfInterestKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCauseAccess().getValueOfInterestKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_4__0__Impl"


    // $ANTLR start "rule__Cause__Group_4__1"
    // InternalIshikawa.g:983:1: rule__Cause__Group_4__1 : rule__Cause__Group_4__1__Impl ;
    public final void rule__Cause__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:987:1: ( rule__Cause__Group_4__1__Impl )
            // InternalIshikawa.g:988:2: rule__Cause__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cause__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_4__1"


    // $ANTLR start "rule__Cause__Group_4__1__Impl"
    // InternalIshikawa.g:994:1: rule__Cause__Group_4__1__Impl : ( ( rule__Cause__ValueOfInterestAssignment_4_1 ) ) ;
    public final void rule__Cause__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:998:1: ( ( ( rule__Cause__ValueOfInterestAssignment_4_1 ) ) )
            // InternalIshikawa.g:999:1: ( ( rule__Cause__ValueOfInterestAssignment_4_1 ) )
            {
            // InternalIshikawa.g:999:1: ( ( rule__Cause__ValueOfInterestAssignment_4_1 ) )
            // InternalIshikawa.g:1000:2: ( rule__Cause__ValueOfInterestAssignment_4_1 )
            {
             before(grammarAccess.getCauseAccess().getValueOfInterestAssignment_4_1()); 
            // InternalIshikawa.g:1001:2: ( rule__Cause__ValueOfInterestAssignment_4_1 )
            // InternalIshikawa.g:1001:3: rule__Cause__ValueOfInterestAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Cause__ValueOfInterestAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCauseAccess().getValueOfInterestAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_4__1__Impl"


    // $ANTLR start "rule__Cause__Group_5__0"
    // InternalIshikawa.g:1010:1: rule__Cause__Group_5__0 : rule__Cause__Group_5__0__Impl rule__Cause__Group_5__1 ;
    public final void rule__Cause__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1014:1: ( rule__Cause__Group_5__0__Impl rule__Cause__Group_5__1 )
            // InternalIshikawa.g:1015:2: rule__Cause__Group_5__0__Impl rule__Cause__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Cause__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__0"


    // $ANTLR start "rule__Cause__Group_5__0__Impl"
    // InternalIshikawa.g:1022:1: rule__Cause__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Cause__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1026:1: ( ( '{' ) )
            // InternalIshikawa.g:1027:1: ( '{' )
            {
            // InternalIshikawa.g:1027:1: ( '{' )
            // InternalIshikawa.g:1028:2: '{'
            {
             before(grammarAccess.getCauseAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCauseAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__0__Impl"


    // $ANTLR start "rule__Cause__Group_5__1"
    // InternalIshikawa.g:1037:1: rule__Cause__Group_5__1 : rule__Cause__Group_5__1__Impl rule__Cause__Group_5__2 ;
    public final void rule__Cause__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1041:1: ( rule__Cause__Group_5__1__Impl rule__Cause__Group_5__2 )
            // InternalIshikawa.g:1042:2: rule__Cause__Group_5__1__Impl rule__Cause__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__Cause__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__1"


    // $ANTLR start "rule__Cause__Group_5__1__Impl"
    // InternalIshikawa.g:1049:1: rule__Cause__Group_5__1__Impl : ( ( rule__Cause__SubCausesAssignment_5_1 ) ) ;
    public final void rule__Cause__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1053:1: ( ( ( rule__Cause__SubCausesAssignment_5_1 ) ) )
            // InternalIshikawa.g:1054:1: ( ( rule__Cause__SubCausesAssignment_5_1 ) )
            {
            // InternalIshikawa.g:1054:1: ( ( rule__Cause__SubCausesAssignment_5_1 ) )
            // InternalIshikawa.g:1055:2: ( rule__Cause__SubCausesAssignment_5_1 )
            {
             before(grammarAccess.getCauseAccess().getSubCausesAssignment_5_1()); 
            // InternalIshikawa.g:1056:2: ( rule__Cause__SubCausesAssignment_5_1 )
            // InternalIshikawa.g:1056:3: rule__Cause__SubCausesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Cause__SubCausesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCauseAccess().getSubCausesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__1__Impl"


    // $ANTLR start "rule__Cause__Group_5__2"
    // InternalIshikawa.g:1064:1: rule__Cause__Group_5__2 : rule__Cause__Group_5__2__Impl rule__Cause__Group_5__3 ;
    public final void rule__Cause__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1068:1: ( rule__Cause__Group_5__2__Impl rule__Cause__Group_5__3 )
            // InternalIshikawa.g:1069:2: rule__Cause__Group_5__2__Impl rule__Cause__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Cause__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cause__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__2"


    // $ANTLR start "rule__Cause__Group_5__2__Impl"
    // InternalIshikawa.g:1076:1: rule__Cause__Group_5__2__Impl : ( ( rule__Cause__SubCausesAssignment_5_2 )* ) ;
    public final void rule__Cause__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1080:1: ( ( ( rule__Cause__SubCausesAssignment_5_2 )* ) )
            // InternalIshikawa.g:1081:1: ( ( rule__Cause__SubCausesAssignment_5_2 )* )
            {
            // InternalIshikawa.g:1081:1: ( ( rule__Cause__SubCausesAssignment_5_2 )* )
            // InternalIshikawa.g:1082:2: ( rule__Cause__SubCausesAssignment_5_2 )*
            {
             before(grammarAccess.getCauseAccess().getSubCausesAssignment_5_2()); 
            // InternalIshikawa.g:1083:2: ( rule__Cause__SubCausesAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIshikawa.g:1083:3: rule__Cause__SubCausesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Cause__SubCausesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCauseAccess().getSubCausesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__2__Impl"


    // $ANTLR start "rule__Cause__Group_5__3"
    // InternalIshikawa.g:1091:1: rule__Cause__Group_5__3 : rule__Cause__Group_5__3__Impl ;
    public final void rule__Cause__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1095:1: ( rule__Cause__Group_5__3__Impl )
            // InternalIshikawa.g:1096:2: rule__Cause__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cause__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__3"


    // $ANTLR start "rule__Cause__Group_5__3__Impl"
    // InternalIshikawa.g:1102:1: rule__Cause__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Cause__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1106:1: ( ( '}' ) )
            // InternalIshikawa.g:1107:1: ( '}' )
            {
            // InternalIshikawa.g:1107:1: ( '}' )
            // InternalIshikawa.g:1108:2: '}'
            {
             before(grammarAccess.getCauseAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCauseAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__Group_5__3__Impl"


    // $ANTLR start "rule__Effect__NameAssignment_2"
    // InternalIshikawa.g:1118:1: rule__Effect__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Effect__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1122:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1123:2: ( ruleEString )
            {
            // InternalIshikawa.g:1123:2: ( ruleEString )
            // InternalIshikawa.g:1124:3: ruleEString
            {
             before(grammarAccess.getEffectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__NameAssignment_2"


    // $ANTLR start "rule__Effect__DescriptionAssignment_3_1"
    // InternalIshikawa.g:1133:1: rule__Effect__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Effect__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1137:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1138:2: ( ruleEString )
            {
            // InternalIshikawa.g:1138:2: ( ruleEString )
            // InternalIshikawa.g:1139:3: ruleEString
            {
             before(grammarAccess.getEffectAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Effect__CategoriesAssignment_4_0"
    // InternalIshikawa.g:1148:1: rule__Effect__CategoriesAssignment_4_0 : ( ruleCategory ) ;
    public final void rule__Effect__CategoriesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1152:1: ( ( ruleCategory ) )
            // InternalIshikawa.g:1153:2: ( ruleCategory )
            {
            // InternalIshikawa.g:1153:2: ( ruleCategory )
            // InternalIshikawa.g:1154:3: ruleCategory
            {
             before(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__CategoriesAssignment_4_0"


    // $ANTLR start "rule__Effect__CategoriesAssignment_4_1"
    // InternalIshikawa.g:1163:1: rule__Effect__CategoriesAssignment_4_1 : ( ruleCategory ) ;
    public final void rule__Effect__CategoriesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1167:1: ( ( ruleCategory ) )
            // InternalIshikawa.g:1168:2: ( ruleCategory )
            {
            // InternalIshikawa.g:1168:2: ( ruleCategory )
            // InternalIshikawa.g:1169:3: ruleCategory
            {
             before(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__CategoriesAssignment_4_1"


    // $ANTLR start "rule__Category__NameAssignment_2"
    // InternalIshikawa.g:1178:1: rule__Category__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Category__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1182:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1183:2: ( ruleEString )
            {
            // InternalIshikawa.g:1183:2: ( ruleEString )
            // InternalIshikawa.g:1184:3: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_2"


    // $ANTLR start "rule__Category__DescriptionAssignment_3_1"
    // InternalIshikawa.g:1193:1: rule__Category__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Category__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1197:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1198:2: ( ruleEString )
            {
            // InternalIshikawa.g:1198:2: ( ruleEString )
            // InternalIshikawa.g:1199:3: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Category__CausesAssignment_4_1"
    // InternalIshikawa.g:1208:1: rule__Category__CausesAssignment_4_1 : ( ruleCause ) ;
    public final void rule__Category__CausesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1212:1: ( ( ruleCause ) )
            // InternalIshikawa.g:1213:2: ( ruleCause )
            {
            // InternalIshikawa.g:1213:2: ( ruleCause )
            // InternalIshikawa.g:1214:3: ruleCause
            {
             before(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCause();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__CausesAssignment_4_1"


    // $ANTLR start "rule__Category__CausesAssignment_4_2_1"
    // InternalIshikawa.g:1223:1: rule__Category__CausesAssignment_4_2_1 : ( ruleCause ) ;
    public final void rule__Category__CausesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1227:1: ( ( ruleCause ) )
            // InternalIshikawa.g:1228:2: ( ruleCause )
            {
            // InternalIshikawa.g:1228:2: ( ruleCause )
            // InternalIshikawa.g:1229:3: ruleCause
            {
             before(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCause();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getCausesCauseParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__CausesAssignment_4_2_1"


    // $ANTLR start "rule__Cause__NameAssignment_2"
    // InternalIshikawa.g:1238:1: rule__Cause__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Cause__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1242:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1243:2: ( ruleEString )
            {
            // InternalIshikawa.g:1243:2: ( ruleEString )
            // InternalIshikawa.g:1244:3: ruleEString
            {
             before(grammarAccess.getCauseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCauseAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__NameAssignment_2"


    // $ANTLR start "rule__Cause__DescriptionAssignment_3_1"
    // InternalIshikawa.g:1253:1: rule__Cause__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Cause__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1257:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1258:2: ( ruleEString )
            {
            // InternalIshikawa.g:1258:2: ( ruleEString )
            // InternalIshikawa.g:1259:3: ruleEString
            {
             before(grammarAccess.getCauseAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCauseAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Cause__ValueOfInterestAssignment_4_1"
    // InternalIshikawa.g:1268:1: rule__Cause__ValueOfInterestAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Cause__ValueOfInterestAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1272:1: ( ( ruleEString ) )
            // InternalIshikawa.g:1273:2: ( ruleEString )
            {
            // InternalIshikawa.g:1273:2: ( ruleEString )
            // InternalIshikawa.g:1274:3: ruleEString
            {
             before(grammarAccess.getCauseAccess().getValueOfInterestEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCauseAccess().getValueOfInterestEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__ValueOfInterestAssignment_4_1"


    // $ANTLR start "rule__Cause__SubCausesAssignment_5_1"
    // InternalIshikawa.g:1283:1: rule__Cause__SubCausesAssignment_5_1 : ( ruleCause ) ;
    public final void rule__Cause__SubCausesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1287:1: ( ( ruleCause ) )
            // InternalIshikawa.g:1288:2: ( ruleCause )
            {
            // InternalIshikawa.g:1288:2: ( ruleCause )
            // InternalIshikawa.g:1289:3: ruleCause
            {
             before(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCause();

            state._fsp--;

             after(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__SubCausesAssignment_5_1"


    // $ANTLR start "rule__Cause__SubCausesAssignment_5_2"
    // InternalIshikawa.g:1298:1: rule__Cause__SubCausesAssignment_5_2 : ( ruleCause ) ;
    public final void rule__Cause__SubCausesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIshikawa.g:1302:1: ( ( ruleCause ) )
            // InternalIshikawa.g:1303:2: ( ruleCause )
            {
            // InternalIshikawa.g:1303:2: ( ruleCause )
            // InternalIshikawa.g:1304:3: ruleCause
            {
             before(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCause();

            state._fsp--;

             after(grammarAccess.getCauseAccess().getSubCausesCauseParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cause__SubCausesAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});

}