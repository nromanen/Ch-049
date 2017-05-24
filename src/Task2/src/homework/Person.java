package homework;

import java.util.Date;

/**
 * Created by prots on 03.05.2017.
 */
public class Person {
    private String name;
    private int bithYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int bithYear) {
        this.bithYear = bithYear;
    }

    public int getBithYear() {
        return bithYear;
    }

    public void setBithYear(int bithYear) {
        this.bithYear = bithYear;
    }

    public Person() {
    }

    public Person(String name, int bithYear) {
        setName(name);
        setDate(bithYear);
    }

    public Date setAge(int date){
        Date date1 = new Date();
        return date1;
    }

    public static void main(String[] args) {
        Person person = new Person("Anna", 1997);
        Person person1 = new Person();
        System.out.println(person.setAge(1997));
    }
}