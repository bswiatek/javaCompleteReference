package util;

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Jest %te. dzień miesiąca %<tB roku %<tY.", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
