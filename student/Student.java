package student;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private String firstName;
	private String lastName;
	private double mark;
	
	public Student(String firstName, String lastName, double mark){
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
	}
	public Student(){
		
	}
	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + mark;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMark(){
		return mark;
	}
	public void setMark(double mark){
		this.mark = mark;
	}	
}

class SortedByFirstName implements Comparator<Student> {
    
    public int compare(Student obj1, Student obj2) {
         
          String str1 = obj1.getFirstName();
          String str2 = obj2.getFirstName();
         
          return str1.compareTo(str2);
    }
}

class SortedByLastName implements Comparator<Student> {
    
    public int compare(Student obj1, Student obj2) {
         
          String str1 = obj1.getLastName();
          String str2 = obj2.getLastName();
         
          return str1.compareTo(str2);
    }
}
class SortedByMark implements Comparator<Student> {
    
    public int compare(Student obj1, Student obj2) {
         
          double mark1 = obj1.getMark();
          double mark2 = obj2.getMark();

          if(mark1 > mark2) {
                 return 1;
          }
          else if(mark1 < mark2) {
                 return -1;
          }
          else {
                 return 0;
          }
    }
}
