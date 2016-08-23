package thread;

/**
 * Created by bswiatek on 26.05.2016.
 */
public class SuspendResume {
    public static void main(String args[]){
        NewThread ob1 = new NewThread("Jeden");
        NewThread ob2 = new NewThread("Dwa");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Zawieszenie wątku jeden");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Wznowienie wątku jeden");
            ob2.mysuspend();
            System.out.println("Zawieszenie wątku dwa");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Wznowienie wątku dwa");
        } catch(InterruptedException e){
            System.out.println("Przerwanie wątku głównego");
        }

        try{
            System.out.println("Oczekiwanie na zakończenie wątków");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e){
            System.out.println("Przerwanie wątku głównego");
        }

        System.out.println("Koniec wątku głównego");
    }
}
