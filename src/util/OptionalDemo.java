package util;

import java.util.BitSet;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String args[]) {

        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent())
            System.out.println("Tu nie wejdzie");
        else
            System.out.println("noVal nie zawiera wartości");

        if(hasVal.isPresent())
            System.out.println("łańcuch w zmiennej hasVal: "+ hasVal.get());

        String defStr = noVal.orElse("domyslny");
        System.out.println(defStr);
    }
}
