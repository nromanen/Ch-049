package classwork.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by valer on 04.05.2017.
 */
public class Main {
    public static List<Integer> find(List<Integer> myCollection, int a) {
        Iterator<Integer> itr = myCollection.listIterator();
        int i = 0;
        List<Integer> newCollection = new ArrayList<>();
        while (itr.hasNext()) {
            int tmp = itr.next();
            if (tmp > a) {
                newCollection.add(i);
            }
            i++;
        }
        return newCollection;
    }

    public static void remove(List<Integer> myCollection, int a) {
        Iterator<Integer> itr = myCollection.listIterator();
        while (itr.hasNext()) {
            if (itr.next() > a) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> myCollection=new ArrayList<>();
        Random rand = new Random();
        for (int i=0;i<10;i++){
            myCollection.add(rand.nextInt(40)-10);
        }

        for(Integer e: myCollection){
            System.out.print(e+" ");
        }
        System.out.println();

        List<Integer> newCollection;
        newCollection=find(myCollection,5);
        for(Integer e: newCollection){
            System.out.print(e+" ");
        }
        System.out.println();

        remove(myCollection,20);
        for(Integer e: myCollection){
            System.out.print(e+" ");
        }
        System.out.println();

        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        int i=0;
        for(Integer e: myCollection){
            System.out.print(i+" - "+e+"  ");
            i++;
        }
        System.out.println();

        myCollection.sort(Integer::compareTo);
        for(Integer e: myCollection){
            System.out.print(e+"  ");
        }
    }
}
