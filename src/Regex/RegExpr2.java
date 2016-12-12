package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        boolean found;

        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");
        found = mat.find();
        System.out.println("Pattern: " + pat + "\nMatcher: " + mat + "\n" + found);
    }
}
