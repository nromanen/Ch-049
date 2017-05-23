package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public class Swallow extends FluingBird {
    private String areal;

    public Swallow(String feathers, boolean layEggs, double wingspan, String areal) {
        super(feathers, layEggs, wingspan);
        this.areal = areal;
    }

    @Override
    public String toString() {
        return getClass() + " " + feathers + " layEggs= " + layEggs + " wingspan= " + wingspan + " is vision= " + areal + '\n' + fly();
    }

    @Override
    public String fly() {
        return "Slow fly!!!!!!";
    }
}
