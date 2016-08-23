package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("stop by wyjść");
        System.out.println("Wpisz nazwę województwa: ");

        do{
            str = br.readLine();
            str = str.trim();

            if(str.equals("śląskie")) System.out.println("Katowice");
            if(str.equals("mazowieckie")) System.out.println("Warszawa");
            if(str.equals("małopolskie")) System.out.println("Kraków");
            if(str.equals("opolskie")) System.out.println("Opole");
        } while(!str.equals("stop"));

    }
}
