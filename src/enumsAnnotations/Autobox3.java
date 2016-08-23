package enumsAnnotations;

/**
 * Created by bswiatek on 07.06.2016.
 */
public class Autobox3 {

    public static void main(String args[])
    {
        Boolean b = true;

        if(b) System.out.println("b: " + b);

        Character ch = 'b';
        char ch2 = ch;

        System.out.println("ch2: " + ch2);

    }
}