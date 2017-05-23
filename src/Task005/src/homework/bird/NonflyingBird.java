package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class NonflyingBird extends Bird {
    protected double speedRun;

    public NonflyingBird(String feathers, boolean layEggs, double speedRun) {
        super(feathers, layEggs);
        this.speedRun = speedRun;
    }
}
