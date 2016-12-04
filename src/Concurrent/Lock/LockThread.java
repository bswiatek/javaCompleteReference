package Concurrent.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {
    private String name;
    private ReentrantLock lock;

    public LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Uruchamiam " + name);
        try {
            System.out.println(name + " czeka na zablokowanie zmiennej count.");;
            lock.lock();
            System.out.println(name + " zablokował zmienną count.");

            Shared.count++;
            System.out.println(name + ": " + Shared.count);
            System.out.println(name + " został zatrzymany");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println(name + " odblokowuje zmienną count.");
            lock.unlock();
        }
    }
}
