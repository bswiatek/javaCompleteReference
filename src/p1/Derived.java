package p1;

/**
 * Created by bswiatek on 04.05.2016.
 */
public class Derived extends Protection {
    Derived(){
        System.out.println("konstruktor podklasy");
        System.out.println(n);
        //System.out.println(n_pri);
        System.out.println(n_pro);
        System.out.println(n_pub);
    }
}
