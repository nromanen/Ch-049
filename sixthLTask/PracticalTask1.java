package sixthLTask;

import java.util.ArrayList;
import java.util.List;

public class PracticalTask1 {

	public static void main(String[] args) {
		List <Integer> MyColletion = new ArrayList<Integer>();
		List <Integer> NewCollection = new ArrayList<Integer>();
		PT1TenIntList arr1 = new PT1TenIntList();
		MyColletion = arr1.randonArrListInt();
		System.out.println("Our list is:");
		
		for (Integer a : MyColletion) {
			System.out.println(a);
		}
		System.out.println("");
		System.out.println("elements bigger than 5 are in places whith indexes:");
		NewCollection = arr1.amountOfIntBiggerThanFive();
		for (Integer a : NewCollection) {
			System.out.println(a);
		}
		//System.out.println("Our list whithout element thet are greater than 20:");
		//MyColletion = arr1.iteratorOfInts();
		System.out.println("We replase some elements. Our result:");
		MyColletion = arr1.intsReplacer();

	}

}
