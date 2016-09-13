package firstPrograms;

/**
 * Created by bswiatek on 13.04.2016.
 */
public class Ternary {
    public static void main(String args[]){
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Wartość bezwzględna z " + i);
        System.out.println(" wynosi " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Wartość bezwzględna z " + i);
        System.out.println(" wynosi " + k);
    }
}
