package lesson_03_statements;

import java.util.Scanner;

public class Task_01_a {

	public static void main(String[] args) {
	
		double [] numbers = new double[3];
		Scanner sc = new Scanner(System.in);		
		for (int i = 0; i < numbers.length; i++){
			System.out.println("Enter 3 float numbers:");
			numbers[i] = Double.parseDouble(sc.nextLine());
		}
		sc.close();
		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] <= 5 && numbers[i] >= -5){
				System.out.println(numbers[i] + " is belong to the range [-5,5]");
			}else{
				System.out.println(numbers[i] + " does not belong to the range [-5,5]");
			}
		}
	}

}
