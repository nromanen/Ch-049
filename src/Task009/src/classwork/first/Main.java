package classwork.first;

/**
 * Created by valeriy on 23.05.17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread("Java", 1000);
        Thread t2 = new MyThread("C#", 2500);
        t1.start();
        t2.start();
    }
}
