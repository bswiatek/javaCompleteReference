package network;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("http://internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        System.out.println("Data: " + new Date(d));

        System.out.println("Rodzaj zawartości: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        System.out.println("Wygasa: " + new Date(d));

        System.out.println("Ostatnio zmodyfikowany: " + new Date(hpCon.getLastModified()));

        System.out.println("Długość: " + hpCon.getContentLength());

        System.out.println("----zawartość----");
        InputStream input = hpCon.getInputStream();
        int i = hpCon.getContentLength();
        while(((c = input.read()) != -1) && --i > 0) {
            System.out.print((char) c);
        }
        input.close();
    }
}
