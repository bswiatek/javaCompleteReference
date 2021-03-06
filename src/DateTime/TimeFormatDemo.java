package DateTime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japonia: " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("UK: " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
        System.out.println("USA: " + df.format(date));
    }
}
