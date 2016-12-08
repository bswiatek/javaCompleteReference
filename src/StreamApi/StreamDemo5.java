package StreamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
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

        System.out.println("Lista imion i telefonów: ");
        nameAndPhone.forEach( (a) -> {
            System.out.println(a.name + " " + a.phonenum);
        } );
    }
}
