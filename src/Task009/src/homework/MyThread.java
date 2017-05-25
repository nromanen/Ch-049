package homework;

/**
 * Created by valeriy on 25.05.17.
 */
public class MyThread extends Thread {
    private String message;
    private int time;
    private int count;

    /**
     *
     * @param message
     * @param time
     * @param count
     */
    public MyThread(String message, int time, int count){
        this.message=message;
        this.count=count;
        this.time=time;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                sleep(time);
            } catch (InterruptedException e) {
            }
            System.out.println(message);
        }
    }
}
