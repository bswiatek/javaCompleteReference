package lambda;

interface SomeFunc<T>{
        T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String args[]){

        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i >=0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Lambda po odwróceniu to: " + reverse.func("Lambda"));
        System.out.println("Wyrażenia lambda po odwróceniu to: " + reverse.func("Wyrażenia lambda"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for(int i=1; i<=n; i++)
                result = i*result;

            return result;
        };

        System.out.println("Silnia 3: " + factorial.func(3));
        System.out.println("Silnia 15: " + factorial.func(15));
    }
}
