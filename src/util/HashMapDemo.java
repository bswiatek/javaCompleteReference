package util;

import java.util.*;

public class HashMapDemo {
    public static void main(String args[]){

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Jan Kowalski", 3434.34);
        hm.put("Piotr Nowak", 123.22);
        hm.put("Joanna Bąk", 1278.00);
        hm.put("Rafał Brzęczyszczykiewicz", 99.22);
        hm.put("Tomek Nosek", -127.54);

        Set<Map.Entry<String,Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me: set)
            System.out.println(me.getKey() + ": " + me.getValue());

        hm.put("Jan Kowalski", hm.get("Jan Kowalski") + 1000);

        System.out.println(hm.get("Jan Kowalski"));
    }
}
