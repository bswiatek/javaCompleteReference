package Concurrent.Phaser;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable{
    Phaser phsr;
    String name;

    public MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Wątek " + name + " rozpoczął fazę nr 1");
        phsr.arriveAndAwaitAdvance();

        System.out.println("Wątek " + name + " rozpoczął fazę nr 2");
        phsr.arriveAndAwaitAdvance();

        System.out.println("Wątek " + name + " rozpoczął fazę nr 3");
        phsr.arriveAndDeregister();
    }
}
