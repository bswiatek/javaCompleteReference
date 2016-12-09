package StreamApi;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("alfa");
        myList.add("beta");
        myList.add("gamma");
        myList.add("delta");
        myList.add("phi");
        myList.add("omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> split = myStream.spliterator();

        Spliterator<String> split2 = split.trySplit();

        if(split2 != null) {
            System.out.println("split2: ");
            split2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("split: ");
        split.forEachRemaining((n) -> System.out.println(n));
    }
}
