package classwork.person;

/**
 * Created by valer on 03.05.2017.
 */
public class Student extends Person {
    public static final String TYPE_PERSON = "Student";
    private double rating;

    public Student(String name, double rating) {
        super(name);
        this.rating = rating;
    }

    @Override
    public String print() {
        return name + " " + TYPE_PERSON + " " + rating;
    }
}
