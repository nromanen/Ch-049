package testWork;

public class Main {

	public static void main(String[] args) {
		
		IJuiceable j1 = new Fruit("Orange");
		IJuiceable j2 = new Fruit("Mandarin");
		IJuiceable j3 = new Fruit("Apple");
		ISliceable s1 = new Fruit("Ananas");
		ISliceable s2 = new Fruit("Watermelon");
		ISliceable s3 = new Fruit("Avokado");
		
		Fresh fresh = new Fresh();
		
		fresh.addToJuices(j1);
		fresh.addToJuices(j2);
		fresh.addToJuices(j3);
		
		fresh.addToSlices(s1);
		fresh.addToSlices(s2);
		fresh.addToSlices(s3);
		
		fresh.makeFrash();
		j1.makeJuice();
		s1.makeSlices();

	}

}
