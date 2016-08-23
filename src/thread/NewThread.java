package thread;

/**
 * Created by bswiatek on 17.05.2016.
 */
public class NewThread implements Runnable {
    Thread t;
    String name;
    boolean suspendFlag;

    NewThread(String threadname){
        t = new Thread(this, name = threadname);
        System.out.println("Nowy wątek " + t);
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try {
            for (int n = 15; n > 0; n--) {
                System.out.println(name + ": " +n);
                Thread.sleep(200);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch(InterruptedException e) {
            System.out.println("Przerwanie potomka " +name);
        }
        System.out.println("Wyjście z wątku " +name);
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
        System.out.println(t.getState());
    }
}
