package homework.first;

import homework.MyThread;

/**
 * Created by valeriy on 25.05.17.
 */
public class Main {
    public static void main(String[] args) {
        MyThread t1= new MyThread("first",100,5);
        MyThread t2= new MyThread("second",300,5);
        MyThread t3= new MyThread("third",200,5);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }

}
