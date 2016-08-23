package util;

import java.util.Currency;
import java.util.Locale;
import java.util.Timer;

public class CurDemo {
    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);

        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("liczba cyfr po przecinku: " + c.getDefaultFractionDigits());
    }
}
