package lambda;

interface MyFunc3<T>{
    int func(T[] vals, T v);
}

class MyArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;

        for(int i=0; i < vals.length; i++)
            if(vals[i] == v) count++;

        return count;
    }
}

public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String args[]){
        Integer[] vals = { 1,2,3,4,2,3,4,4,5 };
        String[] strs = {"Jeden", "Dwa", "Trzy", "Dwa"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Tablica vals zawira" + count + "wartości 4");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Dwa");
        System.out.println("Tablica strs zawira" + count + "wartości \"Dwa\"");

    }
}
