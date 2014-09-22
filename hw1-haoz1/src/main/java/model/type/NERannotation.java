

/* First created by JCasGen Sun Sep 21 16:14:33 EDT 2014 */
package model.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Sun Sep 21 21:52:30 EDT 2014
 * XML source: /home/haoz1/mygit/hw1-haoz1/hw1-haoz1/src/main/resources/descriptor/casConsumerDescriptor.xml
 * @generated */
public class NERannotation extends base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NERannotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NERannotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NERannotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NERannotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NERannotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: NameEntity

  /** getter for NameEntity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNameEntity() {
    if (NERannotation_Type.featOkTst && ((NERannotation_Type)jcasType).casFeat_NameEntity == null)
      jcasType.jcas.throwFeatMissing("NameEntity", "model.type.NERannotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NERannotation_Type)jcasType).casFeatCode_NameEntity);}
    
  /** setter for NameEntity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNameEntity(String v) {
    if (NERannotation_Type.featOkTst && ((NERannotation_Type)jcasType).casFeat_NameEntity == null)
      jcasType.jcas.throwFeatMissing("NameEntity", "model.type.NERannotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NERannotation_Type)jcasType).casFeatCode_NameEntity, v);}    
   
    
  //*--------------*
  //* Feature: SourceSentenceID

  /** getter for SourceSentenceID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceSentenceID() {
    if (NERannotation_Type.featOkTst && ((NERannotation_Type)jcasType).casFeat_SourceSentenceID == null)
      jcasType.jcas.throwFeatMissing("SourceSentenceID", "model.type.NERannotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NERannotation_Type)jcasType).casFeatCode_SourceSentenceID);}
    
  /** setter for SourceSentenceID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceSentenceID(String v) {
    if (NERannotation_Type.featOkTst && ((NERannotation_Type)jcasType).casFeat_SourceSentenceID == null)
      jcasType.jcas.throwFeatMissing("SourceSentenceID", "model.type.NERannotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NERannotation_Type)jcasType).casFeatCode_SourceSentenceID, v);}    
  }

    