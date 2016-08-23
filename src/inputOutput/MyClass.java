package inputOutput;

public class MyClass {
    int a, b;

    MyClass(int i, int j){
        a = i;
        b = j;
    }

    MyClass(int i){
        this(i, i);
    }

    MyClass(){
        this(0);
    }
}
