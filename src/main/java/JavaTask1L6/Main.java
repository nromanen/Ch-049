package JavaTask1L6;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSets<String> m1 = new TwoSets<>();
		//m1.setSet1(new LinkedHashSet());
		
		Set<String> ss = new LinkedHashSet<>();
				
		ss.add("a");
		ss.add("b");
		m1.setSet1(ss);
		ss.add("alkfk");
		//System.out.println(m1.set1);
		
		//Metod m2 = new Metod();
		
		 ss = new LinkedHashSet<>();
		
		
		ss.add("alkfk");
		ss.add("d");
		ss.add("c");
		m1.setSet2(ss);
		System.out.println(m1);
		ss.add("6");
		ss = new LinkedHashSet<>();
		
		ss.add("yyy6");
		
		//System.out.println(m1.set2);
		
		//System.out.println(m1.intersect);
		/*TwoSets<Integer> t = new TwoSets<>();
		t.set1 = new LinkedHashSet<>();
		t.set2 = new LinkedHashSet<>();
		t.set1.add(2);
		t.set2.add(2);
		System.out.println(t.union());*/
		
		System.out.println(m1.union());
		System.out.println(m1.intersect());
	}
}
