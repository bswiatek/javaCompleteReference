package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Janek", "555-5555", "janek@domowy.pl"));
        myList.add(new NamePhoneEmail("Krysia", "555-4444", "krysia@domowy.pl"));
        myList.add(new NamePhoneEmail("Marysia", "555-3333", "marysia@domowy.pl"));

        System.out.println("Początkowa zawartość listy myList: ");
        myList.stream().forEach( (a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Imiona i telefony w formie obiektu List:");
        for(NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);

        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name,a.phonenum)
        );

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Imiona i telefony w formie obiektu Set:");
        for(NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
