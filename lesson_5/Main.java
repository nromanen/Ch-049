package lesson_5;

public class Main {

	public static void main(String[] args) {
		
		Student st = new Student("Petrenko");
		Teacher tch = new Teacher("Ivanov");
		Cleaner cln = new Cleaner("Petrov");
		Person person [] = new Person[3];
		
	
		
		person[0] = st;
		person[1] =tch;
		person[2] = cln;
		
		for(int i =0; i < person.length; i++){
			person[i].prpint();			
			}
		System.out.println(person[1] instanceof Staff);
		System.out.println("Teacher has " + tch.salary() + " salary");
		System.out.println("Cleaner has " + cln.salary() + " salary");
	
		}
	}

 