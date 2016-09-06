package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) throws IOException{
        String instr = "Imię: Tomasz Wiek: 28 Id: 77";

        try(Scanner conin = new Scanner(instr)) {

            conin.findInLine("Wiek: ");
            if (conin.hasNext())
                System.out.println(conin.next());
            else
                System.out.println("Błąd");
        }
    }
}
