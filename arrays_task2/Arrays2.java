package arrays_task2;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter integer");
            a[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(a[4]);

        int x = 0;
        int i = 0;
        while(x!=2){
            for(i = 0; i < a.length; i++){
                if (a[i] > 0){
                x++;}
            }
            }
        System.out.println(a[i-1]);
        }
    }