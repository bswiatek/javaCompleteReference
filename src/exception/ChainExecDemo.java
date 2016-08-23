package exception;

/**
 * Created by bswiatek on 11.05.2016.
 */
public class ChainExecDemo {
    static void demoproc(){

        NullPointerException e = new NullPointerException("najwyzszy poziom");
        e.initCause(new ArithmeticException("powod"));

        throw e;
    }
    public static void main(String args[]){
        try{
            demoproc();

        } catch (NullPointerException e){
            System.out.println("zlapano "+e);
            System.out.println("Oryginalny powod" +e.getCause());

        }
    }
}
