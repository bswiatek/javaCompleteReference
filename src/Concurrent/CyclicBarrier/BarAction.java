package Concurrent.CyclicBarrier;

public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Bariera osiągnięta!");
    }
}
