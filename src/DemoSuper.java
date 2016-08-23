/**
 * Created by bswiatek on 29.04.2016.
 */
public class DemoSuper {
    public static void main(String args[]){
        BoxWeight mybox1 = new BoxWeight(10, 30, 15, 34.1);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.075);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Obj mybox1: " + vol);
        System.out.println("ciężar mybox1: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Obj mybox2: " + vol);
        System.out.println("ciężar mybox2: " + mybox2.weight);

        vol = mybox3.volume();
        System.out.println("Obj mybox3: " + vol);
        System.out.println("ciężar mybox3: " + mybox3.weight);

        vol = myclone.volume();
        System.out.println("Obj myclone: " + vol);
        System.out.println("ciężar myclone: " + myclone.weight);

        vol = mycube.volume();
        System.out.println("Obj mycube: " + vol);
        System.out.println("ciężar mycube: " + mycube.weight);
    }
}
