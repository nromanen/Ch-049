package homework.third;

import homework.MyThread;

/**
 * Created by valeriy on 5/25/17.
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                MyThread t2 = new MyThread("Thread number two", 100, 3);
                t2.start();
            }
        };
        t1.start();
        MyThread t3 = new MyThread("Thread number three", 100, 5);
        t3.start();
    }
}
