package lesson_5;

public class Teacher extends Staff{
	
	private String type;
	
	public Teacher (String name){
		super(name);
		this.type = "teacher";		
	}

	@Override
	int salary() {		
		return 3200;
	}

	@Override
	void prpint() {
		System.out.println("I am a " + type + " " + getName());		
	}
}
