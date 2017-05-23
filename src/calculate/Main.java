package calculate;

import static calculate.Calculate.squareRectangle;

/**
 * Created by koqfl on 16.05.2017.
 */
public class Main {
    public static void main(String[] args) {
    try{
        squareRectangle(-1,-3);
    } catch (MyException myException) {
       System.err.print(myException);
    }
    }
}
