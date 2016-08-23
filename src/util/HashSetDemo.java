package util;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();

        hs.add("Alfa");
        hs.add("Beta");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("Zawartość: " + hs);


    }
}
