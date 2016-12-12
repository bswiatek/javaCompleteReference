package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr8 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frak Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Oryginalna sekwencja: " + str);

        str = mat.replaceAll("Eric ");
        System.out.println("Zmodyfikowana sekwencja: " + str);
    }
}
