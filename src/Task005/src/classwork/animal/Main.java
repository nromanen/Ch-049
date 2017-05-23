package classwork.animal;

import java.util.ArrayList;

/**
 * Created by valer on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bim",3));
        animals.add(new Dog("Bars",3));
        animals.add(new Dog("Rex",3));
        animals.add(new Cat("Murchik",3));
        animals.add(new Cat("Cat",3));
        animals.add(new Cat("Barsic",3));

        for (Animal e: animals) {
            System.out.println(e.toString());
            System.out.println();
        }
    }
}
