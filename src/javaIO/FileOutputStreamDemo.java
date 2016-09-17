//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        String source = "Nadszedł czas, aby wszyscy porządni obywatele\n"
                + " wreszcie zrozumieli potrzeby swojego kraju\n"
                + " i zaczęli uczciwie płacić podatki.";

        byte buf[] = source.getBytes();
        try( FileOutputStream f0 = new FileOutputStream("data/file1.txt");
             FileOutputStream f1 = new FileOutputStream("data/file2.txt");
             FileOutputStream f2 = new FileOutputStream("data/file3.txt") ){

            for(int i=0; i < buf.length; i+=2) f0.write(buf[i]);
            f1.write(buf);
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e){
            System.out.println("błąd I/O");
        }
    }
}
