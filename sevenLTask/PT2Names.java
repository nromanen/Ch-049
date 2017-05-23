package sevenLTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT2Names {

	public static void main(String[] args) {

		System.out.println("Enter your (or just some) full name (surname name patronymic):");
		Scanner s = new Scanner(System.in);
		String yourString = s.nextLine();
		s.close();

		Pattern pFullName = Pattern
				.compile("^[A-Z]{1}[a-z]+[-A-Z]?[a-z]+[\\s]{1}[A-Z]{1}[a-z]+[-A-Z]?[a-z]+[\\s]{1}[A-Z]{1}[a-z]+$");
		Matcher mFullName = pFullName.matcher(yourString);
		Pattern pSurname = Pattern.compile("[A-Z]{1}[a-z]+[-A-Z]?[a-z]+");

		Matcher mSurname = pSurname.matcher(yourString);
		Pattern pName = Pattern.compile("[\\s]{1}[A-Z]{1}[a-z]+[-A-Z]?[a-z]+[\\s]{1}");
		Matcher mName = pName.matcher(yourString);
		Pattern pPatronimic = Pattern.compile("[A-Z]{1}[a-z]+$");
		Matcher mPatronimic = pPatronimic.matcher(yourString);

		if (mFullName.matches()) {

			System.out.println("Fullname you entered is match our pattern.");

			while (mSurname.find() && mName.find() && mPatronimic.find()) {
				System.out.println(yourString.substring(mSurname.start(), mSurname.end()) + " "
						+ yourString.substring(mName.start(), mName.end()).substring(1, 2) + ". "
						+ yourString.substring(mPatronimic.start(), mPatronimic.end()).substring(0, 1) + ".");
				System.out.println(yourString.substring(mName.start(), mName.end()));
				System.out.println(yourString.substring(mName.start(), mName.end())
						+ yourString.substring(mPatronimic.start(), mPatronimic.end()) + " "
						+ yourString.substring(mSurname.start(), mSurname.end()) + ".");
			}

		} else {

			System.out.println("Fullname you entered is not match our pattern. Enter fullname correctly.");
		}

	}
}
