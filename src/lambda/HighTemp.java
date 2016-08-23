package lambda;

interface MyFunc2<T>{
    boolean func(T v1, T v2);
}

public class HighTemp {
    private int hTemp;

    HighTemp(int ht){
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
