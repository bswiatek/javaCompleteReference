package Concurrent.RecursiveTask;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }
    @Override
    protected Double compute() {
        double sum = 0;
        if((end - start) < seqThresHold) {
            for(int i = start; i < end; i++) sum += data[i];
        }
        else {
            int middle = (start + end) / 2;
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}
