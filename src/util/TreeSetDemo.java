package util;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> hs = new TreeSet<>();

        hs.add("Alfa");
        hs.add("Beta");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("Zawartość: " + hs);
        System.out.println(hs.subSet("Beta", "Z"));
        System.out.println(hs.ceiling("C"));
        System.out.println(hs.pollFirst());
        System.out.println("Zawartość: " + hs);

        
    }
}
