package Concurrent.Executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmpExec {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd12 = new CountDownLatch(5);
        CountDownLatch cd13 = new CountDownLatch(5);
        CountDownLatch cd14 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Start");

        es.execute(new MyThread(cd1, "A"));
        es.execute(new MyThread(cd12, "B"));
        es.execute(new MyThread(cd13, "C"));
        es.execute(new MyThread(cd14, "D"));

        try {
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Koniec");
    }
}
