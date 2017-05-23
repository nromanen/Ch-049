package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class FluingBird extends Bird {
    protected double wingspan;

    public FluingBird(String feathers, boolean layEggs, double wingspan) {
        super(feathers, layEggs);
        this.wingspan = wingspan;
    }
}
