package Concurrent.Exchanger;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable{
    Exchanger<String> ex;
    String str;
    public MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();

        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++)
                str += (char) ch++;
            try {
                str = ex.exchange(str);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
