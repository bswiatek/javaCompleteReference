package StreamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("alfa");
        myList.add("beta");
        myList.add("gamma");
        myList.add("delta");
        myList.add("phi");
        myList.add("omega");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
