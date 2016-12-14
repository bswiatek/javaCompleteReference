package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo4 {
    public static void main(String[] args) {
        LocalDateTime curDate = LocalDateTime.parse("June 21, 2014 12:01 AM", DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a"));
        System.out.println(curDate.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
