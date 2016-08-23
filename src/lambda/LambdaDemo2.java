package lambda;

interface NumericTest{
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String args[]){
        NumericTest isEven;

        isEven = (n) -> (n % 2) == 0;
        if(isEven.test(10)) System.out.println("10 to liczba parzysta");
        if(!isEven.test(9)) System.out.println("9 to liczba nieparzysta");

        NumericTest isNonNeg = (n) -> n >=0;
        if(isNonNeg.test(1)) System.out.println("1 to liczba dodatnia");
        if(!isNonNeg.test(-1)) System.out.println("-1 to liczba dodatnia");
    }
}
