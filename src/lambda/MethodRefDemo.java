package lambda;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String args[]){
        String inStr = "Wyrażenia lambda zwiększają możliwości Javy";
        String outStr;

        MyStringOps stringOps = new MyStringOps();
        outStr = stringOp(stringOps::strReverse, inStr);

        System.out.println("Początkowy łańcuch: " + inStr);
        System.out.println("Końcowy łańcuch: " + outStr);
    }
}
