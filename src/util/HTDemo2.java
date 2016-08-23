package util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String args[]){

        Hashtable<String, Double> balance = new Hashtable<>();

        Enumeration<String> names;
        String str;
        double bal;

        balance.put("Jan Kowalski", 3434.34);
        balance.put("Piotr Nowak", 123.22);
        balance.put("Joanna Bąk", 1278.00);
        balance.put("Rafał Brzęczyszczykiewicz", 99.22);
        balance.put("Tomek Nosek", -127.54);

        Set<String> set = balance.keySet();
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        balance.put("Jan Kowalski", balance.get("Jan Kowalski") + 1000);

        System.out.println(balance.get("Jan Kowalski"));
    }
}
