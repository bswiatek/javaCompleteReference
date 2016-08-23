package iface;

/**
 * Created by bswiatek on 07.05.2016.
 */
public class AnotherClient implements Callback {
    public void callback(int p){
        System.out.println("Inna wersja calback");
        System.out.println("p kwadrat to " + (p*p));
    }
}
