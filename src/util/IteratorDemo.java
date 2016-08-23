package util;

import java.util.*;

public class IteratorDemo {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        System.out.println("Zawartość al: ");
        Iterator<String> litr = al.iterator();
        while(litr.hasNext()){
            System.out.println(litr.next() + " ");
        }

        ListIterator<String> itr = al.listIterator();
        while(itr.hasNext()){
            itr.set(itr.next() + "+");
        }

        litr = al.iterator();
        while(litr.hasNext()){
            System.out.println(litr.next() + " ");
        }

        while(itr.hasPrevious()){
            System.out.println(itr.previous() + " ");
        }


    }
}
