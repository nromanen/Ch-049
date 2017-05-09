package fiveLtask;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	public Eagle() {
		super("Eagles are black and white, whith some dark broun feathers", 2);
		
	}
	
	@Override
	public String fly() {
		
		return super.fly();
	}

}
