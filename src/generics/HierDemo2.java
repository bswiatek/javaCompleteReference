package generics;

public class HierDemo2 {
    public static void main(String args[]){
        NonGenExt<String> x = new NonGenExt<>("Witaj", 2);

        System.out.print(x.getOb());
    }
}
