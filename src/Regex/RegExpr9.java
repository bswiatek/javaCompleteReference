package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr9 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ ,.!]");
        String strs[] = pat.split("one two,alpha9 12!done.");

        for(int i=0; i<strs.length; i++)
            System.out.println("Następny wyraz: " + strs[i]);
    }
}
