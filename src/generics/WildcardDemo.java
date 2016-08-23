package generics;

public class WildcardDemo {
    public static void main(String args[]){

        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("średnia iob: " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("średnia dob: " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("średnia fob: " + x);

        System.out.print("iob i dob są ");
        if(iob.sameAvg(dob))
            System.out.println("takie same");
        else
            System.out.println("różne");

        System.out.print("iob i fob są ");
        if(iob.sameAvg(fob))
            System.out.println("takie same");
        else
            System.out.println("różne");
    }
}
