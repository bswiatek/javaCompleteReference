package Concurrent.Semaphore;

import java.util.concurrent.Semaphore;

class DecThread implements Runnable{
    String name;
    Semaphore sem;

    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Uruchamiam " + name);

        try {
            System.out.println(name + " czeka na pozwolenie.");
            sem.acquire();
            System.out.println(name + " uzyskał pozwolenie.");

            for(int i=0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " zwalnia pozwolenie na dostęp");
        sem.release();
    }
}
