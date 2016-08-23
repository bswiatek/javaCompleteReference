package enumsAnnotations;

/**
 * Created by bswiatek on 01.06.2016.
 */
public class EnumDemo4 {
    public static void main(String args[])
    {
        Apple ap, ap2, ap3;

        System.out.println("Stałe wyliczenia i ich wartości liczbowe:");
        for(Apple a : Apple.values()){
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GldenDel;
        ap3 = Apple.RedDel;

        if(ap.compareTo(ap2) < 0 ){
            System.out.println(ap + " przed " + ap2);
        }
        if(ap.compareTo(ap2) > 0 ){
            System.out.println(ap2 + " przed " + ap);
        }
        if(ap.compareTo(ap3) == 0 ){
            System.out.println(ap + " jest równe " + ap3);
        }

        if(ap.equals(ap2)){
            System.out.println("błąd");
        }
        if(ap.equals(ap3)){
            System.out.println("jest ok");
        }
    }
}
