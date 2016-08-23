package thread;

/**
 * Created by bswiatek on 22.05.2016.
 */
public class Synch {
    public static void main(String args[]){
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Witaj");
        Caller ob2 = new Caller(target, "zsynchronizowany");
        Caller ob3 = new Caller(target, "świecie");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e){
            System.out.println("Przerwano");
        }
    }
}
