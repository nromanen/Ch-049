package fiveLtask;

public  class NonFlyingBird extends Bird {
	
	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String fly() {
		
		return "It can not fly.";
	}

}
