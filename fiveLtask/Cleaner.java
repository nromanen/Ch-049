package fiveLtask;

public class Cleaner extends Staff {
	
	public final String TYPE_PERSON = "Cleaner";

	public Cleaner(String name) {
		super(name);
		System.out.println("I am a " + TYPE_PERSON);
		
	}

	@Override
	public Integer Salary() {
		
		return 3200;
	}

}
