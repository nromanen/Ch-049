package call;

import java.util.Scanner;

public class Call_Country{

    public static void main(String [] args){
        Tarriff t1 = new Tarriff();
        t1.setCountry("Usa");
        t1.setPrice(4);
        Tarriff t2 = new Tarriff();
        t2.setCountry("Japan");
        t2.setPrice(7);
        Tarriff t3 = new Tarriff();
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