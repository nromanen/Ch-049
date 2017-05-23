package homework.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valer on 11.05.2017.
 */
public class Main {

    public static String printStudents(List<Student> students,int cours){
        String rez="";
        for (Student e :students){
            rez=rez+" "+e.toString();
        }
        return rez;
    }

    public static void sortByCourse(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            Student e = students.get(i);
            for (int j = 0; j < students.size(); j++) {
                Student e1 = students.get(i);
                if (e.getCourse()>e1.getCourse()){
                    Student tmp=e;
                    e=e1;
                    e1=tmp;
                }
            }
        }
    }
    public static void sortByName(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            Student e = students.get(i);
            for (int j = 0; j < students.size(); j++) {
                Student e1 = students.get(i);
                if (e1.getName().compareTo(e.getName())) {
                    Student tmp = e;
                    e = e1;
                    e1 = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Kulyk",2));
        students.add(new Student("Ushtan",3));
        students.add(new Student("Yavorskiy",4));
        students.add(new Student("Galochkin",5));
        students.add(new Student("Dovgun",6));


    }
}
