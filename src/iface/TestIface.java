package iface;

/**
 * Created by bswiatek on 07.05.2016.
 */
public class TestIface {
    public static void main(String args[]){
        Callback c = new Client();
        c.callback(42);
    }
}
