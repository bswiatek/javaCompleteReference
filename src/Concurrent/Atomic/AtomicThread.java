package Concurrent.Atomic;

public class AtomicThread implements Runnable{
    String name;

    public AtomicThread(String n) {
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Uruchamiam " + name);

        for(int i=1; i<=3; i++)
            System.out.println(name + " uzyskał wartość: " + Shared.ai.getAndSet(i));
    }
}
