package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class PK {
    public static void main(String args[]){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Ctrl+C by zakończyć");
    }
}
