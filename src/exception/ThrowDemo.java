package exception;

/**
 * Created by bswiatek on 11.05.2016.
 */
public class ThrowDemo {
    static void demoproc() throws IllegalAccessException{

            throw new IllegalAccessException("demo");
    }
    public static void main(String args[]){
        try{
            demoproc();

        } catch (IllegalAccessException e){
            System.out.println("zlapanie e");

        }
    }
}
