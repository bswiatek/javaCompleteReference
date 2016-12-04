package Concurrent.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];

        for(int i=0; i<nums.length; i++)
            nums[i] = (double) i;

        System.out.println("Fragment oryginalnej sekwencji: ");
        for(int i=0; i<10; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        fjp.invoke(task);

        System.out.println("Fragment przekształconej sekwencji: ");
        for(int i=0; i<10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println("\n");
    }
}
