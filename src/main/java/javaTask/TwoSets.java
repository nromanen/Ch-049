package javaTask;

import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSets<T> {
	
	
	public Set<T> getSet1() {
		return set1;
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




	@Override
	public String toString() {
		return "TwoSets [set1=" + set1 + ", set2=" + set2 + "]";
	}




	Set<T> set1 = new LinkedHashSet<>();
	private Set<T> set2 = new LinkedHashSet<>();
	
	public Set <T> union(){
		Set <T> res = new LinkedHashSet<>();
		res.addAll(set1);
		res.addAll(set2);
		return res;
	}
	public Set<T> intersect(){
		Set<T> inter = new LinkedHashSet<>(set1);
		inter.retainAll(set2);
		//inter.addAll(set2);
		return inter;
	
	
	
	

	
		
	}
}

