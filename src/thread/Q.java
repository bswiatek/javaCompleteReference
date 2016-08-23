package thread;

/**
 * Created by bswiatek on 25.05.2016.
 */
public class Q {
    int n;
    boolean valueSet = false;

    synchronized void get(){
        if(!valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println("Złapano IE");
            }
        }
        System.out.println("Pobrano " +n);
        valueSet = false;
        notify();
    }

    synchronized void put(int n){
        if(valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println("Złapano IE");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Włożono " +n);
        notify();
    }
}