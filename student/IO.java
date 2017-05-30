package student;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IO {
	public String convFromStudToString(Student s) throws Exception;
	
	public Student convFromStringToStud(String str) throws JsonParseException, JsonMappingException, IOException;
	
}
