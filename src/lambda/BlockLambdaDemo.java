package lambda;

interface NumericFunc{
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String args[]){

        NumericFunc factorial = (n) -> {
            int result = 1;

            for(int i=1; i<=n; i++)
                result = i*result;

            return result;
        };

        System.out.println("Silnia 3: " + factorial.func(3));
        System.out.println("Silnia 15: " + factorial.func(15));
    }
}
