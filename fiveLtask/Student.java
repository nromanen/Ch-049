package fiveLtask;

public class Student extends Person{
	
	 public final String TYPE_PERSON = "Student";

	public Student(String name) {
		super(name);
		System.out.println("I am a " + TYPE_PERSON);
		
	}

	@Override
	public String print() {
		
		return "My name is " + getName();
	}
	
	

	
}
