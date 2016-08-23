package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class A {
    synchronized void foo (B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " wszedł do A.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Przerwano A");
        }

        System.out.println(name + " próbuje wywołać b.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("Wewnątrz A.last()");
    }
}
