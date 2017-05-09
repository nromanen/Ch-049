package sixthLTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HW2MainPerson {

	public static void main(String[] args) {
		Map<String, String> pers = new LinkedHashMap<String, String>();
		pers.put("White", "Ivan");
		pers.put("Rediska", "Kolia");
		pers.put("Dovbnia", "Oleg");
		pers.put("Black", "Boris");
		pers.put("Old", "Sam");
		pers.put("Lost", "Alex");
		pers.put("Theblade", "Boris");
		pers.put("That", "Guy");
		pers.put("This", "Dude");
		pers.put("Some", "Man");

		System.out.println("Our persons are:");
		for (Map.Entry<String, String> p : pers.entrySet()) {
			System.out.println("-------------------");
			System.out.println(p.getValue() + " " + p.getKey());

		}
		System.out.println("___________________");

		int valuesSize = pers.values().size();
		int setSize = (new HashSet<String>(pers.values())).size();
		if (setSize < valuesSize) {
			System.out.println("There are persons with same name.");
			System.out.println("///////////////////////");
		}

		Iterator<Map.Entry<String, String>> p = pers.entrySet().iterator();
		while (p.hasNext()) {
			Map.Entry<String, String> per = p.next();
			if (per.getValue().equals("Oleg")) {
				p.remove();
			}
		}
		System.out.println("Because Oleg died, our collection is:");
		System.out.println(pers);

	}

}
