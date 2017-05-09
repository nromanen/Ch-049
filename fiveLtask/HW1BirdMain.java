package fiveLtask;

import java.util.ArrayList;
import java.util.List;

public class HW1BirdMain {

	public static void main(String[] args) {
		List <Bird> birds = new ArrayList <Bird>();

		birds.add(new Eagle());
		birds.add(new Swallow());
		birds.add(new Penguin());
		birds.add(new Chicken());
		
		for (Bird b : birds) {
			System.out.println(b.getFeathers() + ". " + "They lay " + b.getLayEggs() + " eggs. " + b.fly());
			
		}
		
		
	}

}
