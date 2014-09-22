

/* First created by JCasGen Sun Sep 21 16:14:33 EDT 2014 */
package model.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Sun Sep 21 21:52:30 EDT 2014
 * XML source: /home/haoz1/mygit/hw1-haoz1/hw1-haoz1/src/main/resources/descriptor/casConsumerDescriptor.xml
 * @generated */
public class SentenceID extends base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceID.class);
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
  protected SentenceID() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceID(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceID(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentenceID(JCas jcas, int begin, int end) {
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
  //* Feature: ID

  /** getter for ID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (SentenceID_Type.featOkTst && ((SentenceID_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "model.type.SentenceID");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceID_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (SentenceID_Type.featOkTst && ((SentenceID_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "model.type.SentenceID");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceID_Type)jcasType).casFeatCode_ID, v);}    
  }

    