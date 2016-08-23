/**
 * Created by bswiatek on 16.04.2016.
 */
public class Switch {
    public static void main(String args[])
        throws java.io.IOException {
            int month = 4;
            System.out.println(month);
            String season;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "zima";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "wiosna";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "lato";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "jesień";
                    break;
                default:
                    season = "Błędny miesiąc";
            }
            System.out.println("Wybrany miesiąc należy do pory roku: " + season);
    }
}
