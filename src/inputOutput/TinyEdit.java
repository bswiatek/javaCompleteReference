package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bswiatek on 12.06.2016.
 */
class TinyEdit {
    public static void main(String args[]) throws IOException
    {
            String str[] = new String[100];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Wpisz wiersze, 'stop' to koniec");

        for(int i=0; i<100; i++){
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }

        System.out.println("Wpisane dane: ");

        int i = 0;
        while(!str[i].equals("stop")) {
            System.out.println(str[i++]);
        }
    }

}
