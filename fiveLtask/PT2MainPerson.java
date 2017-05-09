package fiveLtask;

import java.util.ArrayList;
import java.util.List;

public class PT2MainPerson {

	public static void main(String[] args) {
		List <Person> persons = new ArrayList<Person>();
		Teacher t1 = new Teacher("Alex");
		Teacher t2 = new Teacher("Oleg");
		Cleaner c1 = new Cleaner("Ivan");
		Cleaner c2 = new Cleaner("Rob");
		Student s1 = new Student("Bob");
		Student s2 = new Student("Ishtvan");
		
		System.out.println("------------------------");
		
		persons.add(t1);
		persons.add(t2);
		persons.add(c1);
		persons.add(c2);
		persons.add(s1);
		persons.add(s2);
		
		for (Person p : persons) {
			System.out.println(p.print());
			if (p instanceof Staff) {
				System.out.println("My salary is " + ((Staff) p).Salary());
			}
			System.out.println("------------------------");
		}
		
	}

}
