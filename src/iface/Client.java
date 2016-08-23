package iface;

/**
 * Created by bswiatek on 07.05.2016.
 */
public class Client implements Callback {
    public void callback(int p){
        System.out.println("wywolanie callback z wartoscia " +p);
    }

    void nonIfaceMeth(){
        System.out.println("wlasna metoda");
    }
}
