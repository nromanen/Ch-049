package lesson_5_2;

public abstract class Bird {
	
	protected boolean layEggs;
	protected boolean feathers;
	protected String name; 
	
	public abstract void fly();

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}
	}
	


