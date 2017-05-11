package sevenLTask;

public class HW2SpacesInSentence {

	public static void main(String[] args) {
		StringBuilder mySent = new StringBuilder ("I don't know what to wrire here");
		
		
		for (int counter = 0; counter < mySent.length(); counter++) {
		if (counter == mySent.indexOf(" ") && counter != 1) {
			mySent.replace(counter, counter, "");
		
		}
		
		}
			 
			System.out.println(mySent);
	}

}
