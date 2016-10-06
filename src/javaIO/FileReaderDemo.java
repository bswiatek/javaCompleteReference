package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("data/file1.txt"))
        {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
