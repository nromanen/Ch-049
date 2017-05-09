package JavaTask1L7;

import java.util.Scanner;

public class Names {
	private String firstName;
	private String lastName;
	private String secoundName;
	
	
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

	public String getSecoundName() {
		return secoundName;
	}

	public void setSecoundName(String secoundName) {
		this.secoundName = secoundName;
	}
	
	
	public String fullName(){
		return lastName +" " + firstName.charAt(0) +"." + secoundName.charAt(0)+".";
	}
	
	public static void main(String[] args){
		Names person1 = new Names();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter first name");
		String fromConsole = sc.nextLine();
		person1.setFirstName(fromConsole);
		
		System.out.println("Enter last name");
		fromConsole = sc.nextLine();
		person1.setLastName(fromConsole);
		
		System.out.println("Enter secound name");
		fromConsole = sc.nextLine();
		person1.setSecoundName(fromConsole);
		
		System.out.println(person1.fullName());
}

	@Override
	public String toString() {
		return "Names [firstName=" + firstName + ", lastName=" + lastName
				+ ", secoundName=" + secoundName + "]";
	}
}