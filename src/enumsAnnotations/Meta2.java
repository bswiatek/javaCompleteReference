package enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by bswiatek on 11.06.2016.
 */

@What(description = "klasa testowa adnotacji")
@MyAnno(str = "Meta2", val=99)
public class Meta2 {
    @MyAnno(str = "Testowanie", val = 100)
    @What(description = "metoda testowa adnotacji")
    public static void myMeth()
    {
        Meta2 ob = new Meta2();

        try
        {
            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("Wszystkie adnotacje Meta2: ");
            for (Annotation a : annos)
                System.out.println(a);

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Wszystkie adnotacje myMeth: ");
            for (Annotation a : annos)
                System.out.println(a);

        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
