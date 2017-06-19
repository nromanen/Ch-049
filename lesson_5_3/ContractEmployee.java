package lesson_5_3;

public class ContractEmployee extends Employee implements Calculate{
	
	private String federalTaxIdmember;
	private int fixedPayment;
	private String name;
	
	public ContractEmployee(String name, String employeeId, String federalTaxIdmember){
		this.name = name;
		this.employeeId = employeeId;
		this.federalTaxIdmember = federalTaxIdmember;		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedPayment() {
		return fixedPayment;
	}

	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee: "+ getName() + ", fixed payment - " + getFixedPayment() + ", employee id - " + employeeId +
				", federal tax Id member - " + getFederalTaxIdmember() + ", the monthly salary " + calculatePay() + ".";
	}
	@Override
	public double calculatePay() {
		
		return (double)fixedPayment;
	}
}
