package student;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ToFile {
	
	public void writeFile(Object s, File f){
		ObjectMapper mapper= new ObjectMapper();
		try {
			mapper.writeValue(f,s);
		} catch (JsonGenerationException e) {
	
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}	
	}
	
	public Object readFromFile(File f){
		ObjectMapper mapper= new ObjectMapper();
		Object o = new Object();
		try {			
			o = mapper.readValue(f, Object.class);
		} catch (JsonParseException e) {		
			e.printStackTrace();
		} catch (JsonMappingException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return o;
	}

}
