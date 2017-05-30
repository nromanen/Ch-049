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
		return firstName + "\n" + lastName + "\n"  + mark;
	}

	@Override
	public Student convFromStringToStud(String str) throws JsonParseException, JsonMappingException, IOException {		
		String [] st = str.split("\n");
		Student stNew = new Student();
		stNew.setFirstName(st[0]);
		stNew.setLastName(st[1]);
		double mark = Double.parseDouble(st[2]);
		stNew.setMark(mark);
		return stNew;
	}

}
