package eightLtask;

public class TypeExeption extends Exception {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TypeExeption(String type) {
		super();
		this.type = type;
	}


}
