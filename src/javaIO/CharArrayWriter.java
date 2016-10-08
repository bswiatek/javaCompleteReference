//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.*;

public class CharArrayWriter {
    public static void main(String[] args) throws IOException{
        java.io.CharArrayWriter f = new java.io.CharArrayWriter();
        String s = "Ten łańcuch powinien znaleźć się w odpowiedniej tablicy";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try{
            f.write(buf);
        } catch (IOException e){
            System.out.println("błąd zapisu w buforze");
            return;
        }

        System.out.println("bufor z następującej postaci łańcuchowej");
        System.out.println(f.toString());
        System.out.println("jest przekształcony w odpowiednią tablicę");

        char c[] = f.toCharArray();
        for (char aC : c) {
            System.out.print(aC);
        }

        System.out.println("\ntrafia do konstruktora FileWriter()");

        try( FileWriter f2 = new FileWriter("data/test.txt"))
        {
            f.writeTo(f2);
        } catch (IOException e){
            System.out.println("błąd we/wy " + e);
        }

        System.out.println("resetowanie strumienia");
        f.reset();

        for(int i=0; i<3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
