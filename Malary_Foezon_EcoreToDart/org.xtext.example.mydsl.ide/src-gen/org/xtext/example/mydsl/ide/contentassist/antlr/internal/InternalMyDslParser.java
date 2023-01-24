package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FIREBASE'", "'STRING'", "'BOOLEAN'", "'MAP'", "'ARRAY'", "'NULL'", "'TIMESTAMP'", "'GEOPOINT'", "'REFERENCE'", "'NUMBER'", "'BDD'", "'{'", "'}'", "'type'", "'collections'", "','", "'Collection'", "'titre'", "'documents'", "'Documents'", "'id'", "'champs'", "'Champ'", "'champ'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBDD"
    // InternalMyDsl.g:53:1: entryRuleBDD : ruleBDD EOF ;
    public final void entryRuleBDD() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleBDD EOF )
            // InternalMyDsl.g:55:1: ruleBDD EOF
            {
             before(grammarAccess.getBDDRule()); 
            pushFollow(FOLLOW_1);
            ruleBDD();

            state._fsp--;

             after(grammarAccess.getBDDRule()); 
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
    // $ANTLR end "entryRuleBDD"


    // $ANTLR start "ruleBDD"
    // InternalMyDsl.g:62:1: ruleBDD : ( ( rule__BDD__Group__0 ) ) ;
    public final void ruleBDD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__BDD__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__BDD__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__BDD__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__BDD__Group__0 )
            {
             before(grammarAccess.getBDDAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__BDD__Group__0 )
            // InternalMyDsl.g:69:4: rule__BDD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BDD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBDDAccess().getGroup()); 

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
    // $ANTLR end "ruleBDD"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:78:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCollection EOF )
            // InternalMyDsl.g:80:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getCollectionRule()); 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:87:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Collection__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Collection__Group__0 )
            // InternalMyDsl.g:94:4: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getGroup()); 

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
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
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleDocuments"
    // InternalMyDsl.g:128:1: entryRuleDocuments : ruleDocuments EOF ;
    public final void entryRuleDocuments() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleDocuments EOF )
            // InternalMyDsl.g:130:1: ruleDocuments EOF
            {
             before(grammarAccess.getDocumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleDocuments();

            state._fsp--;

             after(grammarAccess.getDocumentsRule()); 
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
    // $ANTLR end "entryRuleDocuments"


    // $ANTLR start "ruleDocuments"
    // InternalMyDsl.g:137:1: ruleDocuments : ( ( rule__Documents__Group__0 ) ) ;
    public final void ruleDocuments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Documents__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Documents__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Documents__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Documents__Group__0 )
            {
             before(grammarAccess.getDocumentsAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Documents__Group__0 )
            // InternalMyDsl.g:144:4: rule__Documents__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getGroup()); 

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
    // $ANTLR end "ruleDocuments"


    // $ANTLR start "entryRuleChamp"
    // InternalMyDsl.g:153:1: entryRuleChamp : ruleChamp EOF ;
    public final void entryRuleChamp() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleChamp EOF )
            // InternalMyDsl.g:155:1: ruleChamp EOF
            {
             before(grammarAccess.getChampRule()); 
            pushFollow(FOLLOW_1);
            ruleChamp();

            state._fsp--;

             after(grammarAccess.getChampRule()); 
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
    // $ANTLR end "entryRuleChamp"


    // $ANTLR start "ruleChamp"
    // InternalMyDsl.g:162:1: ruleChamp : ( ( rule__Champ__Group__0 ) ) ;
    public final void ruleChamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Champ__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Champ__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Champ__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Champ__Group__0 )
            {
             before(grammarAccess.getChampAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Champ__Group__0 )
            // InternalMyDsl.g:169:4: rule__Champ__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Champ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChampAccess().getGroup()); 

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
    // $ANTLR end "ruleChamp"


    // $ANTLR start "ruleTypeBDD"
    // InternalMyDsl.g:178:1: ruleTypeBDD : ( ( 'FIREBASE' ) ) ;
    public final void ruleTypeBDD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( 'FIREBASE' ) ) )
            // InternalMyDsl.g:183:2: ( ( 'FIREBASE' ) )
            {
            // InternalMyDsl.g:183:2: ( ( 'FIREBASE' ) )
            // InternalMyDsl.g:184:3: ( 'FIREBASE' )
            {
             before(grammarAccess.getTypeBDDAccess().getFIREBASEEnumLiteralDeclaration()); 
            // InternalMyDsl.g:185:3: ( 'FIREBASE' )
            // InternalMyDsl.g:185:4: 'FIREBASE'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getTypeBDDAccess().getFIREBASEEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleTypeBDD"


    // $ANTLR start "ruleTypeChamp"
    // InternalMyDsl.g:194:1: ruleTypeChamp : ( ( rule__TypeChamp__Alternatives ) ) ;
    public final void ruleTypeChamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( ( ( rule__TypeChamp__Alternatives ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__TypeChamp__Alternatives ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__TypeChamp__Alternatives ) )
            // InternalMyDsl.g:200:3: ( rule__TypeChamp__Alternatives )
            {
             before(grammarAccess.getTypeChampAccess().getAlternatives()); 
            // InternalMyDsl.g:201:3: ( rule__TypeChamp__Alternatives )
            // InternalMyDsl.g:201:4: rule__TypeChamp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeChamp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeChampAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeChamp"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:209:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:213:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:214:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:214:2: ( RULE_STRING )
                    // InternalMyDsl.g:215:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:220:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:220:2: ( RULE_ID )
                    // InternalMyDsl.g:221:3: RULE_ID
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


    // $ANTLR start "rule__TypeChamp__Alternatives"
    // InternalMyDsl.g:230:1: rule__TypeChamp__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'MAP' ) ) | ( ( 'ARRAY' ) ) | ( ( 'NULL' ) ) | ( ( 'TIMESTAMP' ) ) | ( ( 'GEOPOINT' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'NUMBER' ) ) );
    public final void rule__TypeChamp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:234:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'MAP' ) ) | ( ( 'ARRAY' ) ) | ( ( 'NULL' ) ) | ( ( 'TIMESTAMP' ) ) | ( ( 'GEOPOINT' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'NUMBER' ) ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:235:2: ( ( 'STRING' ) )
                    {
                    // InternalMyDsl.g:235:2: ( ( 'STRING' ) )
                    // InternalMyDsl.g:236:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeChampAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:237:3: ( 'STRING' )
                    // InternalMyDsl.g:237:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:241:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalMyDsl.g:241:2: ( ( 'BOOLEAN' ) )
                    // InternalMyDsl.g:242:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeChampAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:243:3: ( 'BOOLEAN' )
                    // InternalMyDsl.g:243:4: 'BOOLEAN'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:247:2: ( ( 'MAP' ) )
                    {
                    // InternalMyDsl.g:247:2: ( ( 'MAP' ) )
                    // InternalMyDsl.g:248:3: ( 'MAP' )
                    {
                     before(grammarAccess.getTypeChampAccess().getMAPEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:249:3: ( 'MAP' )
                    // InternalMyDsl.g:249:4: 'MAP'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getMAPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:253:2: ( ( 'ARRAY' ) )
                    {
                    // InternalMyDsl.g:253:2: ( ( 'ARRAY' ) )
                    // InternalMyDsl.g:254:3: ( 'ARRAY' )
                    {
                     before(grammarAccess.getTypeChampAccess().getARRAYEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:255:3: ( 'ARRAY' )
                    // InternalMyDsl.g:255:4: 'ARRAY'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getARRAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:259:2: ( ( 'NULL' ) )
                    {
                    // InternalMyDsl.g:259:2: ( ( 'NULL' ) )
                    // InternalMyDsl.g:260:3: ( 'NULL' )
                    {
                     before(grammarAccess.getTypeChampAccess().getNULLEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:261:3: ( 'NULL' )
                    // InternalMyDsl.g:261:4: 'NULL'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getNULLEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:265:2: ( ( 'TIMESTAMP' ) )
                    {
                    // InternalMyDsl.g:265:2: ( ( 'TIMESTAMP' ) )
                    // InternalMyDsl.g:266:3: ( 'TIMESTAMP' )
                    {
                     before(grammarAccess.getTypeChampAccess().getTIMESTAMPEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:267:3: ( 'TIMESTAMP' )
                    // InternalMyDsl.g:267:4: 'TIMESTAMP'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getTIMESTAMPEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:271:2: ( ( 'GEOPOINT' ) )
                    {
                    // InternalMyDsl.g:271:2: ( ( 'GEOPOINT' ) )
                    // InternalMyDsl.g:272:3: ( 'GEOPOINT' )
                    {
                     before(grammarAccess.getTypeChampAccess().getGEOPOINTEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:273:3: ( 'GEOPOINT' )
                    // InternalMyDsl.g:273:4: 'GEOPOINT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getGEOPOINTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:277:2: ( ( 'REFERENCE' ) )
                    {
                    // InternalMyDsl.g:277:2: ( ( 'REFERENCE' ) )
                    // InternalMyDsl.g:278:3: ( 'REFERENCE' )
                    {
                     before(grammarAccess.getTypeChampAccess().getREFERENCEEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:279:3: ( 'REFERENCE' )
                    // InternalMyDsl.g:279:4: 'REFERENCE'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getREFERENCEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:283:2: ( ( 'NUMBER' ) )
                    {
                    // InternalMyDsl.g:283:2: ( ( 'NUMBER' ) )
                    // InternalMyDsl.g:284:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getTypeChampAccess().getNUMBEREnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:285:3: ( 'NUMBER' )
                    // InternalMyDsl.g:285:4: 'NUMBER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeChampAccess().getNUMBEREnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__TypeChamp__Alternatives"


    // $ANTLR start "rule__BDD__Group__0"
    // InternalMyDsl.g:293:1: rule__BDD__Group__0 : rule__BDD__Group__0__Impl rule__BDD__Group__1 ;
    public final void rule__BDD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( rule__BDD__Group__0__Impl rule__BDD__Group__1 )
            // InternalMyDsl.g:298:2: rule__BDD__Group__0__Impl rule__BDD__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BDD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group__1();

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
    // $ANTLR end "rule__BDD__Group__0"


    // $ANTLR start "rule__BDD__Group__0__Impl"
    // InternalMyDsl.g:305:1: rule__BDD__Group__0__Impl : ( () ) ;
    public final void rule__BDD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:309:1: ( ( () ) )
            // InternalMyDsl.g:310:1: ( () )
            {
            // InternalMyDsl.g:310:1: ( () )
            // InternalMyDsl.g:311:2: ()
            {
             before(grammarAccess.getBDDAccess().getBDDAction_0()); 
            // InternalMyDsl.g:312:2: ()
            // InternalMyDsl.g:312:3: 
            {
            }

             after(grammarAccess.getBDDAccess().getBDDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDD__Group__0__Impl"


    // $ANTLR start "rule__BDD__Group__1"
    // InternalMyDsl.g:320:1: rule__BDD__Group__1 : rule__BDD__Group__1__Impl rule__BDD__Group__2 ;
    public final void rule__BDD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( rule__BDD__Group__1__Impl rule__BDD__Group__2 )
            // InternalMyDsl.g:325:2: rule__BDD__Group__1__Impl rule__BDD__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BDD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group__2();

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
    // $ANTLR end "rule__BDD__Group__1"


    // $ANTLR start "rule__BDD__Group__1__Impl"
    // InternalMyDsl.g:332:1: rule__BDD__Group__1__Impl : ( 'BDD' ) ;
    public final void rule__BDD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:336:1: ( ( 'BDD' ) )
            // InternalMyDsl.g:337:1: ( 'BDD' )
            {
            // InternalMyDsl.g:337:1: ( 'BDD' )
            // InternalMyDsl.g:338:2: 'BDD'
            {
             before(grammarAccess.getBDDAccess().getBDDKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getBDDKeyword_1()); 

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
    // $ANTLR end "rule__BDD__Group__1__Impl"


    // $ANTLR start "rule__BDD__Group__2"
    // InternalMyDsl.g:347:1: rule__BDD__Group__2 : rule__BDD__Group__2__Impl rule__BDD__Group__3 ;
    public final void rule__BDD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( rule__BDD__Group__2__Impl rule__BDD__Group__3 )
            // InternalMyDsl.g:352:2: rule__BDD__Group__2__Impl rule__BDD__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BDD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group__3();

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
    // $ANTLR end "rule__BDD__Group__2"


    // $ANTLR start "rule__BDD__Group__2__Impl"
    // InternalMyDsl.g:359:1: rule__BDD__Group__2__Impl : ( '{' ) ;
    public final void rule__BDD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:363:1: ( ( '{' ) )
            // InternalMyDsl.g:364:1: ( '{' )
            {
            // InternalMyDsl.g:364:1: ( '{' )
            // InternalMyDsl.g:365:2: '{'
            {
             before(grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BDD__Group__2__Impl"


    // $ANTLR start "rule__BDD__Group__3"
    // InternalMyDsl.g:374:1: rule__BDD__Group__3 : rule__BDD__Group__3__Impl rule__BDD__Group__4 ;
    public final void rule__BDD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( rule__BDD__Group__3__Impl rule__BDD__Group__4 )
            // InternalMyDsl.g:379:2: rule__BDD__Group__3__Impl rule__BDD__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BDD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group__4();

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
    // $ANTLR end "rule__BDD__Group__3"


    // $ANTLR start "rule__BDD__Group__3__Impl"
    // InternalMyDsl.g:386:1: rule__BDD__Group__3__Impl : ( ( rule__BDD__Group_3__0 )? ) ;
    public final void rule__BDD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:390:1: ( ( ( rule__BDD__Group_3__0 )? ) )
            // InternalMyDsl.g:391:1: ( ( rule__BDD__Group_3__0 )? )
            {
            // InternalMyDsl.g:391:1: ( ( rule__BDD__Group_3__0 )? )
            // InternalMyDsl.g:392:2: ( rule__BDD__Group_3__0 )?
            {
             before(grammarAccess.getBDDAccess().getGroup_3()); 
            // InternalMyDsl.g:393:2: ( rule__BDD__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:393:3: rule__BDD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BDD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBDDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__BDD__Group__3__Impl"


    // $ANTLR start "rule__BDD__Group__4"
    // InternalMyDsl.g:401:1: rule__BDD__Group__4 : rule__BDD__Group__4__Impl rule__BDD__Group__5 ;
    public final void rule__BDD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( rule__BDD__Group__4__Impl rule__BDD__Group__5 )
            // InternalMyDsl.g:406:2: rule__BDD__Group__4__Impl rule__BDD__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__BDD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group__5();

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
    // $ANTLR end "rule__BDD__Group__4"


    // $ANTLR start "rule__BDD__Group__4__Impl"
    // InternalMyDsl.g:413:1: rule__BDD__Group__4__Impl : ( ( rule__BDD__Group_4__0 )? ) ;
    public final void rule__BDD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:417:1: ( ( ( rule__BDD__Group_4__0 )? ) )
            // InternalMyDsl.g:418:1: ( ( rule__BDD__Group_4__0 )? )
            {
            // InternalMyDsl.g:418:1: ( ( rule__BDD__Group_4__0 )? )
            // InternalMyDsl.g:419:2: ( rule__BDD__Group_4__0 )?
            {
             before(grammarAccess.getBDDAccess().getGroup_4()); 
            // InternalMyDsl.g:420:2: ( rule__BDD__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:420:3: rule__BDD__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BDD__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBDDAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BDD__Group__4__Impl"


    // $ANTLR start "rule__BDD__Group__5"
    // InternalMyDsl.g:428:1: rule__BDD__Group__5 : rule__BDD__Group__5__Impl ;
    public final void rule__BDD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( rule__BDD__Group__5__Impl )
            // InternalMyDsl.g:433:2: rule__BDD__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BDD__Group__5__Impl();

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
    // $ANTLR end "rule__BDD__Group__5"


    // $ANTLR start "rule__BDD__Group__5__Impl"
    // InternalMyDsl.g:439:1: rule__BDD__Group__5__Impl : ( '}' ) ;
    public final void rule__BDD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( '}' ) )
            // InternalMyDsl.g:444:1: ( '}' )
            {
            // InternalMyDsl.g:444:1: ( '}' )
            // InternalMyDsl.g:445:2: '}'
            {
             before(grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BDD__Group__5__Impl"


    // $ANTLR start "rule__BDD__Group_3__0"
    // InternalMyDsl.g:455:1: rule__BDD__Group_3__0 : rule__BDD__Group_3__0__Impl rule__BDD__Group_3__1 ;
    public final void rule__BDD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( rule__BDD__Group_3__0__Impl rule__BDD__Group_3__1 )
            // InternalMyDsl.g:460:2: rule__BDD__Group_3__0__Impl rule__BDD__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BDD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_3__1();

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
    // $ANTLR end "rule__BDD__Group_3__0"


    // $ANTLR start "rule__BDD__Group_3__0__Impl"
    // InternalMyDsl.g:467:1: rule__BDD__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__BDD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:471:1: ( ( 'type' ) )
            // InternalMyDsl.g:472:1: ( 'type' )
            {
            // InternalMyDsl.g:472:1: ( 'type' )
            // InternalMyDsl.g:473:2: 'type'
            {
             before(grammarAccess.getBDDAccess().getTypeKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__BDD__Group_3__0__Impl"


    // $ANTLR start "rule__BDD__Group_3__1"
    // InternalMyDsl.g:482:1: rule__BDD__Group_3__1 : rule__BDD__Group_3__1__Impl ;
    public final void rule__BDD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( rule__BDD__Group_3__1__Impl )
            // InternalMyDsl.g:487:2: rule__BDD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BDD__Group_3__1__Impl();

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
    // $ANTLR end "rule__BDD__Group_3__1"


    // $ANTLR start "rule__BDD__Group_3__1__Impl"
    // InternalMyDsl.g:493:1: rule__BDD__Group_3__1__Impl : ( ( rule__BDD__TypeAssignment_3_1 ) ) ;
    public final void rule__BDD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( ( ( rule__BDD__TypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:498:1: ( ( rule__BDD__TypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:498:1: ( ( rule__BDD__TypeAssignment_3_1 ) )
            // InternalMyDsl.g:499:2: ( rule__BDD__TypeAssignment_3_1 )
            {
             before(grammarAccess.getBDDAccess().getTypeAssignment_3_1()); 
            // InternalMyDsl.g:500:2: ( rule__BDD__TypeAssignment_3_1 )
            // InternalMyDsl.g:500:3: rule__BDD__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BDD__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBDDAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__BDD__Group_3__1__Impl"


    // $ANTLR start "rule__BDD__Group_4__0"
    // InternalMyDsl.g:509:1: rule__BDD__Group_4__0 : rule__BDD__Group_4__0__Impl rule__BDD__Group_4__1 ;
    public final void rule__BDD__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( rule__BDD__Group_4__0__Impl rule__BDD__Group_4__1 )
            // InternalMyDsl.g:514:2: rule__BDD__Group_4__0__Impl rule__BDD__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__BDD__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_4__1();

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
    // $ANTLR end "rule__BDD__Group_4__0"


    // $ANTLR start "rule__BDD__Group_4__0__Impl"
    // InternalMyDsl.g:521:1: rule__BDD__Group_4__0__Impl : ( 'collections' ) ;
    public final void rule__BDD__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:525:1: ( ( 'collections' ) )
            // InternalMyDsl.g:526:1: ( 'collections' )
            {
            // InternalMyDsl.g:526:1: ( 'collections' )
            // InternalMyDsl.g:527:2: 'collections'
            {
             before(grammarAccess.getBDDAccess().getCollectionsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getCollectionsKeyword_4_0()); 

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
    // $ANTLR end "rule__BDD__Group_4__0__Impl"


    // $ANTLR start "rule__BDD__Group_4__1"
    // InternalMyDsl.g:536:1: rule__BDD__Group_4__1 : rule__BDD__Group_4__1__Impl rule__BDD__Group_4__2 ;
    public final void rule__BDD__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( rule__BDD__Group_4__1__Impl rule__BDD__Group_4__2 )
            // InternalMyDsl.g:541:2: rule__BDD__Group_4__1__Impl rule__BDD__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__BDD__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_4__2();

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
    // $ANTLR end "rule__BDD__Group_4__1"


    // $ANTLR start "rule__BDD__Group_4__1__Impl"
    // InternalMyDsl.g:548:1: rule__BDD__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BDD__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( '{' ) )
            // InternalMyDsl.g:553:1: ( '{' )
            {
            // InternalMyDsl.g:553:1: ( '{' )
            // InternalMyDsl.g:554:2: '{'
            {
             before(grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__BDD__Group_4__1__Impl"


    // $ANTLR start "rule__BDD__Group_4__2"
    // InternalMyDsl.g:563:1: rule__BDD__Group_4__2 : rule__BDD__Group_4__2__Impl rule__BDD__Group_4__3 ;
    public final void rule__BDD__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( rule__BDD__Group_4__2__Impl rule__BDD__Group_4__3 )
            // InternalMyDsl.g:568:2: rule__BDD__Group_4__2__Impl rule__BDD__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__BDD__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_4__3();

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
    // $ANTLR end "rule__BDD__Group_4__2"


    // $ANTLR start "rule__BDD__Group_4__2__Impl"
    // InternalMyDsl.g:575:1: rule__BDD__Group_4__2__Impl : ( ( rule__BDD__CollectionsAssignment_4_2 ) ) ;
    public final void rule__BDD__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( ( rule__BDD__CollectionsAssignment_4_2 ) ) )
            // InternalMyDsl.g:580:1: ( ( rule__BDD__CollectionsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:580:1: ( ( rule__BDD__CollectionsAssignment_4_2 ) )
            // InternalMyDsl.g:581:2: ( rule__BDD__CollectionsAssignment_4_2 )
            {
             before(grammarAccess.getBDDAccess().getCollectionsAssignment_4_2()); 
            // InternalMyDsl.g:582:2: ( rule__BDD__CollectionsAssignment_4_2 )
            // InternalMyDsl.g:582:3: rule__BDD__CollectionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__BDD__CollectionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBDDAccess().getCollectionsAssignment_4_2()); 

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
    // $ANTLR end "rule__BDD__Group_4__2__Impl"


    // $ANTLR start "rule__BDD__Group_4__3"
    // InternalMyDsl.g:590:1: rule__BDD__Group_4__3 : rule__BDD__Group_4__3__Impl rule__BDD__Group_4__4 ;
    public final void rule__BDD__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( rule__BDD__Group_4__3__Impl rule__BDD__Group_4__4 )
            // InternalMyDsl.g:595:2: rule__BDD__Group_4__3__Impl rule__BDD__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__BDD__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_4__4();

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
    // $ANTLR end "rule__BDD__Group_4__3"


    // $ANTLR start "rule__BDD__Group_4__3__Impl"
    // InternalMyDsl.g:602:1: rule__BDD__Group_4__3__Impl : ( ( rule__BDD__Group_4_3__0 )* ) ;
    public final void rule__BDD__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( ( ( rule__BDD__Group_4_3__0 )* ) )
            // InternalMyDsl.g:607:1: ( ( rule__BDD__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:607:1: ( ( rule__BDD__Group_4_3__0 )* )
            // InternalMyDsl.g:608:2: ( rule__BDD__Group_4_3__0 )*
            {
             before(grammarAccess.getBDDAccess().getGroup_4_3()); 
            // InternalMyDsl.g:609:2: ( rule__BDD__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:609:3: rule__BDD__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BDD__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBDDAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__BDD__Group_4__3__Impl"


    // $ANTLR start "rule__BDD__Group_4__4"
    // InternalMyDsl.g:617:1: rule__BDD__Group_4__4 : rule__BDD__Group_4__4__Impl ;
    public final void rule__BDD__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( rule__BDD__Group_4__4__Impl )
            // InternalMyDsl.g:622:2: rule__BDD__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BDD__Group_4__4__Impl();

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
    // $ANTLR end "rule__BDD__Group_4__4"


    // $ANTLR start "rule__BDD__Group_4__4__Impl"
    // InternalMyDsl.g:628:1: rule__BDD__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BDD__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( '}' ) )
            // InternalMyDsl.g:633:1: ( '}' )
            {
            // InternalMyDsl.g:633:1: ( '}' )
            // InternalMyDsl.g:634:2: '}'
            {
             before(grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__BDD__Group_4__4__Impl"


    // $ANTLR start "rule__BDD__Group_4_3__0"
    // InternalMyDsl.g:644:1: rule__BDD__Group_4_3__0 : rule__BDD__Group_4_3__0__Impl rule__BDD__Group_4_3__1 ;
    public final void rule__BDD__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( rule__BDD__Group_4_3__0__Impl rule__BDD__Group_4_3__1 )
            // InternalMyDsl.g:649:2: rule__BDD__Group_4_3__0__Impl rule__BDD__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__BDD__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDD__Group_4_3__1();

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
    // $ANTLR end "rule__BDD__Group_4_3__0"


    // $ANTLR start "rule__BDD__Group_4_3__0__Impl"
    // InternalMyDsl.g:656:1: rule__BDD__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BDD__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( ( ',' ) )
            // InternalMyDsl.g:661:1: ( ',' )
            {
            // InternalMyDsl.g:661:1: ( ',' )
            // InternalMyDsl.g:662:2: ','
            {
             before(grammarAccess.getBDDAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBDDAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__BDD__Group_4_3__0__Impl"


    // $ANTLR start "rule__BDD__Group_4_3__1"
    // InternalMyDsl.g:671:1: rule__BDD__Group_4_3__1 : rule__BDD__Group_4_3__1__Impl ;
    public final void rule__BDD__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( rule__BDD__Group_4_3__1__Impl )
            // InternalMyDsl.g:676:2: rule__BDD__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BDD__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__BDD__Group_4_3__1"


    // $ANTLR start "rule__BDD__Group_4_3__1__Impl"
    // InternalMyDsl.g:682:1: rule__BDD__Group_4_3__1__Impl : ( ( rule__BDD__CollectionsAssignment_4_3_1 ) ) ;
    public final void rule__BDD__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( ( rule__BDD__CollectionsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:687:1: ( ( rule__BDD__CollectionsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:687:1: ( ( rule__BDD__CollectionsAssignment_4_3_1 ) )
            // InternalMyDsl.g:688:2: ( rule__BDD__CollectionsAssignment_4_3_1 )
            {
             before(grammarAccess.getBDDAccess().getCollectionsAssignment_4_3_1()); 
            // InternalMyDsl.g:689:2: ( rule__BDD__CollectionsAssignment_4_3_1 )
            // InternalMyDsl.g:689:3: rule__BDD__CollectionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BDD__CollectionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBDDAccess().getCollectionsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__BDD__Group_4_3__1__Impl"


    // $ANTLR start "rule__Collection__Group__0"
    // InternalMyDsl.g:698:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalMyDsl.g:703:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Collection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__1();

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
    // $ANTLR end "rule__Collection__Group__0"


    // $ANTLR start "rule__Collection__Group__0__Impl"
    // InternalMyDsl.g:710:1: rule__Collection__Group__0__Impl : ( () ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( ( () ) )
            // InternalMyDsl.g:715:1: ( () )
            {
            // InternalMyDsl.g:715:1: ( () )
            // InternalMyDsl.g:716:2: ()
            {
             before(grammarAccess.getCollectionAccess().getCollectionAction_0()); 
            // InternalMyDsl.g:717:2: ()
            // InternalMyDsl.g:717:3: 
            {
            }

             after(grammarAccess.getCollectionAccess().getCollectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0__Impl"


    // $ANTLR start "rule__Collection__Group__1"
    // InternalMyDsl.g:725:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl rule__Collection__Group__2 ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( rule__Collection__Group__1__Impl rule__Collection__Group__2 )
            // InternalMyDsl.g:730:2: rule__Collection__Group__1__Impl rule__Collection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Collection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__2();

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
    // $ANTLR end "rule__Collection__Group__1"


    // $ANTLR start "rule__Collection__Group__1__Impl"
    // InternalMyDsl.g:737:1: rule__Collection__Group__1__Impl : ( 'Collection' ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:742:1: ( 'Collection' )
            {
            // InternalMyDsl.g:742:1: ( 'Collection' )
            // InternalMyDsl.g:743:2: 'Collection'
            {
             before(grammarAccess.getCollectionAccess().getCollectionKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getCollectionKeyword_1()); 

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
    // $ANTLR end "rule__Collection__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group__2"
    // InternalMyDsl.g:752:1: rule__Collection__Group__2 : rule__Collection__Group__2__Impl rule__Collection__Group__3 ;
    public final void rule__Collection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( rule__Collection__Group__2__Impl rule__Collection__Group__3 )
            // InternalMyDsl.g:757:2: rule__Collection__Group__2__Impl rule__Collection__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Collection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__3();

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
    // $ANTLR end "rule__Collection__Group__2"


    // $ANTLR start "rule__Collection__Group__2__Impl"
    // InternalMyDsl.g:764:1: rule__Collection__Group__2__Impl : ( '{' ) ;
    public final void rule__Collection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( '{' ) )
            // InternalMyDsl.g:769:1: ( '{' )
            {
            // InternalMyDsl.g:769:1: ( '{' )
            // InternalMyDsl.g:770:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Collection__Group__2__Impl"


    // $ANTLR start "rule__Collection__Group__3"
    // InternalMyDsl.g:779:1: rule__Collection__Group__3 : rule__Collection__Group__3__Impl rule__Collection__Group__4 ;
    public final void rule__Collection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( rule__Collection__Group__3__Impl rule__Collection__Group__4 )
            // InternalMyDsl.g:784:2: rule__Collection__Group__3__Impl rule__Collection__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Collection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__4();

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
    // $ANTLR end "rule__Collection__Group__3"


    // $ANTLR start "rule__Collection__Group__3__Impl"
    // InternalMyDsl.g:791:1: rule__Collection__Group__3__Impl : ( ( rule__Collection__Group_3__0 )? ) ;
    public final void rule__Collection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( ( rule__Collection__Group_3__0 )? ) )
            // InternalMyDsl.g:796:1: ( ( rule__Collection__Group_3__0 )? )
            {
            // InternalMyDsl.g:796:1: ( ( rule__Collection__Group_3__0 )? )
            // InternalMyDsl.g:797:2: ( rule__Collection__Group_3__0 )?
            {
             before(grammarAccess.getCollectionAccess().getGroup_3()); 
            // InternalMyDsl.g:798:2: ( rule__Collection__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:798:3: rule__Collection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Collection__Group__3__Impl"


    // $ANTLR start "rule__Collection__Group__4"
    // InternalMyDsl.g:806:1: rule__Collection__Group__4 : rule__Collection__Group__4__Impl rule__Collection__Group__5 ;
    public final void rule__Collection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( rule__Collection__Group__4__Impl rule__Collection__Group__5 )
            // InternalMyDsl.g:811:2: rule__Collection__Group__4__Impl rule__Collection__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Collection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__5();

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
    // $ANTLR end "rule__Collection__Group__4"


    // $ANTLR start "rule__Collection__Group__4__Impl"
    // InternalMyDsl.g:818:1: rule__Collection__Group__4__Impl : ( ( rule__Collection__Group_4__0 )? ) ;
    public final void rule__Collection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( ( rule__Collection__Group_4__0 )? ) )
            // InternalMyDsl.g:823:1: ( ( rule__Collection__Group_4__0 )? )
            {
            // InternalMyDsl.g:823:1: ( ( rule__Collection__Group_4__0 )? )
            // InternalMyDsl.g:824:2: ( rule__Collection__Group_4__0 )?
            {
             before(grammarAccess.getCollectionAccess().getGroup_4()); 
            // InternalMyDsl.g:825:2: ( rule__Collection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:825:3: rule__Collection__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Collection__Group__4__Impl"


    // $ANTLR start "rule__Collection__Group__5"
    // InternalMyDsl.g:833:1: rule__Collection__Group__5 : rule__Collection__Group__5__Impl ;
    public final void rule__Collection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( rule__Collection__Group__5__Impl )
            // InternalMyDsl.g:838:2: rule__Collection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__5__Impl();

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
    // $ANTLR end "rule__Collection__Group__5"


    // $ANTLR start "rule__Collection__Group__5__Impl"
    // InternalMyDsl.g:844:1: rule__Collection__Group__5__Impl : ( '}' ) ;
    public final void rule__Collection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( '}' ) )
            // InternalMyDsl.g:849:1: ( '}' )
            {
            // InternalMyDsl.g:849:1: ( '}' )
            // InternalMyDsl.g:850:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Collection__Group__5__Impl"


    // $ANTLR start "rule__Collection__Group_3__0"
    // InternalMyDsl.g:860:1: rule__Collection__Group_3__0 : rule__Collection__Group_3__0__Impl rule__Collection__Group_3__1 ;
    public final void rule__Collection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( rule__Collection__Group_3__0__Impl rule__Collection__Group_3__1 )
            // InternalMyDsl.g:865:2: rule__Collection__Group_3__0__Impl rule__Collection__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Collection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_3__1();

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
    // $ANTLR end "rule__Collection__Group_3__0"


    // $ANTLR start "rule__Collection__Group_3__0__Impl"
    // InternalMyDsl.g:872:1: rule__Collection__Group_3__0__Impl : ( 'titre' ) ;
    public final void rule__Collection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( ( 'titre' ) )
            // InternalMyDsl.g:877:1: ( 'titre' )
            {
            // InternalMyDsl.g:877:1: ( 'titre' )
            // InternalMyDsl.g:878:2: 'titre'
            {
             before(grammarAccess.getCollectionAccess().getTitreKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getTitreKeyword_3_0()); 

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
    // $ANTLR end "rule__Collection__Group_3__0__Impl"


    // $ANTLR start "rule__Collection__Group_3__1"
    // InternalMyDsl.g:887:1: rule__Collection__Group_3__1 : rule__Collection__Group_3__1__Impl ;
    public final void rule__Collection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( rule__Collection__Group_3__1__Impl )
            // InternalMyDsl.g:892:2: rule__Collection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_3__1__Impl();

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
    // $ANTLR end "rule__Collection__Group_3__1"


    // $ANTLR start "rule__Collection__Group_3__1__Impl"
    // InternalMyDsl.g:898:1: rule__Collection__Group_3__1__Impl : ( ( rule__Collection__TitreAssignment_3_1 ) ) ;
    public final void rule__Collection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__Collection__TitreAssignment_3_1 ) ) )
            // InternalMyDsl.g:903:1: ( ( rule__Collection__TitreAssignment_3_1 ) )
            {
            // InternalMyDsl.g:903:1: ( ( rule__Collection__TitreAssignment_3_1 ) )
            // InternalMyDsl.g:904:2: ( rule__Collection__TitreAssignment_3_1 )
            {
             before(grammarAccess.getCollectionAccess().getTitreAssignment_3_1()); 
            // InternalMyDsl.g:905:2: ( rule__Collection__TitreAssignment_3_1 )
            // InternalMyDsl.g:905:3: rule__Collection__TitreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__TitreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getTitreAssignment_3_1()); 

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
    // $ANTLR end "rule__Collection__Group_3__1__Impl"


    // $ANTLR start "rule__Collection__Group_4__0"
    // InternalMyDsl.g:914:1: rule__Collection__Group_4__0 : rule__Collection__Group_4__0__Impl rule__Collection__Group_4__1 ;
    public final void rule__Collection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( rule__Collection__Group_4__0__Impl rule__Collection__Group_4__1 )
            // InternalMyDsl.g:919:2: rule__Collection__Group_4__0__Impl rule__Collection__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Collection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_4__1();

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
    // $ANTLR end "rule__Collection__Group_4__0"


    // $ANTLR start "rule__Collection__Group_4__0__Impl"
    // InternalMyDsl.g:926:1: rule__Collection__Group_4__0__Impl : ( 'documents' ) ;
    public final void rule__Collection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( 'documents' ) )
            // InternalMyDsl.g:931:1: ( 'documents' )
            {
            // InternalMyDsl.g:931:1: ( 'documents' )
            // InternalMyDsl.g:932:2: 'documents'
            {
             before(grammarAccess.getCollectionAccess().getDocumentsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getDocumentsKeyword_4_0()); 

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
    // $ANTLR end "rule__Collection__Group_4__0__Impl"


    // $ANTLR start "rule__Collection__Group_4__1"
    // InternalMyDsl.g:941:1: rule__Collection__Group_4__1 : rule__Collection__Group_4__1__Impl rule__Collection__Group_4__2 ;
    public final void rule__Collection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( rule__Collection__Group_4__1__Impl rule__Collection__Group_4__2 )
            // InternalMyDsl.g:946:2: rule__Collection__Group_4__1__Impl rule__Collection__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Collection__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_4__2();

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
    // $ANTLR end "rule__Collection__Group_4__1"


    // $ANTLR start "rule__Collection__Group_4__1__Impl"
    // InternalMyDsl.g:953:1: rule__Collection__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Collection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( '{' ) )
            // InternalMyDsl.g:958:1: ( '{' )
            {
            // InternalMyDsl.g:958:1: ( '{' )
            // InternalMyDsl.g:959:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Collection__Group_4__1__Impl"


    // $ANTLR start "rule__Collection__Group_4__2"
    // InternalMyDsl.g:968:1: rule__Collection__Group_4__2 : rule__Collection__Group_4__2__Impl rule__Collection__Group_4__3 ;
    public final void rule__Collection__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( rule__Collection__Group_4__2__Impl rule__Collection__Group_4__3 )
            // InternalMyDsl.g:973:2: rule__Collection__Group_4__2__Impl rule__Collection__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Collection__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_4__3();

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
    // $ANTLR end "rule__Collection__Group_4__2"


    // $ANTLR start "rule__Collection__Group_4__2__Impl"
    // InternalMyDsl.g:980:1: rule__Collection__Group_4__2__Impl : ( ( rule__Collection__DocumentsAssignment_4_2 ) ) ;
    public final void rule__Collection__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( ( ( rule__Collection__DocumentsAssignment_4_2 ) ) )
            // InternalMyDsl.g:985:1: ( ( rule__Collection__DocumentsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:985:1: ( ( rule__Collection__DocumentsAssignment_4_2 ) )
            // InternalMyDsl.g:986:2: ( rule__Collection__DocumentsAssignment_4_2 )
            {
             before(grammarAccess.getCollectionAccess().getDocumentsAssignment_4_2()); 
            // InternalMyDsl.g:987:2: ( rule__Collection__DocumentsAssignment_4_2 )
            // InternalMyDsl.g:987:3: rule__Collection__DocumentsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Collection__DocumentsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getDocumentsAssignment_4_2()); 

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
    // $ANTLR end "rule__Collection__Group_4__2__Impl"


    // $ANTLR start "rule__Collection__Group_4__3"
    // InternalMyDsl.g:995:1: rule__Collection__Group_4__3 : rule__Collection__Group_4__3__Impl rule__Collection__Group_4__4 ;
    public final void rule__Collection__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( rule__Collection__Group_4__3__Impl rule__Collection__Group_4__4 )
            // InternalMyDsl.g:1000:2: rule__Collection__Group_4__3__Impl rule__Collection__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Collection__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_4__4();

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
    // $ANTLR end "rule__Collection__Group_4__3"


    // $ANTLR start "rule__Collection__Group_4__3__Impl"
    // InternalMyDsl.g:1007:1: rule__Collection__Group_4__3__Impl : ( ( rule__Collection__Group_4_3__0 )* ) ;
    public final void rule__Collection__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( rule__Collection__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1012:1: ( ( rule__Collection__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1012:1: ( ( rule__Collection__Group_4_3__0 )* )
            // InternalMyDsl.g:1013:2: ( rule__Collection__Group_4_3__0 )*
            {
             before(grammarAccess.getCollectionAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1014:2: ( rule__Collection__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1014:3: rule__Collection__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Collection__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Collection__Group_4__3__Impl"


    // $ANTLR start "rule__Collection__Group_4__4"
    // InternalMyDsl.g:1022:1: rule__Collection__Group_4__4 : rule__Collection__Group_4__4__Impl ;
    public final void rule__Collection__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( rule__Collection__Group_4__4__Impl )
            // InternalMyDsl.g:1027:2: rule__Collection__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_4__4__Impl();

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
    // $ANTLR end "rule__Collection__Group_4__4"


    // $ANTLR start "rule__Collection__Group_4__4__Impl"
    // InternalMyDsl.g:1033:1: rule__Collection__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Collection__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( '}' ) )
            // InternalMyDsl.g:1038:1: ( '}' )
            {
            // InternalMyDsl.g:1038:1: ( '}' )
            // InternalMyDsl.g:1039:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Collection__Group_4__4__Impl"


    // $ANTLR start "rule__Collection__Group_4_3__0"
    // InternalMyDsl.g:1049:1: rule__Collection__Group_4_3__0 : rule__Collection__Group_4_3__0__Impl rule__Collection__Group_4_3__1 ;
    public final void rule__Collection__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( rule__Collection__Group_4_3__0__Impl rule__Collection__Group_4_3__1 )
            // InternalMyDsl.g:1054:2: rule__Collection__Group_4_3__0__Impl rule__Collection__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Collection__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_4_3__1();

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
    // $ANTLR end "rule__Collection__Group_4_3__0"


    // $ANTLR start "rule__Collection__Group_4_3__0__Impl"
    // InternalMyDsl.g:1061:1: rule__Collection__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Collection__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( ',' ) )
            // InternalMyDsl.g:1066:1: ( ',' )
            {
            // InternalMyDsl.g:1066:1: ( ',' )
            // InternalMyDsl.g:1067:2: ','
            {
             before(grammarAccess.getCollectionAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Collection__Group_4_3__0__Impl"


    // $ANTLR start "rule__Collection__Group_4_3__1"
    // InternalMyDsl.g:1076:1: rule__Collection__Group_4_3__1 : rule__Collection__Group_4_3__1__Impl ;
    public final void rule__Collection__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( rule__Collection__Group_4_3__1__Impl )
            // InternalMyDsl.g:1081:2: rule__Collection__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Collection__Group_4_3__1"


    // $ANTLR start "rule__Collection__Group_4_3__1__Impl"
    // InternalMyDsl.g:1087:1: rule__Collection__Group_4_3__1__Impl : ( ( rule__Collection__DocumentsAssignment_4_3_1 ) ) ;
    public final void rule__Collection__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ( rule__Collection__DocumentsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1092:1: ( ( rule__Collection__DocumentsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1092:1: ( ( rule__Collection__DocumentsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1093:2: ( rule__Collection__DocumentsAssignment_4_3_1 )
            {
             before(grammarAccess.getCollectionAccess().getDocumentsAssignment_4_3_1()); 
            // InternalMyDsl.g:1094:2: ( rule__Collection__DocumentsAssignment_4_3_1 )
            // InternalMyDsl.g:1094:3: rule__Collection__DocumentsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__DocumentsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getDocumentsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Collection__Group_4_3__1__Impl"


    // $ANTLR start "rule__Documents__Group__0"
    // InternalMyDsl.g:1103:1: rule__Documents__Group__0 : rule__Documents__Group__0__Impl rule__Documents__Group__1 ;
    public final void rule__Documents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( rule__Documents__Group__0__Impl rule__Documents__Group__1 )
            // InternalMyDsl.g:1108:2: rule__Documents__Group__0__Impl rule__Documents__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Documents__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__1();

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
    // $ANTLR end "rule__Documents__Group__0"


    // $ANTLR start "rule__Documents__Group__0__Impl"
    // InternalMyDsl.g:1115:1: rule__Documents__Group__0__Impl : ( () ) ;
    public final void rule__Documents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( ( () ) )
            // InternalMyDsl.g:1120:1: ( () )
            {
            // InternalMyDsl.g:1120:1: ( () )
            // InternalMyDsl.g:1121:2: ()
            {
             before(grammarAccess.getDocumentsAccess().getDocumentsAction_0()); 
            // InternalMyDsl.g:1122:2: ()
            // InternalMyDsl.g:1122:3: 
            {
            }

             after(grammarAccess.getDocumentsAccess().getDocumentsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Documents__Group__0__Impl"


    // $ANTLR start "rule__Documents__Group__1"
    // InternalMyDsl.g:1130:1: rule__Documents__Group__1 : rule__Documents__Group__1__Impl rule__Documents__Group__2 ;
    public final void rule__Documents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( rule__Documents__Group__1__Impl rule__Documents__Group__2 )
            // InternalMyDsl.g:1135:2: rule__Documents__Group__1__Impl rule__Documents__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Documents__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__2();

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
    // $ANTLR end "rule__Documents__Group__1"


    // $ANTLR start "rule__Documents__Group__1__Impl"
    // InternalMyDsl.g:1142:1: rule__Documents__Group__1__Impl : ( 'Documents' ) ;
    public final void rule__Documents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1146:1: ( ( 'Documents' ) )
            // InternalMyDsl.g:1147:1: ( 'Documents' )
            {
            // InternalMyDsl.g:1147:1: ( 'Documents' )
            // InternalMyDsl.g:1148:2: 'Documents'
            {
             before(grammarAccess.getDocumentsAccess().getDocumentsKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getDocumentsKeyword_1()); 

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
    // $ANTLR end "rule__Documents__Group__1__Impl"


    // $ANTLR start "rule__Documents__Group__2"
    // InternalMyDsl.g:1157:1: rule__Documents__Group__2 : rule__Documents__Group__2__Impl rule__Documents__Group__3 ;
    public final void rule__Documents__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( rule__Documents__Group__2__Impl rule__Documents__Group__3 )
            // InternalMyDsl.g:1162:2: rule__Documents__Group__2__Impl rule__Documents__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Documents__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__3();

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
    // $ANTLR end "rule__Documents__Group__2"


    // $ANTLR start "rule__Documents__Group__2__Impl"
    // InternalMyDsl.g:1169:1: rule__Documents__Group__2__Impl : ( '{' ) ;
    public final void rule__Documents__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1173:1: ( ( '{' ) )
            // InternalMyDsl.g:1174:1: ( '{' )
            {
            // InternalMyDsl.g:1174:1: ( '{' )
            // InternalMyDsl.g:1175:2: '{'
            {
             before(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Documents__Group__2__Impl"


    // $ANTLR start "rule__Documents__Group__3"
    // InternalMyDsl.g:1184:1: rule__Documents__Group__3 : rule__Documents__Group__3__Impl rule__Documents__Group__4 ;
    public final void rule__Documents__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( rule__Documents__Group__3__Impl rule__Documents__Group__4 )
            // InternalMyDsl.g:1189:2: rule__Documents__Group__3__Impl rule__Documents__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Documents__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__4();

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
    // $ANTLR end "rule__Documents__Group__3"


    // $ANTLR start "rule__Documents__Group__3__Impl"
    // InternalMyDsl.g:1196:1: rule__Documents__Group__3__Impl : ( ( rule__Documents__Group_3__0 )? ) ;
    public final void rule__Documents__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( ( ( rule__Documents__Group_3__0 )? ) )
            // InternalMyDsl.g:1201:1: ( ( rule__Documents__Group_3__0 )? )
            {
            // InternalMyDsl.g:1201:1: ( ( rule__Documents__Group_3__0 )? )
            // InternalMyDsl.g:1202:2: ( rule__Documents__Group_3__0 )?
            {
             before(grammarAccess.getDocumentsAccess().getGroup_3()); 
            // InternalMyDsl.g:1203:2: ( rule__Documents__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1203:3: rule__Documents__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Documents__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Documents__Group__3__Impl"


    // $ANTLR start "rule__Documents__Group__4"
    // InternalMyDsl.g:1211:1: rule__Documents__Group__4 : rule__Documents__Group__4__Impl rule__Documents__Group__5 ;
    public final void rule__Documents__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( rule__Documents__Group__4__Impl rule__Documents__Group__5 )
            // InternalMyDsl.g:1216:2: rule__Documents__Group__4__Impl rule__Documents__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Documents__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__5();

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
    // $ANTLR end "rule__Documents__Group__4"


    // $ANTLR start "rule__Documents__Group__4__Impl"
    // InternalMyDsl.g:1223:1: rule__Documents__Group__4__Impl : ( ( rule__Documents__Group_4__0 )? ) ;
    public final void rule__Documents__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( ( ( rule__Documents__Group_4__0 )? ) )
            // InternalMyDsl.g:1228:1: ( ( rule__Documents__Group_4__0 )? )
            {
            // InternalMyDsl.g:1228:1: ( ( rule__Documents__Group_4__0 )? )
            // InternalMyDsl.g:1229:2: ( rule__Documents__Group_4__0 )?
            {
             before(grammarAccess.getDocumentsAccess().getGroup_4()); 
            // InternalMyDsl.g:1230:2: ( rule__Documents__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1230:3: rule__Documents__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Documents__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Documents__Group__4__Impl"


    // $ANTLR start "rule__Documents__Group__5"
    // InternalMyDsl.g:1238:1: rule__Documents__Group__5 : rule__Documents__Group__5__Impl rule__Documents__Group__6 ;
    public final void rule__Documents__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( rule__Documents__Group__5__Impl rule__Documents__Group__6 )
            // InternalMyDsl.g:1243:2: rule__Documents__Group__5__Impl rule__Documents__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Documents__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group__6();

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
    // $ANTLR end "rule__Documents__Group__5"


    // $ANTLR start "rule__Documents__Group__5__Impl"
    // InternalMyDsl.g:1250:1: rule__Documents__Group__5__Impl : ( ( rule__Documents__Group_5__0 )? ) ;
    public final void rule__Documents__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( ( ( rule__Documents__Group_5__0 )? ) )
            // InternalMyDsl.g:1255:1: ( ( rule__Documents__Group_5__0 )? )
            {
            // InternalMyDsl.g:1255:1: ( ( rule__Documents__Group_5__0 )? )
            // InternalMyDsl.g:1256:2: ( rule__Documents__Group_5__0 )?
            {
             before(grammarAccess.getDocumentsAccess().getGroup_5()); 
            // InternalMyDsl.g:1257:2: ( rule__Documents__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1257:3: rule__Documents__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Documents__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentsAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Documents__Group__5__Impl"


    // $ANTLR start "rule__Documents__Group__6"
    // InternalMyDsl.g:1265:1: rule__Documents__Group__6 : rule__Documents__Group__6__Impl ;
    public final void rule__Documents__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( rule__Documents__Group__6__Impl )
            // InternalMyDsl.g:1270:2: rule__Documents__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group__6__Impl();

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
    // $ANTLR end "rule__Documents__Group__6"


    // $ANTLR start "rule__Documents__Group__6__Impl"
    // InternalMyDsl.g:1276:1: rule__Documents__Group__6__Impl : ( '}' ) ;
    public final void rule__Documents__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( '}' ) )
            // InternalMyDsl.g:1281:1: ( '}' )
            {
            // InternalMyDsl.g:1281:1: ( '}' )
            // InternalMyDsl.g:1282:2: '}'
            {
             before(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Documents__Group__6__Impl"


    // $ANTLR start "rule__Documents__Group_3__0"
    // InternalMyDsl.g:1292:1: rule__Documents__Group_3__0 : rule__Documents__Group_3__0__Impl rule__Documents__Group_3__1 ;
    public final void rule__Documents__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( rule__Documents__Group_3__0__Impl rule__Documents__Group_3__1 )
            // InternalMyDsl.g:1297:2: rule__Documents__Group_3__0__Impl rule__Documents__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Documents__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_3__1();

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
    // $ANTLR end "rule__Documents__Group_3__0"


    // $ANTLR start "rule__Documents__Group_3__0__Impl"
    // InternalMyDsl.g:1304:1: rule__Documents__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Documents__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( ( 'id' ) )
            // InternalMyDsl.g:1309:1: ( 'id' )
            {
            // InternalMyDsl.g:1309:1: ( 'id' )
            // InternalMyDsl.g:1310:2: 'id'
            {
             before(grammarAccess.getDocumentsAccess().getIdKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Documents__Group_3__0__Impl"


    // $ANTLR start "rule__Documents__Group_3__1"
    // InternalMyDsl.g:1319:1: rule__Documents__Group_3__1 : rule__Documents__Group_3__1__Impl ;
    public final void rule__Documents__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( rule__Documents__Group_3__1__Impl )
            // InternalMyDsl.g:1324:2: rule__Documents__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group_3__1__Impl();

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
    // $ANTLR end "rule__Documents__Group_3__1"


    // $ANTLR start "rule__Documents__Group_3__1__Impl"
    // InternalMyDsl.g:1330:1: rule__Documents__Group_3__1__Impl : ( ( rule__Documents__IdAssignment_3_1 ) ) ;
    public final void rule__Documents__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( ( ( rule__Documents__IdAssignment_3_1 ) ) )
            // InternalMyDsl.g:1335:1: ( ( rule__Documents__IdAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1335:1: ( ( rule__Documents__IdAssignment_3_1 ) )
            // InternalMyDsl.g:1336:2: ( rule__Documents__IdAssignment_3_1 )
            {
             before(grammarAccess.getDocumentsAccess().getIdAssignment_3_1()); 
            // InternalMyDsl.g:1337:2: ( rule__Documents__IdAssignment_3_1 )
            // InternalMyDsl.g:1337:3: rule__Documents__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Documents__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__Documents__Group_3__1__Impl"


    // $ANTLR start "rule__Documents__Group_4__0"
    // InternalMyDsl.g:1346:1: rule__Documents__Group_4__0 : rule__Documents__Group_4__0__Impl rule__Documents__Group_4__1 ;
    public final void rule__Documents__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( rule__Documents__Group_4__0__Impl rule__Documents__Group_4__1 )
            // InternalMyDsl.g:1351:2: rule__Documents__Group_4__0__Impl rule__Documents__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Documents__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_4__1();

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
    // $ANTLR end "rule__Documents__Group_4__0"


    // $ANTLR start "rule__Documents__Group_4__0__Impl"
    // InternalMyDsl.g:1358:1: rule__Documents__Group_4__0__Impl : ( 'champs' ) ;
    public final void rule__Documents__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1362:1: ( ( 'champs' ) )
            // InternalMyDsl.g:1363:1: ( 'champs' )
            {
            // InternalMyDsl.g:1363:1: ( 'champs' )
            // InternalMyDsl.g:1364:2: 'champs'
            {
             before(grammarAccess.getDocumentsAccess().getChampsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getChampsKeyword_4_0()); 

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
    // $ANTLR end "rule__Documents__Group_4__0__Impl"


    // $ANTLR start "rule__Documents__Group_4__1"
    // InternalMyDsl.g:1373:1: rule__Documents__Group_4__1 : rule__Documents__Group_4__1__Impl rule__Documents__Group_4__2 ;
    public final void rule__Documents__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1377:1: ( rule__Documents__Group_4__1__Impl rule__Documents__Group_4__2 )
            // InternalMyDsl.g:1378:2: rule__Documents__Group_4__1__Impl rule__Documents__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Documents__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_4__2();

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
    // $ANTLR end "rule__Documents__Group_4__1"


    // $ANTLR start "rule__Documents__Group_4__1__Impl"
    // InternalMyDsl.g:1385:1: rule__Documents__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Documents__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1389:1: ( ( '{' ) )
            // InternalMyDsl.g:1390:1: ( '{' )
            {
            // InternalMyDsl.g:1390:1: ( '{' )
            // InternalMyDsl.g:1391:2: '{'
            {
             before(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Documents__Group_4__1__Impl"


    // $ANTLR start "rule__Documents__Group_4__2"
    // InternalMyDsl.g:1400:1: rule__Documents__Group_4__2 : rule__Documents__Group_4__2__Impl rule__Documents__Group_4__3 ;
    public final void rule__Documents__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( rule__Documents__Group_4__2__Impl rule__Documents__Group_4__3 )
            // InternalMyDsl.g:1405:2: rule__Documents__Group_4__2__Impl rule__Documents__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Documents__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_4__3();

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
    // $ANTLR end "rule__Documents__Group_4__2"


    // $ANTLR start "rule__Documents__Group_4__2__Impl"
    // InternalMyDsl.g:1412:1: rule__Documents__Group_4__2__Impl : ( ( rule__Documents__ChampsAssignment_4_2 ) ) ;
    public final void rule__Documents__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( ( ( rule__Documents__ChampsAssignment_4_2 ) ) )
            // InternalMyDsl.g:1417:1: ( ( rule__Documents__ChampsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1417:1: ( ( rule__Documents__ChampsAssignment_4_2 ) )
            // InternalMyDsl.g:1418:2: ( rule__Documents__ChampsAssignment_4_2 )
            {
             before(grammarAccess.getDocumentsAccess().getChampsAssignment_4_2()); 
            // InternalMyDsl.g:1419:2: ( rule__Documents__ChampsAssignment_4_2 )
            // InternalMyDsl.g:1419:3: rule__Documents__ChampsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Documents__ChampsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getChampsAssignment_4_2()); 

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
    // $ANTLR end "rule__Documents__Group_4__2__Impl"


    // $ANTLR start "rule__Documents__Group_4__3"
    // InternalMyDsl.g:1427:1: rule__Documents__Group_4__3 : rule__Documents__Group_4__3__Impl rule__Documents__Group_4__4 ;
    public final void rule__Documents__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( rule__Documents__Group_4__3__Impl rule__Documents__Group_4__4 )
            // InternalMyDsl.g:1432:2: rule__Documents__Group_4__3__Impl rule__Documents__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Documents__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_4__4();

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
    // $ANTLR end "rule__Documents__Group_4__3"


    // $ANTLR start "rule__Documents__Group_4__3__Impl"
    // InternalMyDsl.g:1439:1: rule__Documents__Group_4__3__Impl : ( ( rule__Documents__Group_4_3__0 )* ) ;
    public final void rule__Documents__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ( rule__Documents__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1444:1: ( ( rule__Documents__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1444:1: ( ( rule__Documents__Group_4_3__0 )* )
            // InternalMyDsl.g:1445:2: ( rule__Documents__Group_4_3__0 )*
            {
             before(grammarAccess.getDocumentsAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1446:2: ( rule__Documents__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1446:3: rule__Documents__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Documents__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDocumentsAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Documents__Group_4__3__Impl"


    // $ANTLR start "rule__Documents__Group_4__4"
    // InternalMyDsl.g:1454:1: rule__Documents__Group_4__4 : rule__Documents__Group_4__4__Impl ;
    public final void rule__Documents__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( rule__Documents__Group_4__4__Impl )
            // InternalMyDsl.g:1459:2: rule__Documents__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group_4__4__Impl();

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
    // $ANTLR end "rule__Documents__Group_4__4"


    // $ANTLR start "rule__Documents__Group_4__4__Impl"
    // InternalMyDsl.g:1465:1: rule__Documents__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Documents__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( '}' ) )
            // InternalMyDsl.g:1470:1: ( '}' )
            {
            // InternalMyDsl.g:1470:1: ( '}' )
            // InternalMyDsl.g:1471:2: '}'
            {
             before(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Documents__Group_4__4__Impl"


    // $ANTLR start "rule__Documents__Group_4_3__0"
    // InternalMyDsl.g:1481:1: rule__Documents__Group_4_3__0 : rule__Documents__Group_4_3__0__Impl rule__Documents__Group_4_3__1 ;
    public final void rule__Documents__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( rule__Documents__Group_4_3__0__Impl rule__Documents__Group_4_3__1 )
            // InternalMyDsl.g:1486:2: rule__Documents__Group_4_3__0__Impl rule__Documents__Group_4_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Documents__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_4_3__1();

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
    // $ANTLR end "rule__Documents__Group_4_3__0"


    // $ANTLR start "rule__Documents__Group_4_3__0__Impl"
    // InternalMyDsl.g:1493:1: rule__Documents__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Documents__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( ( ',' ) )
            // InternalMyDsl.g:1498:1: ( ',' )
            {
            // InternalMyDsl.g:1498:1: ( ',' )
            // InternalMyDsl.g:1499:2: ','
            {
             before(grammarAccess.getDocumentsAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Documents__Group_4_3__0__Impl"


    // $ANTLR start "rule__Documents__Group_4_3__1"
    // InternalMyDsl.g:1508:1: rule__Documents__Group_4_3__1 : rule__Documents__Group_4_3__1__Impl ;
    public final void rule__Documents__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( rule__Documents__Group_4_3__1__Impl )
            // InternalMyDsl.g:1513:2: rule__Documents__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Documents__Group_4_3__1"


    // $ANTLR start "rule__Documents__Group_4_3__1__Impl"
    // InternalMyDsl.g:1519:1: rule__Documents__Group_4_3__1__Impl : ( ( rule__Documents__ChampsAssignment_4_3_1 ) ) ;
    public final void rule__Documents__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( ( ( rule__Documents__ChampsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1524:1: ( ( rule__Documents__ChampsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1524:1: ( ( rule__Documents__ChampsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1525:2: ( rule__Documents__ChampsAssignment_4_3_1 )
            {
             before(grammarAccess.getDocumentsAccess().getChampsAssignment_4_3_1()); 
            // InternalMyDsl.g:1526:2: ( rule__Documents__ChampsAssignment_4_3_1 )
            // InternalMyDsl.g:1526:3: rule__Documents__ChampsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Documents__ChampsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getChampsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Documents__Group_4_3__1__Impl"


    // $ANTLR start "rule__Documents__Group_5__0"
    // InternalMyDsl.g:1535:1: rule__Documents__Group_5__0 : rule__Documents__Group_5__0__Impl rule__Documents__Group_5__1 ;
    public final void rule__Documents__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( rule__Documents__Group_5__0__Impl rule__Documents__Group_5__1 )
            // InternalMyDsl.g:1540:2: rule__Documents__Group_5__0__Impl rule__Documents__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Documents__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_5__1();

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
    // $ANTLR end "rule__Documents__Group_5__0"


    // $ANTLR start "rule__Documents__Group_5__0__Impl"
    // InternalMyDsl.g:1547:1: rule__Documents__Group_5__0__Impl : ( 'collections' ) ;
    public final void rule__Documents__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1551:1: ( ( 'collections' ) )
            // InternalMyDsl.g:1552:1: ( 'collections' )
            {
            // InternalMyDsl.g:1552:1: ( 'collections' )
            // InternalMyDsl.g:1553:2: 'collections'
            {
             before(grammarAccess.getDocumentsAccess().getCollectionsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getCollectionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Documents__Group_5__0__Impl"


    // $ANTLR start "rule__Documents__Group_5__1"
    // InternalMyDsl.g:1562:1: rule__Documents__Group_5__1 : rule__Documents__Group_5__1__Impl rule__Documents__Group_5__2 ;
    public final void rule__Documents__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( rule__Documents__Group_5__1__Impl rule__Documents__Group_5__2 )
            // InternalMyDsl.g:1567:2: rule__Documents__Group_5__1__Impl rule__Documents__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Documents__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_5__2();

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
    // $ANTLR end "rule__Documents__Group_5__1"


    // $ANTLR start "rule__Documents__Group_5__1__Impl"
    // InternalMyDsl.g:1574:1: rule__Documents__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Documents__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( ( '{' ) )
            // InternalMyDsl.g:1579:1: ( '{' )
            {
            // InternalMyDsl.g:1579:1: ( '{' )
            // InternalMyDsl.g:1580:2: '{'
            {
             before(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Documents__Group_5__1__Impl"


    // $ANTLR start "rule__Documents__Group_5__2"
    // InternalMyDsl.g:1589:1: rule__Documents__Group_5__2 : rule__Documents__Group_5__2__Impl rule__Documents__Group_5__3 ;
    public final void rule__Documents__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( rule__Documents__Group_5__2__Impl rule__Documents__Group_5__3 )
            // InternalMyDsl.g:1594:2: rule__Documents__Group_5__2__Impl rule__Documents__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Documents__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_5__3();

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
    // $ANTLR end "rule__Documents__Group_5__2"


    // $ANTLR start "rule__Documents__Group_5__2__Impl"
    // InternalMyDsl.g:1601:1: rule__Documents__Group_5__2__Impl : ( ( rule__Documents__CollectionsAssignment_5_2 ) ) ;
    public final void rule__Documents__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( ( ( rule__Documents__CollectionsAssignment_5_2 ) ) )
            // InternalMyDsl.g:1606:1: ( ( rule__Documents__CollectionsAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1606:1: ( ( rule__Documents__CollectionsAssignment_5_2 ) )
            // InternalMyDsl.g:1607:2: ( rule__Documents__CollectionsAssignment_5_2 )
            {
             before(grammarAccess.getDocumentsAccess().getCollectionsAssignment_5_2()); 
            // InternalMyDsl.g:1608:2: ( rule__Documents__CollectionsAssignment_5_2 )
            // InternalMyDsl.g:1608:3: rule__Documents__CollectionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Documents__CollectionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getCollectionsAssignment_5_2()); 

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
    // $ANTLR end "rule__Documents__Group_5__2__Impl"


    // $ANTLR start "rule__Documents__Group_5__3"
    // InternalMyDsl.g:1616:1: rule__Documents__Group_5__3 : rule__Documents__Group_5__3__Impl rule__Documents__Group_5__4 ;
    public final void rule__Documents__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1620:1: ( rule__Documents__Group_5__3__Impl rule__Documents__Group_5__4 )
            // InternalMyDsl.g:1621:2: rule__Documents__Group_5__3__Impl rule__Documents__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Documents__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_5__4();

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
    // $ANTLR end "rule__Documents__Group_5__3"


    // $ANTLR start "rule__Documents__Group_5__3__Impl"
    // InternalMyDsl.g:1628:1: rule__Documents__Group_5__3__Impl : ( ( rule__Documents__Group_5_3__0 )* ) ;
    public final void rule__Documents__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( ( ( rule__Documents__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1633:1: ( ( rule__Documents__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1633:1: ( ( rule__Documents__Group_5_3__0 )* )
            // InternalMyDsl.g:1634:2: ( rule__Documents__Group_5_3__0 )*
            {
             before(grammarAccess.getDocumentsAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1635:2: ( rule__Documents__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1635:3: rule__Documents__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Documents__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDocumentsAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Documents__Group_5__3__Impl"


    // $ANTLR start "rule__Documents__Group_5__4"
    // InternalMyDsl.g:1643:1: rule__Documents__Group_5__4 : rule__Documents__Group_5__4__Impl ;
    public final void rule__Documents__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( rule__Documents__Group_5__4__Impl )
            // InternalMyDsl.g:1648:2: rule__Documents__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group_5__4__Impl();

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
    // $ANTLR end "rule__Documents__Group_5__4"


    // $ANTLR start "rule__Documents__Group_5__4__Impl"
    // InternalMyDsl.g:1654:1: rule__Documents__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Documents__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( '}' ) )
            // InternalMyDsl.g:1659:1: ( '}' )
            {
            // InternalMyDsl.g:1659:1: ( '}' )
            // InternalMyDsl.g:1660:2: '}'
            {
             before(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Documents__Group_5__4__Impl"


    // $ANTLR start "rule__Documents__Group_5_3__0"
    // InternalMyDsl.g:1670:1: rule__Documents__Group_5_3__0 : rule__Documents__Group_5_3__0__Impl rule__Documents__Group_5_3__1 ;
    public final void rule__Documents__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( rule__Documents__Group_5_3__0__Impl rule__Documents__Group_5_3__1 )
            // InternalMyDsl.g:1675:2: rule__Documents__Group_5_3__0__Impl rule__Documents__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Documents__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Documents__Group_5_3__1();

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
    // $ANTLR end "rule__Documents__Group_5_3__0"


    // $ANTLR start "rule__Documents__Group_5_3__0__Impl"
    // InternalMyDsl.g:1682:1: rule__Documents__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Documents__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( ( ',' ) )
            // InternalMyDsl.g:1687:1: ( ',' )
            {
            // InternalMyDsl.g:1687:1: ( ',' )
            // InternalMyDsl.g:1688:2: ','
            {
             before(grammarAccess.getDocumentsAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDocumentsAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Documents__Group_5_3__0__Impl"


    // $ANTLR start "rule__Documents__Group_5_3__1"
    // InternalMyDsl.g:1697:1: rule__Documents__Group_5_3__1 : rule__Documents__Group_5_3__1__Impl ;
    public final void rule__Documents__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( rule__Documents__Group_5_3__1__Impl )
            // InternalMyDsl.g:1702:2: rule__Documents__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Documents__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Documents__Group_5_3__1"


    // $ANTLR start "rule__Documents__Group_5_3__1__Impl"
    // InternalMyDsl.g:1708:1: rule__Documents__Group_5_3__1__Impl : ( ( rule__Documents__CollectionsAssignment_5_3_1 ) ) ;
    public final void rule__Documents__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( ( ( rule__Documents__CollectionsAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1713:1: ( ( rule__Documents__CollectionsAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1713:1: ( ( rule__Documents__CollectionsAssignment_5_3_1 ) )
            // InternalMyDsl.g:1714:2: ( rule__Documents__CollectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getDocumentsAccess().getCollectionsAssignment_5_3_1()); 
            // InternalMyDsl.g:1715:2: ( rule__Documents__CollectionsAssignment_5_3_1 )
            // InternalMyDsl.g:1715:3: rule__Documents__CollectionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Documents__CollectionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentsAccess().getCollectionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Documents__Group_5_3__1__Impl"


    // $ANTLR start "rule__Champ__Group__0"
    // InternalMyDsl.g:1724:1: rule__Champ__Group__0 : rule__Champ__Group__0__Impl rule__Champ__Group__1 ;
    public final void rule__Champ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( rule__Champ__Group__0__Impl rule__Champ__Group__1 )
            // InternalMyDsl.g:1729:2: rule__Champ__Group__0__Impl rule__Champ__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Champ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Champ__Group__1();

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
    // $ANTLR end "rule__Champ__Group__0"


    // $ANTLR start "rule__Champ__Group__0__Impl"
    // InternalMyDsl.g:1736:1: rule__Champ__Group__0__Impl : ( () ) ;
    public final void rule__Champ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1740:1: ( ( () ) )
            // InternalMyDsl.g:1741:1: ( () )
            {
            // InternalMyDsl.g:1741:1: ( () )
            // InternalMyDsl.g:1742:2: ()
            {
             before(grammarAccess.getChampAccess().getChampAction_0()); 
            // InternalMyDsl.g:1743:2: ()
            // InternalMyDsl.g:1743:3: 
            {
            }

             after(grammarAccess.getChampAccess().getChampAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Champ__Group__0__Impl"


    // $ANTLR start "rule__Champ__Group__1"
    // InternalMyDsl.g:1751:1: rule__Champ__Group__1 : rule__Champ__Group__1__Impl rule__Champ__Group__2 ;
    public final void rule__Champ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( rule__Champ__Group__1__Impl rule__Champ__Group__2 )
            // InternalMyDsl.g:1756:2: rule__Champ__Group__1__Impl rule__Champ__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Champ__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Champ__Group__2();

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
    // $ANTLR end "rule__Champ__Group__1"


    // $ANTLR start "rule__Champ__Group__1__Impl"
    // InternalMyDsl.g:1763:1: rule__Champ__Group__1__Impl : ( 'Champ' ) ;
    public final void rule__Champ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( ( 'Champ' ) )
            // InternalMyDsl.g:1768:1: ( 'Champ' )
            {
            // InternalMyDsl.g:1768:1: ( 'Champ' )
            // InternalMyDsl.g:1769:2: 'Champ'
            {
             before(grammarAccess.getChampAccess().getChampKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChampAccess().getChampKeyword_1()); 

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
    // $ANTLR end "rule__Champ__Group__1__Impl"


    // $ANTLR start "rule__Champ__Group__2"
    // InternalMyDsl.g:1778:1: rule__Champ__Group__2 : rule__Champ__Group__2__Impl rule__Champ__Group__3 ;
    public final void rule__Champ__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( rule__Champ__Group__2__Impl rule__Champ__Group__3 )
            // InternalMyDsl.g:1783:2: rule__Champ__Group__2__Impl rule__Champ__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Champ__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Champ__Group__3();

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
    // $ANTLR end "rule__Champ__Group__2"


    // $ANTLR start "rule__Champ__Group__2__Impl"
    // InternalMyDsl.g:1790:1: rule__Champ__Group__2__Impl : ( '{' ) ;
    public final void rule__Champ__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1794:1: ( ( '{' ) )
            // InternalMyDsl.g:1795:1: ( '{' )
            {
            // InternalMyDsl.g:1795:1: ( '{' )
            // InternalMyDsl.g:1796:2: '{'
            {
             before(grammarAccess.getChampAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChampAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Champ__Group__2__Impl"


    // $ANTLR start "rule__Champ__Group__3"
    // InternalMyDsl.g:1805:1: rule__Champ__Group__3 : rule__Champ__Group__3__Impl rule__Champ__Group__4 ;
    public final void rule__Champ__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( rule__Champ__Group__3__Impl rule__Champ__Group__4 )
            // InternalMyDsl.g:1810:2: rule__Champ__Group__3__Impl rule__Champ__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Champ__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Champ__Group__4();

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
    // $ANTLR end "rule__Champ__Group__3"


    // $ANTLR start "rule__Champ__Group__3__Impl"
    // InternalMyDsl.g:1817:1: rule__Champ__Group__3__Impl : ( ( rule__Champ__Group_3__0 )? ) ;
    public final void rule__Champ__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1821:1: ( ( ( rule__Champ__Group_3__0 )? ) )
            // InternalMyDsl.g:1822:1: ( ( rule__Champ__Group_3__0 )? )
            {
            // InternalMyDsl.g:1822:1: ( ( rule__Champ__Group_3__0 )? )
            // InternalMyDsl.g:1823:2: ( rule__Champ__Group_3__0 )?
            {
             before(grammarAccess.getChampAccess().getGroup_3()); 
            // InternalMyDsl.g:1824:2: ( rule__Champ__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1824:3: rule__Champ__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Champ__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChampAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Champ__Group__3__Impl"


    // $ANTLR start "rule__Champ__Group__4"
    // InternalMyDsl.g:1832:1: rule__Champ__Group__4 : rule__Champ__Group__4__Impl ;
    public final void rule__Champ__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( rule__Champ__Group__4__Impl )
            // InternalMyDsl.g:1837:2: rule__Champ__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Champ__Group__4__Impl();

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
    // $ANTLR end "rule__Champ__Group__4"


    // $ANTLR start "rule__Champ__Group__4__Impl"
    // InternalMyDsl.g:1843:1: rule__Champ__Group__4__Impl : ( '}' ) ;
    public final void rule__Champ__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( ( '}' ) )
            // InternalMyDsl.g:1848:1: ( '}' )
            {
            // InternalMyDsl.g:1848:1: ( '}' )
            // InternalMyDsl.g:1849:2: '}'
            {
             before(grammarAccess.getChampAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChampAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Champ__Group__4__Impl"


    // $ANTLR start "rule__Champ__Group_3__0"
    // InternalMyDsl.g:1859:1: rule__Champ__Group_3__0 : rule__Champ__Group_3__0__Impl rule__Champ__Group_3__1 ;
    public final void rule__Champ__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( rule__Champ__Group_3__0__Impl rule__Champ__Group_3__1 )
            // InternalMyDsl.g:1864:2: rule__Champ__Group_3__0__Impl rule__Champ__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Champ__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Champ__Group_3__1();

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
    // $ANTLR end "rule__Champ__Group_3__0"


    // $ANTLR start "rule__Champ__Group_3__0__Impl"
    // InternalMyDsl.g:1871:1: rule__Champ__Group_3__0__Impl : ( 'champ' ) ;
    public final void rule__Champ__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( ( 'champ' ) )
            // InternalMyDsl.g:1876:1: ( 'champ' )
            {
            // InternalMyDsl.g:1876:1: ( 'champ' )
            // InternalMyDsl.g:1877:2: 'champ'
            {
             before(grammarAccess.getChampAccess().getChampKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChampAccess().getChampKeyword_3_0()); 

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
    // $ANTLR end "rule__Champ__Group_3__0__Impl"


    // $ANTLR start "rule__Champ__Group_3__1"
    // InternalMyDsl.g:1886:1: rule__Champ__Group_3__1 : rule__Champ__Group_3__1__Impl ;
    public final void rule__Champ__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( rule__Champ__Group_3__1__Impl )
            // InternalMyDsl.g:1891:2: rule__Champ__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Champ__Group_3__1__Impl();

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
    // $ANTLR end "rule__Champ__Group_3__1"


    // $ANTLR start "rule__Champ__Group_3__1__Impl"
    // InternalMyDsl.g:1897:1: rule__Champ__Group_3__1__Impl : ( ( rule__Champ__ChampAssignment_3_1 ) ) ;
    public final void rule__Champ__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( ( ( rule__Champ__ChampAssignment_3_1 ) ) )
            // InternalMyDsl.g:1902:1: ( ( rule__Champ__ChampAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1902:1: ( ( rule__Champ__ChampAssignment_3_1 ) )
            // InternalMyDsl.g:1903:2: ( rule__Champ__ChampAssignment_3_1 )
            {
             before(grammarAccess.getChampAccess().getChampAssignment_3_1()); 
            // InternalMyDsl.g:1904:2: ( rule__Champ__ChampAssignment_3_1 )
            // InternalMyDsl.g:1904:3: rule__Champ__ChampAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Champ__ChampAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChampAccess().getChampAssignment_3_1()); 

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
    // $ANTLR end "rule__Champ__Group_3__1__Impl"


    // $ANTLR start "rule__BDD__TypeAssignment_3_1"
    // InternalMyDsl.g:1913:1: rule__BDD__TypeAssignment_3_1 : ( ruleTypeBDD ) ;
    public final void rule__BDD__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( ruleTypeBDD ) )
            // InternalMyDsl.g:1918:2: ( ruleTypeBDD )
            {
            // InternalMyDsl.g:1918:2: ( ruleTypeBDD )
            // InternalMyDsl.g:1919:3: ruleTypeBDD
            {
             before(grammarAccess.getBDDAccess().getTypeTypeBDDEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBDD();

            state._fsp--;

             after(grammarAccess.getBDDAccess().getTypeTypeBDDEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__BDD__TypeAssignment_3_1"


    // $ANTLR start "rule__BDD__CollectionsAssignment_4_2"
    // InternalMyDsl.g:1928:1: rule__BDD__CollectionsAssignment_4_2 : ( ruleCollection ) ;
    public final void rule__BDD__CollectionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:1933:2: ( ruleCollection )
            {
            // InternalMyDsl.g:1933:2: ( ruleCollection )
            // InternalMyDsl.g:1934:3: ruleCollection
            {
             before(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__BDD__CollectionsAssignment_4_2"


    // $ANTLR start "rule__BDD__CollectionsAssignment_4_3_1"
    // InternalMyDsl.g:1943:1: rule__BDD__CollectionsAssignment_4_3_1 : ( ruleCollection ) ;
    public final void rule__BDD__CollectionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:1948:2: ( ruleCollection )
            {
            // InternalMyDsl.g:1948:2: ( ruleCollection )
            // InternalMyDsl.g:1949:3: ruleCollection
            {
             before(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__BDD__CollectionsAssignment_4_3_1"


    // $ANTLR start "rule__Collection__TitreAssignment_3_1"
    // InternalMyDsl.g:1958:1: rule__Collection__TitreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Collection__TitreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1963:2: ( ruleEString )
            {
            // InternalMyDsl.g:1963:2: ( ruleEString )
            // InternalMyDsl.g:1964:3: ruleEString
            {
             before(grammarAccess.getCollectionAccess().getTitreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getTitreEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Collection__TitreAssignment_3_1"


    // $ANTLR start "rule__Collection__DocumentsAssignment_4_2"
    // InternalMyDsl.g:1973:1: rule__Collection__DocumentsAssignment_4_2 : ( ruleDocuments ) ;
    public final void rule__Collection__DocumentsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( ( ruleDocuments ) )
            // InternalMyDsl.g:1978:2: ( ruleDocuments )
            {
            // InternalMyDsl.g:1978:2: ( ruleDocuments )
            // InternalMyDsl.g:1979:3: ruleDocuments
            {
             before(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDocuments();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Collection__DocumentsAssignment_4_2"


    // $ANTLR start "rule__Collection__DocumentsAssignment_4_3_1"
    // InternalMyDsl.g:1988:1: rule__Collection__DocumentsAssignment_4_3_1 : ( ruleDocuments ) ;
    public final void rule__Collection__DocumentsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( ruleDocuments ) )
            // InternalMyDsl.g:1993:2: ( ruleDocuments )
            {
            // InternalMyDsl.g:1993:2: ( ruleDocuments )
            // InternalMyDsl.g:1994:3: ruleDocuments
            {
             before(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocuments();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Collection__DocumentsAssignment_4_3_1"


    // $ANTLR start "rule__Documents__IdAssignment_3_1"
    // InternalMyDsl.g:2003:1: rule__Documents__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Documents__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2008:2: ( ruleEString )
            {
            // InternalMyDsl.g:2008:2: ( ruleEString )
            // InternalMyDsl.g:2009:3: ruleEString
            {
             before(grammarAccess.getDocumentsAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDocumentsAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Documents__IdAssignment_3_1"


    // $ANTLR start "rule__Documents__ChampsAssignment_4_2"
    // InternalMyDsl.g:2018:1: rule__Documents__ChampsAssignment_4_2 : ( ruleChamp ) ;
    public final void rule__Documents__ChampsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( ruleChamp ) )
            // InternalMyDsl.g:2023:2: ( ruleChamp )
            {
            // InternalMyDsl.g:2023:2: ( ruleChamp )
            // InternalMyDsl.g:2024:3: ruleChamp
            {
             before(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChamp();

            state._fsp--;

             after(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Documents__ChampsAssignment_4_2"


    // $ANTLR start "rule__Documents__ChampsAssignment_4_3_1"
    // InternalMyDsl.g:2033:1: rule__Documents__ChampsAssignment_4_3_1 : ( ruleChamp ) ;
    public final void rule__Documents__ChampsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ruleChamp ) )
            // InternalMyDsl.g:2038:2: ( ruleChamp )
            {
            // InternalMyDsl.g:2038:2: ( ruleChamp )
            // InternalMyDsl.g:2039:3: ruleChamp
            {
             before(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChamp();

            state._fsp--;

             after(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Documents__ChampsAssignment_4_3_1"


    // $ANTLR start "rule__Documents__CollectionsAssignment_5_2"
    // InternalMyDsl.g:2048:1: rule__Documents__CollectionsAssignment_5_2 : ( ruleCollection ) ;
    public final void rule__Documents__CollectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:2053:2: ( ruleCollection )
            {
            // InternalMyDsl.g:2053:2: ( ruleCollection )
            // InternalMyDsl.g:2054:3: ruleCollection
            {
             before(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Documents__CollectionsAssignment_5_2"


    // $ANTLR start "rule__Documents__CollectionsAssignment_5_3_1"
    // InternalMyDsl.g:2063:1: rule__Documents__CollectionsAssignment_5_3_1 : ( ruleCollection ) ;
    public final void rule__Documents__CollectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:2068:2: ( ruleCollection )
            {
            // InternalMyDsl.g:2068:2: ( ruleCollection )
            // InternalMyDsl.g:2069:3: ruleCollection
            {
             before(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Documents__CollectionsAssignment_5_3_1"


    // $ANTLR start "rule__Champ__ChampAssignment_3_1"
    // InternalMyDsl.g:2078:1: rule__Champ__ChampAssignment_3_1 : ( ruleTypeChamp ) ;
    public final void rule__Champ__ChampAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ruleTypeChamp ) )
            // InternalMyDsl.g:2083:2: ( ruleTypeChamp )
            {
            // InternalMyDsl.g:2083:2: ( ruleTypeChamp )
            // InternalMyDsl.g:2084:3: ruleTypeChamp
            {
             before(grammarAccess.getChampAccess().getChampTypeChampEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeChamp();

            state._fsp--;

             after(grammarAccess.getChampAccess().getChampTypeChampEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Champ__ChampAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000182800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001FF000L});

}