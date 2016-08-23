package thread;

/**
 * Created by bswiatek on 17.05.2016.
 */
public class CurrentThreadDemo {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("Jeden");
        NewThread ob2 = new NewThread("Dwa");
        NewThread ob3 = new NewThread("Trzy");

        System.out.println("Watek jeden zyje: " + ob1.t.isAlive());
        System.out.println("Watek jeden zyje: " + ob2.t.isAlive());
        System.out.println("Watek jeden zyje: " + ob3.t.isAlive());

        try {
            System.out.println("Oczekiwanie na zakonczenie watkow.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Przerwanie wątku głównego");
        }

        System.out.println("Watek jeden zyje: " + ob1.t.isAlive());
        System.out.println("Watek jeden zyje: " + ob2.t.isAlive());
        System.out.println("Watek jeden zyje: " + ob3.t.isAlive());

        System.out.println("Wyjście z wątku głównego.");
    }
}
