package fiveLtask;

public abstract class Person {
	private String name;

	public abstract String print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
		
	}

}
