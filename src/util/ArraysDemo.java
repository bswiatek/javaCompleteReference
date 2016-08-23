package util;

import java.util.*;

public class ArraysDemo {
    public static void main(String args[]){
        int array[] = new int[10];

        for(int i = 0; i < 10; i++)
            array[i] = -3 * i;

        System.out.print("Oryginalna zawartość: ");
        display(array);

        Arrays.sort(array);
        display(array);

        Arrays.fill(array, 2, 6, -1);
        display(array);

        Arrays.sort(array);
        display(array);

        System.out.println(Arrays.binarySearch(array, -9));
    }

    static void display(int array[]){
        for(int i : array)
            System.out.print(i + " ");

        System.out.println();
    }
}
