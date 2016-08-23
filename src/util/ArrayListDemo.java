package util;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Rozmiar początkowy" + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Rozmiar al po dodaniu elementów: " + al.size());

        System.out.println("Zawartość al: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Rozmiar po usunieciach: " + al.size());
        System.out.println("Zawartość: " + al);

        System.out.println(al.get(2));
        System.out.println(al.indexOf("A2"));
    }
}
