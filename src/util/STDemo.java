package util;

import java.util.StringTokenizer;

public class STDemo {
    static String in = "tytuł = Java. Kompendium programisty;" +
            "autor=Schildt;" +
            "wydawca=Helion;" +
            "copyright=2014";

    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer(in, "=;");

        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
