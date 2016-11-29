package Concurrent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    CountDownLatch latch;

    public MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
