package Concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );
        System.out.println("Start");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "d");
        new MyThread(cb, "e");
        new MyThread(cb, "f");
    }
}
