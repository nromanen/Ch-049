package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public class Kiwi extends NonflyingBird {
    private boolean isNSmell;

    public Kiwi(String feathers, boolean layEggs, double speedRun, boolean isNSmell) {
        super(feathers, layEggs, speedRun);
        this.isNSmell = isNSmell;
    }

    @Override
    public String toString() {
        return getClass() + " " + feathers + " layEggs= " + layEggs + " speed run " +speedRun+ " is Smell= " + isNSmell + '\n' + fly();
    }

    @Override
    public String fly() {
        return "I don't fly, I am run!!!!!";
    }
}
