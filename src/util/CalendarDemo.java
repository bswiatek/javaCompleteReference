package util;

import java.util.Calendar;

class CalendarDemo {
    public static void main(String args[]) {

        String months[] = {
                "Sty", "Lut", "Mar", "Kwi",
                "Maj", "Cze", "Lip", "Sie",
                "Wrz", "Paź", "Lis", "Gru"
        };

        Calendar calendar = Calendar.getInstance();

        System.out.print("Data: " + calendar.get(Calendar.DATE));
        System.out.print(". " + months[calendar.get(Calendar.MONTH)]);
        System.out.println(" " + calendar.get(Calendar.YEAR));

        System.out.print("Godzina: " + calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE));
        System.out.println(":" + calendar.get(Calendar.SECOND));

        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 19);
        calendar.set(Calendar.SECOND, 22);

        System.out.print("Zaktualizowana godzina: " + calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE));
        System.out.println(":" + calendar.get(Calendar.SECOND));
    }
}
