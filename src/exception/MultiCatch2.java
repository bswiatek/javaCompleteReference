package exception;

/**
 * Created by bswiatek on 11.05.2016.
 */
public class MultiCatch2 {
    public static void main(String args[]){
        int a=10, b=0;
        int vals[] = {1,2,3};

        try{
            //int result = a/b;
            vals[10] = 1;
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("zlapano wyjatek " +e
            );
        }
    }
}
