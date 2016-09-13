package firstPrograms;

/**
 * Created by bswiatek on 29.04.2016.
 */
public class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 30, 15, 34.1, 22);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.075, 89);
        double vol;

        vol = shipment1.volume();
        System.out.println("Obj shipment1: " + vol);
        System.out.println("ciężar shipment1: " + shipment1.weight);
        System.out.println("koszt shipment1: " + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("Obj shipment2: " + vol);
        System.out.println("ciężar shipment2: " + shipment2.weight);
        System.out.println("koszt shipment2: " + shipment2.cost);
    }
}
