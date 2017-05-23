package homework.employee;

/**
 * Created by valer on 03.05.2017.
 */
public class ContractEmployee extends Employee {
    private String federalTaxIdmember;
    private double fixedMounthlyPayment;

    public ContractEmployee(int employeeId, String federalTaxIdmember, double fixedMounthlyPayment) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMounthlyPayment = fixedMounthlyPayment;
    }

    @Override
    public String toString() {
        return employeeId + " federalTaxIdmember='" + federalTaxIdmember + '\'' + ", Pay=" + calculatePay();
    }

    @Override
    public double calculatePay() {
        return fixedMounthlyPayment;
    }
}
