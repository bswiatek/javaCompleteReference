package Concurrent.Callable;

import java.util.concurrent.Callable;

class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    @Override
    public Double call() {
        return Math.sqrt((side1*side1) + (side2*side2));
    }
}
