package Concurrent.Phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        int curPhase;

        System.out.println("Start");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        while(!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Obiekt klasy Phaser zakończył działanie");
    }
}
