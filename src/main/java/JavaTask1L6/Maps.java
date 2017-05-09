package JavaTask1L6;
import java.util.*;


public class Maps {
	public static void main(String[] args){
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Zhubya", "Max");
		personMap.put("Pupkin", "Alex");
		personMap.put("Semenov", "Petro");
		personMap.put("Ivanov", "Vasul");
		personMap.put("Petrov", "Sasha");
		personMap.put("Sidorov", "Misha");
		personMap.put("Oliynuk", "Ivan");
		personMap.put("Luchak", "Nastya");
		personMap.put("Gitler", "Orest");
		personMap.put("Poroshenko", "Petro");
		
		for(String lastName: personMap.keySet()) {
			String firstName = personMap.get(lastName); 
			System.out.println("LastName: " + lastName + ", firstName: " + firstName);
		}
		
		for(String lastName: personMap.keySet()) {
			String firstName = personMap.get(lastName);
			if (firstName.equals("Orest")) {
				System.out.println("The Orest is: lastName: " + lastName + ", firstName: " + firstName);
				personMap.remove(lastName);
				break;
				
				
		}

	}
}
}