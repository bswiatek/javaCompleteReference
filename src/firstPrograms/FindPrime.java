package firstPrograms;

/**
 * Created by bswiatek on 16.04.2016.
 */
public class FindPrime {
    public static void main(String args[]){
        double num;
        boolean isPrime = true;

        num = 93610734293610334877934858973458979361073429361033487793485897347.0;

        if(num < 2) isPrime = false;

        for(double i=2; i <= num/i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Jest to liczba pierwsza.");
        else System.out.println("nie jest to liczba pierwsza");
    }
}
