package lesson_04;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList <Integer>();
		ArrayList <Integer> list2 = new ArrayList <Integer>();
		while(true){
		System.out.println("Enter integer number:");
		int integer = Integer.parseInt(sc.nextLine());
		if(integer > 0){
			list.add(integer);			
		}else{
			System.out.println("You enter negative number.");
			break;
		}
		}
		sc.close();
		for(int x: list){
			System.out.print(x + " ");
		}
		for(int x: list){
			if(x%2 == 0){
				list2.add(x);
			}
		}
		System.out.println();
		
		for(int x: list2){
			System.out.print(x + " ");			
		}
		System.out.println();
		int product = 1;
		for(int i = 0; i < list2.size(); i++){
			if(list2.get(i) > 0){
				product = product * list2.get(i);
			}
		}
		System.out.println("Product of even numbers is " + product);
	}
	}