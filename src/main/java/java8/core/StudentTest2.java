package java8.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest2 {

	@Test
	public void test() {
		Group g1 = Group.G1;
		Group g2 = Group.G2;
		Student stud1 = new Student();
		stud1.setFirstName("Ivan");
		stud1.setLastName("Ivanenko");
		stud1.setGroup(g1);
		stud1.setRank(2);
		
		
		Student stud2 = new Student();
		stud2.setFirstName("Sergiy");
		stud2.setLastName("Savchenko");
		stud2.setGroup(g1);
		stud2.setRank(2);
		
		assertTrue(stud2.lessThan(1.5));
	}

}
