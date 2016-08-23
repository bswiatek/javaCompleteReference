/**
 * Created by bswiatek on 25.04.2016.
 */
public class OverloadCons {
    public static void main(String args[]){
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        Box mybox4 = new Box(mybox1);

        System.out.println("Box1: " + mybox1.volume());
        System.out.println("Box2: " + mybox2.volume());
        System.out.println("Box3: " + mybox3.volume());
        System.out.println("Box4: " + mybox4.volume());
    }
}
