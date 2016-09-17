//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Ten łańcuch powinien się znaleźć w odpowiedniej tablicy";
        byte buf[] = s.getBytes();

        try{
            f.write(buf);
        } catch (IOException e){
            System.out.println("Blad zapisu w buforze");
            return;
        }
        System.out.println("bufor z nast postaci łańcuchowej:");
        System.out.println(f.toString());
        System.out.println("jest przeksztalcany w odp tablice:");
        byte b[] = f.toByteArray();

        for (int i=0; i<b.length; i++) System.out.print((char) b[i]);
        System.out.println("\n i trafia do OutputStream");

        try(FileOutputStream f2 = new FileOutputStream("data/test4.txt"))
        {
            f.writeTo(f2);
        } catch (IOException e){
            System.out.println("blad I/O");
            return;
        }
        System.out.println("reset strumienia");
        f.reset();

        for(int i=0; i<=3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
