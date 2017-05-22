package lesson_04;

import java.util.Random;
//import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        int a[] = new int[10];
        //Scanner scanner = new Scanner(System.in);
        Random rm = new Random();
        for (int i = 0; i < a.length; i++) {
            //System.out.println("Enter integer");
            a[i] = rm.nextInt(20)-10;            
        }
        for (int x: a){
        	System.out.print(x + ", ");
        } 
        System.out.println();
        System.out.println(Task_2.calculate(a));
    }

    public static int calculate(int[] numeric) {
        int sum = 0;
        boolean success = false;
        for (int i = 0; i < numeric.length / 2; i++){
            if (numeric[i] > 0) {
                sum += numeric[i];
            }
            else {
                success = true;
                break;
            }
        }
        if (success == true ) {
            sum = 0;
            for (int i = numeric.length / 2; i < numeric.length; i++) {
                sum += numeric[i];
            }
        }

        return sum;
    }
}