package student;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyClass {
	
	List <Student> l = new ArrayList<Student>();

	public List<Student> getL() {
		return l;
	}

	public void setL(List<Student> l) {
		this.l = l;
	}
	
	
	public MyClass(){
		l.add(new Student("dfds", "ddsff", 2.5));
		l.add(new Student("dfds", "ddsff", 2.5));
	}

	
	
	public static void main(String ...strings ){
		ObjectMapper mapper= new ObjectMapper();		
		try {
			System.out.println(mapper.writeValueAsString(new MyClass()));
		
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
	
}
