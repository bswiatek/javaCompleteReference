package Concurrent.Callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    int stop;

    public Sum(int i) {
        stop = i;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for(int i=1; i<=stop; i++) {
            sum += i;
        }
        return sum;
    }
}
