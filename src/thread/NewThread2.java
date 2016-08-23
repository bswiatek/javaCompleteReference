package thread;

/**
 * Created by bswiatek on 17.05.2016.
 */
public class NewThread2 extends Thread{
        NewThread2(){
            super("Przykladowy watek");
            System.out.println("Wątek potomny " + this);
            start();
        }

        public void run(){
            try {
                for (int n = 5; n > 0; n--) {
                    System.out.println("Wątek potomny " +n);
                    Thread.sleep(500);
                }
            } catch(InterruptedException e) {
                System.out.println("Przerwanie potomka");
            }
            System.out.println("Koniec wątku potomka");
        }


}
