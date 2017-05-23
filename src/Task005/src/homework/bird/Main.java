package homework.bird;

import java.util.ArrayList;

/**
 * Created by valer on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Bird> birds=new ArrayList<>();
        birds.add(new Eagle("Brown",true,2.4,true));
        birds.add(new Kiwi("Brown",true,12.3,true));
        birds.add(new Penguin("Black and Waite",true,0.2,18));
        birds.add(new Swallow("Black",true,0.24,"Ukraine"));

        for (Bird e: birds ) {
            System.out.println(e.toString());
            System.out.println();
        }
    }
}
