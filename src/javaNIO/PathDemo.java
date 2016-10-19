package javaNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("data/test.txt");

        System.out.println("Nazwa pliku: " + filepath.getName(1));
        System.out.println("Ścieżka: " + filepath);
        System.out.println("Ścieżka bezwzględna: " + filepath.toAbsolutePath());
        System.out.println("Katalog macierzysty: " + filepath.getParent());

        if(Files.exists(filepath))
            System.out.println("Plik istnieje");
        else
            System.out.println("Plik nie istnieje");

        try{
            if(Files.isHidden(filepath))
                System.out.println("Plik jest ukryty");
            else
                System.out.println("Plik nie jest ukryty");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(Files.isWritable(filepath))
            System.out.println("Plik jest dostępny do zapisu");

        if(Files.isReadable(filepath))
            System.out.println("Plik jest dostępny do odczytu");

        try{
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);
            if(attribs.isDirectory())
                System.out.println("Jest katalogiem");

            if(attribs.isRegularFile())
                System.out.println("Jest zwykłym plikiem");

            System.out.println("Ostatnia modyfikacja pliku: " + attribs.lastModifiedTime());
            System.out.println("Rozmiar: " + attribs.size() + "bajtów");
        } catch (IOException e){
            System.out.println("Błąd odczytu atrybutów: " + e);
        }
    }
}
