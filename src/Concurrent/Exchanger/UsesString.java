package Concurrent.Exchanger;

import java.util.concurrent.Exchanger;

public class UsesString implements Runnable{
    Exchanger<String> ex;
    String str;

    public UsesString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=0; i<3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Otrzymałem: " + str);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
