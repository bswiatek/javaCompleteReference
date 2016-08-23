package lambda;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String args[]){
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i <=n; i++)
                result = i * result;
            return result;
        };

        System.out.println("Silnia 3: " + factorial.apply(3));
        System.out.println("Silnia 9: " + factorial.apply(9));
    }
}
