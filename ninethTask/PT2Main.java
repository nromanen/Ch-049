package ninethTask;

public class PT2Main {

	public static void main(String[] args) {
		Pt2TwoStringsSleep s = new Pt2TwoStringsSleep("Hello, world!", 2000);
		Pt2TwoStringsSleep s1 = new Pt2TwoStringsSleep("Peace in the peace.", 3000);
		
		s.start();
		s1.start();

		

	}

}
