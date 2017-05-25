package classwork.second;

/**
 * Created by valeriy on 23.05.17.
 */
public class MyThread extends Thread {
    private String message;
    private int pause;

    public MyThread(String message, int pause) {
        this.message = message;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(message);
        }
    }
}
