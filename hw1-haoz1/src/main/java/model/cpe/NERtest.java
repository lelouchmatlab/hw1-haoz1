package model.cpe;

import java.io.File;
import java.io.IOException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

public class NERtest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File modelFile = new File(args[0]);

	    System.out.println("Reading chunker from file=" + modelFile);
	    Chunker chunker
	        = (Chunker) AbstractExternalizable.readObject(modelFile);

	    for (int i = 1; i < args.length; ++i) {
	        Chunking chunking = chunker.chunk(args[i]);
	        for(Chunk A : chunking.chunkSet()){
	        	System.out.println(args[i].substring(A.start(),A.end()));
	        }
	        System.out.println("Chunking=" + chunking);
	    }
		
	}

}
