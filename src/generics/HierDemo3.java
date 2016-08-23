package generics;

public class HierDemo3 {
    public static void main(String args[]){

        Gen<Integer> iOb = new Gen<>(88);

        Gen3<Integer> iOb2 = new Gen3<>(99);

        Gen3<String> strOb3 = new Gen3<>("Test");

        if(iOb2 instanceof Gen3<?>) System.out.println("iOb2 to egzemplarz Gen2");
        if(iOb2 instanceof Gen<?>) System.out.println("iOb2 to egzemplarz Gen");
        if(strOb3 instanceof Gen3<?>) System.out.println("strOb3 to egzemplarz Gen2");
        if(strOb3 instanceof Gen<?>) System.out.println("strOb3 to egzemplarz Gen");
        if(iOb instanceof Gen3<?>) System.out.println("iOb to egzemplarz Gen2");
        if(iOb instanceof Gen<?>) System.out.println("iOb to egzemplarz Gen");
    }
}
