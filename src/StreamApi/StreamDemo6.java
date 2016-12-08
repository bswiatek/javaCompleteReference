package StreamApi;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.println("Początkowa zawartość myList: ");
        myList.stream().forEach((a) -> {
            System.out.print(a + " ");
        });
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));

        System.out.print("Lista myList po przekształceniu: ");
        cStrm.forEach((a) -> {
            System.out.print(a + " ");
        });
    }
}
