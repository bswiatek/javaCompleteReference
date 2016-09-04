package util;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        try(Formatter fmt = new Formatter()){

            fmt.format("Formatowanie %s jest bardzo proste: %d %f", "w Javie", 10, 98.6);
            System.out.println(fmt);
        }


    }
}
