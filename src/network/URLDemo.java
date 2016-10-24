package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://www.swiatek.biz/cytaty");

        System.out.println("Protokół: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());

        System.out.println("Komputer: " + hp.getHost());
        System.out.println("Plik: " + hp.getFile());
        System.out.println("Pełny adres: " + hp.toExternalForm());
    }
}
