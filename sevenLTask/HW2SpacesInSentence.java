package sevenLTask;

public class HW2SpacesInSentence {

	public static void main(String[] args) {
		String mySent = "I     don't    know     what     to     write    here";

		System.out.println(mySent);
		System.out.println(mySent.replaceAll("\\s+", " "));

	}

}
