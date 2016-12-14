package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime curDate = LocalDateTime.now();
        System.out.println(curDate.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
