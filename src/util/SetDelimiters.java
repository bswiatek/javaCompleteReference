package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SetDelimiters {
    public static void main(String[] args) throws IOException{
        int count = 0;
        double sum = 0.0;

        FileWriter fout = new FileWriter("data/test3.txt");
        fout.write("2, 3.4,     5,6, 7.4, 9.1, 10.5, gotowe");
        fout.close();

        FileReader fin = new FileReader("data/test3.txt");

        try(Scanner scr = new Scanner(fin)) {
            scr.useDelimiter(", *");
            while (scr.hasNext()) {
                if (scr.hasNextDouble()) {
                    sum += scr.nextDouble();
                    count++;
                } else {
                    String str = scr.next();
                    if (str.equals("gotowe")) break;
                    else {
                        System.out.println("błąd formatu danych");
                        return;
                    }
                }
            }
        }
        System.out.println("Średnia wynosi: " + sum / count);
    }
}
