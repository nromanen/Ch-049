package sevenLTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT2NameWithMethods {
	private String yourString;
	// for all patterns and matchers i choose package access.
	Pattern pFullName = Pattern
			.compile("^[A-Z]{1}[a-z]+[-]?[A-Z]?[a-z]+[\\s]{1}[A-Z]{1}[a-z]+[-]?[A-Z]?[a-z]+[\\s]{1}[A-Z]{1}[a-z]+$");
	Matcher mFullName = pFullName.matcher(yourString);
	Pattern pSurname = Pattern.compile("^[A-Z]{1}[a-z]+[-]?[A-Z]?[a-z]+");
	Matcher mSurname = pSurname.matcher(yourString);
	Pattern pName = Pattern.compile("[\\s]{1}[A-Z]{1}[a-z]+[-]?[A-Z]?[a-z]+[\\s]{1}");
	Matcher mName = pName.matcher(yourString);
	Pattern pPatronimic = Pattern.compile("[A-Z]{1}[a-z]+$");
	Matcher mPatronimic = pPatronimic.matcher(yourString);

	public String getYourString() {
		return yourString;
	}

	public void setYourString(String yourString) {
		this.yourString = yourString;
	}

	/*public String inputString() {
		System.out.println("Enter your (or just some) full name (surname name patronymic):");
		Scanner s = new Scanner(System.in);
		yourString = s.nextLine();
		s.close();
		return yourString;

	}*/

	public String isYourStrMatch() {
		String str = "";
		if (mFullName.matches()) {
			str = "Fullname you entered is match our pattern.";
		} else {
			str = "Fullname you entered is not match our pattern. Enter fullname correctly.";
		}

		return str;
	}

	public String SurnameWithInit(String yourString) {
		String surnameWithInit = "";
		while (mSurname.find() && mName.find() && mPatronimic.find()) {
			surnameWithInit = yourString.substring(mSurname.start(), mSurname.end()) + " "
					+ yourString.substring(mName.start(), mName.end()).substring(0, 1) + ". "
					+ yourString.substring(mPatronimic.start(), mPatronimic.end()).substring(0, 1) + ".";
		}
		return surnameWithInit;
	}

	public String name(String yourString) {
		String name = "";
		while (mName.find()) {
			name = yourString.substring(mName.start(), mName.end());
		}
		return name;
	}

	public String newOrderForFullName(String yourString) {
		String newFullname = "";
		while (mSurname.find() && mName.find() && mPatronimic.find()) {
			newFullname = yourString.substring(mName.start(), mName.end())
					+ yourString.substring(mPatronimic.start(), mPatronimic.end()) + " "
					+ yourString.substring(mSurname.start(), mSurname.end()) + ".";
		}
		return newFullname;
	}

}
