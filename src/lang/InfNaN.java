package lang;

public class InfNaN {
    public static void main(String args[]){
        Double d1 = new Double(1/3);
        Double d2 = new Double(0/0.);

        System.out.println(d1.isInfinite() + " " + d1.isNaN());
        System.out.println(d2.isInfinite() + " " + d2.isNaN());
    }
}
