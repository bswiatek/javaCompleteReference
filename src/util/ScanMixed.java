package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanMixed {
    public static void main(String[] args) throws IOException{
        int i;
        double d;
        boolean b;
        String str;

        FileWriter fout = new FileWriter("data/test2.txt");
        fout.write("Testowanie klasy Scanner 10 12.2 jeden true dwa false");
        fout.close();

        FileReader fin = new FileReader("data/test2.txt");

        try(Scanner scr = new Scanner(fin)) {
            while (scr.hasNext()) {
                if (scr.hasNextInt()) {
                    i = scr.nextInt();
                    System.out.println("int: " + i);
                }
                else if (scr.hasNextDouble()) {
                    d = scr.nextDouble();
                    System.out.println("double: " + d);
                }
                else if (scr.hasNextBoolean()) {
                    b = scr.nextBoolean();
                    System.out.println("boolean: " + b);
                }
                else {
                    str = scr.next();
                    System.out.println("String: " + str);
                }
            }
        }
    }
}
