package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

class GregorianCalendarDemo {
    public static void main(String args[]) {

        String months[] = {
                "Sty", "Lut", "Mar", "Kwi",
                "Maj", "Cze", "Lip", "Sie",
                "Wrz", "Paź", "Lis", "Gru"
        };
        int year;

        GregorianCalendar calendar = new GregorianCalendar();

        System.out.print("Data: " + calendar.get(Calendar.DATE));
        System.out.print(". " + months[calendar.get(Calendar.MONTH)] + " ");
        System.out.println(year=calendar.get(Calendar.YEAR));

        System.out.print("Godzina: " + calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE));
        System.out.println(":" + calendar.get(Calendar.SECOND));

        if(calendar.isLeapYear(year)){
            System.out.println("Bieżący rok jest przestępny");
        } else {
            System.out.println("Bieżący rok nie jest przestępny");
        }
    }
}
