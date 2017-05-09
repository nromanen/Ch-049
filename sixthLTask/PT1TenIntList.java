package sixthLTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



public class PT1TenIntList {
	private int i;
	List <Integer> iList = new ArrayList <Integer>();

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public List<Integer> randonArrListInt() {
		for (int a = 0; a < 10; a++) {
		i = ThreadLocalRandom.current().nextInt(-20, 30);
		iList.add(i);
		
		}
		return iList;
	}
	
	public List<Integer> amountOfIntBiggerThanFive() {
		List <Integer> fiveInt = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			if (iList.get(i) > 5) {
				
				fiveInt.add(i);
			}
		}
		return fiveInt;
		
	}
	
	public List<Integer> iteratorOfInts () {
		Iterator <Integer> itInt = iList.iterator();
		while (itInt.hasNext()) {
			Integer in = itInt.next();
			if (in > 20) {
				itInt.remove();
			}
			
		}
		System.out.println(iList);
		return iList;
		
	}
	
	public List<Integer> intsReplacer () {

			if (iList.get(2) != null) {
				iList.set(2, 1);
				System.out.println("position " + 2 + ", value of element " + 1);
			}
			if (iList.get(8) != null) {
				iList.set(8, -3);
				System.out.println("position " + 8 + ", value of element " + -3);
			}
			if (iList.get(5) != null) {
				iList.set(5, -4);
				System.out.println("position " + 5 + ", value of element " + -4);
			}
			
			System.out.println(iList);
			return iList;
		}
		
		
		
	
	
	

}
