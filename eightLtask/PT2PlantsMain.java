package eightLtask;

import java.util.ArrayList;
import java.util.List;

public class PT2PlantsMain {

	public static void main(String[] args) {
			
		try {
			PlantPT2[] plants = new PlantPT2[5];
			plants[0] = new PlantPT2(3, "red", "oak");
			plants[1] = new PlantPT2(3, "red", "oak1");
			plants[2] = new PlantPT2(3, "pink", "oak");
			plants[3] = new PlantPT2(3, "pink", "oak");
			plants[4] = new PlantPT2(3, "pink", "oak");
		} catch (ColorExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TypeExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
