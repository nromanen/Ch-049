package fiveLtask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import forthLtask.PracticalTask2Employee.CompareSalary;

public class HW2EmployeeMain {

	public static void main(String[] args) {
		
		List <Calculatable> emp = new ArrayList <Calculatable>();
		
		SalariedEmployee emp1 = new SalariedEmployee("1", "Vova");
		emp1.setHourlyRate(3);
		emp1.setHours(168);
		SalariedEmployee emp2 = new SalariedEmployee("2", "Alex");
		emp2.setHourlyRate(7);
		emp2.setHours(178);
		SalariedEmployee emp3 = new SalariedEmployee("3", "Vitia");
		emp3.setHourlyRate(5);
		emp3.setHours(160);
		ContractEmployee emp4 = new ContractEmployee("4", "Petia");
		emp4.setFixedPay(500);
		ContractEmployee emp5 = new ContractEmployee("5", "Kolia");
		emp5.setFixedPay(400);
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		Collections.sort(emp, new Comparator<Calculatable>() {

			@Override
			public int compare(Calculatable o1, Calculatable o2) {
				return o2.calculatePay() - o1.calculatePay();
			}
		});
		
		for (Calculatable c : emp) {
			Employee e = (Employee) c;
			System.out.println("EmployeeID = " + e.getEmployeeID() + ", name = " + e.getName());
			System.out.println("Average monthly payment = " + c.calculatePay());
		}

	}

}
