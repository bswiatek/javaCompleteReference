package inputOutput;

class A{
    int i, j;
}
class B{
    int i, j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}

public class InstanceOf {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if(a instanceof A)
            System.out.println("a to egzemplarz A");
        if(b instanceof B)
            System.out.println("b to egzemplarz B");
        if(c instanceof C)
            System.out.println("c to egzemplarz C");
        if(c instanceof A)
            System.out.println("c mozna rzutowac na A");

        if(a instanceof C)
            System.out.println("a mozna rzutowac na C");

        A ob;

        ob = d;
        if(ob instanceof D)
            System.out.println("ob to egzemplarz D");

        ob = c;
        if(ob instanceof D)
            System.out.println("ob to egzemplarz D");
            else
            System.out.println("ob nie moze byc rzutowany na D");

        if(ob instanceof A)
            System.out.println("ob mozna rzutowac na A");
    }
}
