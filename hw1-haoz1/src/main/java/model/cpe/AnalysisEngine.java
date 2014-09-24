/**
 *Analysis Engine class implements the main function for our Name Entity Recognition task. After initialization,
 *it calls process method to process each CAS.
 * 
 * @author  Hao Zhang
 */


package model.cpe;

import java.io.File;
import java.io.IOException;

import model.type.NERannotation;
import model.type.SentenceID;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.CharLmHmmChunker;
import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

public class AnalysisEngine extends JCasAnnotator_ImplBase {
    public Chunker chunker = null;
	File modelFile = null;
	
	
	
	/**Initialize necessary parameter before processing. It reads in model file name and initialize File object.
	 * 
	 * @param  aContext           UIMA class to access paramters in descriptor file
	 */
	public void initialize(UimaContext aContext){
		
		String model_file = (String) aContext.getConfigParameterValue("Param_ModelFile");
		modelFile = new File(model_file);
		
		try {
			chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Process function is responsible for NER of each sentence. It calls LingPipe class method
	 * "chunk" to get name entity for a given sentence.
	 * 
	 * @param aJCas     CAS to be processed
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		
		
		// TODO Auto-generated method stub
		String docText = aJCas.getDocumentText();
		int start = 0;
		while(docText.charAt(start)!=' '){
			start++;
		}
		String sentence_id = docText.substring(0,start);
		String sentence_content = docText.substring(start+1);
		String[] words = sentence_content.split(" ");
		Chunking chunking = chunker.chunk(sentence_content);
		for(Chunk ner : chunking.chunkSet()){
			NERannotation annotation = new NERannotation(aJCas);
			Integer begin = ner.start();
			Integer end = ner.end();
			String NER = sentence_content.substring(ner.start(),ner.end());
			String[] NER_words = NER.split(" ");
			String NER_begin = NER_words[0];
			boolean begin_offset = true;
			String NER_end = NER_words[NER_words.length-1];
			boolean end_offset = true;
			for(int i=0;i<words.length;i++){
				if(begin_offset && words[i].equals(NER_begin)){
					begin = begin - i;
					begin_offset = false;
				}
				if(end_offset && words[i].equals(NER_end)){
					end = end - i -1;
					end_offset = false;
					break;
				}
			}
			annotation.setBegin(begin);
			annotation.setEnd(end);
			annotation.setNameEntity(NER);
			annotation.setSourceSentenceID(sentence_id);
			annotation.addToIndexes();
        }
	}

}
