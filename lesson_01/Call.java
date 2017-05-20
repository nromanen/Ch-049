package lesson_01;

import java.util.Scanner;

public class Call {
	public static void main(String [] args){
        Call_Tariff t1 = new Call_Tariff();
        t1.setCountry("Usa");
        t1.setPrice(4);
        Call_Tariff t2 = new Call_Tariff();
        t2.setCountry("Japan");
        t2.setPrice(7);
        Call_Tariff t3 = new Call_Tariff();
        t3.setCountry("Italy");
        t3.setPrice(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time for Usa;");
        int timeUsa = Integer.parseInt(sc.nextLine());

        System.out.println("Enter time for Japan;");
        int timeJapan = Integer.parseInt(sc.nextLine());

        System.out.println("Enter time for Italy;");
        int timeItaly = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println(t1 + " " + t1.getSum(timeUsa));
        System.out.println(t1 + " " + t1.getSum(timeJapan));
        System.out.println(t1 + " " + t1.getSum(timeItaly));

    }

}
