package fiveLtask2;

public class SalariedEmployee extends Employee implements Calculatable{
	
	private int hourlyRate;
	private int hours;

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public SalariedEmployee(String employeeID, String name) {
		super(employeeID, name);
		
	}

	@Override
	public Integer calculatePay() {
		
		return hourlyRate * hours;
	}

}
