package classwork.animal;

/**
 * Created by valer on 03.05.2017.
 */
public class Dog implements Animal {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String voice() {
        return "гав";
    }

    @Override
    public String feed() {
        return "feed me!!! meat";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + '\n' + voice()+'\n'+feed();
    }
}
