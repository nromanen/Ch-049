package javaTask;

import java.util.Scanner;

public class SentenceLonger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s1 = sc.nextLine();
		
		String[]s = s1.split("\\s");
		
		for(String t : s){
			System.out.println(t);
			}
		int maxIndex = 0;
		int maxLenght = s [maxIndex].length();
		for (int i = 0; i<s.length; i++){
			if(maxLenght<s [i].length()){
				maxLenght = s[i].length();
				maxIndex = i;
				
			}
		}
		System.out.println("The longest word is " + s [maxIndex]);
}
}