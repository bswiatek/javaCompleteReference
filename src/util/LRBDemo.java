package util;

import java.util.*;

public class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle rd = ResourceBundle.getBundle("util.SampleRB");

        System.out.println("Polska wersja: ");
        System.out.println("title " + rd.getString("title"));
        System.out.println("StopText " + rd.getString("StopText"));
        System.out.println("StartText " + rd.getString("StartText"));

        rd = ResourceBundle.getBundle("util.SampleRB", Locale.GERMAN);

        System.out.println("Niemiecka wersja: ");
        System.out.println("title " + rd.getString("title"));
        System.out.println("StopText " + rd.getString("StopText"));
        System.out.println("StartText " + rd.getString("StartText"));
    }
}
