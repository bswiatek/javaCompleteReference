package util;

import java.util.*;

class MyComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        return bStr.compareTo(aStr);
    }
}

public class CompDemo {
    public static void main(String args[]){

        TreeSet<String> hs = new TreeSet<>( (aStr, bStr) -> bStr.compareTo(aStr));

        hs.add("Alfa");
        hs.add("Beta");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("Zawartość: " + hs);
    }
}
