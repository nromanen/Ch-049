package homework.thirdTask;

/**
 * Created by prots on 25.05.2017.
 */
public class MyThread extends Thread {
    private String message;
    private int pause;
    private int times;

    public MyThread(String message, int pause, int times) {
        this.message = message;
        this.pause = pause;
        this.times = times;
    }

    @Override
    public void run(){
        for (int i = 0; i < times; i++){
            try{
                Thread.sleep(pause);
            }
            catch (InterruptedException e){}
            System.out.println("Thread number "+message);
        }
    }
}
