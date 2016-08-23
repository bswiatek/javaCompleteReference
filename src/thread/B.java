package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class B {
    synchronized void bar (A a) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " wszedł do B.bar");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Przerwano B");
        }

        System.out.println(name + " próbuje wywołać A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("Wewnątrz B.last()");
    }
}
