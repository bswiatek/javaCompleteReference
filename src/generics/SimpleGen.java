package generics;

public class SimpleGen {
    public static void main(String args[]){
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Parametryzacja");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("wartość: " + v);

        String str = tgObj.getOb2();
        System.out.println("wartość " + str);

    }
}
