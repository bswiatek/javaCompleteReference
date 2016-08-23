package util;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        System.out.println("Zawartość: " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Zawartość po usunieciu: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Zawartość po usunieciu krańcowych: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " zmienione");

        System.out.println("Zawartość po zmianie: " + ll);
    }
}
