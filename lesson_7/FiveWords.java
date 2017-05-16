package lesson_7;

import java.util.Scanner;

public class FiveWords {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentece of five words:");
		String sentence = sc.nextLine();
		sc.close();
		String [] words = sentence.split("\\s");
		for (String str: words){
			System.out.println(str);
		}
		System.out.println();		
		maxLength(words);
		System.out.println();
		revers(words,0);
	}
	
	public static void maxLength(String [] str){		
		String longest = str[0];
		for (int i = 1; i < str.length; i++){
			if (str[i].length() > longest.length()){
				longest = str[i];							
				}		
			}
		System.out.println("The longest word is " + longest + ".");
		System.out.println("There are  " + longest.length() + " letters in the longest word.");
		}
	
	public static void revers(String [] str, int i){
		StringBuilder sb = new StringBuilder(str[i]);
		sb.reverse().toString();
		System.out.println(sb);
	}
}
