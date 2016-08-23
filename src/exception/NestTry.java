package exception;

/**
 * Created by bswiatek on 11.05.2016.
 */
public class NestTry {
    static void nesttry(int a){
        try {
            if(a==1) a = a/(a-a);

            if(a==2) {
                int c[] = { 1 };
                c[42] = 99;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("poza tablicą: " +e);
        }
    }

    public static void main(String args[]){
        try{
            int a = 2;

            //int b = 42 / a;

            nesttry(2);
            nesttry(2);
            nesttry(0);

        } catch (ArithmeticException e){
            System.out.println("Dzielenie przez zero: " +e);
        }
    }
}
