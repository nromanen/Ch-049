package homework.student;

/**
 * Created by valer on 11.05.2017.
 */
public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + ", course=" + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return course == student.course && (name != null ? name.equals(student.name) : student.name == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + course;
        return result;
    }
}
