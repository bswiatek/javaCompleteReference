package util;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
    public int compare(String a, String b){
        int i, j;

        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}
class KComp implements Comparator<String> {
    public int compare(String a, String b){
        int i, j;

        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');

        return a.compareToIgnoreCase(b);
    }
}

public class TreeMapDemo2 {
    public static void main(String args[]){

        TComp compLN = new TComp();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new KComp());
        TreeMap<String, Double> hm = new TreeMap<>(compLastThenFirst);

        hm.put("Jan Kowalski", 3434.34);
        hm.put("Piotr Nowak", 123.22);
        hm.put("Joanna Bąk", 1278.00);
        hm.put("Rafał Brzęczyszczykiewicz", 99.22);
        hm.put("Tomek Nosek", -127.54);
        hm.put("Bartek Nosek", -127.54);

        Set<Map.Entry<String,Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me: set)
            System.out.println(me.getKey() + ": " + me.getValue());

        hm.put("Jan Kowalski", hm.get("Jan Kowalski") + 1000);

        System.out.println(hm.get("Jan Kowalski"));
    }
}
