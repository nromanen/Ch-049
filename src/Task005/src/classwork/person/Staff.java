package classwork.person;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class Staff extends Person {
    protected int hours;
    protected double rate;

    public Staff(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    abstract double salary();
}
