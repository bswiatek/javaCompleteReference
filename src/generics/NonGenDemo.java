package generics;

public class NonGenDemo {
    public static void main(String args[]){

        NonGen iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer)iOb.getOb();
        System.out.println("wartość: " + v);

        NonGen strOb = new NonGen("Test typów sparametryzowanych");

        strOb.showType();

        String str = (String)strOb.getOb();
        System.out.println("wartość " + str);

        iOb = strOb;
        //v = (Integer) iOb.getOb();
    }
}
