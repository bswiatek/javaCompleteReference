/**
 * Created by bswiatek on 12.04.2016.
 */
public class BlockTest {
    public static void main(String args[]) {
        int x,y;


        y=20;

        for( x=0; x<10; x++)
        {
            System.out.println("Wartość x wynosi " +x);
            System.out.println("Wartość y wynosi " +y);
            y = y - 2;
        }
    }
}
