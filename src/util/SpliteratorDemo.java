package util;

import thread.Synch;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String args[]){
        ArrayList<Double> al = new ArrayList<>();

        al.add(1.);
        al.add(2.);
        al.add(3.);
        al.add(4.);
        al.add(5.);
        al.add(6.);

        System.out.println("Zawartość al: ");
        Spliterator<Double> spit = al.spliterator();
        while(spit.tryAdvance((n)-> System.out.println(n)));

        spit = al.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spit.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        spit = sqrs.spliterator();
        spit.forEachRemaining((n) -> System.out.println(n));
        System.out.println();


    }
}
