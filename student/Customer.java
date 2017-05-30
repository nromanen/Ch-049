package student;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Customer implements IO {

	@Override
	public String convFromStudToString(Student s) throws Exception {
		String firstName = s.getFirstName();
		String lastName = s.getLastName();
		double mark = s.getMark();
		return "Student name:" + "\n" + firstName + "\n" + lastName + "\n" + "Mark is - " + mark;
	}

	@Override
	public Student convFromStringToStud(String str) throws JsonParseException, JsonMappingException, IOException {
				
		return null;
	}

}
