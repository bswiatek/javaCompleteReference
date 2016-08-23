/**
 * Created by bswiatek on 12.04.2016.
 */
public class Light {
    public static void main(String args[]){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 299792;

        days = 1;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("W " + days);
        System.out.print(" dni światło przebędzie ");
        System.out.println(distance + " kilometrów");
    }
}
