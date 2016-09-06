package util;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Phonebook {
    public static void main(String args[]) throws IOException{

        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try{
            fin = new FileInputStream("data/ksiazkatel.dat");
        } catch (FileNotFoundException e){
        }

        try{
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch (IOException e){
            System.out.println("Błąd odczytu");
        }

        do {
            System.out.println("wpisz imię i nazwisko lub 'koniec': ");
            name = br.readLine();
            if (name.equals("koniec")) continue;

            System.out.println("Wpisz nr tel: ");
            number = br.readLine();

            ht.put(name, number);
            changed = true;
        } while (!name.equals("koniec"));

        if(changed){
            FileOutputStream fout = new FileOutputStream("data/ksiazkatel.dat");
            ht.store(fout, "Książka telefoniczna");
            fout.close();
        }

        do {
            System.out.println("Wpisz imię i nazwisko do wyszukania lub 'koniec': ");
            name = br.readLine();
            if(name.equals("koniec")) continue;

            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("koniec"));
    }
}
