package fiveLtask;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}
	public Penguin() {
		super("Penguins are black and white", 2);
		
	}
	
	@Override
	public String fly() {
		
		return super.fly() + "But!!! They swim briliant";
	}
	
	
}
