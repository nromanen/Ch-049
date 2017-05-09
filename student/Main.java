package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import student.Group;
import student.Student;
import student.StudentService2;

public class Main {

	public static void main(String[] args) {
		Group g1 = Group.G1;
		Group g2 = Group.G2;
		Group g3 = Group.G3;
		Group g4 = Group.G4;

		Student stud1 = new Student();
		stud1.setFirstName("Ivan");
		stud1.setLastName("Ivanenko");
		stud1.setGroup(g1);
		stud1.setRank(1);

		Student stud2 = new Student();
		stud2.setFirstName("Sergiy");
		stud2.setLastName("Savchenko");
		stud2.setGroup(g1);
		stud2.setRank(2);

		Student stud3 = new Student();
		stud3.setFirstName("Petro");
		stud3.setLastName("Grinchenko");
		stud3.setGroup(g1);
		stud3.setRank(3);

		ArrayList<Student> stud = new ArrayList<>();
		stud.add(stud1);
		stud.add(stud2);
		stud.add(stud3);

		StudentService2 studService2 = new StudentService2();

		studService2.setStudList(stud);
		System.out.println(studService2.getTheBestStudentByRank(g1));

		studService2.removeStudent();
		

	}

}
