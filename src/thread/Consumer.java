package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this, "Konsument").start();
    }

    public void run(){
        while (true){
            q.get();
        }
    }
}
