package lambda;

interface NumericTest2{
    boolean test(int n, int d);
}
public class LambdaDemo3 {
    public static void main(String args[]){
        NumericTest2 isFactor = (n,d) -> (n % d) == 0;

        if(isFactor.test(10,2)) System.out.println("2 jest czynnikiem 10");
        if(isFactor.test(15,3)) System.out.println("3 jest czynnikiem 15");
        if(!isFactor.test(10,3)) System.out.println("3 nie jest czynnikiem 10");
    }
}
