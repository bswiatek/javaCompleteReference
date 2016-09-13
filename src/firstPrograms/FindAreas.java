package firstPrograms;

/**
 * Created by bswiatek on 29.04.2016.
 */
public class FindAreas {
    public static void main(String args[]){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figuref;

        figuref = r;
        System.out.println("Pole: " + figuref.arena());

        figuref = t;
        System.out.println("Pole: " + figuref.arena());
    }
}
