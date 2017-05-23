package eightLtask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PT1AreaWithExeptoinMain {

	public static void main(String[] args) {

		try {
			System.out.println("Enter a:");
			Scanner s1 = new Scanner(System.in);
			int a1 = s1.nextInt();
			System.out.println("Enter b:");
			int b1 = s1.nextInt();
			s1.close();

			PT1Rectangle rectArea1 = new PT1Rectangle();
			rectArea1.setA(a1);
			rectArea1.setB(b1);
			System.out.println(rectArea1.squareRectangle(a1, b1));

		} catch (InputMismatchException e) {
			System.out.println("not a number");
		}

	}

}
