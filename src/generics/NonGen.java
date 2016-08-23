package generics;

public class NonGen {
    Object ob;

    NonGen(Object o){
        ob = o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Typ ob to " + ob.getClass().getName());
    }
}
