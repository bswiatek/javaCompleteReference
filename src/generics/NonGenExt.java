package generics;

public class NonGenExt<T> extends NonGen {
    T ob;
    NonGenExt(T o, int i){
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
