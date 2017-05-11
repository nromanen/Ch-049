package java8.core;

public class Main {

	public static void main (String ... args){
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
		
		
		Student stud3 = new Student();
		stud3.setFirstName("Petro");
		stud3.setLastName("Grinchenko");
		stud3.setGroup(g1);
		stud3.setRank(3);
	
		
		StudentService studService = new StudentService(stud1, stud2, stud3);
		
		System.out.println(studService.getTheBestStudentByRank());
	}
}
