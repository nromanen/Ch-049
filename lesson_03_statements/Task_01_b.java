package lesson_03_statements;

import java.util.Scanner;

public class Task_01_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter integer number:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Enter integer number:");
		int c = Integer.parseInt(sc.nextLine());		
		sc.close();
		
		int max;
		if(a > b && a > c){
			max = a;
		}else if(b > a && b > c){
			max = b;
		}else{
			max = c;
		}
		System.out.println("Max is " + max);
		
		int min;
		if(a < b && a < c){
			min = a;
		}else if(b < a && b < c){
			min = b;
		}else{
			min = c;
		}
		System.out.println("Min is " + min);
	}

}
