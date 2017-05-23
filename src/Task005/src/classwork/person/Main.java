package classwork.person;

import java.util.ArrayList;

/**
 * Created by valer on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons=new ArrayList<>();
        persons.add(new Student("Pit",4));
        persons.add(new Teacher("Bill",42,32.54));
        persons.add(new Cleaner("Bob",28,17.13));

        for (Person e: persons) {
            System.out.println(e.print());
            System.out.println();
        }
    }
}
