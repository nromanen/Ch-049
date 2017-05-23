package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public class Eagle extends FluingBird {
    private boolean isVision;

    public Eagle(String feathers, boolean layEggs, double wingspan, boolean isVision) {
        super(feathers, layEggs, wingspan);
        this.isVision = isVision;
    }

    @Override
    public String toString() {
        return feathers + " layEggs= " + layEggs + " wingspan= " + wingspan + " is vision= " + isVision + '\n' + fly();
    }

    @Override
    public String fly() {
        return "Speed fly!!!!!!";
    }
}
