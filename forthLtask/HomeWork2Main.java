package forthLtask;

import java.util.Scanner;

public class HomeWork2Main { 
	public static void main(String[] args) {

		int[] hw2 = new int[10];
		int ctr = 0;
		System.out.println("Enter 10 integer numbers: ");

		while (ctr < hw2.length) {

			int ictr = new Scanner(System.in).nextInt();
			hw2[ctr] = ictr;
			ctr++;

		}
		System.out.print("Your array is [");
		for (int i : hw2) {
			System.out.print(" " + i + " ");
		}
		System.out.println("]");

		int sum = 0;
		int sum2 = 0;
		int i = 0;
		boolean flag = false;
		for (i = 0; i < 5; i++) {
			if (hw2[i] < 0) {
				flag = true;
				break;
			}
			sum += hw2[i];
		}
		if (flag == false) {

			System.out.println("Sum of first five elements is: " + sum);

		} else {

			for (i = 9; i >= 5; i--) {
				sum2 += hw2[i];

			}
			System.out.println("Sum of last five elements is: " + sum2);
		}

	}

}
