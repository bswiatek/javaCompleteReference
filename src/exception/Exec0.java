package exception;

/**
 * Created by bswiatek on 09.05.2016.
 */
public class Exec0 {
    public static void main(String args[]) {
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("po bledzie");
        }
        catch (ArithmeticException e) {
            System.out.println("dzielenie przez zero " +e);
        }
        System.out.println("po catch");
    }
}
