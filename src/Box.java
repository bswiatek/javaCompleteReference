/**
 * Created by bswiatek on 16.04.2016.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public String toString(){
        return "Wymiary: " + width + " na " + height + " na " + depth + ".";
    }

    Box(){
        width = height = depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}