package enumsAnnotations;

/**
 * Created by bswiatek on 01.06.2016.
 */
public enum Apple {
    Jonathan(10), GldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int p) {price = p;}

    Apple() { price = -1; }

    int getPrice(){ return price; }
}
