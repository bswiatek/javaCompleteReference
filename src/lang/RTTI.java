package lang;

class X{
    int a;
    float b;
}

class Y extends X{
    double c;
}

public class RTTI {

    public static void main(String args[]){
        X x = new X();
        Y y = new Y();

        Class<?> clObj;

        clObj= x.getClass();
        System.out.println(clObj.getName());
        clObj= y.getClass();
        System.out.println(clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println(clObj.getName());

    }
}
