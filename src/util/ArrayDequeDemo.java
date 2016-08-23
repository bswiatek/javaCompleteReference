package util;

import java.util.ArrayDeque;
import java.util.TreeSet;

public class ArrayDequeDemo {
    public static void main(String args[]){
        ArrayDeque<String> hs = new ArrayDeque<>();

        hs.push("Alfa");
        hs.push("Beta");
        hs.push("Eta");
        hs.push("Gamma");
        hs.push("Epsilon");
        hs.push("Omega");

        while(hs.peek() != null)
            System.out.println(hs.pop() + " ");
        
    }
}
