package classwork.second;

/**
 * Created by valeriy on 23.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Hello world", 2000);
        Thread t2 = new MyThread("Peace in the peace", 3000);
        t1.start();
        t2.start();
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My mane Valeriy");
    }
}
