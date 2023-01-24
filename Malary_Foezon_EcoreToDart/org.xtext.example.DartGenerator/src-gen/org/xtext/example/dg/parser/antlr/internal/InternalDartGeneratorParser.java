package org.xtext.example.dg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dg.services.DartGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDartGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BDD'", "'{'", "'type'", "'collections'", "','", "'}'", "'Collection'", "'titre'", "'documents'", "'Documents'", "'id'", "'champs'", "'Champ'", "'champ'", "'FIREBASE'", "'STRING'", "'BOOLEAN'", "'MAP'", "'ARRAY'", "'NULL'", "'TIMESTAMP'", "'GEOPOINT'", "'REFERENCE'", "'NUMBER'"
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


        public InternalDartGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDartGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDartGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDartGenerator.g"; }



     	private DartGeneratorGrammarAccess grammarAccess;

        public InternalDartGeneratorParser(TokenStream input, DartGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BDD";
       	}

       	@Override
       	protected DartGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBDD"
    // InternalDartGenerator.g:65:1: entryRuleBDD returns [EObject current=null] : iv_ruleBDD= ruleBDD EOF ;
    public final EObject entryRuleBDD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBDD = null;


        try {
            // InternalDartGenerator.g:65:44: (iv_ruleBDD= ruleBDD EOF )
            // InternalDartGenerator.g:66:2: iv_ruleBDD= ruleBDD EOF
            {
             newCompositeNode(grammarAccess.getBDDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBDD=ruleBDD();

            state._fsp--;

             current =iv_ruleBDD; 
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
    // $ANTLR end "entryRuleBDD"


    // $ANTLR start "ruleBDD"
    // InternalDartGenerator.g:72:1: ruleBDD returns [EObject current=null] : ( () otherlv_1= 'BDD' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )? (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleBDD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_collections_7_0 = null;

        EObject lv_collections_9_0 = null;



        	enterRule();

        try {
            // InternalDartGenerator.g:78:2: ( ( () otherlv_1= 'BDD' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )? (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDartGenerator.g:79:2: ( () otherlv_1= 'BDD' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )? (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDartGenerator.g:79:2: ( () otherlv_1= 'BDD' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )? (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDartGenerator.g:80:3: () otherlv_1= 'BDD' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )? (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalDartGenerator.g:80:3: ()
            // InternalDartGenerator.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBDDAccess().getBDDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBDDAccess().getBDDKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDartGenerator.g:95:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDartGenerator.g:96:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeBDD ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBDDAccess().getTypeKeyword_3_0());
                    			
                    // InternalDartGenerator.g:100:4: ( (lv_type_4_0= ruleTypeBDD ) )
                    // InternalDartGenerator.g:101:5: (lv_type_4_0= ruleTypeBDD )
                    {
                    // InternalDartGenerator.g:101:5: (lv_type_4_0= ruleTypeBDD )
                    // InternalDartGenerator.g:102:6: lv_type_4_0= ruleTypeBDD
                    {

                    						newCompositeNode(grammarAccess.getBDDAccess().getTypeTypeBDDEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_type_4_0=ruleTypeBDD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBDDRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.dg.DartGenerator.TypeBDD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDartGenerator.g:120:3: (otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDartGenerator.g:121:4: otherlv_5= 'collections' otherlv_6= '{' ( (lv_collections_7_0= ruleCollection ) ) (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBDDAccess().getCollectionsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getBDDAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDartGenerator.g:129:4: ( (lv_collections_7_0= ruleCollection ) )
                    // InternalDartGenerator.g:130:5: (lv_collections_7_0= ruleCollection )
                    {
                    // InternalDartGenerator.g:130:5: (lv_collections_7_0= ruleCollection )
                    // InternalDartGenerator.g:131:6: lv_collections_7_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_collections_7_0=ruleCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBDDRule());
                    						}
                    						add(
                    							current,
                    							"collections",
                    							lv_collections_7_0,
                    							"org.xtext.example.dg.DartGenerator.Collection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDartGenerator.g:148:4: (otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDartGenerator.g:149:5: otherlv_8= ',' ( (lv_collections_9_0= ruleCollection ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBDDAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDartGenerator.g:153:5: ( (lv_collections_9_0= ruleCollection ) )
                    	    // InternalDartGenerator.g:154:6: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalDartGenerator.g:154:6: (lv_collections_9_0= ruleCollection )
                    	    // InternalDartGenerator.g:155:7: lv_collections_9_0= ruleCollection
                    	    {

                    	    							newCompositeNode(grammarAccess.getBDDAccess().getCollectionsCollectionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_collections_9_0=ruleCollection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBDDRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collections",
                    	    								lv_collections_9_0,
                    	    								"org.xtext.example.dg.DartGenerator.Collection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBDDAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBDD"


    // $ANTLR start "entryRuleCollection"
    // InternalDartGenerator.g:186:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalDartGenerator.g:186:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalDartGenerator.g:187:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalDartGenerator.g:193:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= 'Collection' otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )? (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_titre_4_0 = null;

        EObject lv_documents_7_0 = null;

        EObject lv_documents_9_0 = null;



        	enterRule();

        try {
            // InternalDartGenerator.g:199:2: ( ( () otherlv_1= 'Collection' otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )? (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDartGenerator.g:200:2: ( () otherlv_1= 'Collection' otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )? (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDartGenerator.g:200:2: ( () otherlv_1= 'Collection' otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )? (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDartGenerator.g:201:3: () otherlv_1= 'Collection' otherlv_2= '{' (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )? (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalDartGenerator.g:201:3: ()
            // InternalDartGenerator.g:202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollectionAccess().getCollectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getCollectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDartGenerator.g:216:3: (otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDartGenerator.g:217:4: otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getTitreKeyword_3_0());
                    			
                    // InternalDartGenerator.g:221:4: ( (lv_titre_4_0= ruleEString ) )
                    // InternalDartGenerator.g:222:5: (lv_titre_4_0= ruleEString )
                    {
                    // InternalDartGenerator.g:222:5: (lv_titre_4_0= ruleEString )
                    // InternalDartGenerator.g:223:6: lv_titre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getTitreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_titre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionRule());
                    						}
                    						set(
                    							current,
                    							"titre",
                    							lv_titre_4_0,
                    							"org.xtext.example.dg.DartGenerator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDartGenerator.g:241:3: (otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDartGenerator.g:242:4: otherlv_5= 'documents' otherlv_6= '{' ( (lv_documents_7_0= ruleDocuments ) ) (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getDocumentsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDartGenerator.g:250:4: ( (lv_documents_7_0= ruleDocuments ) )
                    // InternalDartGenerator.g:251:5: (lv_documents_7_0= ruleDocuments )
                    {
                    // InternalDartGenerator.g:251:5: (lv_documents_7_0= ruleDocuments )
                    // InternalDartGenerator.g:252:6: lv_documents_7_0= ruleDocuments
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_documents_7_0=ruleDocuments();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionRule());
                    						}
                    						add(
                    							current,
                    							"documents",
                    							lv_documents_7_0,
                    							"org.xtext.example.dg.DartGenerator.Documents");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDartGenerator.g:269:4: (otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDartGenerator.g:270:5: otherlv_8= ',' ( (lv_documents_9_0= ruleDocuments ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDartGenerator.g:274:5: ( (lv_documents_9_0= ruleDocuments ) )
                    	    // InternalDartGenerator.g:275:6: (lv_documents_9_0= ruleDocuments )
                    	    {
                    	    // InternalDartGenerator.g:275:6: (lv_documents_9_0= ruleDocuments )
                    	    // InternalDartGenerator.g:276:7: lv_documents_9_0= ruleDocuments
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentsParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_documents_9_0=ruleDocuments();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"documents",
                    	    								lv_documents_9_0,
                    	    								"org.xtext.example.dg.DartGenerator.Documents");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleEString"
    // InternalDartGenerator.g:307:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDartGenerator.g:307:47: (iv_ruleEString= ruleEString EOF )
            // InternalDartGenerator.g:308:2: iv_ruleEString= ruleEString EOF
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
    // InternalDartGenerator.g:314:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDartGenerator.g:320:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDartGenerator.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDartGenerator.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDartGenerator.g:322:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDartGenerator.g:330:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDocuments"
    // InternalDartGenerator.g:341:1: entryRuleDocuments returns [EObject current=null] : iv_ruleDocuments= ruleDocuments EOF ;
    public final EObject entryRuleDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocuments = null;


        try {
            // InternalDartGenerator.g:341:50: (iv_ruleDocuments= ruleDocuments EOF )
            // InternalDartGenerator.g:342:2: iv_ruleDocuments= ruleDocuments EOF
            {
             newCompositeNode(grammarAccess.getDocumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocuments=ruleDocuments();

            state._fsp--;

             current =iv_ruleDocuments; 
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
    // $ANTLR end "entryRuleDocuments"


    // $ANTLR start "ruleDocuments"
    // InternalDartGenerator.g:348:1: ruleDocuments returns [EObject current=null] : ( () otherlv_1= 'Documents' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )? (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_champs_7_0 = null;

        EObject lv_champs_9_0 = null;

        EObject lv_collections_13_0 = null;

        EObject lv_collections_15_0 = null;



        	enterRule();

        try {
            // InternalDartGenerator.g:354:2: ( ( () otherlv_1= 'Documents' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )? (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalDartGenerator.g:355:2: ( () otherlv_1= 'Documents' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )? (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalDartGenerator.g:355:2: ( () otherlv_1= 'Documents' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )? (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalDartGenerator.g:356:3: () otherlv_1= 'Documents' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )? (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalDartGenerator.g:356:3: ()
            // InternalDartGenerator.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentsAccess().getDocumentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentsAccess().getDocumentsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDartGenerator.g:371:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDartGenerator.g:372:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getDocumentsAccess().getIdKeyword_3_0());
                    			
                    // InternalDartGenerator.g:376:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDartGenerator.g:377:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDartGenerator.g:377:5: (lv_id_4_0= ruleEString )
                    // InternalDartGenerator.g:378:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentsAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentsRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.example.dg.DartGenerator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDartGenerator.g:396:3: (otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDartGenerator.g:397:4: otherlv_5= 'champs' otherlv_6= '{' ( (lv_champs_7_0= ruleChamp ) ) (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDocumentsAccess().getChampsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDartGenerator.g:405:4: ( (lv_champs_7_0= ruleChamp ) )
                    // InternalDartGenerator.g:406:5: (lv_champs_7_0= ruleChamp )
                    {
                    // InternalDartGenerator.g:406:5: (lv_champs_7_0= ruleChamp )
                    // InternalDartGenerator.g:407:6: lv_champs_7_0= ruleChamp
                    {

                    						newCompositeNode(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_champs_7_0=ruleChamp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentsRule());
                    						}
                    						add(
                    							current,
                    							"champs",
                    							lv_champs_7_0,
                    							"org.xtext.example.dg.DartGenerator.Champ");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDartGenerator.g:424:4: (otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDartGenerator.g:425:5: otherlv_8= ',' ( (lv_champs_9_0= ruleChamp ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDocumentsAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDartGenerator.g:429:5: ( (lv_champs_9_0= ruleChamp ) )
                    	    // InternalDartGenerator.g:430:6: (lv_champs_9_0= ruleChamp )
                    	    {
                    	    // InternalDartGenerator.g:430:6: (lv_champs_9_0= ruleChamp )
                    	    // InternalDartGenerator.g:431:7: lv_champs_9_0= ruleChamp
                    	    {

                    	    							newCompositeNode(grammarAccess.getDocumentsAccess().getChampsChampParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_champs_9_0=ruleChamp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDocumentsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"champs",
                    	    								lv_champs_9_0,
                    	    								"org.xtext.example.dg.DartGenerator.Champ");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDartGenerator.g:454:3: (otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDartGenerator.g:455:4: otherlv_11= 'collections' otherlv_12= '{' ( (lv_collections_13_0= ruleCollection ) ) (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDocumentsAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getDocumentsAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDartGenerator.g:463:4: ( (lv_collections_13_0= ruleCollection ) )
                    // InternalDartGenerator.g:464:5: (lv_collections_13_0= ruleCollection )
                    {
                    // InternalDartGenerator.g:464:5: (lv_collections_13_0= ruleCollection )
                    // InternalDartGenerator.g:465:6: lv_collections_13_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_collections_13_0=ruleCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentsRule());
                    						}
                    						add(
                    							current,
                    							"collections",
                    							lv_collections_13_0,
                    							"org.xtext.example.dg.DartGenerator.Collection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDartGenerator.g:482:4: (otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDartGenerator.g:483:5: otherlv_14= ',' ( (lv_collections_15_0= ruleCollection ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDocumentsAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDartGenerator.g:487:5: ( (lv_collections_15_0= ruleCollection ) )
                    	    // InternalDartGenerator.g:488:6: (lv_collections_15_0= ruleCollection )
                    	    {
                    	    // InternalDartGenerator.g:488:6: (lv_collections_15_0= ruleCollection )
                    	    // InternalDartGenerator.g:489:7: lv_collections_15_0= ruleCollection
                    	    {

                    	    							newCompositeNode(grammarAccess.getDocumentsAccess().getCollectionsCollectionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_collections_15_0=ruleCollection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDocumentsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collections",
                    	    								lv_collections_15_0,
                    	    								"org.xtext.example.dg.DartGenerator.Collection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getDocumentsAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDocuments"


    // $ANTLR start "entryRuleChamp"
    // InternalDartGenerator.g:520:1: entryRuleChamp returns [EObject current=null] : iv_ruleChamp= ruleChamp EOF ;
    public final EObject entryRuleChamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChamp = null;


        try {
            // InternalDartGenerator.g:520:46: (iv_ruleChamp= ruleChamp EOF )
            // InternalDartGenerator.g:521:2: iv_ruleChamp= ruleChamp EOF
            {
             newCompositeNode(grammarAccess.getChampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChamp=ruleChamp();

            state._fsp--;

             current =iv_ruleChamp; 
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
    // $ANTLR end "entryRuleChamp"


    // $ANTLR start "ruleChamp"
    // InternalDartGenerator.g:527:1: ruleChamp returns [EObject current=null] : ( () otherlv_1= 'Champ' otherlv_2= '{' (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleChamp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_champ_4_0 = null;



        	enterRule();

        try {
            // InternalDartGenerator.g:533:2: ( ( () otherlv_1= 'Champ' otherlv_2= '{' (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )? otherlv_5= '}' ) )
            // InternalDartGenerator.g:534:2: ( () otherlv_1= 'Champ' otherlv_2= '{' (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )? otherlv_5= '}' )
            {
            // InternalDartGenerator.g:534:2: ( () otherlv_1= 'Champ' otherlv_2= '{' (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )? otherlv_5= '}' )
            // InternalDartGenerator.g:535:3: () otherlv_1= 'Champ' otherlv_2= '{' (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )? otherlv_5= '}'
            {
            // InternalDartGenerator.g:535:3: ()
            // InternalDartGenerator.g:536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChampAccess().getChampAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getChampAccess().getChampKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getChampAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDartGenerator.g:550:3: (otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDartGenerator.g:551:4: otherlv_3= 'champ' ( (lv_champ_4_0= ruleTypeChamp ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getChampAccess().getChampKeyword_3_0());
                    			
                    // InternalDartGenerator.g:555:4: ( (lv_champ_4_0= ruleTypeChamp ) )
                    // InternalDartGenerator.g:556:5: (lv_champ_4_0= ruleTypeChamp )
                    {
                    // InternalDartGenerator.g:556:5: (lv_champ_4_0= ruleTypeChamp )
                    // InternalDartGenerator.g:557:6: lv_champ_4_0= ruleTypeChamp
                    {

                    						newCompositeNode(grammarAccess.getChampAccess().getChampTypeChampEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_champ_4_0=ruleTypeChamp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChampRule());
                    						}
                    						set(
                    							current,
                    							"champ",
                    							lv_champ_4_0,
                    							"org.xtext.example.dg.DartGenerator.TypeChamp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChampAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleChamp"


    // $ANTLR start "ruleTypeBDD"
    // InternalDartGenerator.g:583:1: ruleTypeBDD returns [Enumerator current=null] : (enumLiteral_0= 'FIREBASE' ) ;
    public final Enumerator ruleTypeBDD() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDartGenerator.g:589:2: ( (enumLiteral_0= 'FIREBASE' ) )
            // InternalDartGenerator.g:590:2: (enumLiteral_0= 'FIREBASE' )
            {
            // InternalDartGenerator.g:590:2: (enumLiteral_0= 'FIREBASE' )
            // InternalDartGenerator.g:591:3: enumLiteral_0= 'FIREBASE'
            {
            enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

            			current = grammarAccess.getTypeBDDAccess().getFIREBASEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getTypeBDDAccess().getFIREBASEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleTypeBDD"


    // $ANTLR start "ruleTypeChamp"
    // InternalDartGenerator.g:600:1: ruleTypeChamp returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'MAP' ) | (enumLiteral_3= 'ARRAY' ) | (enumLiteral_4= 'NULL' ) | (enumLiteral_5= 'TIMESTAMP' ) | (enumLiteral_6= 'GEOPOINT' ) | (enumLiteral_7= 'REFERENCE' ) | (enumLiteral_8= 'NUMBER' ) ) ;
    public final Enumerator ruleTypeChamp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDartGenerator.g:606:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'MAP' ) | (enumLiteral_3= 'ARRAY' ) | (enumLiteral_4= 'NULL' ) | (enumLiteral_5= 'TIMESTAMP' ) | (enumLiteral_6= 'GEOPOINT' ) | (enumLiteral_7= 'REFERENCE' ) | (enumLiteral_8= 'NUMBER' ) ) )
            // InternalDartGenerator.g:607:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'MAP' ) | (enumLiteral_3= 'ARRAY' ) | (enumLiteral_4= 'NULL' ) | (enumLiteral_5= 'TIMESTAMP' ) | (enumLiteral_6= 'GEOPOINT' ) | (enumLiteral_7= 'REFERENCE' ) | (enumLiteral_8= 'NUMBER' ) )
            {
            // InternalDartGenerator.g:607:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'MAP' ) | (enumLiteral_3= 'ARRAY' ) | (enumLiteral_4= 'NULL' ) | (enumLiteral_5= 'TIMESTAMP' ) | (enumLiteral_6= 'GEOPOINT' ) | (enumLiteral_7= 'REFERENCE' ) | (enumLiteral_8= 'NUMBER' ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 30:
                {
                alt14=5;
                }
                break;
            case 31:
                {
                alt14=6;
                }
                break;
            case 32:
                {
                alt14=7;
                }
                break;
            case 33:
                {
                alt14=8;
                }
                break;
            case 34:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDartGenerator.g:608:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalDartGenerator.g:608:3: (enumLiteral_0= 'STRING' )
                    // InternalDartGenerator.g:609:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeChampAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDartGenerator.g:616:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDartGenerator.g:616:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDartGenerator.g:617:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeChampAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDartGenerator.g:624:3: (enumLiteral_2= 'MAP' )
                    {
                    // InternalDartGenerator.g:624:3: (enumLiteral_2= 'MAP' )
                    // InternalDartGenerator.g:625:4: enumLiteral_2= 'MAP'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getMAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeChampAccess().getMAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDartGenerator.g:632:3: (enumLiteral_3= 'ARRAY' )
                    {
                    // InternalDartGenerator.g:632:3: (enumLiteral_3= 'ARRAY' )
                    // InternalDartGenerator.g:633:4: enumLiteral_3= 'ARRAY'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getARRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeChampAccess().getARRAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDartGenerator.g:640:3: (enumLiteral_4= 'NULL' )
                    {
                    // InternalDartGenerator.g:640:3: (enumLiteral_4= 'NULL' )
                    // InternalDartGenerator.g:641:4: enumLiteral_4= 'NULL'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getNULLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeChampAccess().getNULLEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDartGenerator.g:648:3: (enumLiteral_5= 'TIMESTAMP' )
                    {
                    // InternalDartGenerator.g:648:3: (enumLiteral_5= 'TIMESTAMP' )
                    // InternalDartGenerator.g:649:4: enumLiteral_5= 'TIMESTAMP'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getTIMESTAMPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeChampAccess().getTIMESTAMPEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDartGenerator.g:656:3: (enumLiteral_6= 'GEOPOINT' )
                    {
                    // InternalDartGenerator.g:656:3: (enumLiteral_6= 'GEOPOINT' )
                    // InternalDartGenerator.g:657:4: enumLiteral_6= 'GEOPOINT'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getGEOPOINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeChampAccess().getGEOPOINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDartGenerator.g:664:3: (enumLiteral_7= 'REFERENCE' )
                    {
                    // InternalDartGenerator.g:664:3: (enumLiteral_7= 'REFERENCE' )
                    // InternalDartGenerator.g:665:4: enumLiteral_7= 'REFERENCE'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getREFERENCEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeChampAccess().getREFERENCEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDartGenerator.g:672:3: (enumLiteral_8= 'NUMBER' )
                    {
                    // InternalDartGenerator.g:672:3: (enumLiteral_8= 'NUMBER' )
                    // InternalDartGenerator.g:673:4: enumLiteral_8= 'NUMBER'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeChampAccess().getNUMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeChampAccess().getNUMBEREnumLiteralDeclaration_8());
                    			

                    }


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
    // $ANTLR end "ruleTypeChamp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000614000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000414000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007FC000000L});

}