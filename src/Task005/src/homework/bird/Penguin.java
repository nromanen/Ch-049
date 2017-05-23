package homework.bird;

/**
 * Created by valer on 03.05.2017.
 */
public class Penguin extends NonflyingBird {
    private double speedSwim;

    public Penguin(String feathers, boolean layEggs, double speedRun, double speedSwim) {
        super(feathers, layEggs, speedRun);
        this.speedSwim = speedSwim;
    }

    @Override
    public String toString() {
        return getClass() + " " + feathers + " layEggs= " + layEggs + " speed run " +speedRun+ " swim speed= " + speedSwim + '\n' + fly();
    }

    @Override
    public String fly() {
        return "I don't fly, I am swim!!!!!";
    }
}
