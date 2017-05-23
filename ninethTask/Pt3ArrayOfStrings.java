package ninethTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt3ArrayOfStrings {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("textForLec9Pt3.txt"));
			List<String> str = new ArrayList<String>();
			while (s.hasNextLine()) {
				str.add(s.nextLine());
			}
			s.close();
			for (int i = 0; i < str.size(); i++) {
				System.out.println("Number of symbols of " + i + " string is: " + str.get(i).length());

			}

			System.out.println("_________________________________________________");

			int maxstr = str.get(0).length();
			int minstr = str.get(0).length();
			int maxIndex = 0;
			int minIndex = 0;
			for (int i = 0; i < str.size(); i++) {
				if (str.get(i).length() > maxstr) {
					maxstr = str.get(i).length();
					maxIndex = i;
				}
				if (str.get(i).length() < minstr) {
					minstr = str.get(i).length();
					minIndex = i;
				}
			}
			System.out.println("The longest line is <<" + " " + maxIndex + str.get(maxIndex) + ">>. Its length = "
					+ maxstr + " symbols.");

			System.out.println("__________________________________________________");

			System.out.println("The shortest line is <<" + " " + minIndex + str.get(minIndex) + ">>. Its length = "
					+ minstr + " symbols.");

			System.out.println("__________________________________________________");

			for (String string : str) {
				Pattern wordToFind = Pattern.compile("\\svar\\s");
				Matcher stringToMatch = wordToFind.matcher(string);
				if (stringToMatch.find()) {
					System.out.println("We found string with word <<var>> it is - " + string);
				}

			}

		} catch (FileNotFoundException e) {
		}

	}

}
