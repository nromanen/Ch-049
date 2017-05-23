package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class Bird {
    protected  String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();
}
