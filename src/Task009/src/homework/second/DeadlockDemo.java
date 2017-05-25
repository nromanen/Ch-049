package demo;

/**
 * Created by valeriy on 23.05.17.
 */
public class DeadlockDemo {
    private final static Object first = new Object();
    private final static Object second = new Object();

    public static void main(String s[]) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success1!");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}


