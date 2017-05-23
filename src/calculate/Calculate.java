package calculate;

/**
 * Created by koqfl on 16.05.2017.
 */
public class Calculate {

    public static int squareRectangle(int a, int b) throws MyException {
        if(a>0&&b>0){
            return a*b;
        }
        else{
            throw new MyException("Input value is negative");
        }



    }
}


