package enumsAnnotations;

import java.lang.reflect.Method;

/**
 * Created by bswiatek on 10.06.2016.
 */
public class Meta {
    @MyAnno(str = "Przykladowa adnotacja", val = 19)
    public static void myMeth(String str, int i)
    {
        Meta ob = new Meta();

        try
        {
            Class c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth("test", 10);
    }
}
