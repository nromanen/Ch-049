package homework.thirdTask;

/**
 * Created by prots on 25.05.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(){
          public void run(){
              Thread t2 = new MyThread("two", 10, 3);
              t2.start();
          }
        };

        Thread t3 = new MyThread("third", 20, 5);
        t1.start();
        t3.start();

    }
}
