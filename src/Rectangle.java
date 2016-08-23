/**
 * Created by bswiatek on 29.04.2016.
 */
public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }

    double arena(){
        System.out.println("Rectangle");
        return dim1 * dim2;
    }
}
