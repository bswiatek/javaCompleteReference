package generics;

public class Gen3<T> extends Gen<T>{


    Gen3(T o){
        super(o);
    }

    T getOb(){
        System.out.println("Metoda getob() z Gen3");
        return ob;
    }

}
