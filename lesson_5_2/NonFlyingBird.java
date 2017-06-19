package lesson_5_2;

public class NonFlyingBird extends Bird {
	

	@Override
	public void fly() {
		System.out.println("I can't fly, " + name + ".");
		
	}
	
	public String getType(){
		return "I am not flying bird";
		}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I am ").append(name).append(". ").append(getType()).append(". ");
        if (feathers) {
            stringBuilder.append("I have feathers. ");
        } else {
            stringBuilder.append("I don't have feathers. ");
        }
        if (layEggs) {
            stringBuilder.append("I can lay eggs. ");
        } else {
            stringBuilder.append("i can't lay eggs. ");
        }
        
        return stringBuilder.toString();
	
	}

}
