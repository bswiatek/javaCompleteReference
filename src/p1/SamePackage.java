package p1;

/**
 * Created by bswiatek on 04.05.2016.
 */
public class SamePackage {
    SamePackage() {
        Protection p = new Protection();

        System.out.println("konstruktor z tego samego pakietu");
        System.out.println(p.n);
        //System.out.println(p.n_pri);
        System.out.println(p.n_pro);
        System.out.println(p.n_pub);
    }
}
