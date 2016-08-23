package p2;

/**
 * Created by bswiatek on 04.05.2016.
 */
public class Protection2 extends p1.Protection {
    Protection2(){
        System.out.println("konstruktor podklasy z innego pakietu");
        //System.out.println(n);
        //System.out.println(n_pri);
        //System.out.println(n_pro);
        System.out.println(n_pub);
    }
}
