package enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by bswiatek on 11.06.2016.
 */

public class Meta3 {
    @MyAnno
    public static void myMeth()
    {
        Meta3 ob = new Meta3();

        try
        {
            Class c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
