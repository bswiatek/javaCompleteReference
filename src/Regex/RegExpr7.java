package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr7 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("to jest1test.");

        while (mat.find())
            System.out.println("Dopasowana sekwencja: " + mat.group());
    }
}
