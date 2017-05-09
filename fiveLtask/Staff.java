package fiveLtask;

public abstract class Staff extends Person {

	public Staff(String name) {
		super(name);

	}

	@Override
	public String print() {

		return "My name is " + getName();
	}

	public abstract Integer Salary();

}
