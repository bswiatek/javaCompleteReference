package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();
        System.out.println("Pattern: " + pat + "\nMatcher: " + mat + "\n" + found);

        System.out.println();

        mat = pat.matcher("Java 8");
        found = mat.matches();
        System.out.println("Pattern: " + pat + "\nMatcher: " + mat + "\n" + found);

    }
}
