package inputOutput;

import java.io.PrintWriter;

/**
 * Created by bswiatek on 12.06.2016.
 */
public class PrintWriterDemo {
    public static void main(String args[]){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("To jest łańcuch");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
