package exception;

/**
 * Created by bswiatek on 09.05.2016.
 */
public class MultiCatch {
    public static void main(String args[]){
        try{
            int a = args.length;
            System.out.println("a="+a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("Dzielenie przez zero: " +e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks poza granicami: " + e);
        }
        System.out.println("Po try-catch");
    }
}
