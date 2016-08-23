package p2;

/**
 * Created by bswiatek on 04.05.2016.
 */
public class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("konstruktor z innego pakietu");
        //System.out.println(p.n);
        //System.out.println(p.n_pri);
        //System.out.println(p.n_pro);
        System.out.println(p.n_pub);
    }
}
