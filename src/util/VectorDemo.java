package util;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>(3,2);

        System.out.println("Początkowy rozmiar: " + v.size());
        System.out.println("Początkowa pojemność: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("pojemność: " + v.capacity());
        v.addElement(5);
        System.out.println("pojemność: " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("pojemność: " + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("pojemność: " + v.capacity());
        v.addElement(11);
        v.addElement(12);

        System.out.println("pierwszy: "+ v.firstElement());
        System.out.println("ostatni: "+ v.lastElement());

        if(v.contains(3))
            System.out.println("zawiera 3");

        Enumeration vEnum = v.elements();
        while(vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement() + " ");
        }
    }
}
