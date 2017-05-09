package fiveLtask2;

public class Employee {
	
	private String employeeID;
	private String name;
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	
	

}
