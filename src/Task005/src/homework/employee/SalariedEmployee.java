package homework.employee;

/**
 * Created by valer on 03.05.2017.
 */
public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfhours;

    public SalariedEmployee(int employeeId, String socialSecurityNumber, double hourlyRate, int numberOfhours) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfhours = numberOfhours;
    }

    @Override
    public String toString() {
        return employeeId + " federalTaxIdmember='" + socialSecurityNumber + '\'' + ", Pay=" + calculatePay();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfhours;
    }
}
