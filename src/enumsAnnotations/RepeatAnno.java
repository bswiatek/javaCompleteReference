package enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by bswiatek on 11.06.2016.
 */

public class RepeatAnno {
    @MyAnno(str = "Pierwsza adnotacja", val = -1)
    @MyAnno(str = "Druga adnotacja", val = 100)
    public static void myMeth(String str, int i)
    {
        RepeatAnno ob = new RepeatAnno();

        try
        {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(anno);

        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth("test", 10);
    }
}
