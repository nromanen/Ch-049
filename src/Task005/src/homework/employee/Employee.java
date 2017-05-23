package homework.employee;

/**
 * Created by valer on 03.05.2017.
 */
public abstract class Employee implements Calculate {
    protected int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }
}
