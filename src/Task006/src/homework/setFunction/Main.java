package homework.setFunction;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by valer on 10.05.2017.
 */
public class Main {

    public static Set union(Set set1, Set set2) {
        Set set3 = new TreeSet();
        for (Object o : set1) {
            set3.add(o);
        }
        for (Object o : set2) {
            set3.add(o);
        }
        return set3;
    }

    public static Set intersect(Set set1, Set set2) {
        Set set3=new TreeSet();
        for (Object o : set1) {
            for (Object o1:set2){
                if(o.equals(o1)){
                    set3.add(o);
                }
            }
        }
        return set3;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(9);
        set2.add(3);
        set2.add(7);

        Set set3 = union(set1, set2);

        for (Object e : set3) {
            System.out.print(e + " ");
        }
        System.out.println();

        Set set4 = intersect(set1, set2);

        for (Object e : set4) {
            System.out.print(e + " ");
        }
    }
}
