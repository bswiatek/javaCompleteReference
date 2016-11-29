package Concurrent.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable{
    CyclicBarrier cbar;
    String name;

    public MyThread(CyclicBarrier cb, String n) {
        cbar = cb;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        }
    }
}
