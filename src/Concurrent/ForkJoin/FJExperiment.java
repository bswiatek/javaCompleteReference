package Concurrent.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if(args.length != 2) {
            System.out.println("Sposób użycia: FJExperiment poziom-równoległości próg");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1000000];

        for(int i=0; i<nums.length; i++)
            nums[i] = (double) i;

        Transform task = new Transform(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();

        fjp.invoke(task);
        endT = System.nanoTime();

        System.out.println("Poziom równoległości: " + pLevel);
        System.out.println("Próg przetwarzania sekwencyjnego: " + threshold);
        System.out.println("Czas działnia: " + (endT-beginT) + " ns");
    }
}
