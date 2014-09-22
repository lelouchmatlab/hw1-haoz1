
/* First created by JCasGen Sun Sep 21 16:14:33 EDT 2014 */
package model.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Sun Sep 21 21:52:30 EDT 2014
 * @generated */
public class NERannotation_Type extends base_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NERannotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NERannotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NERannotation(addr, NERannotation_Type.this);
  			   NERannotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NERannotation(addr, NERannotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NERannotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.type.NERannotation");
 
  /** @generated */
  final Feature casFeat_NameEntity;
  /** @generated */
  final int     casFeatCode_NameEntity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNameEntity(int addr) {
        if (featOkTst && casFeat_NameEntity == null)
      jcas.throwFeatMissing("NameEntity", "model.type.NERannotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NameEntity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNameEntity(int addr, String v) {
        if (featOkTst && casFeat_NameEntity == null)
      jcas.throwFeatMissing("NameEntity", "model.type.NERannotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_NameEntity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceSentenceID;
  /** @generated */
  final int     casFeatCode_SourceSentenceID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSourceSentenceID(int addr) {
        if (featOkTst && casFeat_SourceSentenceID == null)
      jcas.throwFeatMissing("SourceSentenceID", "model.type.NERannotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceSentenceID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceSentenceID(int addr, String v) {
        if (featOkTst && casFeat_SourceSentenceID == null)
      jcas.throwFeatMissing("SourceSentenceID", "model.type.NERannotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceSentenceID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NERannotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NameEntity = jcas.getRequiredFeatureDE(casType, "NameEntity", "uima.cas.String", featOkTst);
    casFeatCode_NameEntity  = (null == casFeat_NameEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NameEntity).getCode();

 
    casFeat_SourceSentenceID = jcas.getRequiredFeatureDE(casType, "SourceSentenceID", "uima.cas.String", featOkTst);
    casFeatCode_SourceSentenceID  = (null == casFeat_SourceSentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceSentenceID).getCode();

  }
}



    