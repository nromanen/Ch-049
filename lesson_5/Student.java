package lesson_5;

public class Student extends Person{
	
	private String type;
	
	public Student(String name){
		super(name);
		this.type = "student";		
	}
	
	@Override
	void prpint() {
		System.out.println("I am a " + type + " " + getName());
	}

}
