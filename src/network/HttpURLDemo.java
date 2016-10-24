package network;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://swiatek.biz");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Metoda żądania: " + hpCon.getRequestMethod());
        System.out.println("Kod odpowiedzi: " + hpCon.getResponseCode());
        System.out.println("Komunikat odpowiedzi: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("oto nagłówek: ");
        for(String k : hdrField){
            System.out.println("Klucz: " + k + " Wartość " + hdrMap.get(k));
        }
    }
}
