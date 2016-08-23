package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Wątek główny");
        Thread t = new Thread(this, "Wątek wyścigu");
        t.start();

        a.foo(b);
        System.out.println("Powrót do wątku głównego");
    }

    public void run(){
        b.bar(a);
        System.out.println("Powrót do wątku głównego");
    }

    public static void main(String args[]){
        new Deadlock();
    }
}
