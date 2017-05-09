package sixthLTask;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HW1TwoSetsMain {

	public static void main(String[] args) {
		Set <Integer> set1 = new HashSet <Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Our set is:");
		System.out.println(set1);
		Set <Integer> set2 = new HashSet <Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		System.out.println("Our set is:");
		System.out.println(set2);
		
		System.out.println("This is what we get after union of our sets:");
		System.out.println(union(set1, set2));
		System.out.println("This is what we get after intersection of our sets:");
		System.out.println(intersection(set1, set2));

	}
		
	public static Set <Integer> union (Set <Integer> set1, Set <Integer> set2) {
Set <Integer> union = new HashSet<Integer>(set1);
		
		union.addAll(set2);
		return union;
		
	}
	public static Set <Integer> intersection (Set <Integer> set1, Set <Integer> set2) {
		Set <Integer> intersection = new HashSet<Integer>(set1);

		intersection.retainAll(set2);
		return intersection;
	}

}
