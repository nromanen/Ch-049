package ninethTask;

public class Pt2TwoStringsSleep extends Thread {
	private String s1;
	private int sl;

	public Pt2TwoStringsSleep(String s1, int sl) {
		super();
		this.s1 = s1;
		this.sl = sl;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {

				sleep(sl);
			} catch (InterruptedException e) {

			}
			System.out.println(s1);
		}

		System.out.println("My name is Alex.");
	}

}
