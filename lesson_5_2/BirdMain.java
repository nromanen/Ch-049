package lesson_5_2;

import java.util.ArrayList;

public class BirdMain {

	public static void main(String[] args) {
		
		Bird eagle = new Eagle();
		Bird swallow = new Swallow();
		Bird penguin = new Penguin();
		Bird chicken = new Chicken();
		
		ArrayList<Bird> listOfBirds = new ArrayList<>();
		listOfBirds.add(chicken);
		listOfBirds.add(penguin);
		listOfBirds.add(eagle);
		listOfBirds.add(swallow);
		
		for(Bird bird: listOfBirds){			
			System.out.println(bird);
		}
		
		for(Bird bird: listOfBirds){			
			bird.fly();
		}
	}

}
