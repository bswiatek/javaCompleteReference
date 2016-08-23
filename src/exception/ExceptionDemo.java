package exception;

/**
 * Created by bswiatek on 11.05.2016.
 */
public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Wywołanie compute("+a+")");
        if (a >10)
            throw new MyException(a);
        System.out.println("Normalne wyjscie");
    }

    public static void main(String args[]){
        try{
            compute(1);
            compute(20);
        } catch (MyException e){
            System.out.println("złapano: "+e);
        }
    }
}
