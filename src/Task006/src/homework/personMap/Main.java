package homework.personMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by valer on 10.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> personMap=new TreeMap<>();
        personMap.put("Kulyk","Andriy");
        personMap.put("Ushtan","Petro");
        personMap.put("Yavorskiy","Valeriy");
        personMap.put("Galochkin","Oleksandr");
        personMap.put("Dovgun","Andriy");
        personMap.put("Tomka","Yuriy");
        personMap.put("Yacko","Oksana");
        personMap.put("Kovalchuk","Miroslav");
        personMap.put("Kvasnetskiy","Vadim");
        personMap.put("Grinko","Sergiy");

        System.out.println(personMap);

//        String rez="";
//        for (Map.Entry<String, String> e : personMap.entrySet()) {
//            for (Map.Entry<String, String> e2 : personMap.entrySet()) {
//                if (e2.getValue().equals(e.getValue())) {
//                    rez = rez + " " + e.getValue();
//                }
//            }
//        }
//        System.out.println(rez);
//        System.out.println();

        System.out.println("Enter name for remove");
        String rem=(new Scanner(System.in)).nextLine();
        personMap.entrySet().removeIf(e -> e.getValue().equals(rem));
        System.out.println(personMap);
    }
}
