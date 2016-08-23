package generics;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){

        for (int i=0; i<y.length; i++)
            if(x.equals(y[i])) return true;
        return false;
    }

    public static void main(String args[]){
        Integer nums[] = {1,2,3,4,5,6};

        if(isIn(2, nums))
            System.out.println("2 jest w nums");
        if(!isIn(7, nums))
            System.out.println("7 nie jest w nums");

        String strs[] = {"jeden", "dwa", "trzy", "cztery", "pięć"};
        if(isIn("dwa", strs))
            System.out.println("dwa jest w strs");
        if(!isIn("sześć", strs))
            System.out.println("sześć nie jest w strs");

        Double shrt[] = {1.0,2.0,3.0};
        if(isIn(2.0,shrt))
            System.out.println("OK");
    }
}
