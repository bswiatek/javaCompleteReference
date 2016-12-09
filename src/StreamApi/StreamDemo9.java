package StreamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
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

        while(split.tryAdvance((n) -> System.out.println(n)));
    }
}
