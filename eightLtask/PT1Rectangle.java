package eightLtask;

public class PT1Rectangle {
private int a;
private int b;

public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

public int squareRectangle(int a, int b) throws ArithmeticException{
	if (a <= 0 || b <= 0) {
		throw new ArithmeticException("!!!!!!");
	}
	int area = a * b;
	return area;
}


}
