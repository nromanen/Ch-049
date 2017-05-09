package sixthLTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PT2MainForMaps {

	public static void main(String[] args) {
		Map <Integer, String> employeeMap = new LinkedHashMap <Integer, String>();
		employeeMap.put(1, "Alex");
		employeeMap.put(2, "Igor");
		employeeMap.put(3, "Bob");
		employeeMap.put(4, "Tanya");
		employeeMap.put(5, "Ann");
		employeeMap.put(6, "Rob");
		employeeMap.put(7, "Ivan");
		
		for (Map.Entry<Integer, String> emp : employeeMap.entrySet()) {

			System.out.println("ID : " + emp.getKey() + " Name: " + emp.getValue());
		}
		
		System.out.println("Enter ID of employee:");
		int ID = new Scanner(System.in).nextInt();
		if (employeeMap.containsKey(ID)) {
			System.out.println(employeeMap.get(ID));
		} else {
			System.out.println("Can't find this ID");
		}
		
		for (Map.Entry<Integer, String> emp : employeeMap.entrySet()) {
		System.out.println("Enter name of employee:");
		String name = new Scanner(System.in).next();
		if (employeeMap.containsValue(name)) {
			System.out.println("Name you entered is in our collection, it in " + emp.getKey() + " plase.");
			break;
		} else {
			System.out.println("Can't find this name");
		}
		}

	}

}
