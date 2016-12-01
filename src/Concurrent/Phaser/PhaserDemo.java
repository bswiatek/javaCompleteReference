package Concurrent.Phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Start");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Faza nr " + curPhase + " zakończona");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Faza nr " + curPhase + " zakończona");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Faza nr " + curPhase + " zakończona");

        phsr.arriveAndDeregister();

        if(phsr.isTerminated())
            System.out.println("Obiekt klasy Phaser zakończył działanie");

    }
}
