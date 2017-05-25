package practic.SecondTask;

/**
 * Created by prots on 23.05.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread("Hello world!", 2000);
        Thread t2 = new MyThread("Peace in the peace", 3000);

        t1.start();
        t1.join();
        t2.start();

        try {
            t2.join();
        }catch (Exception e){}

        System.out.println("My name Diana");
    }
}
