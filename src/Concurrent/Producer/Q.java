package Concurrent.Producer;

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    static Semaphore SemCon = new Semaphore(0);
    static Semaphore SemProd = new Semaphore(1);

    void get(){

        try{
            SemCon.acquire();
        } catch (InterruptedException e){
            System.out.println("Złapano IE");
        }

        System.out.println("Pobrano " +n);
        SemProd.release();
    }

    void put(int n){
        try{
            SemProd.acquire();
        } catch (InterruptedException e){
            System.out.println("Złapano IE");
        }

        this.n = n;
        System.out.println("Włożono " +n);
        SemCon.release();
    }
}