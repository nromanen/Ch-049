package fiveLtask;

public class Teacher extends Staff {
	
	public final String TYPE_PERSON = "Teacher";

	public Teacher(String name) {
		super(name);
		System.out.println("I am a " + TYPE_PERSON);
		
	}

	@Override
	public Integer Salary() {
		
		return 3200;
	}

}
