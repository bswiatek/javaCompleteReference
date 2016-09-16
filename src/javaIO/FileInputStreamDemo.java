//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("src/javaIO/FileInputStreamDemo.java")){
            System.out.println("Liczba dostępnych bajtów: " + (size = f.available()));

            int n = size / 40;
            System.out.println("Metoda read odczytała w jednym kroku pierwsze " + n + "bajtów pliku");
            for(int i=0; i<n; i++){
                System.out.print((char) f.read());
            }

            System.out.println("wciąż dostępnych " + f.available() + " bajtów");

            System.out.println("odczytywanie następnych " + n + " bajtow");
            byte b[] = new byte[n];
            if(f.read(b) != n) System.err.println("Nie można odczytać kolejnych " + n + "bajtów");

            System.out.println(new String(b, 0, n));
            System.out.println("wciąż jest dostępnych: " + (size = f.available()) + "bajtów");
            System.out.println("pomijanie połowy dostępnych bajtów poprzez skip");
            f.skip(size/2);
            System.out.println("wciąż jest dostępnych: " + f.available() + "bajtów");

            System.out.println("wczytywanie " + n/2 + " bajtów na koniec tablicy");
            if(f.read(b, n/2, n/2) != n/2) System.err.println("Nie mozna odczytac" + n/2 + " bajtow");

            System.out.println(new String(b, 0, b.length));
            System.out.println("Wciaz jest dostępnych " + f.available() + " bajtow");


        } catch (IOException e) {
            System.out.println("Błąd I/O: " + e);
        }
    }
}
