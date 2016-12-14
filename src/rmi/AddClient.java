package rmi;

import java.rmi.Naming;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerUrl = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerUrl);
            System.out.println("Pierwsza liczba: " + args[1]);
            System.out.println("Druga liczba: " + args[2]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            double d2 = Double.valueOf(args[2]).doubleValue();

            System.out.println("Suma: " + addServerIntf.add(d1, d2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
