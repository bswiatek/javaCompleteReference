package enumsAnnotations;

/**
 * Created by bswiatek on 01.06.2016.
 */
public class EnumDemo {
    public static void main(String args[])
    {
        Apple ap;

        System.out.println("Winesap kosztuje " + Apple.Winesap.getPrice() + " złotych");

        ap = Apple.Cortland;
        System.out.println("Wartość ap: " +ap);
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("ap zawiera "+ ap);

        switch(ap){
            case Jonathan:
                System.out.println("Jonathan czerwone");
                break;
            case GldenDel:
                System.out.println("Golden Delicious jest żółte");
                break;
            case RedDel:
                System.out.println("Red Delicious jest czerwone");
                break;
            case Winesap:
                System.out.println("Winesap czerwone");
                break;
            case Cortland:
                System.out.println("Cortland czerwone");
                break;
        }

        System.out.println("wszystkie wyliczenia Apple: ");
        for(Apple a : Apple.values()){
            System.out.println(a);
        }

    }
}
