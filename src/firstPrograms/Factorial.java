package firstPrograms;

/**
 * Created by bswiatek on 25.04.2016.
 */
class Factorial {
    int fact(int n){
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

class Recursion{
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("3! wynosi " + f.fact(3));
        System.out.println("10! wynosi " + f.fact(10));
        System.out.println("13! wynosi " + f.fact(13));
    }
}
