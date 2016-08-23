package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class Producer implements Runnable {
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this, "Producent").start();
    }

    public void run(){
        int i =0;

        while(true){
            q.put(i++);
        }
    }
}
