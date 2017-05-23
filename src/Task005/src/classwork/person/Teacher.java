package classwork.person;

/**
 * Created by valer on 03.05.2017.
 */
public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, int hours, double rate) {
        super(name, hours, rate);
    }

    @Override
    public String print() {
        return name + " " + TYPE_PERSON + " salary= " + salary();
    }

    @Override
    double salary() {
        return hours * rate;
    }
}
