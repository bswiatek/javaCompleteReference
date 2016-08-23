package lambda;

import inputOutput.*;

interface MyFunc5<R, T>{
    R func(T n);
}

class MyClass2<T>{
    private T val;
    MyClass2(T v) { val = v; }

    T getVal() { return val; }
}

class MyClass3{
    String str;
    MyClass3(String s) { str = s; }

    String getVal() { return str; }
}

public class ConstructorRefDemo {

    static <R,T> R myClassFactory(MyFunc5<R,T> cons, T v){
        return cons.func(v);
    }

    public static void main(String args[]){
        MyFunc5<MyClass2<Double>, Double> myClassCons = MyClass2<Double>::new;

        MyClass2<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Zapisano: " + mc.getVal());

        MyFunc5<MyClass3, String> myClassCons2 = MyClass3::new;
        MyClass3 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("Zapisano: " + mc2.getVal());
    }
}
