package eightLtask;

public class PlantPT2 {
	private int size;
	Color color;
	Type type;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public PlantPT2(int size, String color, String type) throws ColorExeption, TypeExeption {
		super();
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);

		this.size = size;
		this.color = c;
		this.type = t;
	}

	public PlantPT2() {

	}

	public Type typeStrToEnum(String type) throws TypeExeption {
		switch (type.toLowerCase()) {
		case "apple":
			return Type.APPLE;
		case "marijuana":
			return Type.MARIJUANA;
		case "oak":
			return Type.OAK;
		case "pine":
			return Type.PINE;
		default:
			throw new TypeExeption("You entered wrong tye.");
		}

	}

	public Color colorStrToEnum(String color) throws ColorExeption {
		switch (color.toLowerCase()) {
		case "green":
			return Color.GREEN;
		case "golden":
			return Color.GOLDEN;
		case "red":
			return Color.RED;
		default:
			throw new ColorExeption("You entered wrong color.");
		}

	}

	@Override
	public String toString() {
		return "This plant is " + type + ", it's color is " + color + ", and it's size is " + size + " meters.";
	}

}
