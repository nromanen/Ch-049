package fiveLtask;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}
	
	public Chicken() {
		super("Chickens are multicolor", 1);
		System.out.println("In case of a chicken number of aggs is per day.");
	}
	
	@Override
	public String fly() {
		
		return "It's a little chicken. " + super.fly();
	}

	
}
