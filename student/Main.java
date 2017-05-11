package student;

import java.util.ArrayList;
import student.Group;
import student.Student;
import student.StudentService2;

public class Main {

	public static void main(String[] args) {
		Group g1 = Group.G1;

		Course courseJava = Course.JAVA;
		Course courseCPlusPlus = Course.CPLUSPLUS;
		Course coursePhyton = Course.PHYTON;

		Student stud1 = new Student();
		stud1.setFirstName("Ivan");
		stud1.setLastName("AIvanenko");
		stud1.setGroup(g1);
		stud1.setRank(1);
		stud1.setCourse(courseJava);

		Student stud2 = new Student();
		stud2.setFirstName("Sergiy");
		stud2.setLastName("BSavchenko");
		stud2.setGroup(g1);
		stud2.setRank(2);
		stud2.setCourse(courseJava);

		Student stud3 = new Student();
		stud3.setFirstName("Petro");
		stud3.setLastName("CGrinchenko");
		stud3.setGroup(g1);
		stud3.setRank(3);
		stud3.setCourse(courseCPlusPlus);

		Student stud4 = new Student();
		stud4.setFirstName("Ivan");
		stud4.setLastName("DVanVuiko");
		stud4.setGroup(g1);
		stud4.setRank(4);
		stud4.setCourse(courseCPlusPlus);

		Student stud5 = new Student();
		stud5.setFirstName("Ivan");
		stud5.setLastName("EVuiko");
		stud5.setGroup(g1);
		stud5.setRank(5);
		stud5.setCourse(coursePhyton);

		ArrayList<Student> stud = new ArrayList<>();
		stud.add(stud1);
		stud.add(stud2);
		stud.add(stud3);
		stud.add(stud4);
		stud.add(stud5);
		StudentService2 studService2 = new StudentService2();

		studService2.setStudlist(stud);

		System.out.println(studService2.getTheBestStudentByRank(g1));
		
		for (Course courseCPlusPlus1 : Course.values()){

		System.out.println(courseCPlusPlus1 + ":    " +studService2.listsByCourse(courseCPlusPlus1));
		}

		stud.sort(studService2);
		System.out.println("Our list sorted by lastName:");
		System.out.println(stud);
		System.out.println("Our list without student that been killed for bad marks");
		studService2.removeStudent();
	}

}
