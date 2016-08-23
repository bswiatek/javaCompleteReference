/**
 * Created by bswiatek on 29.04.2016.
 */
public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double arena(){
        System.out.println("Triangle");
        return dim1 * dim2 / 2;
    }
}
