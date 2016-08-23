package thread;

/**
 * Created by bswiatek on 22.05.2016.
 */
public class Callme {
    void call(String msg)
    {
        System.out.print("[" + msg);
        try
        {
            Thread.sleep(1000);
        } catch(InterruptedException e)
        {
            System.out.println("Przerwano");
        }
        System.out.println("]");
    }
}
