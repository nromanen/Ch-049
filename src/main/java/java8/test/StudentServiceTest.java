/*package java8.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import java8.core.Group;
import java8.core.Student;
import java8.core.StudentService;

public class StudentServiceTest {

	@Test
	public void test1() {
		
		Student stud1 = new Student();
		stud1.setFirstName("stud1");
		stud1.setLastName("stud1");
		stud1.setGroup(Group.G2);
		stud1.setRank(1);
		
		
		Student stud2 = new Student();
		stud2.setFirstName("stud2");
		stud2.setLastName("stud2");
		stud2.setGroup(Group.G1);
		stud2.setRank(3);
		
		
		Student stud3 = new Student();
		stud3.setFirstName("stud3");
		stud3.setLastName("stud3");
		stud3.setGroup(Group.G1);
		stud3.setRank(3);
		
		StudentService st = new StudentService(stud1, stud2, stud3);
		List<Student> expected = new ArrayList<>();
		List<Student> actual = st.getTheBestStudentByRank();
		
		assertEquals(expected, actual);
		
	}

}*/
