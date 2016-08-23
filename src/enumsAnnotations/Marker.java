package enumsAnnotations;

import java.lang.reflect.Method;

/**
 * Created by bswiatek on 11.06.2016.
 */

public class Marker {
    @MyMarker
    public static void myMeth()
    {
        Marker ob = new Marker();

        try
        {
            Method m = ob.getClass().getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Adnotacja MyMarker istnieje");

        } catch (NoSuchMethodException exc){
            System.out.println("Nie znaleziono metody");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
