package JavaTask1L6;

import java.util.LinkedHashSet;
import java.util.Set;



public class TwoSets<T> {
	private Set <T> set1;
	private Set <T> set2;
	
	public Set <T> union(){
		Set<T> res = new LinkedHashSet <>();
		res.addAll(set1);
		res.addAll(set2);
		return res;	
	}

	public Set<T> getSet1() {
		return set1;
	}

	@Override
	public String toString() {
		return "TwoSets [set1=" + set1 + ", set2=" + set2 + "]";
	}

	public void setSet1(Set<T> set1) {
		this.set1 = set1;
	}

	public Set<T> getSet2() {
		return set2;
	}

	public void setSet2(Set<T> set2) {
		this.set2 = set2;
	}

	public Set <T> intersect(){
		Set<T> inter = new LinkedHashSet <>(set1);
		inter.retainAll(set2);
		inter.addAll(set2);
		return inter;			
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSets m1 = new TwoSets();
		m1.set1 = new LinkedHashSet<String>();
		m1.set1.add("a");
		m1.set1.add("b");
		System.out.println(m1.set1);
		
		m1.set2 = new LinkedHashSet<String>();
		m1.set2.add("c");
		m1.set2.add("d");
		
		System.out.println(m1.set2);
		System.out.println(m1.intersect());
		
		TwoSets<Integer> T = new TwoSets<>();
		T.set1 = new LinkedHashSet <>();
		T.set2 = new LinkedHashSet <>();
		T.set1.add(2);
		T.set2.add(2);
		System.out.println(T.union());	
	}
}

