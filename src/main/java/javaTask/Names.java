package javaTask;

import java.util.Scanner;

public class Names {
	private String firstName;
	private String lastName;
	private String secondName;
	

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


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String abbr(){
		return this.getLastName() + " " + getFirstName().charAt(0)+"." + getSecondName(). charAt(0);
		
	}
	
	public String onlyName(){
		return firstName;
				
	}
	
	public String FullName(){
		return firstName +  ", " + secondName + ", " + lastName; 
	}


	public static void main(String[] args) {
		Names person1 = new Names();
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first name");
		String s1 = sc.nextLine();
		person1.setFirstName(s1);
		
		
		System.out.println("Enter last name");
		s1 = sc.nextLine();
		person1.setLastName(s1);
		
		System.out.println("Enter second name");
		s1 = sc.nextLine();
		person1.setSecondName(s1);
		
		System.out.println(person1.abbr());
		
		Names p2 = new Names();
		p2.setFirstName("Zina");
		p2.setLastName("Kuz'");
		p2.setSecondName("Volodymyrivna");
		
		System.out.println(p2.abbr());
		System.out.println(p2.onlyName());
		System.out.println(p2.FullName());


	}

}
