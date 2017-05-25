package homework.firstTask;

/**
 * Created by prots on 23.05.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Anna", 100);
        Thread t2 = new MyThread("Jane", 200);
        Thread t3 = new MyThread("Kate", 300);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t3.start();

    }
}
