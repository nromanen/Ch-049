package classwork.first;

/**
 * Created by valeriy on 23.05.17.
 */
public class MyThread extends Thread {
    private String subj;
    private int pause;

    public MyThread(String subj, int pause) {
        this.subj = subj;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("I study " + subj);
        }
    }
}

