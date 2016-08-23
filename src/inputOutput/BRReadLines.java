package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bswiatek on 12.06.2016.
 */
class BRReadLines {
    public static void main(String args[]) throws IOException
    {
            String str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Wpisz wiersze, 'stop' to koniec");

            do{
                str = br.readLine();
                System.out.println(str);
            } while(!str.equals("stop"));
    }

}
