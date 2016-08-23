package enumsAnnotations;

import java.lang.reflect.Method;

/**
 * Created by bswiatek on 11.06.2016.
 */

public class Single {
    @MySingle(100)
    public static void myMeth()
    {
        Single ob = new Single();

        try
        {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value());

        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
