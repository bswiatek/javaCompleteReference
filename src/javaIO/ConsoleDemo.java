package javaIO;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();
        if(con == null) return;

        str = con.readLine("Wpisz jakiś tekst: ");
        con.printf("Oto wpisany tekst: %s\n", str);
    }
}
