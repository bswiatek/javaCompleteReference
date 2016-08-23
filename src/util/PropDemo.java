package util;

import java.util.*;

public class PropDemo {
    public static void main(String args[]){

        Properties deflist = new Properties();
        deflist.put("świętokrzyskie", "Kielce");
        deflist.put("podlaskie", "Białystok");

        Properties capitals = new Properties(deflist);

        capitals.put("śląskiego", "Katowice");
        capitals.put("małopolskiego", "Kraków");
        capitals.put("mazowieckiego", "Warszawa");
        capitals.put("opolskiego", "Opole");
        capitals.put("wielkopolskiego", "Poznań");

        Set states = capitals.keySet();

        for(Object name : states)
            System.out.println("Miastem wojewodzkim wojewodztwa " + name + " jest " + capitals.getProperty((String)name) + ".");

        String str = capitals.getProperty("świętokrzyskie", "nie znaleziono");
        System.out.println("świętokrzyskie: " + str);
    }
}
