package Concurrent.Callable;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Start");

        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f.get(10, TimeUnit.MICROSECONDS));
            System.out.println(f2.get(10, TimeUnit.MICROSECONDS));
            System.out.println(f3.get(10, TimeUnit.MICROSECONDS));
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("time out: " + e);
        }

        es.shutdown();
        System.out.println("Koniec");
    }
}
