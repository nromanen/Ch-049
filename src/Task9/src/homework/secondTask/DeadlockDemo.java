package homework.secondTask;

/**
 * Created by prots on 23.05.2017.
 */
public class DeadlockDemo extends Thread {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                synchronized (first){
                    Thread.yield();
                    synchronized (second){
                        System.out.println("Success1!");
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (second){
                    Thread.yield();
                    synchronized (first){
                        System.out.println("Success2!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
