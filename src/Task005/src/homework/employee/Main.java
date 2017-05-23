package homework.employee;

import java.util.ArrayList;

/**
 * Created by valer on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee(1,"FD4264728464",3525.54));
        employees.add(new ContractEmployee(2,"HJ4376902156",54.23));
        employees.add(new ContractEmployee(3,"UY8472540909",33.67));
        employees.add(new SalariedEmployee(4,"WR476552537",76.23,56));
        employees.add(new SalariedEmployee(5,"PO994596686",43.87,57));
        employees.add(new SalariedEmployee(6,"KJ849689485",53.12,45));

        for (Employee e: employees) {
            System.out.println(e.toString());
        }
    }
}
