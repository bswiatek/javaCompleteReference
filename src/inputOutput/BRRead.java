package inputOutput;

import java.io.*;

/**
 * Created by bswiatek on 12.06.2016.
 */
class BRRead {
    public static void main(String args[]) throws IOException
    {
            char c;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Wpisz znaki, q to koniec");

            do{
                c = (char) br.read();
                System.out.println(c);
            } while(c != 'q');
    }

}
