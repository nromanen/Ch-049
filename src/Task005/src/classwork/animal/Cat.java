package classwork.animal;

/**
 * Created by valer on 03.05.2017.
 */
public class Cat implements Animal {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String voice() {
        return "мяу";
    }

    @Override
    public String feed() {
        return "feed me!! fish";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + '\n' + voice()+'\n'+feed();
    }
}
