package fiveLtask2;

public class ContractEmployee extends Employee implements Calculatable{
	
	private int fixedPay;

	public int getFixedPay() {
		return fixedPay;
	}

	public void setFixedPay(int fixedPay) {
		this.fixedPay = fixedPay;
	}

	public ContractEmployee(String employeeID, String name) {
		super(employeeID, name);
		
	}

	@Override
	public Integer calculatePay() {
		
		return fixedPay;
	}

}
