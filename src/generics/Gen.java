package generics;

public class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        System.out.println("Metoda getob z gen");
        return ob;
    }

    void showType(){
        System.out.println("Typ T to " + ob.getClass().getName());
    }
}
