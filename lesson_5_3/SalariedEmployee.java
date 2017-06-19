package lesson_5_3;

public class SalariedEmployee extends Employee implements Calculate{
	
	private String socialSecurityNumber;
	private int hourlyRate;
	private int numberOfHours;
	private String name;
	
	public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, int hourlyRate){
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;	
		this.name = name;
		this.employeeId = employeeId;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	@Override
	public double calculatePay() {
		
		return (double)numberOfHours * hourlyRate;
	}

	@Override
	public String toString() {
		return "SalariedEmployee: " + getName() + ", employee id - " + employeeId + ", social sucurity number " + 
				getSocialSecurityNumber() + ", hourly rate - " + getHourlyRate() + ", the monthly salary " + calculatePay() + ".";
		}
	}
