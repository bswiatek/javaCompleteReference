/**
 * Created by bswiatek on 13.04.2016.
 */
public class ByteShift {
    public static void main(String args[]){
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Org wartosc: " + a);
        System.out.println("i oraz b: " + i + " " + b);
    }
}
