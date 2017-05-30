package student;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIo implements IO{

	@Override
	public String convFromStudToString(Student s) throws Exception {
		ObjectMapper mapper= new ObjectMapper();
		return mapper.writeValueAsString(s);
	}

	@Override
	public Student convFromStringToStud(String str) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper= new ObjectMapper();
		return mapper.readValue(str, Student.class);		
		
	}
	

}
