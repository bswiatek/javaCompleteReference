package util;

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%16.2ef", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%.15s", "Formatowanie w Javie jest bardzo proste");
        System.out.println(fmt);
        fmt.close();
    }
}
