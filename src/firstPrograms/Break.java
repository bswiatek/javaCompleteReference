package firstPrograms;

/**
 * Created by bswiatek on 16.04.2016.
 */
public class Break {
    public static void main(String args[]){
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Przed break.");
                    if(t) break second;
                    System.out.println("Third po break");
                }
                System.out.println("second");
            }
            System.out.println("first");
        }
    }
}
