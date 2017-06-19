package lesson_5;

public class Cleaner extends Staff {
	
	private String type;
	
	public Cleaner(String name){
		super(name);
		this.type = "cleaner";		
	}

	@Override
	int salary() {	
		return 2500;
	}

	@Override
	void prpint() {
		System.out.println("I am a " + type + " " + getName());		
	}

}
