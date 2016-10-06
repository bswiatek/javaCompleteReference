package javaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException{
        String source = "Nadszedł czas, aby wszyscy porządni obywatele\n"
                + " wreszcie zrozumieli potrzeby swojego kraju\n"
                + " i zaczęli uczciwie płacić podatki.";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        try(FileWriter f0 = new FileWriter("data/file1.txt");
            FileWriter f1 = new FileWriter("data/file2.txt");
            FileWriter f2 = new FileWriter("data/file3.txt") ){

            for(int i=0; i < buffer.length; i+=2) f0.write(buffer[i]);
            f1.write(buffer);
            f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
        } catch (IOException e){
            System.out.println("błąd I/O");
        }
    }
}
