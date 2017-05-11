package sevenLTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW3USDollar {

	public static void main(String[] args) {
		System.out.println("Enter text with US dollar in format ($111.11): "); 
		String text = new Scanner(System.in).nextLine();
		int indexCounter = 0;
		
		
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(text);
		for (int i = 0; i < text.length(); i++) {
		if (m.find()) {
			indexCounter++;
		}
		}
		System.out.println("We use our US dollar format " + indexCounter + " times.");
		
	}

}
