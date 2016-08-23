package util;

import java.util.LinkedList;

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString(){
        return name + "\n" + street + "\n" + code + " " + city + ", " + state;
    }
}

public class MailList {
    public static void main(String args[]){
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("Jan Kowalski", "Klonowa 11", "Warszawa", "mazowieckie", "00-591"));
        ml.add(new Address("Danuta Sroka", "Fojkisa 43/2", "Ruda Slaska", "śląskie", "52-456"));
        ml.add(new Address("Piotr Nowak", "Zwycięstwa 345", "Kraków", "małopolskie", "11-372"));

        for(Address element : ml)
            System.out.println(element + "\n");
    }

}
