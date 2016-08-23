/**
 * Created by bswiatek on 29.04.2016.
 */
class DemoBoxWeight {
    public static void main(String args[]){
        BoxWeight mybox1 = new BoxWeight(10, 30, 15, 34.1);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.075);
        double vol;

        vol = mybox1.volume();
        System.out.println("Obj mybox1: " + vol);
        System.out.println("ciężar mybox1: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Obj mybox2: " + vol);
        System.out.println("ciężar mybox2: " + mybox2.weight);
    }
}
