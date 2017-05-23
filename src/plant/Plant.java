package plant;


import java.util.Arrays;

/**
 * Created by koqfl on 16.05.2017.
 */
public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "green":
                return Color.Green;
            default:
                throw new ColorException("Input only color blue, red or white" + Arrays.toString(Color.values()));
        }
    }

    private plant.Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "tree":
                return Type.Tree;
            case "grass":
                return Type.Grass;
            case "flower":
                return Type.Flower;
            default:
                throw new TypeException("Input only type tree, grass or flower");
        }
    }

    public static void main(String[] args) {
        try {
            Plant pl = new Plant("tree", "pink", 5);
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}
