package lesson_5_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EnployeeMain {

	public static void main(String[] args) {
		
		SalariedEmployee s1 = new SalariedEmployee("Bob", "01","001",20);
		s1.setNumberOfHours(164);			
		SalariedEmployee s2 = new SalariedEmployee("Tomas", "02","002",21);
		s2.setNumberOfHours(156);
		SalariedEmployee s3 = new SalariedEmployee("Bill", "03","003",19);
		s3.setNumberOfHours(132);
		
		ContractEmployee c1 = new ContractEmployee("Mark", "01","11111");
		c1.setFixedPayment(4100);
		ContractEmployee c2 = new ContractEmployee("Antony", "02","22222");
		c2.setFixedPayment(3800);
		ContractEmployee c3 = new ContractEmployee("Jordan", "03","33333");
		c3.setFixedPayment(3200);
		
		ArrayList<Calculate> listEmployee = new ArrayList<>();
		
		listEmployee.add(s1);
		listEmployee.add(s2);
		listEmployee.add(s3);
		
		listEmployee.add(c1);
		listEmployee.add(c2);
		listEmployee.add(c3);
		
		
		for(Object o: listEmployee){
			System.out.println(o);
		}
		
		System.out.println();
		
		Collections.sort(listEmployee, new SortedBySalary());
		for(Object o: listEmployee){
			System.out.println(o);
		}
		}
	}

class SortedBySalary implements Comparator<Calculate> {
    
    public int compare(Calculate obj1, Calculate obj2) {
         
          double salary1 = obj1.calculatePay();
          double salary2 = obj2.calculatePay();

          if(salary1 > salary2) {
                 return 1;
          }
          else if(salary1 < salary2) {
                 return -1;
          }
          else {
                 return 0;
          }
          }
    }
    

