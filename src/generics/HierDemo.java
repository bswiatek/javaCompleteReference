package generics;

public class HierDemo {
    public static void main(String args[]){
        Gen2<String, Integer> x = new Gen2<>("Wartość", 2);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
