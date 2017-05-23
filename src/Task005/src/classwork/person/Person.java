package classwork.person;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class Person {
    protected String name;
    Person(String name){
        this.name=name;
    }
    public abstract String print();
}
