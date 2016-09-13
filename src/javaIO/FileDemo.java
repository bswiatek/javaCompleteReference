package javaIO;

import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/bin/bash");
        p("Nazwa pliku: " + f1.getName());
        p("Ścieżka: " + f1.getPath());
        p("Ścieżka bezwzgledna: " + f1.getAbsolutePath());
        p("Katalog: " + f1.getParent());
        p(f1.exists() ? "istnieje" : "nie istnieje");
        p(f1.canWrite() ? "do zapisu" : "nie do zapisu");
        p(f1.isDirectory() ? "to katalog" : "to nie katalog");
        p(f1.isFile() ? "to plik zwykly" : "to nie plik zwykly");
        p("ostatnia modyfikacja: " +f1.lastModified());
        p("rozmiar: " +f1.length());
    }
}
