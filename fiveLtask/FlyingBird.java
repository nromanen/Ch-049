package fiveLtask;

public class FlyingBird extends Bird {

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String fly() {
		
		return "It can fly.";
	}
	
}
