package ninethTask;

public class PT1Sleep extends Thread {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public PT1Sleep(String s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(s);
		}
	}
}
