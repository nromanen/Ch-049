package classwork.person;

/**
 * Created by valer on 03.05.2017.
 */
public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, int hours, double rate) {
        super(name, hours, rate);
    }

    @Override
    public String print() {
        return name + " " + TYPE_PERSON + " salary= " + salary();
    }

    @Override
    double salary() {
        return rate * hours;
    }
}
