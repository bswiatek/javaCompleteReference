package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException{
        int count = 0;
        double sum = 0.0;

        FileReader fin = new FileReader("data/test.txt");

        try(Scanner scr = new Scanner(fin)) {
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

        System.out.println("Średnia wynosi: " + sum/count);
    }
}
