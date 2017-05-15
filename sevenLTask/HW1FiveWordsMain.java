package sevenLTask;

import java.util.Scanner;

public class HW1FiveWordsMain {

	public static void main(String[] args) {
		System.out.println("Enter sentence of five words.");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Your sentence is: " + str);

		String[] words = str.split("[\\s+.,;]");
		/*for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}*/
		
		int maxWord = words[0].length();
		int index = 0;
		int maxIndex = 0;
		for (String s : words) {
			if (maxWord < s.length()) {
				maxWord = words[index].length();
				maxIndex = index;
			}
				index++;
				
				
				
		
			
		}
		System.out.println("Longestword is - " + words[maxIndex]);
		System.out.println("Length of the longest word is - " + maxWord + " leters");
		StringBuilder sb = new StringBuilder (words[1]);
		System.out.println("Second word reversed - " + sb.reverse());
	}

}
