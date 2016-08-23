package lambda;

public class LambdasAsArgumentsDemo {


    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String args[]){

        String inStr = "Wyrażenia lambda rozszerzają możliwości Javy";
        String outStr;

        System.out.println("Wejście: "+ inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("wielkie litery: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for(i = 0; i < str.length(); i++)
                if(str.charAt(i)!= ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);

        System.out.println("bez odstępu: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i >=0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("odwrócenie: " + stringOp(reverse, inStr));
    }
}
