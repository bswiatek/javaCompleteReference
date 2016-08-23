/**
 * Created by bswiatek on 12.04.2016.
 */
public class Scope {
    public static void main(String args[]){
        int x;

        x = 10;

        if(x == 10){
            int y =20;

            x = y * 2;
        }
        System.out.println("x wynosi " + x);
    }
}
