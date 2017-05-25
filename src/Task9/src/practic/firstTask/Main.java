package practic.firstTask;

/**
 * Created by prots on 23.05.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Text("Java");
        Thread t2 = new Text("JavaScript");
        t1.start();
        t2.start();
    }

}
