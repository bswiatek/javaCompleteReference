package firstPrograms;

/**
 * Created by bswiatek on 27.04.2016.
 */
public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("Liczba argumentów int: " + v.length + "Zawartość " );

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("Liczba argumentów bool: " + v.length + "Zawartość " );

        for(boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.print("msg int: " + msg + v.length + "Zawartość " );

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[]){
        vaTest(1,2,3);
        vaTest("testowanie: ", 10, 20, 30, 100);
        vaTest(true, false, false, true);
    }
}
