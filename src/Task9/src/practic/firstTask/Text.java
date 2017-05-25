package practic.firstTask;

/**
 * Created by prots on 23.05.2017.
 */
public class Text extends Thread {
    private String lesson;

    public Text(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
                System.out.println("I learn " + lesson);
            }
        }
    }

