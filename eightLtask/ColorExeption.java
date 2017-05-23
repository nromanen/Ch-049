package eightLtask;

public class ColorExeption extends Exception {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorExeption(String color) {
		super();
		this.color = color;
	}



}
