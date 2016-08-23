package generics;

public class Gen4 extends Gen<String>{


    Gen4(String o){
        super(o);
    }

    String getOb(){
        System.out.println("Metoda string getOb");
        return ob;
    }

}
